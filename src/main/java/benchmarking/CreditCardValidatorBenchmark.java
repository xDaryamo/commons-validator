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

import org.apache.commons.validator.routines.CreditCardValidator;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static org.openjdk.jmh.runner.Defaults.MEASUREMENT_ITERATIONS;
import static org.openjdk.jmh.runner.Defaults.WARMUP_ITERATIONS;

@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = WARMUP_ITERATIONS, time = 1)
@Measurement(iterations = MEASUREMENT_ITERATIONS, time = 1)
@Fork(1)
@State(Scope.Benchmark)
public class CreditCardValidatorBenchmark {

    private CreditCardValidator creditCardValidator;
    private static final int THREADS = 4;
    private static final int DATASET = 1000;

    private CreditCardValidator validVisaValidator;
    private CreditCardValidator invalidVisaValidator;
    private StringBuilder invalidVisaNumber;
    private CreditCardValidator masterCardValidator;
    private CreditCardValidator invalidMasterCardValidator;
    private StringBuilder invalidMasterCardNumber;
    private CreditCardValidator validAmexValidator;
    private CreditCardValidator invalidAmexValidator;
    private StringBuilder invalidAmexCardNumber;
    private List<String> creditCardNumbers;
    private final String[] mixedCardNumbers = {
            "4111111111111111", // Valid Visa card
            "5555555555554444", // Valid MasterCard
            "3782822463PARAM5",  // Valid American Express card
            "1234567890123456"  // Invalid card
    };

    @Setup
    public void setup() {

        Random random = new Random();

        creditCardValidator = CreditCardValidator.genericCreditCardValidator(); // default card
        validVisaValidator = new CreditCardValidator(CreditCardValidator.VISA); //valid visa

        invalidVisaValidator = new CreditCardValidator(CreditCardValidator.VISA); //invalid visa
        invalidVisaNumber = new StringBuilder("4");
        for (int i = 0; i < 16; ++i) { // CHECKSTYLE IGNORE MagicNumber
            invalidVisaNumber.append(random.nextInt(10)); // CHECKSTYLE IGNORE MagicNumber
        }
        // Make the last digit of the card number invalid
        invalidVisaNumber.setCharAt(15, (char) (random.nextInt(10) + '0')); // CHECKSTYLE IGNORE MagicNumber

        masterCardValidator = new CreditCardValidator(CreditCardValidator.MASTERCARD); //valid mastercard

        invalidMasterCardValidator = new CreditCardValidator(CreditCardValidator.MASTERCARD); //invalid mastercard
        invalidMasterCardNumber = new StringBuilder("5");
        for (int i = 0; i < 16; ++i) { // CHECKSTYLE IGNORE MagicNumber
            invalidMasterCardNumber.append(random.nextInt(10)); // CHECKSTYLE IGNORE MagicNumber
        }
        // Make the last digit of the card number invalid
        invalidMasterCardNumber.setCharAt(15, (char) (random.nextInt(10) + '0')); // CHECKSTYLE IGNORE MagicNumber

        validAmexValidator = new CreditCardValidator(CreditCardValidator.AMEX); //valid amex

        invalidAmexValidator = new CreditCardValidator(CreditCardValidator.AMEX); //invalid amex
        invalidAmexCardNumber = new StringBuilder("37");

        for (int i = 0; i < 14; ++i) { // CHECKSTYLE IGNORE MagicNumber
            invalidAmexCardNumber.append(random.nextInt(10)); // CHECKSTYLE IGNORE MagicNumber
        }
        // Make the last digit of the card number invalid
        invalidAmexCardNumber.setCharAt(13, (char) (random.nextInt(10) + '0')); // CHECKSTYLE IGNORE MagicNumber

        creditCardNumbers = generateLargeDataSet(); // Generate a large data set of credit card numbers

    }

    // Edge case: Short credit card number (less than 13 digits)
    @Benchmark
    public void validateShortCreditCard(Blackhole bh) {
        boolean isValid = creditCardValidator.isValid("123456789012"); // Example of a short card number
        bh.consume(isValid);
    }


    // Edge case: Very long credit card number (more than 19 digits)
    @Benchmark
    public void validateLongCreditCard(Blackhole bh) {
        boolean isValid = creditCardValidator.isValid("12345678901234567890"); // Example of a long card number
        bh.consume(isValid);
    }

    // Benchmark for a valid Visa card
    @Benchmark
    public void validateValidVisaCard(Blackhole bh) {
        boolean isValid = validVisaValidator.isValid("4111111111111111"); // Example of a valid Visa card
        bh.consume(isValid);
    }

    // Benchmark for an invalid VisaCard
    @Benchmark
    public void validateInvalidVisaCard(Blackhole bh) {
        boolean isValid = invalidVisaValidator.isValid(invalidVisaNumber.toString());
        bh.consume(isValid);

    }

    // Benchmark for a valid MasterCard
    @Benchmark
    public void validateValidMasterCard(Blackhole bh) {
        boolean isValid = masterCardValidator.isValid("5555555555554444"); // Example of a valid MasterCard
        bh.consume(isValid);
    }

    // Benchmark for an invalid MasterCard
    @Benchmark
    public void validateInvalidMasterCard(Blackhole bh) {
        boolean isValid = invalidMasterCardValidator.isValid(invalidMasterCardNumber.toString());
        bh.consume(isValid);
    }

    // Benchmark for a valid American Express card
    @Benchmark
    public void validateValidAmexCard(Blackhole bh) {
        boolean isValid = validAmexValidator.isValid("3782822463PARAM5"); // Example of a valid American Express card
        bh.consume(isValid);
    }

    // Benchmark for an invalid American Express card
    @Benchmark
    public void validateInvalidAmexCard(Blackhole bh) {
        boolean isValid = invalidAmexValidator.isValid(invalidAmexCardNumber.toString());
        bh.consume(isValid);
    }

    // Benchmark for validating a large data set of credit card numbers
    @Benchmark
    public void validateLargeDataSet(Blackhole bh) {
        for (String cardNumber : creditCardNumbers) {
            boolean isValid = creditCardValidator.isValid(cardNumber);
            bh.consume(isValid);
        }
    }

    // Generate a large data set of credit card numbers
    private List<String> generateLargeDataSet() {
        List<String> dataSet = new ArrayList<>();

        // Generate a large number of credit card numbers
        for (int i = 0; i < DATASET; ++i) {
            dataSet.add("4111111111111111"); // Example of a valid Visa card
            dataSet.add("5555555555554444"); // Example of a valid MasterCard
            dataSet.add("3782822463PARAM5");  // Example of a valid American Express card
            dataSet.add("1234567890123456");  // Example of an invalid card
        }

        return dataSet;
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(new String[]{
                "-f", "1", // "-f" specifica di eseguire una sola classe di benchmark, "1" indica l'indice della classe
                "benchmarking.CreditCardValidatorBenchmark" // Sostituire con il nome completo della vostra classe di benchmark
        });
    }
}
