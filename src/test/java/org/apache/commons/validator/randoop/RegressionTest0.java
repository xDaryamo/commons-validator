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

package org.apache.commons.validator.randoop;/*
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

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test002");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test003");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test004");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.lang.Class<?> wildcardClass1 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test005");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        java.lang.Class<?> wildcardClass4 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test006");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.lang.Class<?> wildcardClass8 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test007");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test008");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.lang.Class<?> wildcardClass4 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test009");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test010");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test011");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.lang.Class<?> wildcardClass11 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test012");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test013");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass8 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test014");
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
        java.lang.Class<?> wildcardClass17 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test015");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test016");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test017");
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
        java.lang.Class<?> wildcardClass24 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test018");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test019");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test020");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.lang.Class<?> wildcardClass8 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test021");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        java.lang.Class<?> wildcardClass8 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test022");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass12 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test023");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test024");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test025");
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
        java.lang.Class<?> wildcardClass17 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test026");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test027");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test028");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        java.lang.Class<?> wildcardClass14 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test029");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.lang.Class<?> wildcardClass11 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test030");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass16 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test031");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass5 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test032");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        java.lang.Class<?> wildcardClass17 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test033");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test034");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test035");
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
        boolean boolean29 = dateValidator0.isValid("", "", true);
        java.lang.Class<?> wildcardClass30 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test036");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test037");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("hi!", locale13);
        java.lang.Class<?> wildcardClass15 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test038");
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
        java.lang.Class<?> wildcardClass23 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test039");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.lang.Class<?> wildcardClass11 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test040");
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
        java.lang.Class<?> wildcardClass25 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test041");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        boolean boolean12 = dateValidator0.isValid("hi!", "", true);
        java.lang.Class<?> wildcardClass13 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test042");
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
        java.lang.Class<?> wildcardClass20 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test043");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test044");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass9 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test045");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test046");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        java.util.Locale locale24 = null;
        boolean boolean25 = dateValidator0.isValid("", locale24);
        java.lang.Class<?> wildcardClass26 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test047");
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
        boolean boolean23 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test048");
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
        java.lang.Class<?> wildcardClass17 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test049");
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
        java.lang.Class<?> wildcardClass33 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test050");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test051");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test052");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("hi!", locale15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test053");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass27 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test054");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        java.lang.Class<?> wildcardClass18 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test055");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass16 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test056");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        boolean boolean17 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass18 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test057");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        boolean boolean7 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test058");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test059");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.lang.Class<?> wildcardClass12 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test060");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("hi!", locale5);
        java.lang.Class<?> wildcardClass7 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test061");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test062");
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
        boolean boolean26 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass27 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test063");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        java.lang.Class<?> wildcardClass23 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test064");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test065");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test066");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
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
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test067");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("", locale18);
        java.lang.Class<?> wildcardClass20 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test068");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("", "", false);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("hi!", locale10);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        java.lang.Class<?> wildcardClass15 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test069");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test070");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("", locale5);
        java.util.Locale locale8 = null;
        boolean boolean9 = dateValidator0.isValid("", locale8);
        boolean boolean13 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass14 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test071");
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
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        java.lang.Class<?> wildcardClass27 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test072");
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
        boolean boolean23 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass24 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test073");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test074");
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
        java.lang.Class<?> wildcardClass33 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test075");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test076");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        boolean boolean30 = dateValidator0.isValid("", "", false);
        boolean boolean34 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale36 = null;
        boolean boolean37 = dateValidator0.isValid("hi!", locale36);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test077");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("hi!", locale10);
        java.lang.Class<?> wildcardClass12 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test078");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test079");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        java.lang.Class<?> wildcardClass12 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test080");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("", "", false);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("hi!", locale10);
        java.lang.Class<?> wildcardClass12 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test081");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        boolean boolean22 = dateValidator0.isValid("hi!", "", true);
        java.lang.Class<?> wildcardClass23 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test082");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test083");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        boolean boolean22 = dateValidator0.isValid("hi!", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test084");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        java.lang.Class<?> wildcardClass15 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test085");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        java.lang.Class<?> wildcardClass19 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test086");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        java.util.Locale locale24 = null;
        boolean boolean25 = dateValidator0.isValid("hi!", locale24);
        java.lang.Class<?> wildcardClass26 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test087");
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
        boolean boolean26 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test088");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        boolean boolean22 = dateValidator0.isValid("hi!", "", true);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass27 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test089");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test090");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test091");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test092");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test093");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        java.lang.Class<?> wildcardClass14 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test094");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("hi!", locale5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test095");
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
        java.lang.Class<?> wildcardClass19 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test096");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("", locale5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test097");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("hi!", locale20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test098");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test099");
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
        java.lang.Class<?> wildcardClass36 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test100");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("hi!", locale15);
        java.lang.Class<?> wildcardClass17 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test101");
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
        java.lang.Class<?> wildcardClass25 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test102");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        java.util.Locale locale24 = null;
        boolean boolean25 = dateValidator0.isValid("hi!", locale24);
        boolean boolean29 = dateValidator0.isValid("", "", true);
        java.lang.Class<?> wildcardClass30 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test103");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        boolean boolean7 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass8 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test104");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test105");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        boolean boolean17 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = dateValidator0.isValid("hi!", "hi!", true);
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
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test106");
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
        java.lang.Class<?> wildcardClass16 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test107");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test108");
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
        java.lang.Class<?> wildcardClass20 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test109");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        java.lang.Class<?> wildcardClass14 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test110");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test111");
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
        java.util.Locale locale34 = null;
        boolean boolean35 = dateValidator0.isValid("hi!", locale34);
        java.lang.Class<?> wildcardClass36 = dateValidator0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test112");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        java.util.Locale locale24 = null;
        boolean boolean25 = dateValidator0.isValid("hi!", locale24);
        boolean boolean29 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass30 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test113");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = dateValidator0.isValid("hi!", "hi!", false);
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
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test114");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        boolean boolean19 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass20 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test115");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test116");
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
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        java.lang.Class<?> wildcardClass27 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test117");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test118");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test119");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("hi!", locale13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test120");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test121");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test122");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test123");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("hi!", locale5);
        boolean boolean10 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass11 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test124");
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
        boolean boolean28 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass29 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test125");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test126");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = dateValidator0.isValid("hi!", "hi!", true);
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
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test127");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test128");
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
        boolean boolean23 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test129");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("", locale17);
        java.lang.Class<?> wildcardClass19 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test130");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("hi!", locale13);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("hi!", locale16);
        java.lang.Class<?> wildcardClass18 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test131");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.lang.Class<?> wildcardClass11 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test132");
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
        boolean boolean23 = dateValidator0.isValid("", "", false);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        java.lang.Class<?> wildcardClass27 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test133");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test134");
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
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("", locale18);
        java.lang.Class<?> wildcardClass20 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test135");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("", locale20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test136");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test137");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test138");
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
        boolean boolean27 = dateValidator0.isValid("", "", true);
        java.lang.Class<?> wildcardClass28 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test139");
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
        java.lang.Class<?> wildcardClass40 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test140");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("hi!", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("", locale18);
        java.lang.Class<?> wildcardClass20 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test141");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test142");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        boolean boolean12 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass13 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test143");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        boolean boolean12 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test144");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        boolean boolean14 = dateValidator0.isValid("hi!", "", false);
        boolean boolean18 = dateValidator0.isValid("", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test145");
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
        boolean boolean25 = dateValidator0.isValid("hi!", locale24);
        java.util.Locale locale27 = null;
        boolean boolean28 = dateValidator0.isValid("", locale27);
        boolean boolean32 = dateValidator0.isValid("", "", true);
        java.lang.Class<?> wildcardClass33 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test146");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        boolean boolean19 = dateValidator0.isValid("", "", false);
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test147");
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
        boolean boolean27 = dateValidator0.isValid("hi!", "", true);
        java.lang.Class<?> wildcardClass28 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test148");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test149");
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
        java.lang.Class<?> wildcardClass26 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test150");
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
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("", locale23);
        java.lang.Class<?> wildcardClass25 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test151");
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
        boolean boolean25 = dateValidator0.isValid("hi!", locale24);
        java.util.Locale locale27 = null;
        boolean boolean28 = dateValidator0.isValid("", locale27);
        java.lang.Class<?> wildcardClass29 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test152");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        boolean boolean30 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale32 = null;
        boolean boolean33 = dateValidator0.isValid("", locale32);
        java.lang.Class<?> wildcardClass34 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test153");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("", locale18);
        boolean boolean23 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        java.lang.Class<?> wildcardClass27 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test154");
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
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("", locale23);
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("", locale26);
        java.lang.Class<?> wildcardClass28 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test155");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        boolean boolean30 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test156");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test157");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("hi!", locale5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test158");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        java.lang.Class<?> wildcardClass19 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test159");
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
        boolean boolean28 = dateValidator0.isValid("", "", false);
        java.util.Locale locale30 = null;
        boolean boolean31 = dateValidator0.isValid("hi!", locale30);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test160");
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
        java.lang.Class<?> wildcardClass27 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test161");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.lang.Class<?> wildcardClass14 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test162");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", false);
        boolean boolean19 = dateValidator0.isValid("", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test163");
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
        java.util.Locale locale41 = null;
        boolean boolean42 = dateValidator0.isValid("hi!", locale41);
        java.util.Locale locale44 = null;
        boolean boolean45 = dateValidator0.isValid("hi!", locale44);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test164");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        boolean boolean30 = dateValidator0.isValid("", "", false);
        boolean boolean34 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale36 = null;
        boolean boolean37 = dateValidator0.isValid("hi!", locale36);
        java.util.Locale locale39 = null;
        boolean boolean40 = dateValidator0.isValid("", locale39);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test165");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("", locale5);
        java.util.Locale locale8 = null;
        boolean boolean9 = dateValidator0.isValid("", locale8);
        java.lang.Class<?> wildcardClass10 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test166");
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
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("hi!", locale26);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test167");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("", locale18);
        boolean boolean23 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test168");
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
        boolean boolean27 = dateValidator0.isValid("", "", true);
        java.util.Locale locale29 = null;
        boolean boolean30 = dateValidator0.isValid("", locale29);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test169");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale28 = null;
        boolean boolean29 = dateValidator0.isValid("hi!", locale28);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test170");
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
        boolean boolean25 = dateValidator0.isValid("", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = dateValidator0.isValid("", "hi!", true);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test171");
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
        boolean boolean36 = dateValidator0.isValid("", "", true);
        java.util.Locale locale38 = null;
        boolean boolean39 = dateValidator0.isValid("", locale38);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test172");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        boolean boolean30 = dateValidator0.isValid("", "", false);
        boolean boolean34 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale36 = null;
        boolean boolean37 = dateValidator0.isValid("hi!", locale36);
        java.lang.Class<?> wildcardClass38 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test173");
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
        java.lang.Class<?> wildcardClass29 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test174");
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
        boolean boolean46 = dateValidator0.isValid("hi!", locale45);
        java.lang.Class<?> wildcardClass47 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test175");
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
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        boolean boolean30 = dateValidator0.isValid("", "", true);
        java.util.Locale locale32 = null;
        boolean boolean33 = dateValidator0.isValid("", locale32);
        java.lang.Class<?> wildcardClass34 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test176");
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
        boolean boolean40 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale42 = null;
        boolean boolean43 = dateValidator0.isValid("", locale42);
        java.lang.Class<?> wildcardClass44 = dateValidator0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test177");
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
        java.lang.Class<?> wildcardClass23 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test178");
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
        java.lang.Class<?> wildcardClass22 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test179");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        boolean boolean22 = dateValidator0.isValid("hi!", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test180");
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
        java.util.Locale locale41 = null;
        boolean boolean42 = dateValidator0.isValid("hi!", locale41);
        java.util.Locale locale44 = null;
        boolean boolean45 = dateValidator0.isValid("hi!", locale44);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test181");
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
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("", locale20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test182");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = dateValidator0.isValid("hi!", "hi!", false);
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
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test183");
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
        java.util.Locale locale37 = null;
        boolean boolean38 = dateValidator0.isValid("hi!", locale37);
        java.lang.Class<?> wildcardClass39 = dateValidator0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test184");
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
        boolean boolean25 = dateValidator0.isValid("hi!", locale24);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test185");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        boolean boolean30 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale32 = null;
        boolean boolean33 = dateValidator0.isValid("", locale32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test186");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        boolean boolean12 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale14 = null;
        boolean boolean15 = dateValidator0.isValid("", locale14);
        boolean boolean19 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass20 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test187");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", false);
        boolean boolean22 = dateValidator0.isValid("", "", true);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass27 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test188");
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
        java.util.Locale locale38 = null;
        boolean boolean39 = dateValidator0.isValid("hi!", locale38);
        java.lang.Class<?> wildcardClass40 = dateValidator0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test189");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("hi!", locale20);
        java.lang.Class<?> wildcardClass22 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test190");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        boolean boolean30 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass31 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test191");
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
        boolean boolean25 = dateValidator0.isValid("", "", true);
        java.lang.Class<?> wildcardClass26 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test192");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("", "", false);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("", locale10);
        java.lang.Class<?> wildcardClass12 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test193");
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
        java.lang.Class<?> wildcardClass21 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test194");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("hi!", locale20);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("", locale23);
        boolean boolean28 = dateValidator0.isValid("hi!", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test195");
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
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        java.util.Locale locale28 = null;
        boolean boolean29 = dateValidator0.isValid("", locale28);
        java.lang.Class<?> wildcardClass30 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test196");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test197");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("hi!", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("", locale18);
        boolean boolean23 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test198");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test199");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test200");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("", "", false);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("hi!", locale10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test201");
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
        java.lang.Class<?> wildcardClass26 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test202");
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
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test203");
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
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("hi!", locale18);
        java.lang.Class<?> wildcardClass20 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test204");
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
        java.lang.Class<?> wildcardClass21 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test205");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("hi!", locale19);
        boolean boolean24 = dateValidator0.isValid("hi!", "", true);
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
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test206");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        boolean boolean17 = dateValidator0.isValid("hi!", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test207");
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
        boolean boolean32 = dateValidator0.isValid("", locale31);
        java.lang.Class<?> wildcardClass33 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test208");
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
        boolean boolean25 = dateValidator0.isValid("hi!", locale24);
        java.util.Locale locale27 = null;
        boolean boolean28 = dateValidator0.isValid("", locale27);
        boolean boolean32 = dateValidator0.isValid("", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test209");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test210");
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
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("", locale20);
        java.lang.Class<?> wildcardClass22 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test211");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        java.lang.Class<?> wildcardClass18 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test212");
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
        java.lang.Class<?> wildcardClass26 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test213");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", false);
        boolean boolean15 = dateValidator0.isValid("", "", false);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("", locale17);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("hi!", locale20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = dateValidator0.isValid("", "hi!", false);
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
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test214");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        boolean boolean22 = dateValidator0.isValid("hi!", "", true);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test215");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test216");
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
        java.lang.Class<?> wildcardClass30 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test217");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test218");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", false);
        boolean boolean15 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass16 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test219");
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
        boolean boolean29 = dateValidator0.isValid("hi!", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test220");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = dateValidator0.isValid("", "hi!", true);
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
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test221");
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
        boolean boolean23 = dateValidator0.isValid("hi!", locale22);
        java.lang.Class<?> wildcardClass24 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test222");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        java.util.Locale locale24 = null;
        boolean boolean25 = dateValidator0.isValid("", locale24);
        java.util.Locale locale27 = null;
        boolean boolean28 = dateValidator0.isValid("hi!", locale27);
        java.lang.Class<?> wildcardClass29 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test223");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test224");
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
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        java.util.Locale locale28 = null;
        boolean boolean29 = dateValidator0.isValid("", locale28);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test225");
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
        java.lang.Class<?> wildcardClass27 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test226");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test227");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test228");
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
        java.util.Locale locale34 = null;
        boolean boolean35 = dateValidator0.isValid("hi!", locale34);
        boolean boolean39 = dateValidator0.isValid("", "", false);
        boolean boolean43 = dateValidator0.isValid("", "", true);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test229");
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
        boolean boolean23 = dateValidator0.isValid("", "", false);
        boolean boolean27 = dateValidator0.isValid("", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test230");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", false);
        boolean boolean22 = dateValidator0.isValid("", "", true);
        java.lang.Class<?> wildcardClass23 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test231");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test232");
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
        boolean boolean27 = dateValidator0.isValid("", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test233");
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
        boolean boolean23 = dateValidator0.isValid("hi!", locale22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test234");
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
        boolean boolean19 = dateValidator0.isValid("", locale18);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test235");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = dateValidator0.isValid("", "hi!", true);
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
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test236");
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
        boolean boolean23 = dateValidator0.isValid("", "", false);
        boolean boolean27 = dateValidator0.isValid("", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test237");
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
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        boolean boolean30 = dateValidator0.isValid("", "", true);
        java.lang.Class<?> wildcardClass31 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test238");
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
        boolean boolean25 = dateValidator0.isValid("hi!", locale24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test239");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", false);
        boolean boolean15 = dateValidator0.isValid("", "", false);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("", locale17);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("hi!", locale20);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("", locale23);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test240");
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
        boolean boolean25 = dateValidator0.isValid("hi!", locale24);
        java.util.Locale locale27 = null;
        boolean boolean28 = dateValidator0.isValid("", locale27);
        java.util.Locale locale30 = null;
        boolean boolean31 = dateValidator0.isValid("", locale30);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test241");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        java.util.Locale locale24 = null;
        boolean boolean25 = dateValidator0.isValid("hi!", locale24);
        boolean boolean29 = dateValidator0.isValid("", "", true);
        java.util.Locale locale31 = null;
        boolean boolean32 = dateValidator0.isValid("hi!", locale31);
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
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test242");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("", locale18);
        boolean boolean23 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        java.util.Locale locale28 = null;
        boolean boolean29 = dateValidator0.isValid("hi!", locale28);
        java.lang.Class<?> wildcardClass30 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test243");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test244");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        boolean boolean30 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale32 = null;
        boolean boolean33 = dateValidator0.isValid("", locale32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test245");
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
        boolean boolean23 = dateValidator0.isValid("", "", false);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test246");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        boolean boolean14 = dateValidator0.isValid("", "", true);
        boolean boolean18 = dateValidator0.isValid("", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test247");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass19 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test248");
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
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        boolean boolean30 = dateValidator0.isValid("", "", true);
        java.util.Locale locale32 = null;
        boolean boolean33 = dateValidator0.isValid("", locale32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test249");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        boolean boolean14 = dateValidator0.isValid("", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test250");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("", locale20);
        java.lang.Class<?> wildcardClass22 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test251");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        java.lang.Class<?> wildcardClass15 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test252");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", false);
        boolean boolean15 = dateValidator0.isValid("", "", false);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("", locale17);
        boolean boolean22 = dateValidator0.isValid("", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test253");
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
        java.util.Locale locale41 = null;
        boolean boolean42 = dateValidator0.isValid("hi!", locale41);
        java.util.Locale locale44 = null;
        boolean boolean45 = dateValidator0.isValid("hi!", locale44);
        boolean boolean49 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass50 = dateValidator0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test254");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("", locale19);
        java.lang.Class<?> wildcardClass21 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test255");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("", "", false);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("hi!", locale10);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("", locale16);
        boolean boolean21 = dateValidator0.isValid("hi!", "", true);
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
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test256");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        boolean boolean14 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test257");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("hi!", locale20);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("hi!", locale23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test258");
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
        boolean boolean27 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test259");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        boolean boolean12 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale14 = null;
        boolean boolean15 = dateValidator0.isValid("", locale14);
        java.lang.Class<?> wildcardClass16 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test260");
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
        java.util.Locale locale34 = null;
        boolean boolean35 = dateValidator0.isValid("", locale34);
        java.util.Locale locale37 = null;
        boolean boolean38 = dateValidator0.isValid("", locale37);
        java.util.Locale locale40 = null;
        boolean boolean41 = dateValidator0.isValid("hi!", locale40);
        java.lang.Class<?> wildcardClass42 = dateValidator0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test261");
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
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("", locale20);
        boolean boolean25 = dateValidator0.isValid("", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test262");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("", locale18);
        boolean boolean23 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test263");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        boolean boolean22 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test264");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", false);
        boolean boolean22 = dateValidator0.isValid("", "", true);
        java.util.Locale locale24 = null;
        boolean boolean25 = dateValidator0.isValid("", locale24);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test265");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test266");
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
        java.lang.Class<?> wildcardClass30 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test267");
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
        boolean boolean30 = dateValidator0.isValid("hi!", "", false);
        boolean boolean34 = dateValidator0.isValid("hi!", "", true);
        java.lang.Class<?> wildcardClass35 = dateValidator0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test268");
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
        boolean boolean25 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass26 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test269");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("", "", false);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        java.lang.Class<?> wildcardClass19 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test270");
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
        boolean boolean29 = dateValidator0.isValid("", "", true);
        boolean boolean33 = dateValidator0.isValid("", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test271");
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
        java.lang.Class<?> wildcardClass30 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test272");
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
        boolean boolean24 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass25 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test273");
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
        boolean boolean29 = dateValidator0.isValid("", "", true);
        boolean boolean33 = dateValidator0.isValid("", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test274");
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
        boolean boolean29 = dateValidator0.isValid("", "", true);
        java.util.Locale locale31 = null;
        boolean boolean32 = dateValidator0.isValid("", locale31);
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
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test275");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("hi!", locale20);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("hi!", locale23);
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("hi!", locale26);
        java.util.Locale locale29 = null;
        boolean boolean30 = dateValidator0.isValid("", locale29);
        java.util.Locale locale32 = null;
        boolean boolean33 = dateValidator0.isValid("", locale32);
        boolean boolean37 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass38 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test276");
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
        boolean boolean36 = dateValidator0.isValid("", "", true);
        java.lang.Class<?> wildcardClass37 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test277");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        boolean boolean30 = dateValidator0.isValid("", "", false);
        boolean boolean34 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale36 = null;
        boolean boolean37 = dateValidator0.isValid("", locale36);
        java.util.Locale locale39 = null;
        boolean boolean40 = dateValidator0.isValid("hi!", locale39);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test278");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("", locale20);
        java.lang.Class<?> wildcardClass22 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test279");
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
        boolean boolean29 = dateValidator0.isValid("", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test280");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("hi!", locale13);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("hi!", locale16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test281");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test282");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        java.lang.Class<?> wildcardClass12 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test283");
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
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        java.util.Locale locale28 = null;
        boolean boolean29 = dateValidator0.isValid("hi!", locale28);
        java.lang.Class<?> wildcardClass30 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test284");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("hi!", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("", locale18);
        java.lang.Class<?> wildcardClass20 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test285");
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
        boolean boolean24 = dateValidator0.isValid("", "", false);
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("", locale26);
        java.lang.Class<?> wildcardClass28 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test286");
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
        boolean boolean19 = dateValidator0.isValid("", "", false);
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("", locale21);
        java.util.Locale locale24 = null;
        boolean boolean25 = dateValidator0.isValid("", locale24);
        java.lang.Class<?> wildcardClass26 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test287");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("hi!", locale13);
        java.lang.Class<?> wildcardClass15 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test288");
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
        boolean boolean25 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass26 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test289");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        boolean boolean17 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass18 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test290");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test291");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        boolean boolean12 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale14 = null;
        boolean boolean15 = dateValidator0.isValid("", locale14);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("", locale17);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("hi!", locale20);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test292");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("hi!", locale20);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("hi!", locale23);
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("hi!", locale26);
        java.util.Locale locale29 = null;
        boolean boolean30 = dateValidator0.isValid("", locale29);
        java.util.Locale locale32 = null;
        boolean boolean33 = dateValidator0.isValid("", locale32);
        boolean boolean37 = dateValidator0.isValid("", "", false);
        java.util.Locale locale39 = null;
        boolean boolean40 = dateValidator0.isValid("hi!", locale39);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test293");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        boolean boolean14 = dateValidator0.isValid("", "", true);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("", locale16);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test294");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("hi!", locale19);
        java.lang.Class<?> wildcardClass21 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test295");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("", locale16);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("", locale19);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test296");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        java.util.Locale locale24 = null;
        boolean boolean25 = dateValidator0.isValid("hi!", locale24);
        java.util.Locale locale27 = null;
        boolean boolean28 = dateValidator0.isValid("hi!", locale27);
        boolean boolean32 = dateValidator0.isValid("", "", false);
        java.util.Locale locale34 = null;
        boolean boolean35 = dateValidator0.isValid("", locale34);
        java.lang.Class<?> wildcardClass36 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test297");
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
        boolean boolean40 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale42 = null;
        boolean boolean43 = dateValidator0.isValid("", locale42);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test298");
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
        boolean boolean32 = dateValidator0.isValid("", locale31);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test299");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("hi!", locale15);
        java.lang.Class<?> wildcardClass17 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test300");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        java.lang.Class<?> wildcardClass9 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test301");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        boolean boolean19 = dateValidator0.isValid("", "", false);
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("", locale21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test302");
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
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("", locale18);
        boolean boolean23 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test303");
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
        boolean boolean23 = dateValidator0.isValid("hi!", locale22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test304");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("hi!", locale5);
        boolean boolean10 = dateValidator0.isValid("", "", true);
        boolean boolean14 = dateValidator0.isValid("hi!", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test305");
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
        java.util.Locale locale41 = null;
        boolean boolean42 = dateValidator0.isValid("hi!", locale41);
        java.lang.Class<?> wildcardClass43 = dateValidator0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test306");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("", "", false);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("", locale20);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("hi!", locale23);
        java.lang.Class<?> wildcardClass25 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test307");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        boolean boolean30 = dateValidator0.isValid("", "", false);
        boolean boolean34 = dateValidator0.isValid("hi!", "", true);
        java.lang.Class<?> wildcardClass35 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test308");
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
        boolean boolean30 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass31 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test309");
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
        java.lang.Class<?> wildcardClass25 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test310");
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
        boolean boolean23 = dateValidator0.isValid("", "", false);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        java.util.Locale locale28 = null;
        boolean boolean29 = dateValidator0.isValid("", locale28);
        boolean boolean33 = dateValidator0.isValid("", "", true);
        boolean boolean37 = dateValidator0.isValid("", "", false);
        java.util.Locale locale39 = null;
        boolean boolean40 = dateValidator0.isValid("hi!", locale39);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test311");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test312");
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
        java.util.Locale locale34 = null;
        boolean boolean35 = dateValidator0.isValid("hi!", locale34);
        java.util.Locale locale37 = null;
        boolean boolean38 = dateValidator0.isValid("hi!", locale37);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test313");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("", locale10);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test314");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        boolean boolean20 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale22 = null;
        boolean boolean23 = dateValidator0.isValid("", locale22);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test315");
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
        boolean boolean23 = dateValidator0.isValid("", "", false);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test316");
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
        boolean boolean24 = dateValidator0.isValid("", "", false);
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("", locale26);
        java.util.Locale locale29 = null;
        boolean boolean30 = dateValidator0.isValid("hi!", locale29);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test317");
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
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("hi!", locale18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test318");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("hi!", locale10);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        java.lang.Class<?> wildcardClass15 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test319");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("hi!", locale20);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("hi!", locale23);
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("hi!", locale26);
        java.util.Locale locale29 = null;
        boolean boolean30 = dateValidator0.isValid("", locale29);
        java.util.Locale locale32 = null;
        boolean boolean33 = dateValidator0.isValid("hi!", locale32);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test320");
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
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        boolean boolean30 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass31 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test321");
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
        boolean boolean30 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test322");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("hi!", locale5);
        boolean boolean10 = dateValidator0.isValid("", "", true);
        java.lang.Class<?> wildcardClass11 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test323");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        boolean boolean30 = dateValidator0.isValid("", "", false);
        boolean boolean34 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale36 = null;
        boolean boolean37 = dateValidator0.isValid("hi!", locale36);
        java.util.Locale locale39 = null;
        boolean boolean40 = dateValidator0.isValid("hi!", locale39);
        boolean boolean44 = dateValidator0.isValid("hi!", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test324");
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
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        boolean boolean30 = dateValidator0.isValid("", "", true);
        java.util.Locale locale32 = null;
        boolean boolean33 = dateValidator0.isValid("hi!", locale32);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test325");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("hi!", locale20);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("hi!", locale23);
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("", locale26);
        java.util.Locale locale29 = null;
        boolean boolean30 = dateValidator0.isValid("", locale29);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test326");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", false);
        boolean boolean15 = dateValidator0.isValid("", "", false);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test327");
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
        boolean boolean36 = dateValidator0.isValid("hi!", "", false);
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
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test328");
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
        boolean boolean20 = dateValidator0.isValid("", "", false);
        java.util.Locale locale22 = null;
        boolean boolean23 = dateValidator0.isValid("", locale22);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test329");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass8 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test330");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        boolean boolean14 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass15 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test331");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", false);
        boolean boolean15 = dateValidator0.isValid("", "", false);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("", locale17);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("hi!", locale20);
        boolean boolean25 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale27 = null;
        boolean boolean28 = dateValidator0.isValid("", locale27);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test332");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test333");
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
        java.util.Locale locale30 = null;
        boolean boolean31 = dateValidator0.isValid("hi!", locale30);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test334");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("hi!", locale10);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test335");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("hi!", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("", locale18);
        boolean boolean23 = dateValidator0.isValid("", "", false);
        boolean boolean27 = dateValidator0.isValid("", "", true);
        java.lang.Class<?> wildcardClass28 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test336");
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
        boolean boolean23 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test337");
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
        java.util.Locale locale41 = null;
        boolean boolean42 = dateValidator0.isValid("hi!", locale41);
        java.util.Locale locale44 = null;
        boolean boolean45 = dateValidator0.isValid("hi!", locale44);
        boolean boolean49 = dateValidator0.isValid("", "", false);
        java.util.Locale locale51 = null;
        boolean boolean52 = dateValidator0.isValid("hi!", locale51);
        java.lang.Class<?> wildcardClass53 = dateValidator0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test338");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test339");
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
        boolean boolean19 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass20 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test340");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("", "", false);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("hi!", locale10);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("hi!", locale16);
        java.lang.Class<?> wildcardClass18 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test341");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("", locale5);
        java.util.Locale locale8 = null;
        boolean boolean9 = dateValidator0.isValid("", locale8);
        boolean boolean13 = dateValidator0.isValid("", "", false);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test342");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        boolean boolean30 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test343");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        java.util.Locale locale24 = null;
        boolean boolean25 = dateValidator0.isValid("hi!", locale24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test344");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("hi!", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("", locale18);
        boolean boolean23 = dateValidator0.isValid("", "", false);
        boolean boolean27 = dateValidator0.isValid("", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test345");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("hi!", locale20);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("hi!", locale23);
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("hi!", locale26);
        java.util.Locale locale29 = null;
        boolean boolean30 = dateValidator0.isValid("", locale29);
        java.util.Locale locale32 = null;
        boolean boolean33 = dateValidator0.isValid("", locale32);
        boolean boolean37 = dateValidator0.isValid("", "", false);
        java.util.Locale locale39 = null;
        boolean boolean40 = dateValidator0.isValid("", locale39);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test346");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        boolean boolean12 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale14 = null;
        boolean boolean15 = dateValidator0.isValid("", locale14);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("", locale17);
        boolean boolean22 = dateValidator0.isValid("", "", false);
        boolean boolean26 = dateValidator0.isValid("", "", true);
        java.lang.Class<?> wildcardClass27 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test347");
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
        boolean boolean36 = dateValidator0.isValid("", "", true);
        boolean boolean40 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test348");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass8 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test349");
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
        boolean boolean23 = dateValidator0.isValid("", "", false);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("", locale25);
        java.lang.Class<?> wildcardClass27 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test350");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        boolean boolean12 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale14 = null;
        boolean boolean15 = dateValidator0.isValid("", locale14);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("", locale17);
        boolean boolean22 = dateValidator0.isValid("", "", false);
        boolean boolean26 = dateValidator0.isValid("", "", true);
        java.util.Locale locale28 = null;
        boolean boolean29 = dateValidator0.isValid("hi!", locale28);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test351");
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
        boolean boolean27 = dateValidator0.isValid("", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test352");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        boolean boolean12 = dateValidator0.isValid("hi!", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test353");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test354");
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
        boolean boolean25 = dateValidator0.isValid("hi!", locale24);
        java.util.Locale locale27 = null;
        boolean boolean28 = dateValidator0.isValid("", locale27);
        java.util.Locale locale30 = null;
        boolean boolean31 = dateValidator0.isValid("hi!", locale30);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test355");
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
        boolean boolean28 = dateValidator0.isValid("", "", false);
        boolean boolean32 = dateValidator0.isValid("", "", false);
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
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test356");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("hi!", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("hi!", locale18);
        java.lang.Class<?> wildcardClass20 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test357");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("", locale5);
        java.util.Locale locale8 = null;
        boolean boolean9 = dateValidator0.isValid("", locale8);
        java.util.Locale locale11 = null;
        boolean boolean12 = dateValidator0.isValid("hi!", locale11);
        java.lang.Class<?> wildcardClass13 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test358");
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
        boolean boolean32 = dateValidator0.isValid("", locale31);
        boolean boolean36 = dateValidator0.isValid("hi!", "", true);
        boolean boolean40 = dateValidator0.isValid("hi!", "", false);
        boolean boolean44 = dateValidator0.isValid("", "", false);
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
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test359");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("hi!", locale19);
        boolean boolean24 = dateValidator0.isValid("hi!", "", true);
        java.lang.Class<?> wildcardClass25 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test360");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        boolean boolean20 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test361");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", false);
        boolean boolean15 = dateValidator0.isValid("", "", false);
        boolean boolean19 = dateValidator0.isValid("", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test362");
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
        java.util.Locale locale34 = null;
        boolean boolean35 = dateValidator0.isValid("", locale34);
        java.util.Locale locale37 = null;
        boolean boolean38 = dateValidator0.isValid("", locale37);
        java.util.Locale locale40 = null;
        boolean boolean41 = dateValidator0.isValid("", locale40);
        java.lang.Class<?> wildcardClass42 = dateValidator0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test363");
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
        boolean boolean27 = dateValidator0.isValid("", "", true);
        boolean boolean31 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test364");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        boolean boolean22 = dateValidator0.isValid("hi!", "", true);
        boolean boolean26 = dateValidator0.isValid("", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test365");
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
        java.lang.Class<?> wildcardClass44 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test366");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test367");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("", locale5);
        java.util.Locale locale8 = null;
        boolean boolean9 = dateValidator0.isValid("", locale8);
        java.util.Locale locale11 = null;
        boolean boolean12 = dateValidator0.isValid("", locale11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test368");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("", "", false);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("hi!", locale10);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("hi!", locale13);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test369");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("", locale18);
        boolean boolean23 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass24 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test370");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        boolean boolean30 = dateValidator0.isValid("", "", false);
        boolean boolean34 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale36 = null;
        boolean boolean37 = dateValidator0.isValid("", locale36);
        java.util.Locale locale39 = null;
        boolean boolean40 = dateValidator0.isValid("hi!", locale39);
        java.lang.Class<?> wildcardClass41 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test371");
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
        java.util.Locale locale34 = null;
        boolean boolean35 = dateValidator0.isValid("", locale34);
        java.lang.Class<?> wildcardClass36 = dateValidator0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test372");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test373");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test374");
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
        java.util.Locale locale41 = null;
        boolean boolean42 = dateValidator0.isValid("hi!", locale41);
        java.util.Locale locale44 = null;
        boolean boolean45 = dateValidator0.isValid("hi!", locale44);
        boolean boolean49 = dateValidator0.isValid("", "", false);
        boolean boolean53 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale55 = null;
        boolean boolean56 = dateValidator0.isValid("hi!", locale55);
        java.lang.Class<?> wildcardClass57 = dateValidator0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test375");
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
        java.util.Locale locale38 = null;
        boolean boolean39 = dateValidator0.isValid("", locale38);
        java.util.Locale locale41 = null;
        boolean boolean42 = dateValidator0.isValid("", locale41);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test376");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("", "", false);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("", locale20);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("hi!", locale23);
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("", locale26);
        java.util.Locale locale29 = null;
        boolean boolean30 = dateValidator0.isValid("hi!", locale29);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test377");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("hi!", locale20);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("hi!", locale23);
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("hi!", locale26);
        java.util.Locale locale29 = null;
        boolean boolean30 = dateValidator0.isValid("", locale29);
        java.lang.Class<?> wildcardClass31 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test378");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test379");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("hi!", locale5);
        boolean boolean10 = dateValidator0.isValid("", "", false);
        boolean boolean14 = dateValidator0.isValid("hi!", "", true);
        java.lang.Class<?> wildcardClass15 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test380");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        boolean boolean12 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale14 = null;
        boolean boolean15 = dateValidator0.isValid("", locale14);
        boolean boolean19 = dateValidator0.isValid("", "", false);
        boolean boolean23 = dateValidator0.isValid("hi!", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test381");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test382");
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
        boolean boolean27 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass28 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test383");
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
        boolean boolean30 = dateValidator0.isValid("hi!", "", false);
        boolean boolean34 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale36 = null;
        boolean boolean37 = dateValidator0.isValid("", locale36);
        java.util.Locale locale39 = null;
        boolean boolean40 = dateValidator0.isValid("hi!", locale39);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test384");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("", locale5);
        java.util.Locale locale8 = null;
        boolean boolean9 = dateValidator0.isValid("", locale8);
        java.util.Locale locale11 = null;
        boolean boolean12 = dateValidator0.isValid("", locale11);
        boolean boolean16 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test385");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test386");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("hi!", locale13);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("", locale16);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("", locale19);
        java.lang.Class<?> wildcardClass21 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test387");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("", locale20);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("", locale23);
        java.lang.Class<?> wildcardClass25 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test388");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("hi!", locale13);
        boolean boolean18 = dateValidator0.isValid("", "", false);
        boolean boolean22 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass23 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test389");
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
        boolean boolean46 = dateValidator0.isValid("hi!", locale45);
        boolean boolean50 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale52 = null;
        boolean boolean53 = dateValidator0.isValid("", locale52);
        java.util.Locale locale55 = null;
        boolean boolean56 = dateValidator0.isValid("hi!", locale55);
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test390");
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
        java.lang.Class<?> wildcardClass21 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test391");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        boolean boolean30 = dateValidator0.isValid("", "", false);
        boolean boolean34 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale36 = null;
        boolean boolean37 = dateValidator0.isValid("hi!", locale36);
        boolean boolean41 = dateValidator0.isValid("", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test392");
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
        boolean boolean29 = dateValidator0.isValid("hi!", "", true);
        java.lang.Class<?> wildcardClass30 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test393");
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
        boolean boolean20 = dateValidator0.isValid("", "", false);
        boolean boolean24 = dateValidator0.isValid("", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test394");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("hi!", locale13);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("", locale16);
        java.lang.Class<?> wildcardClass18 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test395");
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
        boolean boolean27 = dateValidator0.isValid("", "", false);
        boolean boolean31 = dateValidator0.isValid("", "", true);
        java.util.Locale locale33 = null;
        boolean boolean34 = dateValidator0.isValid("", locale33);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test396");
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
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("", locale23);
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("", locale26);
        java.util.Locale locale29 = null;
        boolean boolean30 = dateValidator0.isValid("hi!", locale29);
        java.util.Locale locale32 = null;
        boolean boolean33 = dateValidator0.isValid("", locale32);
        java.util.Locale locale35 = null;
        boolean boolean36 = dateValidator0.isValid("", locale35);
        java.lang.Class<?> wildcardClass37 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test397");
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
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        boolean boolean30 = dateValidator0.isValid("", "", true);
        java.util.Locale locale32 = null;
        boolean boolean33 = dateValidator0.isValid("", locale32);
        boolean boolean37 = dateValidator0.isValid("", "", true);
        java.util.Locale locale39 = null;
        boolean boolean40 = dateValidator0.isValid("", locale39);
        java.util.Locale locale42 = null;
        boolean boolean43 = dateValidator0.isValid("", locale42);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test398");
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
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        boolean boolean30 = dateValidator0.isValid("", "", true);
        java.util.Locale locale32 = null;
        boolean boolean33 = dateValidator0.isValid("", locale32);
        java.util.Locale locale35 = null;
        boolean boolean36 = dateValidator0.isValid("", locale35);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test399");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test400");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test401");
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
        boolean boolean26 = dateValidator0.isValid("", "", false);
        java.util.Locale locale28 = null;
        boolean boolean29 = dateValidator0.isValid("", locale28);
        java.lang.Class<?> wildcardClass30 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test402");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test403");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        java.util.Locale locale24 = null;
        boolean boolean25 = dateValidator0.isValid("hi!", locale24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test404");
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
        boolean boolean30 = dateValidator0.isValid("hi!", "", false);
        boolean boolean34 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale36 = null;
        boolean boolean37 = dateValidator0.isValid("", locale36);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test405");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("hi!", locale13);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("hi!", locale16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test406");
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
        boolean boolean23 = dateValidator0.isValid("hi!", locale22);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("", locale25);
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
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test407");
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
        java.lang.Class<?> wildcardClass20 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test408");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("", locale19);
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
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test409");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.lang.Class<?> wildcardClass11 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test410");
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
        boolean boolean20 = dateValidator0.isValid("", "", true);
        java.util.Locale locale22 = null;
        boolean boolean23 = dateValidator0.isValid("", locale22);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test411");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        java.util.Locale locale24 = null;
        boolean boolean25 = dateValidator0.isValid("hi!", locale24);
        java.util.Locale locale27 = null;
        boolean boolean28 = dateValidator0.isValid("hi!", locale27);
        boolean boolean32 = dateValidator0.isValid("", "", false);
        java.util.Locale locale34 = null;
        boolean boolean35 = dateValidator0.isValid("hi!", locale34);
        java.lang.Class<?> wildcardClass36 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test412");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test413");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = dateValidator0.isValid("", "hi!", true);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test414");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        boolean boolean12 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale14 = null;
        boolean boolean15 = dateValidator0.isValid("", locale14);
        boolean boolean19 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass20 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test415");
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
        java.util.Locale locale34 = null;
        boolean boolean35 = dateValidator0.isValid("", locale34);
        java.util.Locale locale37 = null;
        boolean boolean38 = dateValidator0.isValid("", locale37);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test416");
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
        boolean boolean40 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass41 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test417");
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
        java.lang.Class<?> wildcardClass21 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test418");
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
        boolean boolean27 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale29 = null;
        boolean boolean30 = dateValidator0.isValid("", locale29);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test419");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("hi!", locale13);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("", locale16);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("hi!", locale19);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test420");
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
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("", locale26);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test421");
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
        boolean boolean23 = dateValidator0.isValid("", "", false);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        java.util.Locale locale28 = null;
        boolean boolean29 = dateValidator0.isValid("", locale28);
        boolean boolean33 = dateValidator0.isValid("", "", true);
        boolean boolean37 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass38 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test422");
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
        boolean boolean46 = dateValidator0.isValid("hi!", locale45);
        boolean boolean50 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale52 = null;
        boolean boolean53 = dateValidator0.isValid("", locale52);
        java.lang.Class<?> wildcardClass54 = dateValidator0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test423");
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
        boolean boolean19 = dateValidator0.isValid("", "", true);
        java.lang.Class<?> wildcardClass20 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test424");
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
        java.util.Locale locale29 = null;
        boolean boolean30 = dateValidator0.isValid("", locale29);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test425");
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
        boolean boolean30 = dateValidator0.isValid("hi!", "", false);
        boolean boolean34 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale36 = null;
        boolean boolean37 = dateValidator0.isValid("", locale36);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test426");
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
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("", locale23);
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("", locale26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = dateValidator0.isValid("", "hi!", false);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test427");
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
        boolean boolean31 = dateValidator0.isValid("hi!", "", true);
        boolean boolean35 = dateValidator0.isValid("hi!", "", true);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test428");
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
        boolean boolean27 = dateValidator0.isValid("hi!", "", false);
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
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test429");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        boolean boolean17 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("hi!", locale19);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test430");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("hi!", locale20);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("hi!", locale23);
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("hi!", locale26);
        java.util.Locale locale29 = null;
        boolean boolean30 = dateValidator0.isValid("", locale29);
        java.util.Locale locale32 = null;
        boolean boolean33 = dateValidator0.isValid("", locale32);
        java.util.Locale locale35 = null;
        boolean boolean36 = dateValidator0.isValid("", locale35);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test431");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        java.lang.Class<?> wildcardClass14 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test432");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("hi!", locale10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test433");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("", locale18);
        boolean boolean23 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("", locale25);
        java.lang.Class<?> wildcardClass27 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test434");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("", "", false);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test435");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("hi!", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("hi!", locale18);
        boolean boolean23 = dateValidator0.isValid("", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test436");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("", locale18);
        boolean boolean23 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        boolean boolean30 = dateValidator0.isValid("", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test437");
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
        java.util.Locale locale38 = null;
        boolean boolean39 = dateValidator0.isValid("", locale38);
        java.lang.Class<?> wildcardClass40 = dateValidator0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test438");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        boolean boolean30 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test439");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        boolean boolean12 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale14 = null;
        boolean boolean15 = dateValidator0.isValid("", locale14);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("", locale17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = dateValidator0.isValid("hi!", "hi!", false);
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
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test440");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("", locale18);
        boolean boolean23 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        java.util.Locale locale28 = null;
        boolean boolean29 = dateValidator0.isValid("hi!", locale28);
        java.util.Locale locale31 = null;
        boolean boolean32 = dateValidator0.isValid("hi!", locale31);
        java.util.Locale locale34 = null;
        boolean boolean35 = dateValidator0.isValid("", locale34);
        java.util.Locale locale37 = null;
        boolean boolean38 = dateValidator0.isValid("hi!", locale37);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test441");
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
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test442");
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
        boolean boolean29 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale31 = null;
        boolean boolean32 = dateValidator0.isValid("", locale31);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test443");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("", "", false);
        boolean boolean19 = dateValidator0.isValid("", "", true);
        boolean boolean23 = dateValidator0.isValid("hi!", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test444");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("hi!", locale13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test445");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale28 = null;
        boolean boolean29 = dateValidator0.isValid("", locale28);
        java.util.Locale locale31 = null;
        boolean boolean32 = dateValidator0.isValid("hi!", locale31);
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
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test446");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test447");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("", locale17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test448");
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
        java.util.Locale locale34 = null;
        boolean boolean35 = dateValidator0.isValid("hi!", locale34);
        boolean boolean39 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test449");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        boolean boolean30 = dateValidator0.isValid("hi!", "", false);
        boolean boolean34 = dateValidator0.isValid("", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test450");
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
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("", locale20);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("", locale23);
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("hi!", locale26);
        java.util.Locale locale29 = null;
        boolean boolean30 = dateValidator0.isValid("", locale29);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test451");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("", locale19);
        java.util.Locale locale22 = null;
        boolean boolean23 = dateValidator0.isValid("", locale22);
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("", locale25);
        boolean boolean30 = dateValidator0.isValid("", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test452");
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
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("hi!", locale26);
        boolean boolean31 = dateValidator0.isValid("hi!", "", true);
        java.lang.Class<?> wildcardClass32 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test453");
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
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        boolean boolean30 = dateValidator0.isValid("", "", true);
        java.util.Locale locale32 = null;
        boolean boolean33 = dateValidator0.isValid("", locale32);
        java.util.Locale locale35 = null;
        boolean boolean36 = dateValidator0.isValid("hi!", locale35);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test454");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        boolean boolean30 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale32 = null;
        boolean boolean33 = dateValidator0.isValid("", locale32);
        boolean boolean37 = dateValidator0.isValid("hi!", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test455");
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
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test456");
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
        boolean boolean20 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = dateValidator0.isValid("", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test457");
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
        java.lang.Class<?> wildcardClass24 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test458");
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
        boolean boolean23 = dateValidator0.isValid("hi!", locale22);
        boolean boolean27 = dateValidator0.isValid("hi!", "", true);
        java.lang.Class<?> wildcardClass28 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test459");
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
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("hi!", locale18);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test460");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("hi!", locale10);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("hi!", locale13);
        java.lang.Class<?> wildcardClass15 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test461");
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
        boolean boolean30 = dateValidator0.isValid("hi!", "", false);
        boolean boolean34 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass35 = dateValidator0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test462");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", false);
        boolean boolean15 = dateValidator0.isValid("", "", false);
        boolean boolean19 = dateValidator0.isValid("hi!", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test463");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("", locale10);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test464");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("", locale5);
        boolean boolean10 = dateValidator0.isValid("", "", true);
        boolean boolean14 = dateValidator0.isValid("hi!", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = dateValidator0.isValid("", "hi!", false);
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
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test465");
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
        java.util.Locale locale41 = null;
        boolean boolean42 = dateValidator0.isValid("hi!", locale41);
        java.util.Locale locale44 = null;
        boolean boolean45 = dateValidator0.isValid("hi!", locale44);
        boolean boolean49 = dateValidator0.isValid("", "", false);
        boolean boolean53 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale55 = null;
        boolean boolean56 = dateValidator0.isValid("hi!", locale55);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = dateValidator0.isValid("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test466");
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
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("", locale23);
        java.util.Locale locale26 = null;
        boolean boolean27 = dateValidator0.isValid("hi!", locale26);
        java.lang.Class<?> wildcardClass28 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test467");
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
        boolean boolean27 = dateValidator0.isValid("", "", false);
        java.util.Locale locale29 = null;
        boolean boolean30 = dateValidator0.isValid("hi!", locale29);
        java.util.Locale locale32 = null;
        boolean boolean33 = dateValidator0.isValid("", locale32);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test468");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        boolean boolean14 = dateValidator0.isValid("hi!", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test469");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        boolean boolean19 = dateValidator0.isValid("", "", false);
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("hi!", locale21);
        java.lang.Class<?> wildcardClass23 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test470");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("hi!", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("", locale18);
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("", locale21);
        boolean boolean26 = dateValidator0.isValid("hi!", "", false);
        boolean boolean30 = dateValidator0.isValid("", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test471");
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
        java.util.Locale locale41 = null;
        boolean boolean42 = dateValidator0.isValid("hi!", locale41);
        java.util.Locale locale44 = null;
        boolean boolean45 = dateValidator0.isValid("hi!", locale44);
        boolean boolean49 = dateValidator0.isValid("", "", false);
        boolean boolean53 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale55 = null;
        boolean boolean56 = dateValidator0.isValid("hi!", locale55);
        boolean boolean60 = dateValidator0.isValid("hi!", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test472");
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
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        boolean boolean30 = dateValidator0.isValid("", "", true);
        java.util.Locale locale32 = null;
        boolean boolean33 = dateValidator0.isValid("", locale32);
        java.util.Locale locale35 = null;
        boolean boolean36 = dateValidator0.isValid("", locale35);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test473");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("hi!", locale5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test474");
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
        boolean boolean27 = dateValidator0.isValid("", "", false);
        boolean boolean31 = dateValidator0.isValid("", "", true);
        java.lang.Class<?> wildcardClass32 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test475");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("", locale12);
        boolean boolean17 = dateValidator0.isValid("hi!", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = dateValidator0.isValid("hi!", "hi!", true);
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
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test476");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("hi!", locale13);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("", locale16);
        boolean boolean21 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass22 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test477");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        boolean boolean14 = dateValidator0.isValid("", "", false);
        java.lang.Class<?> wildcardClass15 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test478");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", false);
        boolean boolean15 = dateValidator0.isValid("", "", false);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("", locale17);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("hi!", locale20);
        boolean boolean25 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale27 = null;
        boolean boolean28 = dateValidator0.isValid("hi!", locale27);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test479");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        boolean boolean21 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass22 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test480");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("", locale10);
        java.lang.Class<?> wildcardClass12 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test481");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        boolean boolean7 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test482");
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
        java.util.Locale locale41 = null;
        boolean boolean42 = dateValidator0.isValid("hi!", locale41);
        java.util.Locale locale44 = null;
        boolean boolean45 = dateValidator0.isValid("hi!", locale44);
        boolean boolean49 = dateValidator0.isValid("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test483");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        boolean boolean17 = dateValidator0.isValid("", "", true);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("", locale19);
        boolean boolean24 = dateValidator0.isValid("hi!", "", false);
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
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test484");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("hi!", locale13);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("hi!", locale16);
        java.lang.Class<?> wildcardClass18 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test485");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("", locale5);
        boolean boolean10 = dateValidator0.isValid("", "", true);
        boolean boolean14 = dateValidator0.isValid("hi!", "", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = dateValidator0.isValid("hi!", "hi!", true);
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
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test486");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        boolean boolean8 = dateValidator0.isValid("", "", false);
        java.util.Locale locale10 = null;
        boolean boolean11 = dateValidator0.isValid("hi!", locale10);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("", locale16);
        java.lang.Class<?> wildcardClass18 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test487");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("hi!", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test488");
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
        java.util.Locale locale29 = null;
        boolean boolean30 = dateValidator0.isValid("hi!", locale29);
        java.lang.Class<?> wildcardClass31 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test489");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        boolean boolean11 = dateValidator0.isValid("", "", false);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test490");
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
        boolean boolean27 = dateValidator0.isValid("", "", false);
        java.util.Locale locale29 = null;
        boolean boolean30 = dateValidator0.isValid("", locale29);
        java.lang.Class<?> wildcardClass31 = dateValidator0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test491");
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
        java.lang.Class<?> wildcardClass21 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test492");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("hi!", locale6);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        java.util.Locale locale12 = null;
        boolean boolean13 = dateValidator0.isValid("hi!", locale12);
        java.util.Locale locale15 = null;
        boolean boolean16 = dateValidator0.isValid("hi!", locale15);
        java.util.Locale locale18 = null;
        boolean boolean19 = dateValidator0.isValid("", locale18);
        java.util.Locale locale21 = null;
        boolean boolean22 = dateValidator0.isValid("", locale21);
        java.util.Locale locale24 = null;
        boolean boolean25 = dateValidator0.isValid("hi!", locale24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test493");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("", locale13);
        boolean boolean18 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("hi!", locale20);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("", locale23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = dateValidator0.isValid("hi!", "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test494");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", true);
        boolean boolean11 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("hi!", locale13);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("", locale16);
        java.util.Locale locale19 = null;
        boolean boolean20 = dateValidator0.isValid("", locale19);
        java.util.Locale locale22 = null;
        boolean boolean23 = dateValidator0.isValid("hi!", locale22);
        java.lang.Class<?> wildcardClass24 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test495");
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
        java.util.Locale locale25 = null;
        boolean boolean26 = dateValidator0.isValid("hi!", locale25);
        boolean boolean30 = dateValidator0.isValid("", "", true);
        java.util.Locale locale32 = null;
        boolean boolean33 = dateValidator0.isValid("", locale32);
        boolean boolean37 = dateValidator0.isValid("hi!", "", false);
        java.lang.Class<?> wildcardClass38 = dateValidator0.getClass();
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test496");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        boolean boolean14 = dateValidator0.isValid("hi!", "", false);
        boolean boolean18 = dateValidator0.isValid("", "", true);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test497");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = dateValidator0.isValid("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test498");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale9 = null;
        boolean boolean10 = dateValidator0.isValid("hi!", locale9);
        boolean boolean14 = dateValidator0.isValid("", "", true);
        java.util.Locale locale16 = null;
        boolean boolean17 = dateValidator0.isValid("hi!", locale16);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test499");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("", locale2);
        boolean boolean7 = dateValidator0.isValid("hi!", "", false);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        java.util.Locale locale13 = null;
        boolean boolean14 = dateValidator0.isValid("hi!", locale13);
        boolean boolean18 = dateValidator0.isValid("", "", false);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "org.apache.commons.validator.randoop.RegressionTest0.test500");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        boolean boolean4 = dateValidator0.isValid("hi!", "", false);
        java.util.Locale locale6 = null;
        boolean boolean7 = dateValidator0.isValid("", locale6);
        boolean boolean11 = dateValidator0.isValid("", "", true);
        boolean boolean15 = dateValidator0.isValid("hi!", "", true);
        java.util.Locale locale17 = null;
        boolean boolean18 = dateValidator0.isValid("hi!", locale17);
        java.util.Locale locale20 = null;
        boolean boolean21 = dateValidator0.isValid("", locale20);
        java.util.Locale locale23 = null;
        boolean boolean24 = dateValidator0.isValid("hi!", locale23);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }
}

