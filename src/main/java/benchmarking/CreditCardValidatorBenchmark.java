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
    private static final int DATASET = 10000;

    @Setup
    public void setup() {
        creditCardValidator = CreditCardValidator.genericCreditCardValidator(); // default card
    }

    // Edge case: Short credit card number (less than 13 digits)
    @Benchmark
    public void validateShortCreditCard() {
        creditCardValidator.isValid("123456789012"); // Example of a short card number
    }


    // Edge case: Very long credit card number (more than 19 digits)
    @Benchmark
    public void validateLongCreditCard() {
        creditCardValidator.isValid("12345678901234567890"); // Example of a long card number
    }

    // Benchmark for a valid Visa card
    @Benchmark
    public void validateValidVisaCard() {
        CreditCardValidator validator = new CreditCardValidator(CreditCardValidator.VISA);
        validator.isValid("4111111111111111"); // Example of a valid Visa card
    }

    // Benchmark for an invalid VisaCard
    @Benchmark
    public void validateInvalidVisaCard(Blackhole bh) {
        CreditCardValidator validator = new CreditCardValidator(CreditCardValidator.VISA);

        Random random = new Random();
        StringBuilder cardNumber = new StringBuilder("4");

        for (int i = 0; i < 16; ++i) { // CHECKSTYLE IGNORE MagicNumber
            cardNumber.append(random.nextInt(10)); // CHECKSTYLE IGNORE MagicNumber
        }

        // Make the last digit of the card number invalid
        cardNumber.setCharAt(15, (char) (random.nextInt(10) + '0')); // CHECKSTYLE IGNORE MagicNumber

        boolean isValid = validator.isValid(cardNumber.toString());
        bh.consume(isValid);

    }

    // Benchmark for a valid MasterCard
    @Benchmark
    public void validateValidMasterCard() {
        CreditCardValidator validator = new CreditCardValidator(CreditCardValidator.MASTERCARD);
        validator.isValid("5555555555554444"); // Example of a valid MasterCard
    }

    // Benchmark for an invalid MasterCard
    @Benchmark
    public void validateInvalidMasterCard(Blackhole bh) {
        CreditCardValidator validator = new CreditCardValidator(CreditCardValidator.MASTERCARD);

        Random random = new Random();
        StringBuilder cardNumber = new StringBuilder("5");

        for (int i = 0; i < 16; ++i) { // CHECKSTYLE IGNORE MagicNumber
            cardNumber.append(random.nextInt(10)); // CHECKSTYLE IGNORE MagicNumber
        }

        // Make the last digit of the card number invalid
        cardNumber.setCharAt(15, (char) (random.nextInt(10) + '0')); // CHECKSTYLE IGNORE MagicNumber

        boolean isValid = validator.isValid(cardNumber.toString());
        bh.consume(isValid);

    }

    // Benchmark for a valid American Express card
    @Benchmark
    public void validateValidAmexCard(Blackhole bh) {
        CreditCardValidator validator = new CreditCardValidator(CreditCardValidator.AMEX);
        boolean isValid = validator.isValid("3782822463PARAM5"); // Example of a valid American Express card
        bh.consume(isValid);
    }

    // Benchmark for an invalid American Express card
    @Benchmark
    public void validateInvalidAmexCard(Blackhole bh) {
        CreditCardValidator validator = new CreditCardValidator(CreditCardValidator.AMEX);

        Random random = new Random();
        StringBuilder cardNumber = new StringBuilder("37");

        for (int i = 0; i < 14; ++i) { // CHECKSTYLE IGNORE MagicNumber
            cardNumber.append(random.nextInt(10)); // CHECKSTYLE IGNORE MagicNumber
        }

        // Make the last digit of the card number invalid
        cardNumber.setCharAt(13, (char) (random.nextInt(10) + '0')); // CHECKSTYLE IGNORE MagicNumber

        boolean isValid = validator.isValid(cardNumber.toString());
        bh.consume(isValid);

    }

    // Benchmark for concurrent validation with multiple threads
    @Benchmark
    @Threads(THREADS) // Adjust the number of threads as needed
    public void validateConcurrently(Blackhole bh) throws InterruptedException {
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
                results[index] = creditCardValidator.isValid(cardNumber);
            });
            threads[i].start();
        }

        // Wait for all threads to complete
        for (Thread thread : threads) {
            thread.join();
        }

        // Consume results
        for (boolean result : results) {
            bh.consume(result);
        }
    }

    // Benchmark for validating a large data set of credit card numbers
    @Benchmark
    public void validateLargeDataSet(Blackhole bh) {

        List<String> creditCardNumbers;
        creditCardNumbers = generateLargeDataSet(); // Generate a large data set of credit card numbers

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
