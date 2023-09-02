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

import java.util.ArrayList;
import java.util.List;

import static org.openjdk.jmh.runner.Defaults.MEASUREMENT_ITERATIONS;
import static org.openjdk.jmh.runner.Defaults.WARMUP_ITERATIONS;

@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = WARMUP_ITERATIONS, time = 1)
@Measurement(iterations = MEASUREMENT_ITERATIONS, time = 1)
@Fork(1)
@State(Scope.Benchmark)
public class CreditCardValidatorBenchmark {

    private static final CreditCardValidator CCV = CreditCardValidator.genericCreditCardValidator(); // default card
    private static final int PARAM = 1000;

    private static final int THREADS = 4;

    private static final int DATASET = 10000;
    private List<String> creditCardNumbers;

    @Setup
    public void setup() {
        creditCardNumbers = generateLargeDataSet(); // Generate a large data set of credit card numbers
    }

    @Benchmark
    public void validateMixedCreditCards() {
        CCV.isValid("ValidCreditCardNumber1");
        CCV.isValid("InvalidCreditCardNumber1");
        //add more if needed
    }

    // Edge case: Short credit card number (less than 13 digits)
    @Benchmark
    public void validateShortCreditCard() {
        CCV.isValid("123456789012"); // Example of a short card number
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public void validateShortCreditCardMulti() {
        CCV.isValid("123456789012"); // Example of a short card number
    }

    // Edge case: Very long credit card number (more than 19 digits)
    @Benchmark
    public void validateLongCreditCard() {
        CCV.isValid("12345678901234567890"); // Example of a long card number
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public void validateLongCreditCardMulti() {
        CCV.isValid("12345678901234567890"); // Example of a long card number
    }

    // Edge case: Valid credit card number with spaces
    @Benchmark
    public void validateCreditCardWithSpaces() {
        CCV.isValid("4111 1111 1111 1111"); // Example with spaces
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public void validateCreditCardWithSpacesMulti() {
        CCV.isValid("4111 1111 1111 1111"); // Example with spaces
    }

    // Edge case: Valid credit card number with dashes
    @Benchmark
    public void validateCreditCardWithDashes() {
        CCV.isValid("4111-1111-1111-1111"); // Example with dashes
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public void validateCreditCardWithDashesMulti() {
        CCV.isValid("4111-1111-1111-1111"); // Example with dashes
    }

    // Benchmark for a valid Visa card
    @Benchmark
    public void validateValidVisaCard() {
        CreditCardValidator validator = new CreditCardValidator(CreditCardValidator.VISA);
        validator.isValid("4111111111111111"); // Example of a valid Visa card
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public void validateValidVisaCardMulti() {
        CreditCardValidator validator = new CreditCardValidator(CreditCardValidator.VISA);
        validator.isValid("4111111111111111"); // Example of a valid Visa card
    }

    // Benchmark for a valid MasterCard
    @Benchmark
    public void validateValidMasterCard() {
        CreditCardValidator validator = new CreditCardValidator(CreditCardValidator.MASTERCARD);
        validator.isValid("5555555555554444"); // Example of a valid MasterCard
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public void validateValidMasterCardMulti() {
        CreditCardValidator validator = new CreditCardValidator(CreditCardValidator.MASTERCARD);
        validator.isValid("5555555555554444"); // Example of a valid MasterCard
    }

    // Benchmark for a valid American Express card
    @Benchmark
    public void validateValidAmexCard() {
        CreditCardValidator validator = new CreditCardValidator(CreditCardValidator.AMEX);
        validator.isValid("3782822463PARAM5"); // Example of a valid American Express card
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public void validateValidAmexCardMulti() {
        CreditCardValidator validator = new CreditCardValidator(CreditCardValidator.AMEX);
        validator.isValid("3782822463PARAM5"); // Example of a valid American Express card
    }

    // Benchmark for an invalid card
    @Benchmark
    public void validateInvalidCard() {
        CCV.isValid("1234567890123456"); // Example of an invalid card
    }

    @Benchmark
    @OperationsPerInvocation(PARAM)
    public void validateInvalidCardMulti() {
        CCV.isValid("1234567890123456"); // Example of an invalid card
    }

    // Benchmark for concurrent validation with multiple threads
    @Benchmark
    @Threads(THREADS) // Adjust the number of threads as needed
    public boolean validateConcurrently() throws InterruptedException {
        // Create an array of credit card numbers to validate
        String[] creditCardNumbers = {
                "4111111111111111", // Valid Visa card
                "5555555555554444", // Valid MasterCard
                "3782822463PARAM5",  // Valid American Express card
                "1234567890123456"  // Invalid card
        };

        // Create an array of threads
        Thread[] threads = new Thread[creditCardNumbers.length];

        // Create an array of results
        boolean[] results = new boolean[creditCardNumbers.length];

        // Start the threads
        for (int i = 0; i < threads.length; ++i) {
            final String cardNumber = creditCardNumbers[i];
            final int index = i;
            threads[i] = new Thread(() -> {
                results[index] = CCV.isValid(cardNumber);
            });
            threads[i].start();
        }

        // Wait for all threads to complete
        for (Thread thread : threads) {
            thread.join();
        }

        // Return the combined result (e.g., whether all credit card numbers are valid)
        for (boolean result : results) {
            if (!result) {
                return false; // At least one card is invalid
            }
        }
        return true; // All cards are valid
    }

    // Benchmark for validating a large data set of credit card numbers
    @Benchmark
    public void validateLargeDataSet() {
        for (String cardNumber : creditCardNumbers) {
            CCV.isValid(cardNumber);
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
        org.openjdk.jmh.Main.main(args);
    }
}
