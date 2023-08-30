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

import org.apache.commons.validator.routines.checkdigit.CheckDigit;
import org.apache.commons.validator.routines.checkdigit.EAN13CheckDigit;

import junit.framework.TestCase;

/**
 * CodeValidatorTest.java.
 *
 * @since 1.4
 */
public class CodeValidatorTest extends TestCase {

    /**
     * Construct a test with the specified name.
     * @param name The name of the test
     */
    public CodeValidatorTest(final String name) {
        super(name);
    }

    /**
     * @see junit.framework.TestCase#setUp()
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * @see junit.framework.TestCase#tearDown()
     */
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test Check Digit.
     */
    public void testCheckDigit() {
        CodeValidator validator = new CodeValidator((String)null, -1, -1, (CheckDigit)null);
        final String invalidEAN = "9781930110992";
        final String validEAN   = "9781930110991";

        // Test no CheckDigit (i.e. null)
        assertNull("No CheckDigit", validator.getCheckDigit());
        assertEquals("No CheckDigit invalid", invalidEAN, validator.validate(invalidEAN));
        assertEquals("No CheckDigit valid",     validEAN, validator.validate(validEAN));
        assertEquals("No CheckDigit (is) invalid",  true, validator.isValid(invalidEAN));
        assertEquals("No CheckDigit (is) valid",    true, validator.isValid(validEAN));

        // Use the EAN-13 check digit routine
        validator = new CodeValidator((String)null, -1, EAN13CheckDigit.EAN13_CHECK_DIGIT);

        assertNotNull("EAN CheckDigit", validator.getCheckDigit());
        assertEquals("EAN CheckDigit invalid",       null, validator.validate(invalidEAN));
        assertEquals("EAN CheckDigit valid",     validEAN, validator.validate(validEAN));
        assertEquals("EAN CheckDigit (is) invalid", false, validator.isValid(invalidEAN));
        assertEquals("EAN CheckDigit (is) valid",    true, validator.isValid(validEAN));
        assertEquals("EAN CheckDigit ex",            null, validator.validate("978193011099X"));
    }

    /**
     * Test the minimum/maximum length
     */
    /**
     * Test the minimum/maximum length
     */
    /**
     * Test the minimum/maximum length
     */
    public void testLength() {
        CodeValidator validator = new CodeValidator((String)null, -1, -1, (CheckDigit)null);

        final String[] testValues = {
                "1234567890", "12345678901", "123456789012",
                "12345678901234567890", "123456789012345678901", "1234567890123456789012"
        };

        assertEquals("No min", -1, validator.getMinLength());
        assertEquals("No max", -1, validator.getMaxLength());

        for (String value : testValues) {
            assertEquals(value, validator.validate(value));
        }

        // Min 11
        validator = new CodeValidator((String)null, 11, -1, (CheckDigit)null);
        assertEquals(11, validator.getMinLength());

        for (String value : testValues) {
            assertEquals(value.length() >= 11 ? value : null, validator.validate(value));
        }

        // Max 21
        validator = new CodeValidator((String)null, -1, 21, (CheckDigit)null);
        assertEquals(21, validator.getMaxLength());

        for (String value : testValues) {
            assertEquals(value.length() <= 21 ? value : null, validator.validate(value));
        }

        // Min 11 / Max 21
        validator = new CodeValidator((String)null, 11, 21, (CheckDigit)null);
        assertEquals(11, validator.getMinLength());
        assertEquals(21, validator.getMaxLength());

        for (String value : testValues) {
            assertEquals((value.length() >= 11 && value.length() <= 21) ? value : null, validator.validate(value));
        }
    }


    /**
     * Test Regular Expression.
     */
    public void testRegex() {
        CodeValidator validator = new CodeValidator((String)null, -1, -1, (CheckDigit)null);
        final String[] values = { "12", "123", "1234", "12345", "12a4" };

        // No Regex
        assertNull("No Regex", validator.getRegexValidator());
        for (String value : values)
            assertEquals("No Regex " + value, value, validator.validate(value));

        // Regular Expression
        String regex = "^([0-9]{3,4})$";
        validator = new CodeValidator(regex, -1, -1, (CheckDigit)null);
        assertNotNull("No Regex", validator.getRegexValidator());
        assertEquals("Regex 2", null, validator.validate(values[0]));
        assertEquals("Regex 3", values[1], validator.validate(values[1]));
        assertEquals("Regex 4", values[2], validator.validate(values[2]));
        assertEquals("Regex 5", null, validator.validate(values[3]));
        assertEquals("Regex invalid", null, validator.validate(values[4]));

        // Reformatted
        regex = "^([0-9]{3})(?:[-\\s])([0-9]{3})$";
        validator = new CodeValidator(new RegexValidator(regex), 6, (CheckDigit)null);
        assertEquals("Reformat 123-456", "123456", validator.validate("123-456"));
        assertEquals("Reformat 123 456", "123456", validator.validate("123 456"));

        // Reformat 2
        regex = "^(?:([0-9]{3})(?:[-\\s])([0-9]{3}))|([0-9]{6})$";
        validator = new CodeValidator(new RegexValidator(regex), 6, (CheckDigit)null);
        assertEquals("Reformat 2 Regex",  "RegexValidator{" + regex + "}", validator.getRegexValidator().toString());
        assertEquals("Reformat 2 123-456", "123456", validator.validate("123-456"));
        assertEquals("Reformat 2 123 456", "123456", validator.validate("123 456"));
    }

