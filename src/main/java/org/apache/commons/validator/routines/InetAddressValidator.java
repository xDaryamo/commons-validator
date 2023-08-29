/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.validator.routines;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p><b>InetAddress</b> validation and conversion routines (<code>java.net.InetAddress</code>).</p>
 *
 * <p>This class provides methods to validate a candidate IP address.
 *
 * <p>
 * This class is a Singleton; you can retrieve the instance via the {@link #getInstance()} method.
 * </p>
 *
 * @since 1.4
 */
public class InetAddressValidator implements Serializable {

    private static final int MAX_BYTE = 128;

    private static final int IPV4_MAX_OCTET_VALUE = 255;

    private static final int MAX_UNSIGNED_SHORT = 0xffff;

    private static final int BASE_16 = 16;

    private static final long serialVersionUID = -919201640201914789L;

    private static final String IPV4_REGEX =
            "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$";

    // Max number of hex groups (separated by :) in an IPV6 address
    private static final int IPV6_MAX_HEX_GROUPS = 8;

    // Max hex digits in each IPv6 group
    private static final int IPV6_MAX_HEX_DIGITS_PER_GROUP = 4;

    /**
     * Singleton instance of this class.
     */
    private static final InetAddressValidator VALIDATOR = new InetAddressValidator();

    /** IPv4 RegexValidator */
    private final RegexValidator ipv4Validator = new RegexValidator(IPV4_REGEX);

    /**
     * Returns the singleton instance of this validator.
     * @return the singleton instance of this validator
     */
    public static InetAddressValidator getInstance() {
        return VALIDATOR;
    }

    /**
     * Checks if the specified string is a valid IPv4 or IPv6 address.
     * @param inetAddress the string to validate
     * @return true if the string validates as an IP address
     */
    public boolean isValid(final String inetAddress) {
        return isValidInet4Address(inetAddress) || isValidInet6Address(inetAddress);
    }

    /**
     * Validates an IPv4 address. Returns true if valid.
     * @param inet4Address the IPv4 address to validate
     * @return true if the argument contains a valid IPv4 address
     */
    public boolean isValidInet4Address(final String inet4Address) {
        // verify that address conforms to generic IPv4 format
        final String[] groups = ipv4Validator.match(inet4Address);

        if (groups == null) {
            return false;
        }

        // verify that address subgroups are legal
        for (final String ipSegment : groups) {
            if (ipSegment == null || ipSegment.isEmpty()) {
                return false;
            }

            int iIpSegment = 0;

            try {
                iIpSegment = Integer.parseInt(ipSegment);
            } catch(final NumberFormatException e) {
                return false;
            }

            if (iIpSegment > IPV4_MAX_OCTET_VALUE) {
                return false;
            }

            if (ipSegment.length() > 1 && ipSegment.startsWith("0")) {
                return false;
            }

        }

        return true;
    }

    /**
     * Validates an IPv6 address. Returns true if valid.
     * @param inet6Address the IPv6 address to validate
     * @return true if the argument contains a valid IPv6 address
     *
     * @since 1.4.1
     */
    public boolean isValidInet6Address(String inet6Address) {
        String[] parts;
        // remove prefix size. This will appear after the zone id (if any)
        parts = getParts(inet6Address);
        if (parts == null) return false;

        inet6Address = parts[0];
        final boolean containsCompressedZeroes = inet6Address.contains("::");
        if (checkZeros(inet6Address, containsCompressedZeroes)) return false;
        
        String[] octets = inet6Address.split(":");
        octets = getOctets(inet6Address, containsCompressedZeroes, octets);

        if (octets.length > IPV6_MAX_HEX_GROUPS) {
            return false;
        }

        Integer validOctets = getValidOctets(octets);
        if (validOctets == null) return false;

        return validOctets <= IPV6_MAX_HEX_GROUPS && (validOctets == IPV6_MAX_HEX_GROUPS || containsCompressedZeroes);
    }

    private Integer getValidOctets(String[] octets) {
        int validOctets = 0;
        int emptyOctets = 0; // consecutive empty chunks
        for (int index = 0; index < octets.length; index++) {
            final String octet = octets[index];
            if (octet.isEmpty()) {
                emptyOctets++;
                if (emptyOctets > 1) {
                    return null;
                }
            } else {
                emptyOctets = 0;
                // Is last chunk an IPv4 address?
                if (index == octets.length - 1 && octet.contains(".")) {
                    if (!isValidInet4Address(octet)) {
                        return null;
                    }
                    validOctets += 2;
                    continue;
                }
                if (octet.length() > IPV6_MAX_HEX_DIGITS_PER_GROUP) {
                    return null;
                }

                if (checkOctectInt(octet)) return null;
            }
            validOctets++;
        }
        return validOctets;
    }

    private static String[] getParts(String inet6Address) {
        String[] parts;
        parts = inet6Address.split("/", -1);
        if (parts.length > 2) {
            return null;
        }
        if (checkParts(parts)) return null;

        // remove zone-id
        parts = parts[0].split("%", -1);
        if (parts.length > 2) {
            return null;
        }
        // The id syntax is implementation independent, but it presumably cannot allow:
        // whitespace, '/' or '%'
        if (bitsMatches(parts)) {
            return null;
        }
        return parts;
    }

    private static String[] getOctets(String inet6Address, boolean containsCompressedZeroes, String[] octets) {
        if (containsCompressedZeroes) {
            final List<String> octetList = new ArrayList<>(Arrays.asList(octets));
            checkOctets(inet6Address, octetList);
            octets = octetList.toArray(new String[0]);
        }
        return octets;
    }

    private static boolean checkOctectInt(String octet) {
        int octetInt;
        try {
            octetInt = Integer.parseInt(octet, BASE_16);
        } catch (final NumberFormatException e) {
            return true;
        }
        return octetInt < 0 || octetInt > MAX_UNSIGNED_SHORT;
    }

    private static void checkOctets(String inet6Address, List<String> octetList) {
        if (inet6Address.endsWith("::")) {
            // String.split() drops ending empty segments
            octetList.add("");
        } else if (inet6Address.startsWith("::") && !octetList.isEmpty()) {
            octetList.remove(0);
        }
    }

    private static boolean checkZeros(String inet6Address, boolean containsCompressedZeroes) {
        if (containsCompressedZeroes && (inet6Address.indexOf("::") != inet6Address.lastIndexOf("::"))) {
            return true;
        }
        return (inet6Address.startsWith(":") && !inet6Address.startsWith("::"))
                || (inet6Address.endsWith(":") && !inet6Address.endsWith("::"));
    }

    private static boolean bitsMatches(String[] parts) {
        return (parts.length == 2) && !parts[1].matches("[^\\s/%]+");
    }

    private static boolean checkParts(String[] parts) {
        if (parts.length == 2) {
            if (!parts[1].matches("\\d{1,3}")) {
                return true;
            }
            final int bits = Integer.parseInt(parts[1]); // cannot fail because of RE check
            return bits < 0 || bits > MAX_BYTE;
        }
        return false;
    }
}
