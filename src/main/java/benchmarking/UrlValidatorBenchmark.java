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
package benchmarking;

import org.apache.commons.validator.routines.DomainValidator;
import org.apache.commons.validator.routines.UrlValidator;
import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.List;

import static org.openjdk.jmh.runner.Defaults.MEASUREMENT_ITERATIONS;
import static org.openjdk.jmh.runner.Defaults.WARMUP_ITERATIONS;

@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = WARMUP_ITERATIONS, time = 1)
@Measurement(iterations = MEASUREMENT_ITERATIONS, time = 1)
@Fork(1)
@State(Scope.Benchmark)
public class UrlValidatorBenchmark {

    private static final int WARMUP_ITERATIONS = 5;
    private static final int MEASUREMENT_ITERATIONS = 5;

    private static final UrlValidator URL_VALIDATOR = UrlValidator.getInstance(); //default validator

    private static final String URL = "http://example.com";
    
    private static final int PARAM = 1000;

    private UrlValidator allow2SlashesValidator;
    private UrlValidator allowAllSchemesValidator;
    private UrlValidator noFragmentsValidator;
    private UrlValidator customSchemeValidator;

    private List<String> validUrls;
    private List<String> invalidUrls;

    private List<String> validSchemes;
    private List<String> invalidSchemes;

    @Setup
    public void setup() {

        // Initialize UrlValidator instances with different configuration options
        allow2SlashesValidator = new UrlValidator(UrlValidator.ALLOW_2_SLASHES);
        allowAllSchemesValidator = new UrlValidator(UrlValidator.ALLOW_ALL_SCHEMES);
        noFragmentsValidator = new UrlValidator(UrlValidator.NO_FRAGMENTS);
        customSchemeValidator = new UrlValidator(new String[]{"customscheme"});

        // Add valid URLs to the list
        validUrls = new ArrayList<>();
        validUrls.add("http://www.amazon.com");
        validUrls.add("https://www.google.com");
        validUrls.add("ftp://ftp.example.org");
        validUrls.add("http://www.apache.org");
        validUrls.add("https://www.github.com");
        validUrls.add("ftp://ftp.gnu.org");
        validUrls.add("2001:0db8:85a3:0000:0000:8a2e:0370:7334"); //Full IPv6 Address
        validUrls.add("2001:0db8:0:0:0:0:0:1"); //Full IPv6 Address
        validUrls.add("::1");  //Shorthand Notation and Loopback address
        validUrls.add("fe80::1%eth0"); //Link-local address with zone ID
        validUrls.add("ff02::1%wlan0"); //Multicast address with zone ID
        validUrls.add("192.168.0.1"); //IPv4
        validUrls.add("10.0.0.2"); //IPv4

        // Add invalid URLs to the list
        invalidUrls = new ArrayList<>();
        invalidUrls.add("www.invalid-url"); // Missing scheme
        invalidUrls.add("http://"); // Missing host
        invalidUrls.add("http://example.com:8080/path?query"); // Missing path
        invalidUrls.add("htp://www.example.com"); // Invalid scheme
        invalidUrls.add("http://www.example.com:80/<>"); // Invalid characters in path
        invalidUrls.add("ftp://www.example.com:invalidport"); // Invalid port
        invalidUrls.add("http://[FEDC:BA98:7654:3210]:80/index.html"); // Missing square brackets
        invalidUrls.add("http://[FEDC:BA98:7654:3210:FEDC:BA98:7654:3210]:80/index.html"); // Extra colon
        invalidUrls.add("http://[FEDC:BA98:7654:3210:FEDC:BA98:7654:3210]:80:80/index.html"); // Extra colon
        invalidUrls.add("http://[::1]:80/index.html"); // Valid IPv6 but missing square brackets
        invalidUrls.add("192.168.0.300"); // Invalid range
        invalidUrls.add("172.16.0.256");   // Invalid range
        invalidUrls.add("10.0.0.0.1");     // Extra digits
        invalidUrls.add("192.168.1");       // Incomplete

        // Add valid URL schemes to the list
        validSchemes = new ArrayList<>();
        validSchemes.add("http");
        validSchemes.add("https");
        validSchemes.add("ftp");
        validSchemes.add("file");
        validSchemes.add("mailto");
        validSchemes.add("tel");
        validSchemes.add("data");

        // Add invalid URL schemes to the list
        invalidSchemes = new ArrayList<>();
        invalidSchemes.add("htp"); // Invalid scheme
        invalidSchemes.add("invalidscheme"); // Invalid scheme
        invalidSchemes.add("123scheme"); // Invalid scheme
        invalidSchemes.add("htt:p");    // Colon in the wrong place
        invalidSchemes.add("ht-tp");   // Dash not allowed
        invalidSchemes.add("ft p");    // Space not allowed
        invalidSchemes.add("123");     // Numbers not allowed as scheme
    }

