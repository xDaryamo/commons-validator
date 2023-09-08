
/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
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
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.apache.commons.validator.ValidatorResources validatorResources0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.validator.Validator validator2 = new org.apache.commons.validator.Validator(validatorResources0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Resources cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxLength("hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((double) '#', (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((byte) 1, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isUrl("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue(0L, 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.validator.ValidatorResources validatorResources0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.validator.Validator validator1 = new org.apache.commons.validator.Validator(validatorResources0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Resources cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.matchRegexp("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.matchRegexp("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isByte("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String str0 = org.apache.commons.validator.Validator.VALIDATOR_PARAM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.commons.validator.Validator" + "'", str0, "org.apache.commons.validator.Validator");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((long) (-1), (long) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str0 = org.apache.commons.validator.Validator.VALIDATOR_ACTION_PARAM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.commons.validator.ValidatorAction" + "'", str0, "org.apache.commons.validator.ValidatorAction");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((float) (short) 1, (float) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.validator.ValidatorResources validatorResources0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.validator.Validator validator3 = new org.apache.commons.validator.Validator(validatorResources0, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Resources cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.String str0 = org.apache.commons.validator.Validator.LOCALE_PARAM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "java.util.Locale" + "'", str0, "java.util.Locale");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isBlankOrNull("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxLength("org.apache.commons.validator.ValidatorAction", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((double) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        java.lang.Class<?> wildcardClass3 = flags0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String str0 = org.apache.commons.validator.Var.JSTYPE_REGEXP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "regexp" + "'", str0, "regexp");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isCreditCard("regexp");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isUrl("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.validator.ValidatorResources validatorResources0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.validator.Validator validator2 = new org.apache.commons.validator.Validator(validatorResources0, "java.util.Locale");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Resources cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.minLength("org.apache.commons.validator.ValidatorAction", (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.maxLength("", (int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap1 = org.apache.commons.validator.util.ValidatorUtils.copyMap(strMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue(1L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isDate("", "", false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isBlankOrNull("org.apache.commons.validator.ValidatorAction");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.maxLength("regexp", 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((float) (-1L), (float) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.Locale locale1 = null;
        boolean boolean2 = org.apache.commons.validator.GenericValidator.isDate("", locale1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minLength("FormSet: language=null  country=null  variant=null\n", 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.validator.util.ValidatorUtils validatorUtils0 = new org.apache.commons.validator.util.ValidatorUtils();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minLength("Msg: name=null  key=null  resource=true  bundle=null\n", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((short) 10, (short) (byte) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue(1.0d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minLength("Var: name=null  value=null  resource=false  jsType=null\n", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.collections.FastHashMap fastHashMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.FastHashMap fastHashMap1 = org.apache.commons.validator.util.ValidatorUtils.copyFastHashMap(fastHashMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((short) (byte) 0, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.String str0 = org.apache.commons.validator.Validator.VALIDATOR_RESULTS_PARAM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.commons.validator.ValidatorResults" + "'", str0, "org.apache.commons.validator.ValidatorResults");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((-1.0f), (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((long) ' ', 1L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.validator.GenericValidator.isDate("regexp", "java.util.Locale", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'j'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        org.apache.commons.validator.Form form1 = null;
        // The following exception was thrown during execution in test generation
        try {
            formSet0.addForm(form1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxLength("Var: name=null  value=null  resource=false  jsType=null\n", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = dateValidator0.isValid("regexp", "java.util.Locale", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'j'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isDouble("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((double) 0, (double) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((float) 0, (float) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange(10.0f, (float) (-1L), (float) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((float) 0, (float) (byte) 1, (float) 100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.String str0 = org.apache.commons.validator.Validator.FORM_PARAM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.commons.validator.Form" + "'", str0, "org.apache.commons.validator.Form");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((double) 'a', (double) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.minLength("org.apache.commons.validator.ValidatorAction", (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.validator.Var var3 = new org.apache.commons.validator.Var("org.apache.commons.validator.Validator", "", "");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.validator.ValidatorException validatorException0 = new org.apache.commons.validator.ValidatorException();
        java.lang.Throwable[] throwableArray1 = validatorException0.getSuppressed();
        java.lang.String str2 = validatorException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.validator.ValidatorException" + "'", str2, "org.apache.commons.validator.ValidatorException");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((long) (byte) 100, (long) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((short) (byte) 10, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.String str0 = org.apache.commons.validator.Var.JSTYPE_INT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "int" + "'", str0, "int");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.validator.GenericValidator genericValidator0 = new org.apache.commons.validator.GenericValidator();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        java.lang.String str2 = formSet0.getLanguage();
        java.lang.String str3 = formSet0.toString();
        formSet0.addConstant("", "org.apache.commons.validator.ValidatorAction");
        org.apache.commons.validator.Form form8 = formSet0.getForm("org.apache.commons.validator.Form");
        org.apache.commons.validator.Form form9 = null;
        // The following exception was thrown during execution in test generation
        try {
            formSet0.addForm(form9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str3, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(form8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxLength("org.apache.commons.validator.ValidatorResults", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange(100.0f, (float) (byte) 10, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isCreditCard("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.maxLength("1111111111111111111111111111111111111111111111111111111111111111", 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((float) 100L, (float) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((long) (-1), (long) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((long) 0, (long) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue(100L, 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.displayKey();
        org.apache.commons.validator.Form form2 = null;
        // The following exception was thrown during execution in test generation
        try {
            formSet0.addForm(form2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "default" + "'", str1, "default");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((byte) 10, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        var0.setValue("int");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isByte("1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.String str0 = org.apache.commons.validator.Var.JSTYPE_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "string" + "'", str0, "string");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.minLength("org.apache.commons.validator.Form", (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.validator.GenericValidator.isDate("hi!", "int", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.validator.ValidatorException validatorException1 = new org.apache.commons.validator.ValidatorException("org.apache.commons.validator.ValidatorResults");
        java.lang.Throwable[] throwableArray2 = validatorException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isFloat("Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((double) (short) 10, (double) (byte) 0, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxLength("string", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        var0.setBundle("Var: name=null  value=null  resource=false  jsType=null\n");
        var0.setResource(true);
        var0.setValue("regexp");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue(0.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        boolean boolean1 = var0.isResource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((double) 1.0f, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((int) (short) 1, (-1), (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((long) (byte) -1, (long) '4', 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange(10L, (-1L), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        boolean boolean5 = var0.isResource();
        java.lang.String str6 = var0.getValue();
        var0.setResource(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str6, "Var: name=null  value=null  resource=false  jsType=null\n");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((int) (byte) -1, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue(1L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((-1L), (long) 0, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.validator.ValidatorException validatorException1 = new org.apache.commons.validator.ValidatorException("org.apache.commons.validator.ValidatorAction");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minLength("Msg: name=null  key=null  resource=true  bundle=null\n", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isLong("java.util.Locale");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        org.apache.commons.validator.Form form2 = null;
        // The following exception was thrown during execution in test generation
        try {
            formSet0.addForm(form2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isCreditCard("string");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.Locale locale1 = null;
        boolean boolean2 = org.apache.commons.validator.GenericValidator.isDate("org.apache.commons.validator.ValidatorAction", locale1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.maxLength("language=1111111111111111111111111111111111111111111111111111111111111111", 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.String str1 = msg0.toString();
        msg0.setKey("");
        msg0.setResource(false);
        java.lang.String str6 = msg0.getBundle();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str1, "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((long) (byte) 10, (long) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isDouble("java.util.Locale");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((double) 1, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.validator.GenericValidator.isDate("Var: name=null  value=null  resource=false  jsType=null\n", "language=1111111111111111111111111111111111111111111111111111111111111111", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'l'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.validator.ValidatorResources validatorResources0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.validator.Validator validator2 = new org.apache.commons.validator.Validator(validatorResources0, "language=1111111111111111111111111111111111111111111111111111111111111111");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Resources cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.maxLength("regexp", (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isByte("language=1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        var0.setResource(true);
        var0.setName("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((long) (short) 1, (long) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.maxLength("hi!", 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isShort("FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((long) (byte) 10, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((double) 100, (double) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange(10, 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((float) (short) 1, (float) 100L, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((float) (byte) 1, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        boolean boolean2 = flags0.isOn(100L);
        boolean boolean4 = flags0.isOff((long) 100);
        flags0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((double) (short) 0, (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isCreditCard("org.apache.commons.validator.Validator");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isFloat("org.apache.commons.validator.ValidatorResults");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.displayKey();
        formSet0.setLanguage("1111111111111111111111111111111111111111111111111111111111111111");
        java.lang.String str4 = formSet0.getVariant();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "default" + "'", str1, "default");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.displayKey();
        formSet0.setLanguage("1111111111111111111111111111111111111111111111111111111111111111");
        boolean boolean4 = formSet0.isProcessed();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "default" + "'", str1, "default");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("Var: name=hi!  value=null  resource=false  jsType=null\n");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((double) 1L, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.Locale locale1 = null;
        boolean boolean2 = org.apache.commons.validator.GenericValidator.isDate("int", locale1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.String str0 = org.apache.commons.validator.Validator.BEAN_PARAM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "java.lang.Object" + "'", str0, "java.lang.Object");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isByte("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isByte("java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((float) (byte) 100, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = dateValidator0.isValid("", "org.apache.commons.validator.ValidatorException", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'o'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.util.Locale locale1 = null;
        boolean boolean2 = org.apache.commons.validator.GenericValidator.isDate("string", locale1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.minLength("java.util.Locale", 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minLength("org.apache.commons.validator.ValidatorResults", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxLength("", (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = dateValidator0.isValid("java.util.Locale", "org.apache.commons.validator.Form", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'o'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((byte) 0, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        msg0.setName("org.apache.commons.validator.Validator");
        java.lang.Object obj5 = msg0.clone();
        java.lang.String str6 = msg0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "Msg: name=org.apache.commons.validator.Validator  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "Msg: name=org.apache.commons.validator.Validator  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "Msg: name=org.apache.commons.validator.Validator  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.validator.Validator" + "'", str6, "org.apache.commons.validator.Validator");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isLong("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        java.lang.String str2 = var0.toString();
        java.lang.String str3 = var0.toString();
        java.lang.Object obj4 = var0.clone();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str2, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str3, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "Var: name=null  value=null  resource=false  jsType=null\n");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.matchRegexp("org.apache.commons.validator.Form", "org.apache.commons.validator.ValidatorAction");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((int) (byte) 0, (int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isShort("java.util.Locale");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.Object obj1 = msg0.clone();
        msg0.setBundle("org.apache.commons.validator.ValidatorAction");
        msg0.setBundle("Var: name=hi!  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        java.lang.Object obj4 = var0.clone();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=false  jsType=null\n");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        java.lang.String str2 = var0.toString();
        java.lang.String str3 = var0.toString();
        java.lang.String str4 = var0.getName();
        var0.setResource(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str2, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str3, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((float) (-1L), 10.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.minLength("regexp", (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((int) (short) 10, (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.matchRegexp("Msg: name=null  key=null  resource=true  bundle=null\n", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minLength("java.lang.Object", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOn((long) ' ');
        java.lang.String str8 = flags0.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str8, "1111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange(0L, (long) (short) -1, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((float) (-1L), (float) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        boolean boolean2 = var0.isResource();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((float) 1, (float) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.validator.ValidatorException validatorException0 = new org.apache.commons.validator.ValidatorException();
        java.lang.String str1 = validatorException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.commons.validator.ValidatorException" + "'", str1, "org.apache.commons.validator.ValidatorException");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isDate("int", "1111111111111111111111111111111111111111111111111111111111111111", false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        java.lang.String str2 = msg0.getName();
        msg0.setResource(true);
        msg0.setName("0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((long) (byte) 1, (long) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        boolean boolean2 = formSet0.isProcessed();
        boolean boolean3 = formSet0.isProcessed();
        org.apache.commons.validator.Form form4 = null;
        // The following exception was thrown during execution in test generation
        try {
            formSet0.addForm(form4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        var0.setResource(true);
        java.lang.Object obj7 = var0.clone();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=true  bundle=null  jsType=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=true  bundle=null  jsType=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=true  bundle=null  jsType=null\n");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setName("hi!");
        boolean boolean4 = var0.isResource();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        arg0.setResource(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        msg0.setKey("int");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        org.apache.commons.validator.Form form3 = formSet0.getForm("org.apache.commons.validator.ValidatorAction");
        org.apache.commons.validator.Form form4 = null;
        // The following exception was thrown during execution in test generation
        try {
            formSet0.addForm(form4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(form3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setKey("Var: name=hi!  value=null  resource=false  jsType=null\n");
        java.lang.String str5 = arg0.getBundle();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((byte) 1, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((long) (short) 0, (long) (short) 0, 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.validator.ValidatorResources validatorResources0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.validator.Validator validator3 = new org.apache.commons.validator.Validator(validatorResources0, "Msg: name=null  key=null  resource=true  bundle=null\n", "default");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Resources cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isShort("regexp");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("Msg: name=null  key=null  resource=true  bundle=null\n", locale2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = dateValidator0.isValid("default", "FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'o'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isEmail("Var: name=hi!  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        java.lang.String str3 = arg0.getName();
        arg0.setBundle("0000000000000000000000000000000000000000000000000000000000000000");
        arg0.setBundle("string");
        java.lang.Class<?> wildcardClass8 = arg0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.maxLength("java.util.Locale", (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((double) (-1), (double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        long long4 = flags0.getFlags();
        flags0.turnOnAll();
        long long6 = flags0.getFlags();
        boolean boolean8 = flags0.isOff(1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.minLength("int", (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue(100L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isDate("", "1111111111111111111111111111111111111111111111111111111111111111", false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        java.lang.String str3 = msg0.getKey();
        boolean boolean4 = msg0.isResource();
        java.lang.String str5 = msg0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isByte("0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((double) 0.0f, (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        flags0.turnOnAll();
        long long5 = flags0.getFlags();
        java.lang.String str6 = flags0.toString();
        flags0.turnOnAll();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str6, "1111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minLength("default", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.String str0 = org.apache.commons.validator.Validator.FIELD_PARAM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "org.apache.commons.validator.Field" + "'", str0, "org.apache.commons.validator.Field");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((byte) 0, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        var0.setBundle("Var: name=null  value=null  resource=false  jsType=null\n");
        var0.setResource(false);
        var0.setBundle("default");
        java.lang.String str7 = var0.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str7, "Var: name=null  value=null  resource=false  jsType=null\n");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        java.lang.String str3 = msg0.toString();
        msg0.setName("org.apache.commons.validator.ValidatorException");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str3, "Msg: name=null  key=null  resource=true  bundle=null\n");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isDouble("string");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange(100L, (long) 0, 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isFloat("Var: name=hi!  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        var0.setBundle("Msg: name=null  key=null  resource=true  bundle=null\n");
        java.lang.String str3 = var0.getName();
        var0.setJsType("Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        boolean boolean1 = formSet0.isProcessed();
        org.apache.commons.validator.Form form3 = formSet0.getForm("default");
        org.apache.commons.validator.Form form4 = null;
        // The following exception was thrown during execution in test generation
        try {
            formSet0.addForm(form4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(form3);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isBlankOrNull("org.apache.commons.validator.Validator");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue(10.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((double) 0, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        java.lang.String str2 = var0.toString();
        var0.setResource(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str2, "Var: name=null  value=null  resource=false  jsType=null\n");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isCreditCard("language=org.apache.commons.validator.Form");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minLength("", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((byte) -1, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.matchRegexp("", "FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((int) (byte) 100, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        var0.setBundle("Msg: name=null  key=null  resource=true  bundle=null\n");
        java.lang.String str3 = var0.toString();
        java.lang.String str4 = var0.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str3, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        java.lang.String str2 = msg0.getName();
        msg0.setKey("Msg: name=null  key=null  resource=true  bundle=null\n");
        java.lang.String str5 = msg0.getKey();
        msg0.setKey("org.apache.commons.validator.ValidatorResults");
        msg0.setKey("java.lang.Object");
        msg0.setName("Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str5, "Msg: name=null  key=null  resource=true  bundle=null\n");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((short) (byte) 1, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        var0.setResource(true);
        var0.setJsType("org.apache.commons.validator.Form");
        java.lang.String str9 = var0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=true  bundle=null  jsType=org.apache.commons.validator.Form\n" + "'", str9, "Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=true  bundle=null  jsType=org.apache.commons.validator.Form\n");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOffAll();
        flags0.turnOff((long) '4');
        flags0.clear();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isEmail("FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOnAll();
        boolean boolean7 = flags0.isOff((long) (short) -1);
        flags0.turnOn((long) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        boolean boolean5 = flags0.isOff(100L);
        flags0.turnOffAll();
        java.lang.String str7 = flags0.toString();
        flags0.turnOffAll();
        flags0.turnOn((long) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000" + "'", str7, "0000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minLength("FormSet: language=null  country=null  variant=null\n", (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((-1.0d), (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isLong("regexp");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap2 = formSet0.getForms();
        java.lang.String str3 = formSet0.getVariant();
        java.lang.String str4 = formSet0.getLanguage();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minLength("language=org.apache.commons.validator.Form", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isByte("string");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.displayKey();
        formSet0.setLanguage("1111111111111111111111111111111111111111111111111111111111111111");
        java.lang.String str4 = formSet0.displayKey();
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap5 = formSet0.getForms();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "default" + "'", str1, "default");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "language=1111111111111111111111111111111111111111111111111111111111111111" + "'", str4, "language=1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        java.lang.String str3 = msg0.getKey();
        msg0.setKey("Msg: name=null  key=null  resource=true  bundle=null\n");
        java.lang.Class<?> wildcardClass6 = msg0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((long) (short) 100, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isLong("1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.minLength("regexp", (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        boolean boolean5 = flags0.isOff(100L);
        boolean boolean7 = flags0.equals((java.lang.Object) (short) -1);
        long long8 = flags0.getFlags();
        flags0.turnOffAll();
        flags0.turnOn((long) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((double) (short) 1, (double) 0L, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        long long4 = flags0.getFlags();
        flags0.turnOnAll();
        org.apache.commons.validator.Var var6 = new org.apache.commons.validator.Var();
        boolean boolean7 = flags0.equals((java.lang.Object) var6);
        flags0.turnOnAll();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        var0.setResource(true);
        var0.setJsType("org.apache.commons.validator.Form");
        java.lang.String str9 = var0.getName();
        var0.setBundle("0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        var0.setBundle("Var: name=null  value=null  resource=false  jsType=null\n");
        var0.setJsType("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        arg0.setKey("int");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isShort("org.apache.commons.validator.ValidatorResults");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.maxLength("", (int) ' ', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        java.lang.Object obj1 = arg0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "Arg: name=null  key=null  position=-1  bundle=null  resource=true\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "Arg: name=null  key=null  position=-1  bundle=null  resource=true\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "Arg: name=null  key=null  position=-1  bundle=null  resource=true\n");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setResource(true);
        boolean boolean3 = arg0.isResource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.lang.String str3 = org.apache.commons.validator.util.ValidatorUtils.replace("org.apache.commons.validator.Form", "Arg: name=null  key=null  position=1  bundle=  resource=true\n", "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.validator.Form" + "'", str3, "org.apache.commons.validator.Form");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((double) 100L, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        java.lang.String str3 = arg0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Arg: name=null  key=null  position=1  bundle=null  resource=true\n" + "'", str3, "Arg: name=null  key=null  position=1  bundle=null  resource=true\n");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.validator.ValidatorException validatorException1 = new org.apache.commons.validator.ValidatorException("regexp");
        java.lang.String str2 = validatorException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.validator.ValidatorException: regexp" + "'", str2, "org.apache.commons.validator.ValidatorException: regexp");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isInt("org.apache.commons.validator.ValidatorException");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        boolean boolean2 = flags0.isOn(100L);
        boolean boolean4 = flags0.isOff((long) 100);
        org.apache.commons.validator.util.Flags flags5 = new org.apache.commons.validator.util.Flags();
        flags5.turnOn((long) 100);
        boolean boolean8 = flags0.equals((java.lang.Object) 100);
        boolean boolean10 = flags0.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setKey("FormSet: language=null  country=null  variant=null\n");
        arg0.setKey("language=org.apache.commons.validator.Form");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue(0L, (long) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        java.lang.String str3 = msg0.getKey();
        msg0.setBundle("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        boolean boolean1 = formSet0.isProcessed();
        org.apache.commons.validator.Form form2 = null;
        // The following exception was thrown during execution in test generation
        try {
            formSet0.addForm(form2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        java.lang.String str3 = arg0.getName();
        arg0.setBundle("0000000000000000000000000000000000000000000000000000000000000000");
        arg0.setBundle("string");
        boolean boolean8 = arg0.isResource();
        java.lang.String str9 = arg0.getName();
        java.lang.String str10 = arg0.getBundle();
        boolean boolean11 = arg0.isResource();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "string" + "'", str10, "string");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        boolean boolean5 = flags0.isOff(100L);
        flags0.turnOffAll();
        java.lang.String str7 = flags0.toString();
        flags0.turnOffAll();
        boolean boolean10 = flags0.isOn((long) (byte) -1);
        flags0.turnOn((long) '4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000" + "'", str7, "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        boolean boolean5 = var0.isResource();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        var0.setResource(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((byte) 1, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isEmail("java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setKey("org.apache.commons.validator.Form");
        java.lang.String str5 = arg0.getName();
        int int6 = arg0.getPosition();
        int int7 = arg0.getPosition();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isDouble("1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isByte("org.apache.commons.validator.ValidatorException: regexp");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        formSet0.addConstant("org.apache.commons.validator.ValidatorAction", "org.apache.commons.validator.ValidatorAction");
        formSet0.setVariant("org.apache.commons.validator.ValidatorResults");
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap6 = formSet0.getForms();
        org.apache.commons.validator.Form form8 = formSet0.getForm("org.apache.commons.validator.ValidatorResults");
        formSet0.setLanguage("Var: name=hi!  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(form8);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.maxLength("FormSet: language=null  country=null  variant=Var: name=null  value=null  resource=false  jsType=null\n\n", (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.validator.ValidatorException validatorException1 = new org.apache.commons.validator.ValidatorException("org.apache.commons.validator.Field");
        org.apache.commons.validator.ValidatorException validatorException2 = new org.apache.commons.validator.ValidatorException();
        java.lang.Throwable[] throwableArray3 = validatorException2.getSuppressed();
        org.apache.commons.validator.ValidatorException validatorException4 = new org.apache.commons.validator.ValidatorException();
        java.lang.Throwable[] throwableArray5 = validatorException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = validatorException4.getSuppressed();
        validatorException2.addSuppressed((java.lang.Throwable) validatorException4);
        validatorException1.addSuppressed((java.lang.Throwable) validatorException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((double) (byte) 0, (double) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOff((long) 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("Arg: name=null  key=null  position=1  bundle=null  resource=true\n", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=true  bundle=null  jsType=org.apache.commons.validator.Form\n", locale5);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isEmail("org.apache.commons.validator.ValidatorAction");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setKey("FormSet: language=null  country=null  variant=null\n");
        java.lang.String str5 = arg0.getName();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        java.lang.String str2 = formSet0.getVariant();
        java.lang.Class<?> wildcardClass3 = formSet0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.validator.ValidatorException validatorException0 = new org.apache.commons.validator.ValidatorException();
        java.lang.Throwable[] throwableArray1 = validatorException0.getSuppressed();
        org.apache.commons.validator.ValidatorException validatorException2 = new org.apache.commons.validator.ValidatorException();
        java.lang.Throwable[] throwableArray3 = validatorException2.getSuppressed();
        validatorException0.addSuppressed((java.lang.Throwable) validatorException2);
        java.lang.String str5 = validatorException2.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.validator.ValidatorException" + "'", str5, "org.apache.commons.validator.ValidatorException");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        formSet0.addConstant("org.apache.commons.validator.ValidatorAction", "org.apache.commons.validator.ValidatorAction");
        formSet0.setVariant("org.apache.commons.validator.ValidatorResults");
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap6 = formSet0.getForms();
        org.apache.commons.validator.Form form8 = formSet0.getForm("org.apache.commons.validator.ValidatorResults");
        formSet0.setVariant("language=1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(form8);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        formSet0.addConstant("org.apache.commons.validator.ValidatorAction", "org.apache.commons.validator.ValidatorAction");
        formSet0.setVariant("org.apache.commons.validator.ValidatorResults");
        formSet0.addConstant("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n", "org.apache.commons.validator.Field");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        java.lang.String str3 = arg0.getName();
        arg0.setResource(true);
        java.lang.String str6 = arg0.getBundle();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.validator.Var var3 = new org.apache.commons.validator.Var("language=1111111111111111111111111111111111111111111111111111111111111111", "FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n", "Var: name=hi!  value=null  resource=false  jsType=null\n");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isDate("0000000000000000000000000000000000000000000000000000000000000000", "1111111111111111111111111111111111111111111111111111111111111111", true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue(1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((short) (byte) 1, (short) (byte) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.validator.ValidatorException validatorException1 = new org.apache.commons.validator.ValidatorException("Var: name=hi!  value=null  resource=false  jsType=null\n");
        java.lang.String str2 = validatorException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.validator.ValidatorException: Var: name=hi!  value=null  resource=false  jsType=null\n" + "'", str2, "org.apache.commons.validator.ValidatorException: Var: name=hi!  value=null  resource=false  jsType=null\n");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.String str1 = msg0.getName();
        java.lang.Object obj2 = msg0.clone();
        java.lang.Object obj3 = msg0.clone();
        msg0.setKey("Arg: name=null  key=null  position=1  bundle=null  resource=true\n");
        java.lang.String str6 = msg0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.validator.ValidatorException validatorException1 = new org.apache.commons.validator.ValidatorException("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        java.lang.Throwable[] throwableArray2 = validatorException1.getSuppressed();
        org.apache.commons.validator.ValidatorException validatorException3 = new org.apache.commons.validator.ValidatorException();
        java.lang.Throwable[] throwableArray4 = validatorException3.getSuppressed();
        org.apache.commons.validator.ValidatorException validatorException5 = new org.apache.commons.validator.ValidatorException();
        java.lang.Throwable[] throwableArray6 = validatorException5.getSuppressed();
        validatorException3.addSuppressed((java.lang.Throwable) validatorException5);
        validatorException1.addSuppressed((java.lang.Throwable) validatorException3);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        long long1 = flags0.getFlags();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.lang.String str3 = org.apache.commons.validator.util.ValidatorUtils.replace("Arg: name=null  key=null  position=1  bundle=null  resource=true\n", "org.apache.commons.validator.ValidatorException: Var: name=hi!  value=null  resource=false  jsType=null\n", "regexp");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Arg: name=null  key=null  position=1  bundle=null  resource=true\n" + "'", str3, "Arg: name=null  key=null  position=1  bundle=null  resource=true\n");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.util.Locale locale1 = null;
        boolean boolean2 = org.apache.commons.validator.GenericValidator.isDate("1111111111111111111111111111111111111111111111111111111111111111", locale1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        java.lang.Object obj1 = flags0.clone();
        java.lang.Object obj2 = flags0.clone();
        flags0.turnOffAll();
        java.lang.String str4 = flags0.toString();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000" + "'", str4, "0000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isLong("string");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        msg0.setBundle("Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        arg0.setPosition((int) (short) -1);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        java.lang.String str3 = arg0.getName();
        java.lang.String str4 = arg0.getName();
        java.lang.String str5 = arg0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.validator.ValidatorResources validatorResources0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.validator.Validator validator3 = new org.apache.commons.validator.Validator(validatorResources0, "language=org.apache.commons.validator.Form", "org.apache.commons.validator.ValidatorResults");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Resources cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.validator.Var var3 = new org.apache.commons.validator.Var("FormSet: language=null  country=null  variant=Var: name=null  value=null  resource=false  jsType=null\n\n", "Msg: name=null  key=null  resource=true  bundle=null\n", "FormSet: language=null  country=null  variant=null\n");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isInt("org.apache.commons.validator.ValidatorAction");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.displayKey();
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap2 = formSet0.getForms();
        formSet0.addConstant("org.apache.commons.validator.Form", "Arg: name=null  key=null  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "default" + "'", str1, "default");
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((-1L), (long) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        formSet0.setLanguage("default");
        boolean boolean4 = formSet0.isProcessed();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        var0.setBundle("Var: name=null  value=null  resource=false  jsType=null\n");
        var0.setResource(false);
        java.lang.String str5 = var0.getBundle();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str5, "Var: name=null  value=null  resource=false  jsType=null\n");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isDouble("org.apache.commons.validator.Form");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOnAll();
        boolean boolean7 = flags0.isOff((long) (short) -1);
        boolean boolean9 = flags0.equals((java.lang.Object) "org.apache.commons.validator.Form");
        flags0.clear();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((long) 'a', (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isDouble("org.apache.commons.validator.ValidatorResults");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setKey("org.apache.commons.validator.Form");
        java.lang.String str5 = arg0.getName();
        arg0.setBundle("string");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((short) (byte) 0, (short) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isLong("Arg: name=null  key=null  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        org.apache.commons.validator.Form form3 = formSet0.getForm("org.apache.commons.validator.ValidatorAction");
        formSet0.setVariant("java.util.Locale");
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap6 = formSet0.getForms();
        formSet0.addConstant("org.apache.commons.validator.ValidatorException", "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(form3);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((float) 1L, (float) 0L, (float) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((float) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        arg0.setResource(false);
        java.lang.String str8 = arg0.getBundle();
        arg0.setName("");
        arg0.setPosition((int) (byte) 10);
        arg0.setBundle("java.util.Locale");
        java.lang.String str15 = arg0.getName();
        arg0.setName("java.util.Locale");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        boolean boolean5 = flags0.isOff(100L);
        boolean boolean7 = flags0.isOn((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.lang.String str3 = org.apache.commons.validator.util.ValidatorUtils.replace("language=1111111111111111111111111111111111111111111111111111111111111111", "java.lang.Object", "org.apache.commons.validator.ValidatorResults");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "language=1111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "language=1111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange(0L, (long) (short) 100, (long) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((float) (-1), (float) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        boolean boolean5 = flags0.isOff(100L);
        flags0.turnOffAll();
        java.lang.String str7 = flags0.toString();
        flags0.turnOffAll();
        boolean boolean10 = flags0.isOn((long) (byte) -1);
        flags0.turnOffAll();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000" + "'", str7, "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minLength("", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.displayKey();
        boolean boolean2 = formSet0.isProcessed();
        formSet0.setCountry("");
        java.lang.String str5 = formSet0.getLanguage();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "default" + "'", str1, "default");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue(1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        arg0.setResource(false);
        java.lang.String str8 = arg0.getBundle();
        arg0.setName("");
        arg0.setName("");
        int int13 = arg0.getPosition();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((float) 1, 100.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        java.lang.String str3 = msg0.toString();
        java.lang.String str4 = msg0.getKey();
        java.lang.String str5 = msg0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str3, "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str5, "Msg: name=null  key=null  resource=true  bundle=null\n");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        formSet0.setLanguage("default");
        java.lang.String str4 = formSet0.getLanguage();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        arg0.setResource(false);
        java.lang.String str8 = arg0.getBundle();
        arg0.setName("");
        arg0.setPosition((int) (byte) 10);
        arg0.setBundle("java.util.Locale");
        java.lang.String str15 = arg0.getName();
        arg0.setPosition((int) (short) -1);
        arg0.setName("language=1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        java.lang.String str2 = formSet0.getLanguage();
        java.lang.String str3 = formSet0.toString();
        formSet0.addConstant("", "org.apache.commons.validator.ValidatorAction");
        org.apache.commons.validator.Form form8 = formSet0.getForm("org.apache.commons.validator.Form");
        formSet0.setVariant("int");
        org.apache.commons.validator.Form form12 = formSet0.getForm("Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=true  bundle=null  jsType=org.apache.commons.validator.Form\n");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str3, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(form8);
        org.junit.Assert.assertNull(form12);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.String str1 = msg0.getName();
        java.lang.Object obj2 = msg0.clone();
        java.lang.Object obj3 = msg0.clone();
        boolean boolean4 = msg0.isResource();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange(0, (int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((int) ' ', (int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        var0.setResource(true);
        java.lang.String str7 = var0.getJsType();
        var0.setBundle("default");
        java.lang.String str10 = var0.getJsType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isFloat("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        boolean boolean5 = flags0.isOff((long) (short) 100);
        flags0.turnOnAll();
        java.lang.Object obj7 = flags0.clone();
        flags0.turnOff(100L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isLong("org.apache.commons.validator.ValidatorException: regexp");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        var0.setBundle("Msg: name=null  key=null  resource=true  bundle=null\n");
        java.lang.String str3 = var0.getName();
        var0.setName("org.apache.commons.validator.Validator");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isShort("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        java.lang.String str3 = arg0.getName();
        java.lang.String str4 = arg0.getBundle();
        arg0.setResource(true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        java.lang.String str3 = arg0.getName();
        arg0.setBundle("0000000000000000000000000000000000000000000000000000000000000000");
        arg0.setBundle("string");
        boolean boolean8 = arg0.isResource();
        arg0.setBundle("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.minLength("org.apache.commons.validator.Form", (-1), (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        var0.setResource(true);
        java.lang.String str7 = var0.getJsType();
        var0.setBundle("default");
        java.lang.Object obj10 = var0.clone();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=true  bundle=default  jsType=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=true  bundle=default  jsType=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=true  bundle=default  jsType=null\n");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isBlankOrNull("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        arg0.setResource(false);
        java.lang.String str8 = arg0.getBundle();
        int int9 = arg0.getPosition();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((double) 100.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((long) (short) 100, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((float) (byte) 1, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.minLength("org.apache.commons.validator.ValidatorException: Var: name=hi!  value=null  resource=false  jsType=null\n", (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((long) (byte) 10, 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        boolean boolean5 = flags0.isOff((long) (short) 100);
        flags0.turnOnAll();
        java.lang.Object obj7 = flags0.clone();
        flags0.turnOn((-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((double) (byte) 0, (double) (-1), (double) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((short) 10, (short) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxLength("org.apache.commons.validator.ValidatorAction", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.commons.validator.Var var3 = new org.apache.commons.validator.Var("Var: name=hi!  value=null  resource=false  jsType=null\n", "int", "0000000000000000000000000000000000000000000000000000000000000000");
        var3.setValue("hi!");
        java.lang.String str6 = var3.getBundle();
        java.lang.String str7 = var3.toString();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Var: name=Var: name=hi!  value=null  resource=false  jsType=null\n  value=hi!  resource=false  jsType=0000000000000000000000000000000000000000000000000000000000000000\n" + "'", str7, "Var: name=Var: name=hi!  value=null  resource=false  jsType=null\n  value=hi!  resource=false  jsType=0000000000000000000000000000000000000000000000000000000000000000\n");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.validator.GenericValidator.isDate("", "Var: name=hi!  value=null  resource=false  jsType=null\n", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'V'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setKey("Var: name=hi!  value=null  resource=false  jsType=null\n");
        arg0.setName("Var: name=null  value=null  resource=false  jsType=null\n");
        arg0.setKey("");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        long long4 = flags0.getFlags();
        flags0.turnOnAll();
        org.apache.commons.validator.Var var6 = new org.apache.commons.validator.Var();
        boolean boolean7 = flags0.equals((java.lang.Object) var6);
        var6.setJsType("org.apache.commons.validator.ValidatorResults");
        java.lang.String str10 = var6.getJsType();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.validator.ValidatorResults" + "'", str10, "org.apache.commons.validator.ValidatorResults");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.validator.GenericValidator.isDate("org.apache.commons.validator.Form", "org.apache.commons.validator.ValidatorException", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'o'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((float) 1L, (float) 1L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        java.lang.Object obj1 = flags0.clone();
        java.lang.Object obj2 = flags0.clone();
        flags0.turnOffAll();
        flags0.clear();
        flags0.turnOff((long) (byte) 10);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "0000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange(100, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        java.lang.String str3 = msg0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.Object obj1 = msg0.clone();
        msg0.setBundle("org.apache.commons.validator.ValidatorAction");
        boolean boolean4 = msg0.isResource();
        java.lang.String str5 = msg0.getName();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        java.lang.String str2 = var0.getJsType();
        java.lang.String str3 = var0.getValue();
        java.lang.String str4 = var0.getValue();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.getName();
        boolean boolean2 = var0.isResource();
        var0.setBundle("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isEmail("int");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        var0.setResource(true);
        var0.setJsType("regexp");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        java.lang.String str2 = formSet0.getVariant();
        org.apache.commons.validator.Form form4 = formSet0.getForm("java.util.Locale");
        formSet0.setCountry("org.apache.commons.validator.ValidatorException: regexp");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(form4);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        arg0.setResource(false);
        int int8 = arg0.getPosition();
        int int9 = arg0.getPosition();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.displayKey();
        boolean boolean2 = formSet0.isProcessed();
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap3 = formSet0.getForms();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "default" + "'", str1, "default");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        java.lang.String str2 = var0.getBundle();
        java.lang.String str3 = var0.getBundle();
        var0.setBundle("java.util.Locale");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setBundle("");
        arg0.setPosition(10);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        formSet0.addConstant("org.apache.commons.validator.ValidatorAction", "org.apache.commons.validator.ValidatorAction");
        formSet0.setVariant("org.apache.commons.validator.ValidatorResults");
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap6 = formSet0.getForms();
        java.lang.String str7 = formSet0.toString();
        org.apache.commons.validator.Form form9 = formSet0.getForm("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n" + "'", str7, "FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        org.junit.Assert.assertNull(form9);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isEmail("org.apache.commons.validator.ValidatorException");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        java.lang.String str2 = formSet0.getVariant();
        formSet0.setLanguage("org.apache.commons.validator.Validator");
        java.lang.Class<?> wildcardClass5 = formSet0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.commons.validator.ValidatorException validatorException0 = new org.apache.commons.validator.ValidatorException();
        java.lang.Throwable[] throwableArray1 = validatorException0.getSuppressed();
        org.apache.commons.validator.ValidatorException validatorException2 = new org.apache.commons.validator.ValidatorException();
        java.lang.Throwable[] throwableArray3 = validatorException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = validatorException2.getSuppressed();
        validatorException0.addSuppressed((java.lang.Throwable) validatorException2);
        java.lang.String str6 = validatorException2.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.validator.ValidatorException" + "'", str6, "org.apache.commons.validator.ValidatorException");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((-1L), (long) 0, (long) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        java.lang.String str2 = formSet0.getLanguage();
        java.lang.String str3 = formSet0.toString();
        formSet0.addConstant("", "org.apache.commons.validator.ValidatorAction");
        org.apache.commons.validator.Form form8 = formSet0.getForm("org.apache.commons.validator.Form");
        boolean boolean9 = formSet0.isProcessed();
        java.lang.String str10 = formSet0.getCountry();
        java.lang.String str11 = formSet0.getVariant();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str3, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(form8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        java.lang.String str3 = org.apache.commons.validator.util.ValidatorUtils.replace("Var: name=Var: name=hi!  value=null  resource=false  jsType=null\n  value=hi!  resource=false  jsType=0000000000000000000000000000000000000000000000000000000000000000\n", "FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n", "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Var: name=Var: name=hi!  value=null  resource=false  jsType=null\n  value=hi!  resource=false  jsType=0000000000000000000000000000000000000000000000000000000000000000\n" + "'", str3, "Var: name=Var: name=hi!  value=null  resource=false  jsType=null\n  value=hi!  resource=false  jsType=0000000000000000000000000000000000000000000000000000000000000000\n");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((float) 100L, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.Object obj1 = msg0.clone();
        msg0.setBundle("org.apache.commons.validator.ValidatorAction");
        java.lang.String str4 = msg0.toString();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorAction\n" + "'", str4, "Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorAction\n");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.util.Locale locale1 = null;
        boolean boolean2 = org.apache.commons.validator.GenericValidator.isDate("Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorAction\n", locale1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        java.lang.String str2 = msg0.getName();
        msg0.setKey("Msg: name=null  key=null  resource=true  bundle=null\n");
        java.lang.String str5 = msg0.getKey();
        msg0.setKey("org.apache.commons.validator.ValidatorResults");
        java.lang.String str8 = msg0.getBundle();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str5, "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isUrl("org.apache.commons.validator.Form");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minLength("Var: name=hi!  value=null  resource=false  jsType=null\n", (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.commons.validator.Var var3 = new org.apache.commons.validator.Var("int", "FormSet: language=null  country=null  variant=Var: name=null  value=null  resource=false  jsType=null\n\n", "org.apache.commons.validator.ValidatorResults");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((double) 100.0f, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isCreditCard("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.String str1 = msg0.getName();
        msg0.setResource(true);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((double) 1.0f, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((float) 0L, (float) (short) 100, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.String str1 = msg0.toString();
        msg0.setBundle("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str1, "Msg: name=null  key=null  resource=true  bundle=null\n");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isEmail("Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorAction\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((long) 10, (long) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        arg0.setResource(false);
        java.lang.String str8 = arg0.getBundle();
        arg0.setName("");
        arg0.setName("java.util.Locale");
        arg0.setName("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        int int6 = arg0.getPosition();
        java.lang.String str7 = arg0.getBundle();
        boolean boolean8 = arg0.isResource();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        arg0.setResource(false);
        java.lang.String str8 = arg0.getBundle();
        arg0.setName("");
        arg0.setPosition((int) (byte) 10);
        arg0.setBundle("java.util.Locale");
        arg0.setPosition((int) (byte) -1);
        arg0.setBundle("Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorAction\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setKey("FormSet: language=null  country=null  variant=null\n");
        java.lang.Object obj5 = arg0.clone();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "Arg: name=null  key=FormSet: language=null  country=null  variant=null\n  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "Arg: name=null  key=FormSet: language=null  country=null  variant=null\n  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "Arg: name=null  key=FormSet: language=null  country=null  variant=null\n  position=1  bundle=null  resource=true\n");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        java.lang.String str6 = arg0.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Arg: name=hi!  key=null  position=1  bundle=null  resource=true\n" + "'", str6, "Arg: name=hi!  key=null  position=1  bundle=null  resource=true\n");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((double) 1L, (double) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.Object obj1 = msg0.clone();
        msg0.setBundle("org.apache.commons.validator.ValidatorAction");
        msg0.setBundle("org.apache.commons.validator.ValidatorException");
        java.lang.String str6 = msg0.toString();
        java.lang.String str7 = msg0.getName();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorException\n" + "'", str6, "Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorException\n");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        msg0.setName("org.apache.commons.validator.Validator");
        java.lang.Object obj5 = msg0.clone();
        msg0.setName("FormSet: language=null  country=null  variant=null\n");
        java.lang.String str8 = msg0.getKey();
        msg0.setResource(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "Msg: name=org.apache.commons.validator.Validator  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "Msg: name=org.apache.commons.validator.Validator  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "Msg: name=org.apache.commons.validator.Validator  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isEmail("string");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOffAll();
        java.lang.Object obj7 = flags0.clone();
        flags0.turnOn((long) (byte) 10);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "0000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isDouble("Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setKey("org.apache.commons.validator.Form");
        boolean boolean5 = arg0.isResource();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isBlankOrNull("Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.validator.GenericValidator.isDate("Arg: name=hi!  key=null  position=1  bundle=null  resource=true\n", "FormSet: language=null  country=null  variant=null\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'o'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        arg0.setResource(false);
        java.lang.Object obj7 = arg0.clone();
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "Arg: name=hi!  key=null  position=1  bundle=null  resource=false\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "Arg: name=hi!  key=null  position=1  bundle=null  resource=false\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "Arg: name=hi!  key=null  position=1  bundle=null  resource=false\n");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isLong("Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        boolean boolean2 = formSet0.isProcessed();
        formSet0.setVariant("Var: name=null  value=null  resource=false  jsType=null\n");
        formSet0.setVariant("java.lang.Object");
        java.lang.Class<?> wildcardClass7 = formSet0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        java.lang.String str3 = msg0.getKey();
        boolean boolean4 = msg0.isResource();
        java.lang.Class<?> wildcardClass5 = msg0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        arg0.setResource(false);
        java.lang.String str8 = arg0.getBundle();
        arg0.setName("");
        arg0.setPosition((int) (byte) 10);
        arg0.setBundle("java.util.Locale");
        arg0.setPosition((int) (byte) -1);
        java.lang.String str17 = arg0.getBundle();
        arg0.setBundle("org.apache.commons.validator.ValidatorResults");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.util.Locale" + "'", str17, "java.util.Locale");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange(0, (int) ' ', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minLength("Arg: name=hi!  key=null  position=1  bundle=null  resource=true\n", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((double) (-1.0f), 10.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        java.lang.String str3 = arg0.getName();
        arg0.setBundle("0000000000000000000000000000000000000000000000000000000000000000");
        arg0.setBundle("string");
        boolean boolean8 = arg0.isResource();
        java.lang.String str9 = arg0.getName();
        java.lang.Object obj10 = arg0.clone();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "Arg: name=null  key=null  position=1  bundle=string  resource=true\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "Arg: name=null  key=null  position=1  bundle=string  resource=true\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "Arg: name=null  key=null  position=1  bundle=string  resource=true\n");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        java.lang.String str2 = formSet0.getLanguage();
        java.lang.String str3 = formSet0.toString();
        formSet0.addConstant("", "org.apache.commons.validator.ValidatorAction");
        org.apache.commons.validator.Form form8 = formSet0.getForm("org.apache.commons.validator.Form");
        formSet0.setVariant("int");
        java.lang.String str11 = formSet0.getLanguage();
        formSet0.setVariant("regexp");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str3, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(form8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((long) 1, (long) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.getName();
        boolean boolean2 = var0.isResource();
        java.lang.String str3 = var0.getName();
        var0.setBundle("regexp");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((long) (short) 10, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setKey("org.apache.commons.validator.Form");
        java.lang.String str5 = arg0.getName();
        int int6 = arg0.getPosition();
        arg0.setResource(true);
        java.lang.Object obj9 = arg0.clone();
        java.lang.String str10 = arg0.toString();
        arg0.setKey("FormSet: language=null  country=null  variant=Var: name=null  value=null  resource=false  jsType=null\n\n");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "Arg: name=null  key=org.apache.commons.validator.Form  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "Arg: name=null  key=org.apache.commons.validator.Form  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "Arg: name=null  key=org.apache.commons.validator.Form  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Arg: name=null  key=org.apache.commons.validator.Form  position=1  bundle=null  resource=true\n" + "'", str10, "Arg: name=null  key=org.apache.commons.validator.Form  position=1  bundle=null  resource=true\n");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        int int6 = arg0.getPosition();
        java.lang.String str7 = arg0.getBundle();
        arg0.setPosition((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.getName();
        java.lang.String str2 = var0.getName();
        var0.setJsType("org.apache.commons.validator.ValidatorException: regexp");
        java.lang.Class<?> wildcardClass5 = var0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.maxLength("FormSet: language=null  country=null  variant=Var: name=null  value=null  resource=false  jsType=null\n\n", (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isByte("Var: name=Var: name=hi!  value=null  resource=false  jsType=null\n  value=hi!  resource=false  jsType=0000000000000000000000000000000000000000000000000000000000000000\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        formSet0.addConstant("org.apache.commons.validator.ValidatorAction", "org.apache.commons.validator.ValidatorAction");
        formSet0.setVariant("org.apache.commons.validator.ValidatorResults");
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap6 = formSet0.getForms();
        java.lang.String str7 = formSet0.getCountry();
        formSet0.setVariant("Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=true  bundle=null  jsType=org.apache.commons.validator.Form\n");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        java.lang.String str2 = formSet0.getLanguage();
        java.lang.String str3 = formSet0.toString();
        formSet0.addConstant("", "org.apache.commons.validator.ValidatorAction");
        java.lang.String str7 = formSet0.getLanguage();
        java.lang.String str8 = formSet0.getVariant();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str3, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        java.lang.String str3 = arg0.getName();
        arg0.setBundle("0000000000000000000000000000000000000000000000000000000000000000");
        arg0.setBundle("string");
        boolean boolean8 = arg0.isResource();
        java.lang.String str9 = arg0.getName();
        java.lang.String str10 = arg0.getKey();
        arg0.setKey("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOn((long) ' ');
        org.apache.commons.validator.util.Flags flags8 = new org.apache.commons.validator.util.Flags();
        flags8.turnOn((long) 100);
        flags8.turnOnAll();
        flags8.turnOnAll();
        long long13 = flags8.getFlags();
        java.lang.Object obj14 = flags8.clone();
        boolean boolean15 = flags0.equals((java.lang.Object) flags8);
        flags8.turnOff((long) 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange(0.0f, (float) 100L, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isInt("language=1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        boolean boolean5 = flags0.isOff(100L);
        flags0.turnOffAll();
        flags0.turnOn((long) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        long long4 = flags0.getFlags();
        flags0.turnOnAll();
        long long6 = flags0.getFlags();
        java.lang.String str7 = flags0.toString();
        flags0.turnOnAll();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str7, "1111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isBlankOrNull("Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=true  bundle=null  jsType=org.apache.commons.validator.Form\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((long) ' ', (long) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.commons.validator.util.Flags flags1 = new org.apache.commons.validator.util.Flags(10L);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        formSet0.setLanguage("default");
        formSet0.addConstant("org.apache.commons.validator.ValidatorAction", "1111111111111111111111111111111111111111111111111111111111111111");
        java.lang.String str7 = formSet0.getLanguage();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "default" + "'", str7, "default");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((long) ' ', 0L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        long long4 = flags0.getFlags();
        flags0.turnOnAll();
        java.lang.String str6 = flags0.toString();
        flags0.turnOnAll();
        boolean boolean9 = flags0.isOn((long) (byte) 100);
        flags0.turnOn((long) (byte) 10);
        flags0.turnOnAll();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str6, "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((double) 10, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        arg0.setResource(false);
        java.lang.String str8 = arg0.getBundle();
        arg0.setName("");
        arg0.setName("");
        boolean boolean13 = arg0.isResource();
        java.lang.String str14 = arg0.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Arg: name=  key=null  position=1  bundle=null  resource=false\n" + "'", str14, "Arg: name=  key=null  position=1  bundle=null  resource=false\n");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isDouble("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        java.lang.String str2 = var0.getJsType();
        java.lang.String str3 = var0.getValue();
        boolean boolean4 = var0.isResource();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue(1.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue(100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((byte) 10, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        java.lang.String str3 = org.apache.commons.validator.util.ValidatorUtils.replace("language=org.apache.commons.validator.Form", "org.apache.commons.validator.ValidatorException: Var: name=hi!  value=null  resource=false  jsType=null\n", "Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorAction\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "language=org.apache.commons.validator.Form" + "'", str3, "language=org.apache.commons.validator.Form");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOnAll();
        boolean boolean7 = flags0.isOff((long) (short) -1);
        java.lang.Class<?> wildcardClass8 = flags0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isFloat("Arg: name=hi!  key=null  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((double) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        msg0.setName("org.apache.commons.validator.Validator");
        msg0.setBundle("int");
        msg0.setName("org.apache.commons.validator.Form");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.matchRegexp("1111111111111111111111111111111111111111111111111111111111111111", "int");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.maxLength("Var: name=null  value=null  resource=false  jsType=null\n", (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        long long4 = flags0.getFlags();
        flags0.turnOnAll();
        java.lang.Object obj6 = flags0.clone();
        org.apache.commons.validator.ValidatorException validatorException8 = new org.apache.commons.validator.ValidatorException("int");
        boolean boolean9 = flags0.equals((java.lang.Object) validatorException8);
        org.apache.commons.validator.ValidatorException validatorException11 = new org.apache.commons.validator.ValidatorException("int");
        validatorException8.addSuppressed((java.lang.Throwable) validatorException11);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        boolean boolean2 = formSet0.isProcessed();
        formSet0.setVariant("Var: name=null  value=null  resource=false  jsType=null\n");
        java.lang.String str5 = formSet0.toString();
        java.lang.String str6 = formSet0.getVariant();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FormSet: language=null  country=null  variant=Var: name=null  value=null  resource=false  jsType=null\n\n" + "'", str5, "FormSet: language=null  country=null  variant=Var: name=null  value=null  resource=false  jsType=null\n\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str6, "Var: name=null  value=null  resource=false  jsType=null\n");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        long long4 = flags0.getFlags();
        flags0.turnOnAll();
        long long6 = flags0.getFlags();
        java.lang.String str7 = flags0.toString();
        long long8 = flags0.getFlags();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str7, "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.validator.GenericValidator.isDate("hi!", "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        var0.setResource(true);
        var0.setJsType("org.apache.commons.validator.Form");
        java.lang.String str9 = var0.getName();
        java.lang.String str10 = var0.getJsType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.validator.Form" + "'", str10, "org.apache.commons.validator.Form");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        java.lang.String str3 = msg0.toString();
        boolean boolean4 = msg0.isResource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str3, "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        boolean boolean1 = formSet0.isProcessed();
        org.apache.commons.validator.Form form3 = formSet0.getForm("default");
        formSet0.setLanguage("org.apache.commons.validator.Form");
        java.lang.String str6 = formSet0.displayKey();
        org.apache.commons.validator.Form form7 = null;
        // The following exception was thrown during execution in test generation
        try {
            formSet0.addForm(form7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(form3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "language=org.apache.commons.validator.Form" + "'", str6, "language=org.apache.commons.validator.Form");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.commons.validator.ValidatorException validatorException1 = new org.apache.commons.validator.ValidatorException("1111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOnAll();
        java.lang.String str2 = flags0.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str2, "1111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isBlankOrNull("org.apache.commons.validator.Form");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        var0.setBundle("Var: name=null  value=null  resource=false  jsType=null\n");
        var0.setResource(true);
        java.lang.String str5 = var0.getName();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isShort("int");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((float) (short) 100, 0.0f, (float) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((float) 1, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isDouble("Arg: name=hi!  key=null  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((long) 100, (long) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isDouble("Var: name=Var: name=hi!  value=null  resource=false  jsType=null\n  value=hi!  resource=false  jsType=0000000000000000000000000000000000000000000000000000000000000000\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.commons.validator.ValidatorResources validatorResources0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.validator.Validator validator3 = new org.apache.commons.validator.Validator(validatorResources0, "org.apache.commons.validator.ValidatorException: Var: name=hi!  value=null  resource=false  jsType=null\n", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Resources cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isDouble("Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorException\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        java.lang.String str3 = arg0.getName();
        arg0.setBundle("0000000000000000000000000000000000000000000000000000000000000000");
        arg0.setBundle("string");
        arg0.setName("Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorException\n");
        arg0.setPosition((int) ' ');
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        long long4 = flags0.getFlags();
        flags0.turnOnAll();
        org.apache.commons.validator.Var var6 = new org.apache.commons.validator.Var();
        boolean boolean7 = flags0.equals((java.lang.Object) var6);
        var6.setJsType("org.apache.commons.validator.ValidatorResults");
        var6.setName("FormSet: language=null  country=null  variant=Var: name=null  value=null  resource=false  jsType=null\n\n");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        long long4 = flags0.getFlags();
        flags0.turnOnAll();
        java.lang.Object obj6 = flags0.clone();
        org.apache.commons.validator.ValidatorException validatorException8 = new org.apache.commons.validator.ValidatorException("int");
        boolean boolean9 = flags0.equals((java.lang.Object) validatorException8);
        java.lang.Throwable[] throwableArray10 = validatorException8.getSuppressed();
        org.apache.commons.validator.ValidatorException validatorException12 = new org.apache.commons.validator.ValidatorException("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        java.lang.Throwable[] throwableArray13 = validatorException12.getSuppressed();
        validatorException8.addSuppressed((java.lang.Throwable) validatorException12);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        int int6 = arg0.getPosition();
        java.lang.String str7 = arg0.getKey();
        java.lang.String str8 = arg0.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setName("hi!");
        var0.setValue("");
        var0.setResource(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.commons.validator.util.Flags flags1 = new org.apache.commons.validator.util.Flags((long) 0);
        flags1.clear();
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        long long4 = flags0.getFlags();
        flags0.turnOnAll();
        long long6 = flags0.getFlags();
        java.lang.String str7 = flags0.toString();
        java.lang.Object obj8 = flags0.clone();
        java.lang.String str9 = flags0.toString();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str7, "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str9, "1111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.commons.validator.EmailValidator emailValidator0 = org.apache.commons.validator.EmailValidator.getInstance();
        boolean boolean2 = emailValidator0.isValid("java.lang.Object");
        org.junit.Assert.assertNotNull(emailValidator0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        boolean boolean5 = var0.isResource();
        boolean boolean6 = var0.isResource();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        arg0.setResource(false);
        java.lang.String str8 = arg0.getBundle();
        arg0.setResource(true);
        java.lang.String str11 = arg0.getBundle();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        arg0.setResource(false);
        java.lang.String str8 = arg0.getBundle();
        java.lang.String str9 = arg0.getBundle();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        java.lang.String str3 = msg0.toString();
        java.lang.String str4 = msg0.getName();
        boolean boolean5 = msg0.isResource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str3, "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((int) (byte) 10, (int) '4', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.minLength("1111111111111111111111111111111111111111111111111111111111111111", (int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOff(1L);
        flags0.clear();
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        msg0.setName("org.apache.commons.validator.Validator");
        java.lang.String str5 = msg0.getBundle();
        msg0.setKey("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        java.lang.String str2 = formSet0.getLanguage();
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap3 = formSet0.getForms();
        java.lang.String str4 = formSet0.getCountry();
        java.lang.String str5 = formSet0.getVariant();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        var0.setResource(true);
        var0.setJsType("org.apache.commons.validator.Form");
        java.lang.String str9 = var0.getBundle();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.matchRegexp("1111111111111111111111111111111111111111111111111111111111111111", "FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isInt("Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.commons.validator.ValidatorException validatorException1 = new org.apache.commons.validator.ValidatorException("Arg: name=null  key=null  position=1  bundle=  resource=true\n");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        var0.setResource(false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.String str1 = msg0.toString();
        msg0.setKey("");
        java.lang.String str4 = msg0.getKey();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str1, "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        formSet0.setLanguage("default");
        formSet0.addConstant("java.util.Locale", "language=org.apache.commons.validator.Form");
        java.lang.String str7 = formSet0.getLanguage();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "default" + "'", str7, "default");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minLength("org.apache.commons.validator.ValidatorAction", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        formSet0.addConstant("org.apache.commons.validator.ValidatorAction", "org.apache.commons.validator.ValidatorAction");
        java.lang.String str4 = formSet0.displayKey();
        formSet0.setVariant("int");
        java.lang.String str7 = formSet0.getVariant();
        java.lang.String str8 = formSet0.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "int" + "'", str7, "int");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "FormSet: language=null  country=null  variant=int\n" + "'", str8, "FormSet: language=null  country=null  variant=int\n");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        var0.setValue("FormSet: language=null  country=null  variant=null\n");
        java.lang.String str6 = var0.getBundle();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isCreditCard("Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorException\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        long long4 = flags0.getFlags();
        flags0.turnOnAll();
        long long6 = flags0.getFlags();
        java.lang.String str7 = flags0.toString();
        flags0.turnOn(100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str7, "1111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((double) '#', (double) (-1), (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        boolean boolean5 = flags0.isOff(100L);
        flags0.turnOffAll();
        flags0.turnOffAll();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        formSet0.setLanguage("default");
        formSet0.addConstant("org.apache.commons.validator.ValidatorAction", "1111111111111111111111111111111111111111111111111111111111111111");
        formSet0.setVariant("org.apache.commons.validator.ValidatorException: regexp");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.apache.commons.validator.ValidatorException validatorException1 = new org.apache.commons.validator.ValidatorException("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        java.lang.String str2 = validatorException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.validator.ValidatorException: FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n" + "'", str2, "org.apache.commons.validator.ValidatorException: FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
    }
}

