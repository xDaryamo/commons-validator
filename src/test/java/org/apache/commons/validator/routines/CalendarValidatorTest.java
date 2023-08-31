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
import java.text.Format;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import static org.junit.Assert.assertNotEquals;

/**
 * Test Case for CalendarValidator.
 */
public class CalendarValidatorTest extends AbstractCalendarValidatorTest {

    private static final int DATE_2005_11_23 = 20051123;
    private static final int TIME_12_03_45   = 120345;

    private CalendarValidator calValidator;

    /**
     * Constructor
     * @param name test name
     */
    public CalendarValidatorTest(final String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        calValidator = new CalendarValidator();
        validator         = calValidator;
    }

    /**
     * Test CalendarValidator validate Methods
     */
    public void testCalendarValidatorMethods() {
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

        CalendarValidator validator = CalendarValidator.getInstance();

        assertEquals("validate(A) default", expected, validator.validate(defaultVal).getTime());
        assertTrue("isValid(A) default", validator.isValid(defaultVal));

        assertEquals("validate(A) locale", expected, validator.validate(localeVal, locale).getTime());
        assertTrue("isValid(A) locale", validator.isValid(localeVal, locale));

        assertNull("validate(B) default", validator.validate(XXXX));
        assertFalse("isValid(B) default", validator.isValid(XXXX));

        assertNull("validate(B) locale", validator.validate(XXXX, locale));
        assertFalse("isValid(B) locale", validator.isValid(XXXX, locale));

        final TimeZone zone = (TimeZone.getDefault().getRawOffset() == EET.getRawOffset() ? EST : EET);
        final Date expectedZone = createCalendar(zone, 20051231, 0).getTime();
        assertNotEquals("default/EET same ", expected.getTime(), expectedZone.getTime());

        assertEquals("validate(C) default", expectedZone, validator.validate(defaultVal, zone).getTime());
        assertEquals("validate(C) locale", expectedZone, validator.validate(localeVal, locale, zone).getTime());
    }






    /**
     * Test compare date methods
     */
    public void testCompare() {
        final int sameTime = 124522;
        final int testDate = 20050823;
        final Calendar value = createCalendar(GMT, testDate, sameTime);

        final Calendar[] calendars = {
                createCalendar(GMT, 20050824, sameTime),
                createCalendar(GMT, 20050822, sameTime),
                createCalendar(GMT, 20050830, sameTime),
                createCalendar(GMT, 20050816, sameTime),
                createCalendar(GMT, 20050901, sameTime),
                createCalendar(GMT, 20050801, sameTime),
                createCalendar(GMT, 20050731, sameTime),
                createCalendar(GMT, 20051101, sameTime),
                createCalendar(GMT, 20051001, sameTime),
                createCalendar(GMT, 20050701, sameTime),
                createCalendar(GMT, 20050630, sameTime),
                createCalendar(GMT, 20060101, sameTime),
                createCalendar(GMT, 20050101, sameTime),
                createCalendar(GMT, 20041231, sameTime)
        };

        for (Calendar calendar : calendars) {
            int result = value.compareTo(calendar);
            String message = String.format(
                    "Comparison: %s to %s", value.getTime(), calendar.getTime()
            );
            assertNotEquals(message, 0, result);
        }
    }



    /**
     * Test Date/Time style Validator (there isn't an implementation for this)
     */
    public void testDateTimeStyle() {
        // Set the default Locale
        final Locale origDefault = Locale.getDefault();
        Locale.setDefault(Locale.UK);

        final AbstractCalendarValidator dateTimeValidator =
            new AbstractCalendarValidator(true, DateFormat.SHORT, DateFormat.SHORT) {
                private static final long serialVersionUID = 1L;

            @Override
            protected Object processParsedValue(final Object value, final Format formatter) {
                return value;
            }
        };
        assertTrue("validate(A) default", dateTimeValidator.isValid("31/12/05 14:23"));
        assertTrue("validate(A) locale ", dateTimeValidator.isValid("12/31/05 2:23 PM", Locale.US));

        // Restore the original default
        Locale.setDefault(origDefault);
    }

