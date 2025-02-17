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
package org.apache.commons.validator.routines.checkdigit;


/**
 * ModulusTenCheckDigit CUSIP Test.
 */
public class ModulusTenCUSIPCheckDigitTest extends AbstractCheckDigitTest {

    /**
     * Construct a new test.
     * @param name test name
     */
    public ModulusTenCUSIPCheckDigitTest(final String name) {
        super(name);
    }

    /**
     * Set up routine & valid codes.
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        routine = new ModulusTenCheckDigit(new int[] { 1, 2}, true, true);
        valid = new String[] {"037833100",
                              "931142103",
                              "837649128",
                              "392690QT3",
                              "594918104",
                              "86770G101",
                              "Y8295N109",
                              "G8572F100"
                              };
        invalid = new String[] {"0378#3100"};
    }

    private static final String[] INVALID_CHECK_DIGITS = {"DUS0421CW",
                                                  "DUS0421CN",
                                                  "DUS0421CE"
    };

    public void testVALIDATOR_336_InvalidCheckDigits() {
        for (final String invalidCheckDigit : INVALID_CHECK_DIGITS) {
            assertFalse("Should fail: " + invalidCheckDigit, routine.isValid(invalidCheckDigit));
        }
    }

    private static final String[] VALID_CHECK_DIGITS = {"DUS0421C5"};

    public void testVALIDATOR_336_ValidCheckDigits() {
        for (final String validCheckDigit : VALID_CHECK_DIGITS) {
            assertTrue("Should fail: " + validCheckDigit, routine.isValid(validCheckDigit));
        }
    }
}
