
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
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.apache.commons.validator.ValidatorResources validatorResources0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.validator.Validator validator2 = new org.apache.commons.validator.Validator(validatorResources0, "1111111111111111111111111111111111111111111111111111111111111111");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Resources cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.maxLength("org.apache.commons.validator.ValidatorException: Var: name=hi!  value=null  resource=false  jsType=null\n", (int) (short) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        var0.setBundle("Var: name=null  value=null  resource=false  jsType=null\n");
        java.lang.Object obj3 = var0.clone();
        var0.setResource(false);
        java.lang.String str6 = var0.getName();
        java.lang.String str7 = var0.getName();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isShort("Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange(1L, 100L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((double) 10, (double) (-1.0f), (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isUrl("org.apache.commons.validator.ValidatorException: Var: name=hi!  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        java.lang.String str2 = formSet0.getLanguage();
        java.lang.String str3 = formSet0.toString();
        formSet0.addConstant("", "org.apache.commons.validator.ValidatorAction");
        org.apache.commons.validator.Form form8 = formSet0.getForm("org.apache.commons.validator.Form");
        boolean boolean9 = formSet0.isProcessed();
        java.lang.String str10 = formSet0.getCountry();
        formSet0.setVariant("org.apache.commons.validator.Validator");
        org.apache.commons.validator.Form form14 = formSet0.getForm("1111111111111111111111111111111111111111111111111111111111111111");
        formSet0.addConstant("language=1111111111111111111111111111111111111111111111111111111111111111", "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str3, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(form8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(form14);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setKey("Var: name=hi!  value=null  resource=false  jsType=null\n");
        arg0.setKey("language=1111111111111111111111111111111111111111111111111111111111111111");
        arg0.setName("org.apache.commons.validator.ValidatorException: regexp");
        java.lang.String str9 = arg0.getKey();
        arg0.setKey("language=1111111111111111111111111111111111111111111111111111111111111111");
        java.lang.String str12 = arg0.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "language=1111111111111111111111111111111111111111111111111111111111111111" + "'", str9, "language=1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Arg: name=org.apache.commons.validator.ValidatorException: regexp  key=language=1111111111111111111111111111111111111111111111111111111111111111  position=1  bundle=null  resource=true\n" + "'", str12, "Arg: name=org.apache.commons.validator.ValidatorException: regexp  key=language=1111111111111111111111111111111111111111111111111111111111111111  position=1  bundle=null  resource=true\n");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isLong("Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=true  bundle=null  jsType=org.apache.commons.validator.Form\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isShort("Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorAction\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        boolean boolean5 = flags0.isOff(100L);
        flags0.turnOff(0L);
        long long8 = flags0.getFlags();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((double) (short) -1, (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setResource(true);
        var0.setJsType("hi!");
        java.lang.String str6 = var0.getJsType();
        var0.setName("1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.commons.validator.EmailValidator emailValidator0 = org.apache.commons.validator.EmailValidator.getInstance();
        boolean boolean2 = emailValidator0.isValid("0000000000000000000000000000000000000000000000000000000000000000");
        boolean boolean4 = emailValidator0.isValid("string");
        org.junit.Assert.assertNotNull(emailValidator0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.validator.ValidatorResources validatorResources0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.validator.Validator validator2 = new org.apache.commons.validator.Validator(validatorResources0, "Arg: name=null  key=null  position=1  bundle=  resource=true\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Resources cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        boolean boolean5 = flags0.isOff(100L);
        boolean boolean7 = flags0.equals((java.lang.Object) (short) -1);
        long long8 = flags0.getFlags();
        boolean boolean10 = flags0.isOff((long) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((-1L), (long) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.validator.ValidatorResources validatorResources0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.validator.Validator validator3 = new org.apache.commons.validator.Validator(validatorResources0, "java.util.Locale", "Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorException\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Resources cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
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
        arg0.setPosition(0);
        int int19 = arg0.getPosition();
        boolean boolean20 = arg0.isResource();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = dateValidator0.isValid("Arg: name=org.apache.commons.validator.ValidatorException: regexp  key=language=1111111111111111111111111111111111111111111111111111111111111111  position=1  bundle=null  resource=true\n", "Msg: name=null  key=null  resource=true  bundle=null\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'g'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        java.lang.String str2 = var0.getBundle();
        java.lang.String str3 = var0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str3, "Var: name=null  value=null  resource=false  jsType=null\n");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.String str1 = msg0.toString();
        msg0.setKey("");
        msg0.setResource(false);
        msg0.setName("language=org.apache.commons.validator.Form");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str1, "Msg: name=null  key=null  resource=true  bundle=null\n");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isShort("Var: name=hi!  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((float) 'a', (float) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        java.lang.String str3 = org.apache.commons.validator.util.ValidatorUtils.replace("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n", "Arg: name=null  key=org.apache.commons.validator.Form  position=1  bundle=null  resource=true\n", "Arg: name=org.apache.commons.validator.ValidatorException: regexp  key=language=1111111111111111111111111111111111111111111111111111111111111111  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n" + "'", str3, "FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue(100.0f, (float) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((float) (byte) 10, (float) 1L, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isUrl("Arg: name=null  key=null  position=1  bundle=  resource=true\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.validator.util.Flags flags1 = new org.apache.commons.validator.util.Flags(1L);
        flags1.turnOff((long) (short) 1);
        flags1.clear();
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        java.lang.String str2 = formSet0.toString();
        formSet0.setLanguage("language=org.apache.commons.validator.Form");
        java.lang.String str5 = formSet0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str2, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "FormSet: language=language=org.apache.commons.validator.Form  country=null  variant=null\n" + "'", str5, "FormSet: language=language=org.apache.commons.validator.Form  country=null  variant=null\n");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((double) 100, (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        int int3 = arg0.getPosition();
        java.lang.String str4 = arg0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Arg: name=null  key=null  position=1  bundle=null  resource=true\n" + "'", str4, "Arg: name=null  key=null  position=1  bundle=null  resource=true\n");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.displayKey();
        formSet0.setLanguage("1111111111111111111111111111111111111111111111111111111111111111");
        java.lang.String str4 = formSet0.displayKey();
        java.lang.String str5 = formSet0.getVariant();
        java.lang.String str6 = formSet0.displayKey();
        formSet0.setLanguage("");
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap9 = formSet0.getForms();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "default" + "'", str1, "default");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "language=1111111111111111111111111111111111111111111111111111111111111111" + "'", str4, "language=1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "language=1111111111111111111111111111111111111111111111111111111111111111" + "'", str6, "language=1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue(1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((short) (byte) -1, (short) (byte) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        java.lang.String str3 = arg0.getName();
        arg0.setBundle("0000000000000000000000000000000000000000000000000000000000000000");
        arg0.setBundle("string");
        boolean boolean8 = arg0.isResource();
        java.lang.String str9 = arg0.getName();
        java.lang.String str10 = arg0.getBundle();
        arg0.setBundle("hi!");
        java.lang.String str13 = arg0.getBundle();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "string" + "'", str10, "string");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((float) 10, (float) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        msg0.setName("org.apache.commons.validator.ValidatorAction");
        boolean boolean5 = msg0.isResource();
        java.lang.String str6 = msg0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Msg: name=org.apache.commons.validator.ValidatorAction  key=null  resource=true  bundle=null\n" + "'", str6, "Msg: name=org.apache.commons.validator.ValidatorAction  key=null  resource=true  bundle=null\n");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue(10.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isEmail("FormSet: language=language=org.apache.commons.validator.Form  country=null  variant=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        formSet0.addConstant("org.apache.commons.validator.ValidatorAction", "org.apache.commons.validator.ValidatorAction");
        java.lang.String str4 = formSet0.displayKey();
        formSet0.setCountry("org.apache.commons.validator.ValidatorException: Var: name=hi!  value=null  resource=false  jsType=null\n");
        java.lang.String str7 = formSet0.getVariant();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.validator.GenericValidator.isDate("Arg: name=null  key=null  position=1  bundle=null  resource=true\n", "Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=true  bundle=null  jsType=org.apache.commons.validator.Form\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'V'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        boolean boolean2 = flags0.isOn(100L);
        flags0.clear();
        flags0.turnOn((long) (-1));
        flags0.turnOffAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.commons.validator.Var var3 = new org.apache.commons.validator.Var("Var: name=hi!  value=null  resource=false  jsType=null\n", "int", "0000000000000000000000000000000000000000000000000000000000000000");
        var3.setValue("hi!");
        java.lang.String str6 = var3.getBundle();
        var3.setValue("Arg: name=null  key=org.apache.commons.validator.Form  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        arg0.setResource(false);
        java.lang.String str8 = arg0.getBundle();
        arg0.setName("");
        arg0.setPosition((int) (byte) 10);
        java.lang.String str13 = arg0.getKey();
        arg0.setBundle("org.apache.commons.validator.Validator");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        var0.setBundle("Var: name=null  value=null  resource=false  jsType=null\n");
        var0.setResource(false);
        var0.setBundle("string");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.apache.commons.validator.ValidatorException validatorException1 = new org.apache.commons.validator.ValidatorException("Arg: name=null  key=null  position=1  bundle=null  resource=true\n");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue(0.0d, (double) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.apache.commons.validator.ValidatorException validatorException0 = new org.apache.commons.validator.ValidatorException();
        java.lang.Throwable[] throwableArray1 = validatorException0.getSuppressed();
        org.apache.commons.validator.ValidatorException validatorException3 = new org.apache.commons.validator.ValidatorException("regexp");
        validatorException0.addSuppressed((java.lang.Throwable) validatorException3);
        java.lang.Throwable[] throwableArray5 = validatorException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.apache.commons.validator.ValidatorException validatorException1 = new org.apache.commons.validator.ValidatorException("");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((long) '#', (long) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((byte) 0, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isShort("java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        formSet0.addConstant("org.apache.commons.validator.ValidatorAction", "org.apache.commons.validator.ValidatorAction");
        formSet0.addConstant("string", "org.apache.commons.validator.ValidatorException: Var: name=hi!  value=null  resource=false  jsType=null\n");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.apache.commons.validator.Var var3 = new org.apache.commons.validator.Var("Var: name=hi!  value=null  resource=false  jsType=null\n", "int", "0000000000000000000000000000000000000000000000000000000000000000");
        var3.setValue("hi!");
        java.lang.String str6 = var3.getBundle();
        java.lang.Class<?> wildcardClass7 = var3.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxLength("", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        java.lang.String str3 = org.apache.commons.validator.util.ValidatorUtils.replace("Arg: name=org.apache.commons.validator.ValidatorException: regexp  key=language=1111111111111111111111111111111111111111111111111111111111111111  position=1  bundle=null  resource=true\n", "java.lang.Object", "Arg: name=hi!  key=null  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Arg: name=org.apache.commons.validator.ValidatorException: regexp  key=language=1111111111111111111111111111111111111111111111111111111111111111  position=1  bundle=null  resource=true\n" + "'", str3, "Arg: name=org.apache.commons.validator.ValidatorException: regexp  key=language=1111111111111111111111111111111111111111111111111111111111111111  position=1  bundle=null  resource=true\n");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isCreditCard("org.apache.commons.validator.ValidatorException: regexp");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.apache.commons.validator.EmailValidator emailValidator0 = org.apache.commons.validator.EmailValidator.getInstance();
        boolean boolean2 = emailValidator0.isValid("string");
        boolean boolean4 = emailValidator0.isValid("");
        boolean boolean6 = emailValidator0.isValid("Arg: name=hi!  key=null  position=1  bundle=null  resource=true\n");
        boolean boolean8 = emailValidator0.isValid("java.util.Locale");
        org.junit.Assert.assertNotNull(emailValidator0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        boolean boolean2 = formSet0.isProcessed();
        formSet0.setVariant("Var: name=null  value=null  resource=false  jsType=null\n");
        org.apache.commons.validator.Form form5 = null;
        // The following exception was thrown during execution in test generation
        try {
            formSet0.addForm(form5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((long) (byte) 1, 10L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minLength("", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        java.lang.String str3 = msg0.toString();
        java.lang.String str4 = msg0.getName();
        java.lang.String str5 = msg0.getKey();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str3, "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.displayKey();
        boolean boolean2 = formSet0.isProcessed();
        java.lang.String str3 = formSet0.getCountry();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "default" + "'", str1, "default");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        flags0.turnOnAll();
        long long5 = flags0.getFlags();
        flags0.turnOn((long) (short) 100);
        org.apache.commons.validator.FormSet formSet8 = new org.apache.commons.validator.FormSet();
        java.lang.String str9 = formSet8.getLanguage();
        java.lang.String str10 = formSet8.getLanguage();
        boolean boolean11 = flags0.equals((java.lang.Object) formSet8);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.matchRegexp("Arg: name=null  key=org.apache.commons.validator.Form  position=1  bundle=null  resource=true\n", "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        java.lang.Object obj1 = flags0.clone();
        long long2 = flags0.getFlags();
        boolean boolean4 = flags0.isOn((long) '4');
        flags0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        long long4 = flags0.getFlags();
        flags0.turnOnAll();
        long long6 = flags0.getFlags();
        java.lang.String str7 = flags0.toString();
        flags0.turnOn((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str7, "1111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setName("FormSet: language=null  country=null  variant=null\n");
        int int3 = arg0.getPosition();
        java.lang.String str4 = arg0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Arg: name=FormSet: language=null  country=null  variant=null\n  key=null  position=-1  bundle=null  resource=true\n" + "'", str4, "Arg: name=FormSet: language=null  country=null  variant=null\n  key=null  position=-1  bundle=null  resource=true\n");
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((int) (byte) 100, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        java.lang.String str3 = org.apache.commons.validator.util.ValidatorUtils.replace("", "Arg: name=  key=null  position=1  bundle=null  resource=false\n", "org.apache.commons.validator.ValidatorException: FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((double) (byte) 1, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.apache.commons.validator.ValidatorResources validatorResources0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.validator.Validator validator2 = new org.apache.commons.validator.Validator(validatorResources0, "Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorAction\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Resources cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        boolean boolean5 = var0.isResource();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        var0.setJsType("default");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue(1.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        java.lang.String str2 = formSet0.getLanguage();
        java.lang.String str3 = formSet0.toString();
        formSet0.addConstant("", "org.apache.commons.validator.ValidatorAction");
        java.lang.String str7 = formSet0.getLanguage();
        formSet0.setCountry("int");
        org.apache.commons.validator.Form form10 = null;
        // The following exception was thrown during execution in test generation
        try {
            formSet0.addForm(form10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str3, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isDouble("Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=true  bundle=null  jsType=org.apache.commons.validator.Form\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((int) (byte) 0, 0, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.minLength("Msg: name=null  key=null  resource=true  bundle=null\n", (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((float) (short) 1, (float) '4', (float) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.apache.commons.validator.util.Flags flags1 = new org.apache.commons.validator.util.Flags(1L);
        flags1.turnOff((long) (short) 1);
        boolean boolean5 = flags1.isOff((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isBlankOrNull("Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap2 = formSet0.getForms();
        java.lang.String str3 = formSet0.getVariant();
        java.lang.String str4 = formSet0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str4, "FormSet: language=null  country=null  variant=null\n");
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        int int3 = arg0.getPosition();
        arg0.setKey("org.apache.commons.validator.ValidatorAction");
        java.lang.String str6 = arg0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Arg: name=null  key=org.apache.commons.validator.ValidatorAction  position=1  bundle=null  resource=true\n" + "'", str6, "Arg: name=null  key=org.apache.commons.validator.ValidatorAction  position=1  bundle=null  resource=true\n");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        java.lang.String str3 = arg0.getName();
        arg0.setBundle("0000000000000000000000000000000000000000000000000000000000000000");
        arg0.setBundle("string");
        arg0.setPosition(0);
        arg0.setKey("Arg: name=hi!  key=null  position=1  bundle=null  resource=true\n");
        int int12 = arg0.getPosition();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("Msg: name=null  key=null  resource=true  bundle=null\n", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("regexp", locale5);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        var0.setBundle("Msg: name=null  key=null  resource=true  bundle=null\n");
        java.lang.String str3 = var0.getName();
        java.lang.Object obj4 = var0.clone();
        boolean boolean5 = var0.isResource();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((long) (byte) 1, (long) (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((double) 1L, (double) (-1.0f), (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        var0.setResource(true);
        java.lang.String str7 = var0.getJsType();
        var0.setBundle("default");
        boolean boolean10 = var0.isResource();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((long) '4', (long) ' ', (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        long long4 = flags0.getFlags();
        flags0.turnOnAll();
        java.lang.String str6 = flags0.toString();
        java.lang.Object obj7 = flags0.clone();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str6, "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isFloat("org.apache.commons.validator.Validator");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.displayKey();
        formSet0.setLanguage("1111111111111111111111111111111111111111111111111111111111111111");
        java.lang.String str4 = formSet0.displayKey();
        java.lang.String str5 = formSet0.getVariant();
        java.lang.String str6 = formSet0.displayKey();
        boolean boolean7 = formSet0.isProcessed();
        org.apache.commons.validator.Form form9 = formSet0.getForm("org.apache.commons.validator.ValidatorException: Var: name=hi!  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "default" + "'", str1, "default");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "language=1111111111111111111111111111111111111111111111111111111111111111" + "'", str4, "language=1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "language=1111111111111111111111111111111111111111111111111111111111111111" + "'", str6, "language=1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(form9);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        var0.setResource(true);
        java.lang.String str7 = var0.getJsType();
        java.lang.String str8 = var0.getValue();
        var0.setValue("");
        java.lang.String str11 = var0.getBundle();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str8, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isFloat("org.apache.commons.validator.ValidatorException: FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        formSet0.addConstant("org.apache.commons.validator.ValidatorAction", "org.apache.commons.validator.ValidatorAction");
        java.lang.String str4 = formSet0.displayKey();
        formSet0.setCountry("Arg: name=null  key=null  position=1  bundle=  resource=true\n");
        java.lang.String str7 = formSet0.getCountry();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Arg: name=null  key=null  position=1  bundle=  resource=true\n" + "'", str7, "Arg: name=null  key=null  position=1  bundle=  resource=true\n");
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isUrl("FormSet: language=language=org.apache.commons.validator.Form  country=null  variant=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        boolean boolean2 = formSet0.isProcessed();
        org.apache.commons.validator.Form form4 = formSet0.getForm("FormSet: language=null  country=null  variant=int\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(form4);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.minLength("Msg: name=org.apache.commons.validator.ValidatorAction  key=null  resource=true  bundle=null\n", 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        boolean boolean5 = flags0.isOff(100L);
        boolean boolean7 = flags0.equals((java.lang.Object) (short) -1);
        long long8 = flags0.getFlags();
        flags0.turnOffAll();
        long long10 = flags0.getFlags();
        java.lang.String str11 = flags0.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000" + "'", str11, "0000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.Object obj1 = msg0.clone();
        msg0.setBundle("org.apache.commons.validator.ValidatorAction");
        msg0.setBundle("org.apache.commons.validator.ValidatorException");
        java.lang.String str6 = msg0.getBundle();
        msg0.setName("string");
        msg0.setName("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        boolean boolean11 = msg0.isResource();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.validator.ValidatorException" + "'", str6, "org.apache.commons.validator.ValidatorException");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        var0.setBundle("Msg: name=null  key=null  resource=true  bundle=null\n");
        java.lang.String str3 = var0.toString();
        java.lang.String str4 = var0.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str3, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setResource(true);
        var0.setJsType("hi!");
        java.lang.String str6 = var0.getBundle();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOff(1L);
        long long8 = flags0.getFlags();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-2L) + "'", long8 == (-2L));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        msg0.setName("org.apache.commons.validator.ValidatorAction");
        msg0.setBundle("org.apache.commons.validator.ValidatorException: regexp");
        msg0.setResource(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.apache.commons.validator.EmailValidator emailValidator0 = org.apache.commons.validator.EmailValidator.getInstance();
        boolean boolean2 = emailValidator0.isValid("string");
        boolean boolean4 = emailValidator0.isValid("");
        boolean boolean6 = emailValidator0.isValid("Arg: name=hi!  key=null  position=1  bundle=null  resource=true\n");
        boolean boolean8 = emailValidator0.isValid("Arg: name=null  key=null  position=1  bundle=  resource=true\n");
        org.junit.Assert.assertNotNull(emailValidator0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        arg0.setResource(false);
        int int7 = arg0.getPosition();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((int) (byte) -1, (int) '#', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setBundle("");
        java.lang.String str5 = arg0.toString();
        java.lang.String str6 = arg0.toString();
        arg0.setKey("Arg: name=org.apache.commons.validator.ValidatorException: regexp  key=language=1111111111111111111111111111111111111111111111111111111111111111  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Arg: name=null  key=null  position=1  bundle=  resource=true\n" + "'", str5, "Arg: name=null  key=null  position=1  bundle=  resource=true\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Arg: name=null  key=null  position=1  bundle=  resource=true\n" + "'", str6, "Arg: name=null  key=null  position=1  bundle=  resource=true\n");
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.getName();
        boolean boolean2 = var0.isResource();
        java.lang.String str3 = var0.getBundle();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isLong("0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOnAll();
        boolean boolean7 = flags0.isOff((long) (short) -1);
        boolean boolean9 = flags0.isOn((long) (byte) 100);
        flags0.clear();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.apache.commons.validator.ValidatorResources validatorResources0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.validator.Validator validator3 = new org.apache.commons.validator.Validator(validatorResources0, "Arg: name=FormSet: language=null  country=null  variant=null\n  key=null  position=-1  bundle=null  resource=true\n", "org.apache.commons.validator.ValidatorException: FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Resources cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        java.lang.String str2 = msg0.getName();
        msg0.setKey("Msg: name=null  key=null  resource=true  bundle=null\n");
        java.lang.String str5 = msg0.getKey();
        msg0.setKey("org.apache.commons.validator.ValidatorResults");
        java.lang.String str8 = msg0.getName();
        java.lang.String str9 = msg0.getKey();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str5, "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.validator.ValidatorResults" + "'", str9, "org.apache.commons.validator.ValidatorResults");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        var0.setResource(true);
        var0.setName("org.apache.commons.validator.ValidatorException");
        var0.setResource(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.apache.commons.validator.ValidatorException validatorException1 = new org.apache.commons.validator.ValidatorException("FormSet: language=null  country=null  variant=null\n");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((int) (short) -1, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        java.lang.Object obj1 = flags0.clone();
        java.lang.Object obj2 = flags0.clone();
        flags0.turnOffAll();
        flags0.clear();
        org.apache.commons.validator.Msg msg5 = new org.apache.commons.validator.Msg();
        java.lang.String str6 = msg5.toString();
        msg5.setKey("");
        msg5.setResource(false);
        msg5.setName("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        msg5.setKey("language=org.apache.commons.validator.Form");
        java.lang.String str15 = msg5.getBundle();
        boolean boolean16 = flags0.equals((java.lang.Object) str15);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str6, "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        java.lang.String str2 = formSet0.getLanguage();
        java.lang.String str3 = formSet0.toString();
        formSet0.addConstant("", "org.apache.commons.validator.ValidatorAction");
        org.apache.commons.validator.Form form8 = formSet0.getForm("org.apache.commons.validator.Form");
        formSet0.setVariant("int");
        java.lang.String str11 = formSet0.getLanguage();
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap12 = formSet0.getForms();
        org.apache.commons.validator.Form form14 = formSet0.getForm("0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str3, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(form8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(form14);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        int int3 = arg0.getPosition();
        boolean boolean4 = arg0.isResource();
        java.lang.String str5 = arg0.toString();
        java.lang.String str6 = arg0.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Arg: name=null  key=null  position=1  bundle=null  resource=true\n" + "'", str5, "Arg: name=null  key=null  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.maxLength("Arg: name=null  key=org.apache.commons.validator.ValidatorAction  position=1  bundle=null  resource=true\n", (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        long long4 = flags0.getFlags();
        flags0.turnOnAll();
        java.lang.String str6 = flags0.toString();
        flags0.turnOnAll();
        boolean boolean9 = flags0.isOn((long) (byte) 100);
        boolean boolean11 = flags0.isOn(10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str6, "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        long long4 = flags0.getFlags();
        flags0.turnOnAll();
        java.lang.String str6 = flags0.toString();
        flags0.turnOnAll();
        boolean boolean9 = flags0.isOn((long) (byte) 100);
        flags0.clear();
        java.lang.Object obj11 = flags0.clone();
        boolean boolean13 = flags0.equals((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str6, "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((long) (short) 0, (long) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        java.util.Locale locale1 = null;
        boolean boolean2 = org.apache.commons.validator.GenericValidator.isDate("Arg: name=hi!  key=null  position=1  bundle=null  resource=true\n", locale1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        boolean boolean5 = flags0.isOff(100L);
        flags0.turnOffAll();
        java.lang.String str7 = flags0.toString();
        flags0.turnOffAll();
        java.lang.String str9 = flags0.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000" + "'", str7, "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000" + "'", str9, "0000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        msg0.setName("org.apache.commons.validator.Validator");
        java.lang.Object obj5 = msg0.clone();
        msg0.setName("FormSet: language=null  country=null  variant=null\n");
        boolean boolean8 = msg0.isResource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "Msg: name=org.apache.commons.validator.Validator  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "Msg: name=org.apache.commons.validator.Validator  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "Msg: name=org.apache.commons.validator.Validator  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        arg0.setResource(false);
        int int8 = arg0.getPosition();
        arg0.setResource(false);
        java.lang.Object obj11 = arg0.clone();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "Arg: name=hi!  key=null  position=1  bundle=null  resource=false\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "Arg: name=hi!  key=null  position=1  bundle=null  resource=false\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "Arg: name=hi!  key=null  position=1  bundle=null  resource=false\n");
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((int) 'a', (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.String str1 = msg0.toString();
        msg0.setKey("");
        msg0.setResource(false);
        msg0.setName("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        msg0.setKey("language=org.apache.commons.validator.Form");
        java.lang.String str10 = msg0.getBundle();
        msg0.setBundle("Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorAction\n");
        boolean boolean13 = msg0.isResource();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str1, "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        boolean boolean5 = flags0.isOff((long) (short) 100);
        flags0.turnOnAll();
        long long7 = flags0.getFlags();
        flags0.turnOn(100L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        java.lang.String str2 = formSet0.toString();
        java.lang.String str3 = formSet0.getCountry();
        formSet0.addConstant("org.apache.commons.validator.ValidatorAction", "Var: name=Var: name=hi!  value=null  resource=false  jsType=null\n  value=hi!  resource=false  jsType=0000000000000000000000000000000000000000000000000000000000000000\n");
        org.apache.commons.validator.Form form7 = null;
        // The following exception was thrown during execution in test generation
        try {
            formSet0.addForm(form7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str2, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue(0.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        java.lang.String str2 = formSet0.getLanguage();
        java.lang.String str3 = formSet0.toString();
        formSet0.addConstant("", "org.apache.commons.validator.ValidatorAction");
        org.apache.commons.validator.Form form8 = formSet0.getForm("org.apache.commons.validator.Form");
        formSet0.setVariant("int");
        java.lang.String str11 = formSet0.getLanguage();
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap12 = formSet0.getForms();
        java.lang.String str13 = formSet0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str3, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(form8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "FormSet: language=null  country=null  variant=int\n" + "'", str13, "FormSet: language=null  country=null  variant=int\n");
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        org.apache.commons.validator.ValidatorException validatorException0 = new org.apache.commons.validator.ValidatorException();
        java.lang.Throwable[] throwableArray1 = validatorException0.getSuppressed();
        org.apache.commons.validator.ValidatorException validatorException2 = new org.apache.commons.validator.ValidatorException();
        java.lang.Throwable[] throwableArray3 = validatorException2.getSuppressed();
        validatorException0.addSuppressed((java.lang.Throwable) validatorException2);
        java.lang.String str5 = validatorException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.validator.ValidatorException" + "'", str5, "org.apache.commons.validator.ValidatorException");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        var0.setResource(true);
        var0.setName("org.apache.commons.validator.ValidatorException");
        java.lang.String str9 = var0.getValue();
        var0.setBundle("Arg: name=org.apache.commons.validator.ValidatorException: regexp  key=language=1111111111111111111111111111111111111111111111111111111111111111  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str9, "Var: name=null  value=null  resource=false  jsType=null\n");
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        java.lang.String str3 = org.apache.commons.validator.util.ValidatorUtils.replace("language=org.apache.commons.validator.Form", "Arg: name=null  key=null  position=1  bundle=null  resource=true\n", "java.lang.Object");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "language=org.apache.commons.validator.Form" + "'", str3, "language=org.apache.commons.validator.Form");
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((-2L), (-2L), (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        boolean boolean5 = flags0.isOff(100L);
        boolean boolean7 = flags0.equals((java.lang.Object) (short) -1);
        java.lang.String str8 = flags0.toString();
        org.apache.commons.validator.Var var9 = new org.apache.commons.validator.Var();
        java.lang.String str10 = var9.toString();
        java.lang.String str11 = var9.toString();
        boolean boolean12 = var9.isResource();
        boolean boolean13 = flags0.equals((java.lang.Object) var9);
        java.lang.String str14 = var9.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str8, "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str10, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str11, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange(100, 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        org.apache.commons.validator.ValidatorException validatorException1 = new org.apache.commons.validator.ValidatorException("int");
        org.apache.commons.validator.ValidatorException validatorException2 = new org.apache.commons.validator.ValidatorException();
        validatorException1.addSuppressed((java.lang.Throwable) validatorException2);
        java.lang.Throwable[] throwableArray4 = validatorException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isEmail("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        msg0.setName("string");
        msg0.setBundle("Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=true  bundle=null  jsType=org.apache.commons.validator.Form\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        java.lang.String str3 = msg0.toString();
        java.lang.String str4 = msg0.getName();
        java.lang.String str5 = msg0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str3, "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str5, "Msg: name=null  key=null  resource=true  bundle=null\n");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((double) (byte) 10, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        boolean boolean2 = formSet0.isProcessed();
        boolean boolean3 = formSet0.isProcessed();
        boolean boolean4 = formSet0.isProcessed();
        formSet0.addConstant("java.lang.Object", "org.apache.commons.validator.ValidatorException");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        long long4 = flags0.getFlags();
        flags0.turnOnAll();
        boolean boolean7 = flags0.isOn((long) 0);
        java.lang.Object obj8 = flags0.clone();
        org.apache.commons.validator.ValidatorException validatorException9 = new org.apache.commons.validator.ValidatorException();
        java.lang.Throwable[] throwableArray10 = validatorException9.getSuppressed();
        org.apache.commons.validator.ValidatorException validatorException11 = new org.apache.commons.validator.ValidatorException();
        java.lang.Throwable[] throwableArray12 = validatorException11.getSuppressed();
        validatorException9.addSuppressed((java.lang.Throwable) validatorException11);
        java.lang.Throwable[] throwableArray14 = validatorException9.getSuppressed();
        java.lang.Throwable[] throwableArray15 = validatorException9.getSuppressed();
        boolean boolean16 = flags0.equals((java.lang.Object) validatorException9);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((byte) 1, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        org.apache.commons.validator.Form form3 = formSet0.getForm("org.apache.commons.validator.ValidatorAction");
        formSet0.setVariant("java.util.Locale");
        formSet0.setVariant("");
        formSet0.setCountry("1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(form3);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setName("hi!");
        java.lang.String str4 = var0.toString();
        java.lang.Class<?> wildcardClass5 = var0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Var: name=hi!  value=null  resource=false  jsType=null\n" + "'", str4, "Var: name=hi!  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        java.lang.Object obj1 = flags0.clone();
        flags0.turnOn((long) (short) 0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "0000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        java.lang.String str4 = flags0.toString();
        boolean boolean6 = flags0.isOn(100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str4, "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        java.lang.String str3 = arg0.getName();
        arg0.setBundle("0000000000000000000000000000000000000000000000000000000000000000");
        java.lang.String str6 = arg0.getKey();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isShort("FormSet: language=null  country=null  variant=Var: name=null  value=null  resource=false  jsType=null\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOffAll();
        flags0.turnOff((long) '4');
        flags0.turnOff((long) 0);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setBundle("");
        boolean boolean5 = arg0.isResource();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
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
        arg0.setBundle("Msg: name=org.apache.commons.validator.ValidatorAction  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.util.Locale" + "'", str17, "java.util.Locale");
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        var0.setBundle("Var: name=null  value=null  resource=false  jsType=null\n");
        var0.setResource(true);
        var0.setBundle("Var: name=hi!  value=null  resource=false  jsType=null\n");
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
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
        arg0.setPosition((int) (byte) 0);
        arg0.setPosition(100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((long) (short) 1, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("Arg: name=null  key=null  position=1  bundle=null  resource=true\n", locale2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = dateValidator0.isValid("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n", "Arg: name=null  key=null  position=1  bundle=  resource=true\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'A'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("Msg: name=null  key=null  resource=true  bundle=null\n", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("language=org.apache.commons.validator.Form", locale5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = dateValidator0.isValid("string", "Arg: name=null  key=org.apache.commons.validator.Form  position=1  bundle=null  resource=true\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'A'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        java.lang.String str2 = formSet0.getLanguage();
        java.lang.String str3 = formSet0.getVariant();
        formSet0.setVariant("Var: name=Var: name=hi!  value=null  resource=false  jsType=null\n  value=hi!  resource=false  jsType=0000000000000000000000000000000000000000000000000000000000000000\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        org.apache.commons.validator.util.Flags flags1 = new org.apache.commons.validator.util.Flags(0L);
        flags1.turnOnAll();
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.matchRegexp("FormSet: language=null  country=null  variant=null\n", "int");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        java.lang.String str2 = formSet0.getLanguage();
        java.lang.String str3 = formSet0.toString();
        formSet0.addConstant("", "org.apache.commons.validator.ValidatorAction");
        org.apache.commons.validator.Form form8 = formSet0.getForm("org.apache.commons.validator.Form");
        formSet0.setVariant("int");
        java.lang.String str11 = formSet0.getLanguage();
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap12 = formSet0.getForms();
        java.lang.String str13 = formSet0.displayKey();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str3, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(form8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "variant=int" + "'", str13, "variant=int");
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isEmail("language=1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.getName();
        java.lang.String str2 = var0.getName();
        java.lang.String str3 = var0.toString();
        java.lang.String str4 = var0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str3, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxLength("org.apache.commons.validator.ValidatorAction", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.matchRegexp("org.apache.commons.validator.ValidatorException: Var: name=hi!  value=null  resource=false  jsType=null\n", "Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorException\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        long long3 = flags0.getFlags();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        java.lang.String str2 = var0.toString();
        var0.setBundle("Var: name=null  value=null  resource=false  jsType=null\n");
        java.lang.String str5 = var0.toString();
        java.lang.String str6 = var0.getJsType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str2, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str5, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        java.lang.String str2 = formSet0.getLanguage();
        java.lang.String str3 = formSet0.getVariant();
        java.lang.String str4 = formSet0.getCountry();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        long long4 = flags0.getFlags();
        flags0.turnOnAll();
        org.apache.commons.validator.Var var6 = new org.apache.commons.validator.Var();
        boolean boolean7 = flags0.equals((java.lang.Object) var6);
        var6.setValue("FormSet: language=language=org.apache.commons.validator.Form  country=null  variant=null\n");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        java.lang.String str3 = arg0.getName();
        arg0.setBundle("0000000000000000000000000000000000000000000000000000000000000000");
        arg0.setBundle("string");
        boolean boolean8 = arg0.isResource();
        java.lang.String str9 = arg0.getName();
        java.lang.String str10 = arg0.getKey();
        java.lang.Object obj11 = arg0.clone();
        arg0.setBundle("Arg: name=  key=null  position=1  bundle=null  resource=false\n");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "Arg: name=null  key=null  position=1  bundle=string  resource=true\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "Arg: name=null  key=null  position=1  bundle=string  resource=true\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "Arg: name=null  key=null  position=1  bundle=string  resource=true\n");
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setKey("org.apache.commons.validator.Form");
        java.lang.String str5 = arg0.getName();
        int int6 = arg0.getPosition();
        boolean boolean7 = arg0.isResource();
        java.lang.Object obj8 = arg0.clone();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "Arg: name=null  key=org.apache.commons.validator.Form  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "Arg: name=null  key=org.apache.commons.validator.Form  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "Arg: name=null  key=org.apache.commons.validator.Form  position=1  bundle=null  resource=true\n");
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        flags0.turnOnAll();
        long long5 = flags0.getFlags();
        java.lang.String str6 = flags0.toString();
        java.lang.Object obj7 = flags0.clone();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str6, "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        org.apache.commons.validator.ValidatorResources validatorResources0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.validator.Validator validator3 = new org.apache.commons.validator.Validator(validatorResources0, "language=1111111111111111111111111111111111111111111111111111111111111111", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Resources cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        flags0.turnOnAll();
        long long5 = flags0.getFlags();
        java.lang.String str6 = flags0.toString();
        boolean boolean8 = flags0.isOff((long) 0);
        flags0.clear();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str6, "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        java.lang.String str3 = msg0.getKey();
        msg0.setResource(false);
        java.lang.String str6 = msg0.getBundle();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        java.lang.String str3 = arg0.getName();
        arg0.setBundle("0000000000000000000000000000000000000000000000000000000000000000");
        arg0.setBundle("string");
        boolean boolean8 = arg0.isResource();
        java.lang.String str9 = arg0.getBundle();
        arg0.setName("Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "string" + "'", str9, "string");
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        formSet0.addConstant("org.apache.commons.validator.ValidatorAction", "org.apache.commons.validator.ValidatorAction");
        formSet0.setVariant("org.apache.commons.validator.ValidatorResults");
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap6 = formSet0.getForms();
        org.apache.commons.validator.Form form8 = formSet0.getForm("org.apache.commons.validator.ValidatorResults");
        java.lang.String str9 = formSet0.getLanguage();
        formSet0.setVariant("org.apache.commons.validator.ValidatorAction");
        org.apache.commons.validator.Form form13 = formSet0.getForm("Var: name=Var: name=hi!  value=null  resource=false  jsType=null\n  value=hi!  resource=false  jsType=0000000000000000000000000000000000000000000000000000000000000000\n");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(form8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(form13);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isCreditCard("FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((int) (short) 10, (int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        org.apache.commons.validator.Var var3 = new org.apache.commons.validator.Var("Arg: name=null  key=org.apache.commons.validator.ValidatorAction  position=1  bundle=null  resource=true\n", "FormSet: language=null  country=null  variant=Var: name=null  value=null  resource=false  jsType=null\n\n", "Msg: name=org.apache.commons.validator.ValidatorAction  key=null  resource=true  bundle=null\n");
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        long long4 = flags0.getFlags();
        flags0.turnOnAll();
        long long6 = flags0.getFlags();
        java.lang.String str7 = flags0.toString();
        flags0.turnOff(1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str7, "1111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        org.apache.commons.validator.ValidatorException validatorException1 = new org.apache.commons.validator.ValidatorException("Msg: name=null  key=null  resource=true  bundle=null\n");
        org.apache.commons.validator.ValidatorException validatorException3 = new org.apache.commons.validator.ValidatorException("int");
        validatorException1.addSuppressed((java.lang.Throwable) validatorException3);
        java.lang.Throwable[] throwableArray5 = validatorException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.Object obj1 = msg0.clone();
        msg0.setBundle("org.apache.commons.validator.ValidatorAction");
        msg0.setBundle("org.apache.commons.validator.ValidatorException");
        java.lang.String str6 = msg0.getBundle();
        java.lang.String str7 = msg0.toString();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.validator.ValidatorException" + "'", str6, "org.apache.commons.validator.ValidatorException");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorException\n" + "'", str7, "Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorException\n");
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.Object obj1 = msg0.clone();
        msg0.setBundle("org.apache.commons.validator.ValidatorAction");
        msg0.setKey("org.apache.commons.validator.ValidatorException: regexp");
        java.lang.String str6 = msg0.getName();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        java.lang.String str2 = formSet0.getVariant();
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap3 = formSet0.getForms();
        java.lang.String str4 = formSet0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str4, "FormSet: language=null  country=null  variant=null\n");
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.String str1 = msg0.toString();
        msg0.setKey("");
        msg0.setResource(false);
        msg0.setName("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        msg0.setKey("language=org.apache.commons.validator.Form");
        java.lang.String str10 = msg0.getBundle();
        msg0.setBundle("Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorAction\n");
        msg0.setBundle("org.apache.commons.validator.ValidatorResults");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str1, "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isUrl("Arg: name=org.apache.commons.validator.ValidatorException: regexp  key=language=1111111111111111111111111111111111111111111111111111111111111111  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.getName();
        boolean boolean2 = var0.isResource();
        java.lang.String str3 = var0.toString();
        java.lang.String str4 = var0.getValue();
        java.lang.String str5 = var0.getJsType();
        var0.setResource(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str3, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        java.lang.String str2 = msg0.getName();
        msg0.setKey("Msg: name=null  key=null  resource=true  bundle=null\n");
        java.lang.String str5 = msg0.getKey();
        msg0.setKey("org.apache.commons.validator.ValidatorResults");
        msg0.setKey("java.lang.Object");
        java.lang.Object obj10 = msg0.clone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str5, "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "Msg: name=null  key=java.lang.Object  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "Msg: name=null  key=java.lang.Object  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "Msg: name=null  key=java.lang.Object  resource=true  bundle=null\n");
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((int) (short) 100, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        java.util.Locale locale1 = null;
        boolean boolean2 = org.apache.commons.validator.GenericValidator.isDate("FormSet: language=language=org.apache.commons.validator.Form  country=null  variant=null\n", locale1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        arg0.setResource(false);
        int int8 = arg0.getPosition();
        java.lang.String str9 = arg0.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Arg: name=hi!  key=null  position=1  bundle=null  resource=false\n" + "'", str9, "Arg: name=hi!  key=null  position=1  bundle=null  resource=false\n");
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOnAll();
        flags0.turnOffAll();
        flags0.turnOff((long) '4');
        flags0.turnOn((long) '#');
        java.lang.Class<?> wildcardClass11 = flags0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        org.apache.commons.validator.ValidatorResources validatorResources0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.validator.Validator validator3 = new org.apache.commons.validator.Validator(validatorResources0, "Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorAction\n", "0000000000000000000000000000000000000000000000000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Resources cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.String str1 = msg0.getName();
        java.lang.Object obj2 = msg0.clone();
        java.lang.Object obj3 = msg0.clone();
        msg0.setKey("Arg: name=null  key=null  position=1  bundle=null  resource=true\n");
        msg0.setBundle("Arg: name=null  key=null  position=1  bundle=  resource=true\n");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "Msg: name=null  key=null  resource=true  bundle=null\n");
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((float) 1, (float) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxValue((double) '#', (double) (-2L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        flags0.turnOnAll();
        boolean boolean6 = flags0.isOn(100L);
        java.lang.String str7 = flags0.toString();
        boolean boolean9 = flags0.isOff((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str7, "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.Object obj1 = var0.clone();
        var0.setName("org.apache.commons.validator.ValidatorAction");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "Var: name=null  value=null  resource=false  jsType=null\n");
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isEmail("org.apache.commons.validator.Form");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minLength("FormSet: language=null  country=null  variant=Var: name=null  value=null  resource=false  jsType=null\n\n", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        java.lang.String str2 = formSet0.getLanguage();
        java.lang.String str3 = formSet0.toString();
        formSet0.addConstant("", "org.apache.commons.validator.ValidatorAction");
        formSet0.setCountry("java.util.Locale");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str3, "FormSet: language=null  country=null  variant=null\n");
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setName("FormSet: language=null  country=null  variant=null\n");
        java.lang.String str3 = arg0.getBundle();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isInt("Arg: name=null  key=org.apache.commons.validator.ValidatorAction  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.validator.GenericValidator.isDate("Arg: name=hi!  key=null  position=1  bundle=null  resource=true\n", "java.util.Locale", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'j'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isDouble("0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        java.lang.String str3 = arg0.getName();
        arg0.setBundle("0000000000000000000000000000000000000000000000000000000000000000");
        arg0.setBundle("string");
        java.lang.String str8 = arg0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        var0.setBundle("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean3 = var0.isResource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        java.lang.String str2 = formSet0.getLanguage();
        java.lang.String str3 = formSet0.toString();
        formSet0.addConstant("", "org.apache.commons.validator.ValidatorAction");
        org.apache.commons.validator.Form form8 = formSet0.getForm("org.apache.commons.validator.Form");
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap9 = formSet0.getForms();
        formSet0.addConstant("org.apache.commons.validator.Form", "org.apache.commons.validator.Form");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str3, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(form8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isDouble("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.Object obj1 = msg0.clone();
        msg0.setBundle("org.apache.commons.validator.ValidatorAction");
        msg0.setBundle("org.apache.commons.validator.ValidatorException");
        java.lang.String str6 = msg0.getBundle();
        msg0.setName("Arg: name=hi!  key=null  position=1  bundle=null  resource=false\n");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.validator.ValidatorException" + "'", str6, "org.apache.commons.validator.ValidatorException");
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        java.lang.String str2 = msg0.getName();
        msg0.setKey("Msg: name=null  key=null  resource=true  bundle=null\n");
        java.lang.String str5 = msg0.getKey();
        java.lang.Object obj6 = msg0.clone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Msg: name=null  key=null  resource=true  bundle=null\n" + "'", str5, "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "Msg: name=null  key=Msg: name=null  key=null  resource=true  bundle=null\n  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "Msg: name=null  key=Msg: name=null  key=null  resource=true  bundle=null\n  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "Msg: name=null  key=Msg: name=null  key=null  resource=true  bundle=null\n  resource=true  bundle=null\n");
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        long long4 = flags0.getFlags();
        flags0.turnOnAll();
        flags0.turnOffAll();
        boolean boolean8 = flags0.isOff((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isFloat("Arg: name=null  key=null  position=1  bundle=  resource=true\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        msg0.setName("org.apache.commons.validator.Validator");
        java.lang.Object obj5 = msg0.clone();
        msg0.setName("FormSet: language=null  country=null  variant=null\n");
        msg0.setName("FormSet: language=language=org.apache.commons.validator.Form  country=null  variant=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "Msg: name=org.apache.commons.validator.Validator  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "Msg: name=org.apache.commons.validator.Validator  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "Msg: name=org.apache.commons.validator.Validator  key=null  resource=true  bundle=null\n");
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        formSet0.addConstant("org.apache.commons.validator.ValidatorAction", "org.apache.commons.validator.ValidatorAction");
        java.lang.String str4 = formSet0.displayKey();
        formSet0.setVariant("int");
        java.lang.String str7 = formSet0.getVariant();
        org.apache.commons.validator.Form form9 = formSet0.getForm("Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "int" + "'", str7, "int");
        org.junit.Assert.assertNull(form9);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.Object obj1 = msg0.clone();
        msg0.setBundle("org.apache.commons.validator.ValidatorAction");
        java.lang.String str4 = msg0.getBundle();
        msg0.setKey("Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorAction\n");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.validator.ValidatorAction" + "'", str4, "org.apache.commons.validator.ValidatorAction");
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        org.apache.commons.validator.util.Flags flags1 = new org.apache.commons.validator.util.Flags((long) (byte) 1);
        java.lang.Object obj2 = flags1.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "0000000000000000000000000000000000000000000000000000000000000001");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "0000000000000000000000000000000000000000000000000000000000000001");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "0000000000000000000000000000000000000000000000000000000000000001");
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("Msg: name=null  key=null  resource=true  bundle=null\n", locale2);
        boolean boolean7 = dateValidator0.isValid("FormSet: language=language=org.apache.commons.validator.Form  country=null  variant=null\n", "0000000000000000000000000000000000000000000000000000000000000000", true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = dateValidator0.isValid("FormSet: language=null  country=null  variant=null\n", "org.apache.commons.validator.Form", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'o'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        java.lang.String str2 = msg0.getName();
        msg0.setKey("org.apache.commons.validator.Validator");
        msg0.setBundle("Var: name=null  value=null  resource=false  jsType=null\n");
        msg0.setResource(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        org.apache.commons.validator.Var var3 = new org.apache.commons.validator.Var("org.apache.commons.validator.Form", "Arg: name=hi!  key=null  position=1  bundle=null  resource=true\n", "Arg: name=hi!  key=null  position=1  bundle=null  resource=false\n");
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        boolean boolean1 = formSet0.isProcessed();
        org.apache.commons.validator.Form form3 = formSet0.getForm("default");
        formSet0.setLanguage("org.apache.commons.validator.Form");
        formSet0.setCountry("language=org.apache.commons.validator.Form");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(form3);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((double) 0, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((byte) 10, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap1 = formSet0.getForms();
        formSet0.setVariant("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("org.apache.commons.validator.Form", locale2);
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isInt("language=org.apache.commons.validator.Form");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        int int5 = arg0.getPosition();
        arg0.setResource(false);
        java.lang.String str8 = arg0.getBundle();
        arg0.setName("");
        arg0.setName("");
        arg0.setPosition(0);
        arg0.setResource(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isFloat("org.apache.commons.validator.Form");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        msg0.setName("org.apache.commons.validator.Validator");
        java.lang.Object obj5 = msg0.clone();
        msg0.setName("FormSet: language=null  country=null  variant=null\n");
        java.lang.String str8 = msg0.getKey();
        boolean boolean9 = msg0.isResource();
        boolean boolean10 = msg0.isResource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "Msg: name=org.apache.commons.validator.Validator  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "Msg: name=org.apache.commons.validator.Validator  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "Msg: name=org.apache.commons.validator.Validator  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.Object obj1 = var0.clone();
        java.lang.String str2 = var0.getBundle();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((float) (byte) -1, (float) 100, (float) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setBundle("");
        java.lang.String str5 = arg0.getKey();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((long) (short) 1, (long) (byte) 100, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.getName();
        boolean boolean2 = var0.isResource();
        var0.setJsType("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        boolean boolean5 = var0.isResource();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        org.apache.commons.validator.ValidatorException validatorException1 = new org.apache.commons.validator.ValidatorException("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        java.lang.Throwable[] throwableArray2 = validatorException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = validatorException1.getSuppressed();
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            validatorException1.addSuppressed(throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        boolean boolean2 = formSet0.isProcessed();
        formSet0.addConstant("org.apache.commons.validator.ValidatorResults", "Var: name=null  value=null  resource=false  jsType=null\n");
        formSet0.addConstant("int", "Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=true  bundle=null  jsType=org.apache.commons.validator.Form\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        org.apache.commons.validator.EmailValidator emailValidator0 = org.apache.commons.validator.EmailValidator.getInstance();
        boolean boolean2 = emailValidator0.isValid("java.util.Locale");
        boolean boolean4 = emailValidator0.isValid("Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNotNull(emailValidator0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        formSet0.addConstant("org.apache.commons.validator.ValidatorAction", "org.apache.commons.validator.ValidatorAction");
        formSet0.setVariant("org.apache.commons.validator.ValidatorResults");
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap6 = formSet0.getForms();
        java.lang.String str7 = formSet0.getCountry();
        boolean boolean8 = formSet0.isProcessed();
        java.lang.String str9 = formSet0.getCountry();
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        formSet0.addConstant("org.apache.commons.validator.ValidatorAction", "org.apache.commons.validator.ValidatorAction");
        java.lang.String str4 = formSet0.displayKey();
        formSet0.setCountry("org.apache.commons.validator.ValidatorException: Var: name=hi!  value=null  resource=false  jsType=null\n");
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap7 = formSet0.getForms();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "default" + "'", str4, "default");
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.Object obj1 = msg0.clone();
        msg0.setBundle("org.apache.commons.validator.ValidatorAction");
        msg0.setBundle("org.apache.commons.validator.ValidatorException");
        java.lang.String str6 = msg0.getBundle();
        msg0.setName("string");
        java.lang.Object obj9 = msg0.clone();
        java.lang.String str10 = msg0.getKey();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.validator.ValidatorException" + "'", str6, "org.apache.commons.validator.ValidatorException");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "Msg: name=string  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorException\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "Msg: name=string  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorException\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "Msg: name=string  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorException\n");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isCreditCard("Arg: name=null  key=org.apache.commons.validator.ValidatorAction  position=1  bundle=null  resource=true\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.displayKey();
        formSet0.setLanguage("1111111111111111111111111111111111111111111111111111111111111111");
        java.lang.String str4 = formSet0.getLanguage();
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap5 = formSet0.getForms();
        java.lang.String str6 = formSet0.getLanguage();
        java.lang.String str7 = formSet0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "default" + "'", str1, "default");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str4, "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str6, "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "FormSet: language=1111111111111111111111111111111111111111111111111111111111111111  country=null  variant=null\n" + "'", str7, "FormSet: language=1111111111111111111111111111111111111111111111111111111111111111  country=null  variant=null\n");
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        boolean boolean2 = formSet0.isProcessed();
        formSet0.setVariant("Var: name=null  value=null  resource=false  jsType=null\n");
        formSet0.setVariant("language=org.apache.commons.validator.Form");
        java.lang.String str7 = formSet0.getCountry();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
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
        arg0.setKey("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.toString();
        boolean boolean2 = formSet0.isProcessed();
        formSet0.setVariant("Var: name=null  value=null  resource=false  jsType=null\n");
        formSet0.setVariant("java.lang.Object");
        boolean boolean7 = formSet0.isProcessed();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str1, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((float) 0, (float) (byte) 0, (float) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        org.apache.commons.validator.util.Flags flags1 = new org.apache.commons.validator.util.Flags(1L);
        flags1.turnOff((long) (short) 1);
        flags1.turnOnAll();
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        msg0.setName("string");
        boolean boolean4 = msg0.isResource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        java.lang.String str2 = msg0.getKey();
        java.lang.String str3 = msg0.getBundle();
        msg0.setName("org.apache.commons.validator.ValidatorException");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isShort("FormSet: language=language=org.apache.commons.validator.Form  country=null  variant=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.maxLength("Msg: name=org.apache.commons.validator.ValidatorAction  key=null  resource=true  bundle=null\n", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        var0.setResource(true);
        java.lang.String str7 = var0.getJsType();
        java.lang.String str8 = var0.getValue();
        var0.setValue("");
        java.lang.String str11 = var0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str8, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        var0.setResource(true);
        var0.setName("org.apache.commons.validator.ValidatorException");
        var0.setBundle("org.apache.commons.validator.ValidatorException: Var: name=hi!  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.String str1 = msg0.getName();
        java.lang.Object obj2 = msg0.clone();
        java.lang.Object obj3 = msg0.clone();
        java.lang.String str4 = msg0.getKey();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setBundle("Arg: name=null  key=null  position=1  bundle=null  resource=true\n");
        arg0.setResource(false);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        java.lang.String str2 = formSet0.getLanguage();
        java.lang.String str3 = formSet0.toString();
        formSet0.addConstant("", "org.apache.commons.validator.ValidatorAction");
        java.lang.String str7 = formSet0.getLanguage();
        formSet0.setCountry("int");
        java.lang.String str10 = formSet0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str3, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "int" + "'", str10, "int");
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        boolean boolean1 = msg0.isResource();
        boolean boolean2 = msg0.isResource();
        msg0.setName("org.apache.commons.validator.Validator");
        java.lang.String str5 = msg0.getBundle();
        java.lang.String str6 = msg0.toString();
        msg0.setKey("FormSet: language=null  country=null  variant=int\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Msg: name=org.apache.commons.validator.Validator  key=null  resource=true  bundle=null\n" + "'", str6, "Msg: name=org.apache.commons.validator.Validator  key=null  resource=true  bundle=null\n");
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        org.apache.commons.validator.DateValidator dateValidator0 = org.apache.commons.validator.DateValidator.getInstance();
        java.util.Locale locale2 = null;
        boolean boolean3 = dateValidator0.isValid("Msg: name=null  key=null  resource=true  bundle=null\n", locale2);
        java.util.Locale locale5 = null;
        boolean boolean6 = dateValidator0.isValid("language=org.apache.commons.validator.Form", locale5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = dateValidator0.isValid("regexp", "Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorAction\n", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'g'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateValidator0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.Object obj1 = msg0.clone();
        msg0.setBundle("org.apache.commons.validator.ValidatorAction");
        msg0.setBundle("org.apache.commons.validator.ValidatorException");
        java.lang.String str6 = msg0.getBundle();
        msg0.setName("string");
        msg0.setName("FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        java.lang.String str11 = msg0.toString();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.validator.ValidatorException" + "'", str6, "org.apache.commons.validator.ValidatorException");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Msg: name=FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorException\n" + "'", str11, "Msg: name=FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorException\n");
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        org.apache.commons.validator.ValidatorResources validatorResources0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.validator.Validator validator2 = new org.apache.commons.validator.Validator(validatorResources0, "Msg: name=null  key=null  resource=true  bundle=org.apache.commons.validator.ValidatorException\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Resources cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((short) 0, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        java.lang.String str1 = var0.toString();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean4 = var0.isResource();
        boolean boolean5 = var0.isResource();
        var0.setValue("Var: name=null  value=null  resource=false  jsType=null\n");
        var0.setName("org.apache.commons.validator.Validator");
        java.lang.String str10 = var0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Var: name=null  value=null  resource=false  jsType=null\n" + "'", str1, "Var: name=null  value=null  resource=false  jsType=null\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.validator.Validator" + "'", str10, "org.apache.commons.validator.Validator");
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        java.lang.String str1 = formSet0.getLanguage();
        java.lang.String str2 = formSet0.getLanguage();
        java.lang.String str3 = formSet0.toString();
        org.apache.commons.validator.Form form5 = formSet0.getForm("org.apache.commons.validator.ValidatorException: FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FormSet: language=null  country=null  variant=null\n" + "'", str3, "FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertNull(form5);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        org.apache.commons.validator.Var var0 = new org.apache.commons.validator.Var();
        var0.setBundle("Var: name=null  value=null  resource=false  jsType=null\n");
        var0.setResource(true);
        var0.setBundle("");
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        boolean boolean3 = org.apache.commons.validator.GenericValidator.isInRange((byte) 1, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        org.apache.commons.validator.EmailValidator emailValidator0 = org.apache.commons.validator.EmailValidator.getInstance();
        boolean boolean2 = emailValidator0.isValid("string");
        boolean boolean4 = emailValidator0.isValid("Var: name=null  value=null  resource=false  jsType=null\n");
        boolean boolean6 = emailValidator0.isValid("Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=true  bundle=null  jsType=org.apache.commons.validator.Form\n");
        org.junit.Assert.assertNotNull(emailValidator0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue(0.0d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        org.apache.commons.validator.FormSet formSet0 = new org.apache.commons.validator.FormSet();
        formSet0.addConstant("org.apache.commons.validator.ValidatorAction", "org.apache.commons.validator.ValidatorAction");
        formSet0.setVariant("org.apache.commons.validator.ValidatorResults");
        java.util.Map<java.lang.String, org.apache.commons.validator.Form> strMap6 = formSet0.getForms();
        org.apache.commons.validator.Form form8 = formSet0.getForm("org.apache.commons.validator.ValidatorResults");
        java.lang.String str9 = formSet0.getLanguage();
        formSet0.setVariant("org.apache.commons.validator.ValidatorAction");
        java.lang.String str12 = formSet0.displayKey();
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(form8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "variant=org.apache.commons.validator.ValidatorAction" + "'", str12, "variant=org.apache.commons.validator.ValidatorAction");
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue((int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        org.apache.commons.validator.ValidatorException validatorException1 = new org.apache.commons.validator.ValidatorException("Arg: name=hi!  key=null  position=1  bundle=null  resource=false\n");
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        org.apache.commons.validator.Var var3 = new org.apache.commons.validator.Var("Arg: name=null  key=org.apache.commons.validator.ValidatorAction  position=1  bundle=null  resource=true\n", "org.apache.commons.validator.ValidatorException: FormSet: language=null  country=null  variant=org.apache.commons.validator.ValidatorResults\n", "default");
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        org.apache.commons.validator.ValidatorException validatorException1 = new org.apache.commons.validator.ValidatorException("regexp");
        java.lang.Throwable[] throwableArray2 = validatorException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        org.apache.commons.validator.Msg msg0 = new org.apache.commons.validator.Msg();
        java.lang.Object obj1 = msg0.clone();
        msg0.setBundle("org.apache.commons.validator.ValidatorAction");
        msg0.setBundle("org.apache.commons.validator.ValidatorException");
        java.lang.String str6 = msg0.getBundle();
        java.lang.String str7 = msg0.getName();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "Msg: name=null  key=null  resource=true  bundle=null\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.validator.ValidatorException" + "'", str6, "org.apache.commons.validator.ValidatorException");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        arg0.setName("hi!");
        arg0.setKey("int");
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        boolean boolean1 = org.apache.commons.validator.GenericValidator.isUrl("FormSet: language=null  country=null  variant=null\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        org.apache.commons.validator.util.Flags flags0 = new org.apache.commons.validator.util.Flags();
        flags0.turnOn((long) 100);
        flags0.turnOnAll();
        flags0.turnOnAll();
        long long5 = flags0.getFlags();
        java.lang.String str6 = flags0.toString();
        boolean boolean8 = flags0.isOff((long) 0);
        long long9 = flags0.getFlags();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111" + "'", str6, "1111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minValue(0L, (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.validator.GenericValidator.isDate("Arg: name=null  key=null  position=1  bundle=  resource=true\n", "Var: name=null  value=Var: name=null  value=null  resource=false  jsType=null\n  resource=true  bundle=null  jsType=org.apache.commons.validator.Form\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'V'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        org.apache.commons.validator.Var var3 = new org.apache.commons.validator.Var("org.apache.commons.validator.Validator", "default", "language=1111111111111111111111111111111111111111111111111111111111111111");
        var3.setName("Var: name=null  value=null  resource=false  jsType=null\n");
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        boolean boolean2 = org.apache.commons.validator.GenericValidator.minLength("Arg: name=hi!  key=null  position=1  bundle=null  resource=true\n", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        org.apache.commons.validator.Arg arg0 = new org.apache.commons.validator.Arg();
        arg0.setPosition((int) (byte) 1);
        boolean boolean3 = arg0.isResource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        org.apache.commons.validator.EmailValidator emailValidator0 = org.apache.commons.validator.EmailValidator.getInstance();
        boolean boolean2 = emailValidator0.isValid("Arg: name=hi!  key=null  position=1  bundle=null  resource=false\n");
        org.junit.Assert.assertNotNull(emailValidator0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