    /**
     * Test format methods
     */
    @Override
    public void testFormat() {
        // Set the default Locale
        final Locale origDefault = Locale.getDefault();
        Locale.setDefault(Locale.UK);

        final Calendar cal20050101 = createCalendar(GMT, 20051231, 11500);
        assertNull("null", calValidator.format(null));
        assertEquals("default",  "31/12/05",         calValidator.format(cal20050101));
        assertEquals("locale",   "12/31/05",         calValidator.format(cal20050101, Locale.US));
        assertEquals("patternA", "2005-12-31 01:15", calValidator.format(cal20050101, "yyyy-MM-dd HH:mm"));
        assertEquals("patternB", "2005-12-31 GMT",   calValidator.format(cal20050101, "yyyy-MM-dd z"));
        assertEquals("both",     "31 Dez 2005",      calValidator.format(cal20050101, "dd MMM yyyy", Locale.GERMAN));

        // EST Time Zone
        assertEquals("EST default",  "30/12/05",         calValidator.format(cal20050101, EST));
        assertEquals("EST locale",   "12/30/05",         calValidator.format(cal20050101, Locale.US, EST));
        assertEquals("EST patternA", "2005-12-30 20:15", calValidator.format(cal20050101, "yyyy-MM-dd HH:mm", EST));
        assertEquals("EST patternB", "2005-12-30 EST",   calValidator.format(cal20050101, "yyyy-MM-dd z", EST));
        assertEquals("EST both",     "30 Dez 2005",      calValidator.format(cal20050101, "dd MMM yyyy", Locale.GERMAN, EST));

        // Restore the original default
        Locale.setDefault(origDefault);
    }

    /**
     * Test adjustToTimeZone() method
     */
    public void testAdjustToTimeZone() {

        final Calendar calEST = createCalendar(EST, DATE_2005_11_23, TIME_12_03_45);
        final Date dateEST = calEST.getTime();

        final Calendar calGMT = createCalendar(GMT, DATE_2005_11_23, TIME_12_03_45);
        final Date dateGMT = calGMT.getTime();

        final Calendar calCET = createCalendar(EET, DATE_2005_11_23, TIME_12_03_45);
        final Date dateCET = calCET.getTime();

        // Check the dates don't match
        assertNotEquals("Check GMT != CET", dateGMT.getTime(), dateCET.getTime());
        assertNotEquals("Check GMT != CET", dateGMT.getTime(), dateEST.getTime());
        assertNotEquals("Check GMT != CET", dateCET.getTime(), dateEST.getTime());

        // EST to GMT and back
        CalendarValidator.adjustToTimeZone(calEST, GMT);
        assertEquals("EST to GMT", dateGMT, calEST.getTime());
        assertNotSame("Check EST = GMT", dateEST, calEST.getTime());
        CalendarValidator.adjustToTimeZone(calEST, EST);
        assertEquals("back to EST", dateEST, calEST.getTime());
        assertNotSame("Check EST != GMT", dateGMT, calEST.getTime());

        // CET to GMT and back
        CalendarValidator.adjustToTimeZone(calCET, GMT);
        assertEquals("CET to GMT", dateGMT, calCET.getTime());
        assertNotSame("Check CET = GMT", dateCET, calCET.getTime());
        CalendarValidator.adjustToTimeZone(calCET, EET);
        assertEquals("back to CET", dateCET, calCET.getTime());
        assertNotSame("Check CET != GMT", dateGMT, calCET.getTime());

        // Adjust to TimeZone with Same rules
        final Calendar calUTC = createCalendar(UTC, DATE_2005_11_23, TIME_12_03_45);
        assertTrue("SAME: UTC = GMT",  UTC.hasSameRules(GMT));
        assertEquals("SAME: Check time (A)", calUTC.getTime(), calGMT.getTime());
        assertNotEquals("SAME: Check GMT(A)", GMT, calUTC.getTimeZone());
        assertEquals("SAME: Check UTC(A)", UTC, calUTC.getTimeZone());
        CalendarValidator.adjustToTimeZone(calUTC, GMT);
        assertEquals("SAME: Check time (B)", calUTC.getTime(), calGMT.getTime());
        assertEquals("SAME: Check GMT(B)", GMT, calUTC.getTimeZone());
        assertNotEquals("SAME: Check UTC(B)", UTC, calUTC.getTimeZone());
    }

}
