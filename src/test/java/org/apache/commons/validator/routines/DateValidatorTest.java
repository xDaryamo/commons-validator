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

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import static org.junit.Assert.assertNotEquals;

/**
 * Test Case for DateValidator.
 */
public class DateValidatorTest extends AbstractCalendarValidatorTest {

    private DateValidator dateValidator;

    /**
     * Constructor
     * @param name test name
     */
    public DateValidatorTest(final String name) {
        super(name);
    }

    /**
     * Set Up.
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        dateValidator = new DateValidator();
        validator         = dateValidator;
    }

    /**
     * Check that locale providers are set up correctly
     * If not, the parse will fail
     */
    public void testLocaleProviders() throws Exception {
        final String localeProviders = System.getProperty("java.locale.providers");
        if (localeProviders != null) { // may be null before Java 9
            assertTrue("java.locale.providers must start with COMPAT", localeProviders.startsWith("COMPAT"));
        }
        final String txt = "3/20/15 10:59:00 PM";  // This relies on the locale format prior to Java 9 to parse correctly
        final DateFormat dateformat= DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, Locale.US);
        dateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
        final Date date = dateformat.parse(txt);
        assertNotNull(date);
    }
    /**
     * Test DateValidator validate Methods
     */
    public void testDateValidatorMethods() {
        Locale.setDefault(Locale.US);
        final Locale locale = Locale.GERMAN;
        final String pattern = "yyyy-MM-dd";
        final String patternVal = "2005-12-31";
        final String germanVal = "31 Dez 2005";
        final String germanPattern = "dd MMM yyyy";
        final String localeVal = "31.12.2005";
        final String defaultVal = "12/31/05";
        final String XXXX = "XXXX";
        final Date expected = createCalendar(null, 20051231, 0).getTime();

        // Validation and isValid tests for various input types
        assertEquals("validate(A) default", expected, DateValidator.getInstance().validate(defaultVal));
        assertTrue("isValid(A) default", DateValidator.getInstance().isValid(defaultVal));

        assertEquals("validate(A) locale ", expected, DateValidator.getInstance().validate(localeVal, locale));
        assertTrue("isValid(A) locale ", DateValidator.getInstance().isValid(localeVal, locale));

        assertEquals("validate(A) pattern", expected, DateValidator.getInstance().validate(patternVal, pattern));
        assertTrue("isValid(A) pattern", DateValidator.getInstance().isValid(patternVal, pattern));

        assertEquals("validate(A) both", expected, DateValidator.getInstance().validate(germanVal, germanPattern, Locale.GERMAN));
        assertTrue("isValid(A) both", DateValidator.getInstance().isValid(germanVal, germanPattern, Locale.GERMAN));

        // Validation and isValid tests for invalid input
        assertNull("validate(B) default", DateValidator.getInstance().validate(XXXX));
        assertFalse("isValid(B) default", DateValidator.getInstance().isValid(XXXX));

        assertNull("validate(B) locale ", DateValidator.getInstance().validate(XXXX, locale));
        assertFalse("isValid(B) locale ", DateValidator.getInstance().isValid(XXXX, locale));

        assertNull("validate(B) pattern", DateValidator.getInstance().validate(XXXX, pattern));
        assertFalse("isValid(B) pattern", DateValidator.getInstance().isValid(XXXX, pattern));

        assertNull("validate(B) both", DateValidator.getInstance().validate("31 Dec 2005", germanPattern, Locale.GERMAN));
        assertFalse("isValid(B) both", DateValidator.getInstance().isValid("31 Dec 2005", germanPattern, Locale.GERMAN));
    }





    /**
     * Test compare date methods
     */
    public void testCompare() {
        final int sameTime = 124522;
        final int testDate = 20050823;
        final Date diffHour = createDate(GMT, testDate, 115922); // same date, different time

        final Date value = createDate(GMT, testDate, sameTime); // test value

        final Date date20050824 = createDate(GMT, 20050824, sameTime); // +1 day
        final Date date20050822 = createDate(GMT, 20050822, sameTime); // -1 day

        final Date date20050830 = createDate(GMT, 20050830, sameTime); // +1 week
        final Date date20050816 = createDate(GMT, 20050816, sameTime); // -1 week

        final Date date20050901 = createDate(GMT, 20050901, sameTime); // +1 month
        final Date date20050801 = createDate(GMT, 20050801, sameTime); // same month
        final Date date20050731 = createDate(GMT, 20050731, sameTime); // -1 month

        final Date date20051101 = createDate(GMT, 20051101, sameTime); // +1 quarter (Feb Start)
        final Date date20051001 = createDate(GMT, 20051001, sameTime); // +1 quarter
        final Date date20050701 = createDate(GMT, 20050701, sameTime); // same quarter
        final Date date20050630 = createDate(GMT, 20050630, sameTime); // -1 quarter
        final Date date20050110 = createDate(GMT, 20050110, sameTime); // Previous Year qtr (Feb start)

        final Date date20060101 = createDate(GMT, 20060101, sameTime); // +1 year
        final Date date20050101 = createDate(GMT, 20050101, sameTime); // same year
        final Date date20041231 = createDate(GMT, 20041231, sameTime); // -1 year

        // Date comparisons
        assertEquals("date LT", -1, dateValidator.compareDates(value, date20050824, GMT)); // +1 day
        assertEquals("date EQ", 0, dateValidator.compareDates(value, diffHour, GMT)); // same day, diff hour
        assertEquals("date GT", 1, dateValidator.compareDates(value, date20050822, GMT)); // -1 day

        // Week comparisons
        assertEquals("week LT", -1, dateValidator.compareWeeks(value, date20050830, GMT)); // +1 week
        assertEquals("week =1", 0, dateValidator.compareWeeks(value, date20050824, GMT)); // +1 day
        assertEquals("week =2", 0, dateValidator.compareWeeks(value, date20050822, GMT)); // same week
        assertEquals("week GT", 1, dateValidator.compareWeeks(value, date20050816, GMT)); // -1 week

        // Month and Quarter comparisons
        assertEquals("mnth LT", -1, dateValidator.compareMonths(value, date20050901, GMT)); // +1 month
        assertEquals("mnth =1", 0, dateValidator.compareMonths(value, date20050830, GMT)); // +1 week
        assertEquals("mnth =2", 0, dateValidator.compareMonths(value, date20050801, GMT)); // same month
        assertEquals("mnth GT", 1, dateValidator.compareMonths(value, date20050731, GMT)); // -1 month

        // Year comparisons
        assertEquals("year LT", -1, dateValidator.compareYears(value, date20060101, GMT)); // +1 year
        assertEquals("year EQ", 0, dateValidator.compareYears(value, date20050101, GMT)); // same year
        assertEquals("year GT", 1, dateValidator.compareYears(value, date20041231, GMT)); // -1 year

        // Compare using alternative TimeZone
        final Date sameDayTwoAm = createDate(GMT, testDate, 20000);
        assertEquals("date LT", -1, dateValidator.compareDates(value, date20050824, EST)); // +1 day
        assertEquals("date EQ", 0, dateValidator.compareDates(value, diffHour, EST)); // same day, diff hour
        assertEquals("date EQ", 1, dateValidator.compareDates(value, sameDayTwoAm, EST)); // same day, diff hour
        assertEquals("date GT", 1, dateValidator.compareDates(value, date20050822, EST)); // -1 day
    }

}
