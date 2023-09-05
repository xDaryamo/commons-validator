/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.commons.validator.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test501");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("hi!", locale15);
        boolean boolean20 = dateValidator0.isValid("", "", false);
        boolean boolean24 = dateValidator0.isValid("hi!", "", false);
        boolean boolean28 = dateValidator0.isValid("hi!", "", false);
        boolean boolean32 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale34 = null;
        boolean boolean35 = dateValidator0.isValid("", locale34);
        boolean boolean39 = dateValidator0.isValid("hi!", "", true);
        boolean boolean43 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale45 = null;
        boolean boolean46 = dateValidator0.isValid("", locale45);
        java.util.Locale locale48 = null;
        boolean boolean49 = dateValidator0.isValid("hi!", locale48);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test502");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("", locale20);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("", locale23);
        boolean boolean28 = dateValidator0.isValid("hi!", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test503");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("hi!", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("hi!", locale18);
        boolean boolean23 = dateValidator0.isValid("", "", false);
        boolean boolean27 = dateValidator0.isValid("hi!", "", true);
        boolean boolean31 = dateValidator0.isValid("", "", true);
        java.lang.Class<?> wildcardClass32 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test504");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("", locale19);
        java.util.Locale locale22 = null;
        boolean boolean23 = dateValidator0.isValid("", locale22);
        boolean boolean27 = dateValidator0.isValid("", "", true);
        java.util.Locale locale29 = null;
        boolean boolean30 = dateValidator0.isValid("hi!", locale29);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test505");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        boolean boolean12 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale14 = null;
        boolean boolean15 = dateValidator0.isValid("hi!", locale14);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test506");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        boolean boolean20 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale22 = null;
        boolean boolean23 = dateValidator0.isValid("hi!", locale22);
        boolean boolean27 = dateValidator0.isValid("", "", false);
        boolean boolean31 = dateValidator0.isValid("", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test507");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("hi!", locale18);
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("", locale21);
        java.util.Locale locale24 = null;
        boolean boolean25 = dateValidator0.isValid("hi!", locale24);
        java.util.Locale locale27 = null;
        boolean boolean28 = dateValidator0.isValid("hi!", locale27);
        boolean boolean32 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale34 = null;
        boolean boolean35 = dateValidator0.isValid("hi!", locale34);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test508");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("hi!", locale18);
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale28 = null;
        boolean boolean29 = dateValidator0.isValid("hi!", locale28);
        java.util.Locale locale31 = null;
        boolean boolean32 = dateValidator0.isValid("", locale31);
        java.util.Locale locale34 = null;
        boolean boolean35 = dateValidator0.isValid("hi!", locale34);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test509");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("", locale19);
        java.util.Locale locale22 = null;
        boolean boolean23 = dateValidator0.isValid("", locale22);
        boolean boolean27 = dateValidator0.isValid("", "", true);
        boolean boolean31 = dateValidator0.isValid("hi!", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test510");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        boolean boolean17 = dateValidator0.isValid("hi!", "", false);
        boolean boolean21 = dateValidator0.isValid("", "", true);
        boolean boolean25 = dateValidator0.isValid("", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test511");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.lang.Class<?> wildcardClass14 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test512");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("hi!", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("hi!", locale18);
        java.lang.Class<?> wildcardClass20 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test513");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("", locale16);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("", locale19);
        java.util.Locale locale22 = null;
        boolean boolean23 = dateValidator0.isValid("hi!", locale22);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("", locale25);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test514");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        boolean boolean21 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("hi!", locale23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test515");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("", locale5);
        java.util.Locale locale8 = null;
        boolean boolean9 = dateValidator0.isValid("", locale8);
        java.util.Locale locale11 = null;
        boolean boolean12 = dateValidator0.isValid("", locale11);
        java.util.Locale locale14 = null;
        boolean boolean15 = dateValidator0.isValid("", locale14);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        boolean boolean22 = dateValidator0.isValid("hi!", "", false);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale28 = null;
        boolean boolean29 = dateValidator0.isValid("hi!", locale28);
        java.util.Locale locale31 = null;
        boolean boolean32 = dateValidator0.isValid("hi!", locale31);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test516");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("", "", false);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("", locale20);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("", locale23);
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("hi!", locale26);
        java.util.Locale locale29 = null;
        boolean boolean30 = dateValidator0.isValid("", locale29);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test517");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("hi!", locale15);
        boolean boolean20 = dateValidator0.isValid("", "", false);
        java.util.Locale locale22 = null;
        boolean boolean23 = dateValidator0.isValid("", locale22);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("", locale25);
        boolean boolean30 = dateValidator0.isValid("hi!", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test518");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("", locale5);
        java.util.Locale locale8 = null;
        boolean boolean9 = dateValidator0.isValid("", locale8);
        java.util.Locale locale11 = null;
        boolean boolean12 = dateValidator0.isValid("", locale11);
        java.util.Locale locale14 = null;
        boolean boolean15 = dateValidator0.isValid("", locale14);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        boolean boolean22 = dateValidator0.isValid("hi!", "", false);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        boolean boolean30 = dateValidator0.isValid("hi!", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test519");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", false);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test520");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("", locale19);
        java.util.Locale locale22 = null;
        boolean boolean23 = dateValidator0.isValid("", locale22);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("", locale25);
        java.util.Locale locale28 = null;
        boolean boolean29 = dateValidator0.isValid("", locale28);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test521");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("", locale5);
        java.util.Locale locale8 = null;
        boolean boolean9 = dateValidator0.isValid("", locale8);
        java.util.Locale locale11 = null;
        boolean boolean12 = dateValidator0.isValid("", locale11);
        java.util.Locale locale14 = null;
        boolean boolean15 = dateValidator0.isValid("", locale14);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        boolean boolean22 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale24 = null;
        boolean boolean25 = dateValidator0.isValid("", locale24);
        boolean boolean29 = dateValidator0.isValid("hi!", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test522");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("hi!", locale19);
        java.util.Locale locale22 = null;
        boolean boolean23 = dateValidator0.isValid("", locale22);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test523");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("", "", false);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("hi!", locale10);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("", locale16);
        boolean boolean21 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("", locale23);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test524");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        boolean boolean17 = dateValidator0.isValid("hi!", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test525");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("hi!", locale5);
        boolean boolean10 = dateValidator0.isValid("", "", false);
        boolean boolean14 = dateValidator0.isValid("hi!", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test526");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("hi!", locale18);
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        java.util.Locale locale24 = null;
        boolean boolean25 = dateValidator0.isValid("", locale24);
        boolean boolean29 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale31 = null;
        boolean boolean32 = dateValidator0.isValid("hi!", locale31);
        boolean boolean36 = dateValidator0.isValid("", "", false);
        boolean boolean40 = dateValidator0.isValid("", "", true);
        boolean boolean44 = dateValidator0.isValid("hi!", "", true);
        java.lang.Class<?> wildcardClass45 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test527");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        boolean boolean20 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale22 = null;
        boolean boolean23 = dateValidator0.isValid("", locale22);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test528");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("hi!", locale5);
        boolean boolean10 = dateValidator0.isValid("", "", false);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test529");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        boolean boolean22 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale24 = null;
        boolean boolean25 = dateValidator0.isValid("hi!", locale24);
        java.util.Locale locale27 = null;
        boolean boolean28 = dateValidator0.isValid("hi!", locale27);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test530");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test531");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        boolean boolean22 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale24 = null;
        boolean boolean25 = dateValidator0.isValid("hi!", locale24);
        boolean boolean29 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale31 = null;
        boolean boolean32 = dateValidator0.isValid("", locale31);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test532");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("hi!", locale10);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("hi!", locale13);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("", locale16);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("", locale19);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test533");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("", locale5);
        java.util.Locale locale8 = null;
        boolean boolean9 = dateValidator0.isValid("", locale8);
        java.util.Locale locale11 = null;
        boolean boolean12 = dateValidator0.isValid("hi!", locale11);
        java.util.Locale locale14 = null;
        boolean boolean15 = dateValidator0.isValid("hi!", locale14);
        boolean boolean19 = dateValidator0.isValid("hi!", "", true);
        boolean boolean23 = dateValidator0.isValid("hi!", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test534");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("hi!", locale19);
        java.util.Locale locale22 = null;
        boolean boolean23 = dateValidator0.isValid("", locale22);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("", locale25);
        java.lang.Class<?> wildcardClass27 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test535");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("", "", false);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("hi!", locale10);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("", locale16);
        boolean boolean21 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass22 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test536");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        boolean boolean12 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale14 = null;
        boolean boolean15 = dateValidator0.isValid("", locale14);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("", locale17);
        boolean boolean22 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test537");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("hi!", locale15);
        boolean boolean20 = dateValidator0.isValid("", "", false);
        java.util.Locale locale22 = null;
        boolean boolean23 = dateValidator0.isValid("", locale22);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("", locale25);
        java.util.Locale locale28 = null;
        boolean boolean29 = dateValidator0.isValid("hi!", locale28);
        java.util.Locale locale31 = null;
        boolean boolean32 = dateValidator0.isValid("hi!", locale31);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test538");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("", "", false);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("hi!", locale10);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("", locale16);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("hi!", locale19);
        java.util.Locale locale22 = null;
        boolean boolean23 = dateValidator0.isValid("hi!", locale22);
        boolean boolean27 = dateValidator0.isValid("", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test539");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("", locale17);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("", locale20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test540");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        boolean boolean21 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("", locale23);
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("hi!", locale26);
        boolean boolean31 = dateValidator0.isValid("hi!", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test541");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("", locale5);
        java.util.Locale locale8 = null;
        boolean boolean9 = dateValidator0.isValid("", locale8);
        boolean boolean13 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test542");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("", locale5);
        java.util.Locale locale8 = null;
        boolean boolean9 = dateValidator0.isValid("", locale8);
        boolean boolean13 = dateValidator0.isValid("", "", false);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("hi!", locale15);
        boolean boolean20 = dateValidator0.isValid("hi!", "", true);
        java.lang.Class<?> wildcardClass21 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test543");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        boolean boolean21 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("hi!", locale23);
        boolean boolean28 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale30 = null;
        boolean boolean31 = dateValidator0.isValid("hi!", locale30);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test544");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("hi!", locale19);
        boolean boolean24 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest1.test545");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        boolean boolean20 = dateValidator0.isValid("", "", true);
        java.util.Locale locale22 = null;
        boolean boolean23 = dateValidator0.isValid("", locale22);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("", locale25);
        boolean boolean30 = dateValidator0.isValid("hi!", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }
}