    //Major Input Size Validation
    @Benchmark
    public boolean[] benchmarkIsValidForValidUrls() {
        return getUrlsBooleans(validUrls);
    }

    @Benchmark
    public boolean[] benchmarkIsValidForInvalidUrls() {
        return getUrlsBooleans(invalidUrls);
    }

    private boolean[] getUrlsBooleans(List<String> urls) {
        boolean[] results = new boolean[invalidUrls.size()];
        int n = urls.size();
        for (int i = 0; i < n; ++i) {
            String url = urls.get(i);
            results[i] = URL_VALIDATOR.isValid(url);
        }
        return results;
    }

    //Basic Url Validation
    @Benchmark
    public boolean validateValidBasicUrl() {
        return URL_VALIDATOR.isValid("https://www.google.com");
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public boolean validateValidBasicUrlMulti() {
        return URL_VALIDATOR.isValid("https://www.google.com");
    }

    @Benchmark
    public boolean validateInvalidBasicUrl() {
        return URL_VALIDATOR.isValid("www.invalid-url");
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public boolean validateInvalidBasicUrlMulti() {
        return URL_VALIDATOR.isValid("www.invalid-url");
    }
    @Benchmark
    public boolean validateValidIPv4() {
        return URL_VALIDATOR.isValid("192.168.0.1");
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public boolean validateValidIPv4Multi() {
        return URL_VALIDATOR.isValid("192.168.0.1");
    }

    @Benchmark
    public boolean validateInvalidIPv4() {
        return URL_VALIDATOR.isValid("192.168.1");
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public boolean validateInvalidIPv4Multi() {
        return URL_VALIDATOR.isValid("192.168.1");
    }

    @Benchmark
    public boolean validateValidIPv6() {
        return URL_VALIDATOR.isValid("2001:0db8:85a3:0000:0000:8a2e:0370:7334");
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public boolean validateValidIPv6Multi() {
        return URL_VALIDATOR.isValid("2001:0db8:85a3:0000:0000:8a2e:0370:7334");
    }

    @Benchmark
    public boolean validateInvalidIPv6() {
        return URL_VALIDATOR.isValid("http://[FEDC:BA98:7654:3210:FEDC:BA98:7654:3210]:80:80/index.html");
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public boolean validateInvalidIPv6Multi() {
        return URL_VALIDATOR.isValid("http://[FEDC:BA98:7654:3210:FEDC:BA98:7654:3210]:80:80/index.html");
    }

    //Schemes Validation
    @Benchmark
    public boolean[] benchmarkIsValidatorForValidSchemes() {
        return getSchemesBooleans(validSchemes);
    }

    @Benchmark
    public boolean[] benchmarkIsValidatorForInvalidSchemes() {
        return getSchemesBooleans(invalidSchemes);
    }

    private boolean[] getSchemesBooleans(List<String> schemes) {
        boolean[] results = new boolean[schemes.size()];
        int n = schemes.size();
        for (int i = 0; i < n; ++i) {
            String scheme = schemes.get(i);
            String url = new StringBuilder(scheme).append("://www.example.com").toString();
            results[i] = URL_VALIDATOR.isValid(url);
        }
        return results;
    }

    //Domain rejections
    @Benchmark
    public boolean benchmarkValidatorNullDomain() { // reject null DomainValidator
        try {
            new UrlValidator(new String[]{}, null, 0L, null);
            return false;
        } catch (IllegalArgumentException e) {
            return e.getMessage().equals("DomainValidator must not be null");
        }
    }

    @Benchmark
    public boolean benchmarkValidatorMistMatchHost() { // reject mismatched allowLocal
        final List<DomainValidator.Item> items = new ArrayList<>();
        try {
            new UrlValidator(new String[]{}, null, 0L, DomainValidator
                    .getInstance(true, items));
            return false;
        } catch (IllegalArgumentException e) {
            return e.getMessage().equals("DomainValidator disagrees with ALLOW_LOCAL_URLS setting");
        }
    }

    @Benchmark
    public boolean benchmarkValidatorNotLocalsAllowed() { //DomainValidator disagrees with ALLOW_LOCAL_URLS setting
        final List<DomainValidator.Item> items = new ArrayList<>();
        try {
            new UrlValidator(new String[]{}, null, UrlValidator.ALLOW_LOCAL_URLS, DomainValidator
                    .getInstance(false, items));
            return false;
        } catch (IllegalArgumentException e) {
            return e.getMessage().equals("DomainValidator disagrees with ALLOW_LOCAL_URLS setting");
        }
    }

    //Validator Mods
    @Benchmark
    public boolean validateDefault() {
        return URL_VALIDATOR.isValid(URL);
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public boolean validateDefaultMulti() {
        return URL_VALIDATOR.isValid(URL);
    }

    @Benchmark
    public boolean validateAllow2Slashes() {
        return allow2SlashesValidator.isValid(URL);
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public boolean validateAllow2SlashesMulti() {
        return allow2SlashesValidator.isValid(URL);
    }

    @Benchmark
    public boolean validateAllowAllSchemes() {
        return allowAllSchemesValidator.isValid(URL);
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public boolean validateAllowAllSchemesMulti() {
        return allowAllSchemesValidator.isValid(URL);
    }

    @Benchmark
    public boolean validateNoFragments() {
        return noFragmentsValidator.isValid(URL);
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public boolean validateNoFragmentsMulti() {
        return noFragmentsValidator.isValid(URL);
    }

    //Special Urls
    @Benchmark
    public boolean validateUrlWithUserInfo() {
        return URL_VALIDATOR.isValid("http://user:pass@example.com");
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public boolean validateUrlWithUserInfoMulti() {
        return URL_VALIDATOR.isValid("http://user:pass@example.com");
    }

    @Benchmark
    public boolean validateUrlWithSpecialCharacters() {
        return URL_VALIDATOR.isValid("http://example.com/path%20to%20resource");
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public boolean validateUrlWithSpecialCharactersMulti() {
        return URL_VALIDATOR.isValid("http://example.com/path%20to%20resource");
    }

    @Benchmark
    public boolean validateUrlWithCustomScheme() {
        return customSchemeValidator.isValid("customscheme://example.com");
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public boolean validateUrlWithCustomSchemeMulti() {
        return customSchemeValidator.isValid("customscheme://example.com");
    }
    @Benchmark
    public boolean validateUrlWithFragment() {
        return URL_VALIDATOR.isValid("http://example.com#section");
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public boolean validateUrlWithFragmentMulti() {
        return URL_VALIDATOR.isValid("http://example.com#section");
    }

    @Benchmark
    public boolean validateUrlWithPort() {
        return URL_VALIDATOR.isValid("http://example.com:8080/path");
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public boolean validateUrlWithPortMulti() {
        return URL_VALIDATOR.isValid("http://example.com:8080/path");
    }

    @Benchmark
    public boolean validateLocalFileUrl() {
        return isLocalFileUrl("file://localhost/path/to/file");
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public boolean validateLocalFileUrlMulti() {
        return isLocalFileUrl("file://localhost/path/to/file");
    }

    private boolean isLocalFileUrl(String url) {
        // Add your custom logic here to check if the URL is a local file URL
        // This could involve checking the URL scheme, host, and other conditions

        return url.startsWith("file://localhost/");
    }

    @Benchmark
    public boolean validateIDNUrl() {
        return URL_VALIDATOR.isValid("http://xn--bcher-kva.example.com"); // IDN domain example

    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public boolean validateIDNUrlMulti() {
        return URL_VALIDATOR.isValid("http://xn--bcher-kva.example.com"); // IDN domain example

    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }
}