    /**
     * Test Regular Expression.
     */
    public void testNoInput() {
        final CodeValidator validator = new CodeValidator((String)null, -1, -1, (CheckDigit)null);
        assertEquals("Null",         null, validator.validate(null));
        assertEquals("Zero Length",  null, validator.validate(""));
        assertEquals("Spaces",       null, validator.validate("   "));
        assertEquals("Trimmed",      "A",  validator.validate(" A  "));
    }

    public void testValidator294_1() {
        CodeValidator validator = new CodeValidator((String)null, 0, -1, (CheckDigit)null);
        assertEquals("Null",         null, validator.validate(null));
        validator = new CodeValidator((String)null, -1, 0, (CheckDigit)null);
        assertEquals("Null",         null, validator.validate(null));
    }

    public void testValidator294_2() {
        final CodeValidator validator = new CodeValidator((String)null, -1, 0, (CheckDigit)null);
        assertEquals("Null",         null, validator.validate(null));
    }

    /**
     * Test Regular Expression.
     */
    public void testConstructors() {
        CodeValidator validator;
        final RegexValidator regex = new RegexValidator("^[0-9]*$");

        // Constructor 1
        validator = new CodeValidator(regex, EAN13CheckDigit.EAN13_CHECK_DIGIT);
        assertEquals("Constructor 1 - regex",      regex, validator.getRegexValidator());
        assertEquals("Constructor 1 - min length", -1, validator.getMinLength());
        assertEquals("Constructor 1 - max length", -1, validator.getMaxLength());
        assertEquals("Constructor 1 - check digit", EAN13CheckDigit.EAN13_CHECK_DIGIT, validator.getCheckDigit());

        // Constructor 2
        validator = new CodeValidator(regex, 13, EAN13CheckDigit.EAN13_CHECK_DIGIT);
        assertEquals("Constructor 2 - regex",      regex, validator.getRegexValidator());
        assertEquals("Constructor 2 - min length", 13, validator.getMinLength());
        assertEquals("Constructor 2 - max length", 13, validator.getMaxLength());
        assertEquals("Constructor 2 - check digit", EAN13CheckDigit.EAN13_CHECK_DIGIT, validator.getCheckDigit());

        // Constructor 3
        validator = new CodeValidator(regex, 10, 20, EAN13CheckDigit.EAN13_CHECK_DIGIT);
        assertEquals("Constructor 3 - regex",      regex, validator.getRegexValidator());
        assertEquals("Constructor 3 - min length", 10, validator.getMinLength());
        assertEquals("Constructor 3 - max length", 20, validator.getMaxLength());
        assertEquals("Constructor 3 - check digit", EAN13CheckDigit.EAN13_CHECK_DIGIT, validator.getCheckDigit());

        // Constructor 4
        validator = new CodeValidator("^[0-9]*$", EAN13CheckDigit.EAN13_CHECK_DIGIT);
        assertEquals("Constructor 4 - regex",      "RegexValidator{^[0-9]*$}", validator.getRegexValidator().toString());
        assertEquals("Constructor 4 - min length", -1, validator.getMinLength());
        assertEquals("Constructor 4 - max length", -1, validator.getMaxLength());
        assertEquals("Constructor 4 - check digit", EAN13CheckDigit.EAN13_CHECK_DIGIT, validator.getCheckDigit());

        // Constructor 5
        validator = new CodeValidator("^[0-9]*$", 13, EAN13CheckDigit.EAN13_CHECK_DIGIT);
        assertEquals("Constructor 5 - regex",      "RegexValidator{^[0-9]*$}", validator.getRegexValidator().toString());
        assertEquals("Constructor 5 - min length", 13, validator.getMinLength());
        assertEquals("Constructor 5 - max length", 13, validator.getMaxLength());
        assertEquals("Constructor 5 - check digit", EAN13CheckDigit.EAN13_CHECK_DIGIT, validator.getCheckDigit());

        // Constructor 6
        validator = new CodeValidator("^[0-9]*$", 10, 20, EAN13CheckDigit.EAN13_CHECK_DIGIT);
        assertEquals("Constructor 6 - regex",      "RegexValidator{^[0-9]*$}", validator.getRegexValidator().toString());
        assertEquals("Constructor 6 - min length", 10, validator.getMinLength());
        assertEquals("Constructor 6 - max length", 20, validator.getMaxLength());
        assertEquals("Constructor 6 - check digit", EAN13CheckDigit.EAN13_CHECK_DIGIT, validator.getCheckDigit());
    }

}
