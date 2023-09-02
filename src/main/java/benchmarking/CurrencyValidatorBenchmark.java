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

import org.apache.commons.validator.routines.CurrencyValidator;
import org.openjdk.jmh.annotations.*;
import static org.openjdk.jmh.runner.Defaults.MEASUREMENT_ITERATIONS;
import static org.openjdk.jmh.runner.Defaults.WARMUP_ITERATIONS;
import org.openjdk.jmh.infra.Blackhole;
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = WARMUP_ITERATIONS, time = 1)
@Measurement(iterations = MEASUREMENT_ITERATIONS, time = 1)
@Fork(1)
@State(Scope.Benchmark)
public class CurrencyValidatorBenchmark {

    private static final int WARMUP_ITERATIONS = 5;
    private static final int MEASUREMENT_ITERATIONS = 5;
    private CurrencyValidator currencyValidator;

    @Setup
    public void setup() {currencyValidator = (CurrencyValidator) CurrencyValidator.getInstance();}

    @Benchmark
    public void validateSingleShortValidEntry(Blackhole bh) {
        String validEntry = "EUR 25.5";

        boolean isValid = currencyValidator.isValid(validEntry, String.valueOf(CurrencyValidator.CURRENCY_FORMAT));

        bh.consume(isValid);
    }

    @Benchmark
    public void validateSingleShortInvalidEntry(Blackhole bh) {

        String invalidEntry = "EUR 25.5R";

        boolean isValid = currencyValidator.isValid(invalidEntry, String.valueOf(CurrencyValidator.CURRENCY_FORMAT));

        bh.consume(isValid);

    }

    @Benchmark
    public void validateSingleLongValidEntry(Blackhole bh) {
        String validEntry = "USD 2032479382479264936473.45";

        boolean isValid = currencyValidator.isValid(validEntry, String.valueOf(CurrencyValidator.CURRENCY_FORMAT));

        bh.consume(isValid);
    }

    @Benchmark
    public void validateSingleLongInvalidEntry(Blackhole bh) {

        String invalidEntry = "USD 201278132518A527185231723.34";

        boolean isValid = currencyValidator.isValid(invalidEntry, String.valueOf(CurrencyValidator.CURRENCY_FORMAT));

        bh.consume(isValid);

    }

    @Benchmark
    public void validateSingleVeryLongValidEntry(Blackhole bh) {

        StringBuilder entry = new StringBuilder("EUR");

        for (int i = 0; i < 700; ++i) { // CHECKSTYLE IGNORE MagicNumber
            entry.append("5");
        }

        entry.append(".").append("55");

        boolean isValid = currencyValidator.isValid(entry.toString(), String.valueOf(CurrencyValidator.CURRENCY_FORMAT));
        bh.consume(isValid);
    }

    @Benchmark
    public void validateSingleVeryLongInvalidEntry(Blackhole bh) {

        StringBuilder entry = new StringBuilder("EUR");

        for (int i = 0; i < 700; ++i) { // CHECKSTYLE IGNORE MagicNumber
            entry.append("5");
        }

        entry.append(".").append("5").append("A");

        boolean isValid = currencyValidator.isValid(entry.toString(), String.valueOf(CurrencyValidator.CURRENCY_FORMAT));
        bh.consume(isValid);

    }

    @Benchmark
    public void validateMultipleValidEntry(Blackhole bh) {
        String[] validEntry = new String[]{
                "EUR 25.5",
                "USD 150.0",
                "GBP 1200.35",
                "JPY 320.99",
                "CAD 12.45",
                "EUR 35.5",
                "USD 1220.12",
                "GBP 1200.35",
                "JPY 999.99",
                "CAD 15000.45",
                "EUR 32.5",
                "USD 1500000.0",
                "GBP 120000.35",
                "JPY 3205670.99",
                "CAD 4512.45",
                "EUR 166725.5",
                "USD 152.12",
                "GBP 450670.50",
                "JPY 78212.99",
                "CAD 11167.45",
                "EUR 167251.24",
                "USD 444152.12",
                "GBP 4560.50",
                "JPY 71212.99",
                "CAD 168907.45",
        };

        for (String entry : validEntry) {
            boolean isValid = currencyValidator.isValid(entry, String.valueOf(CurrencyValidator.CURRENCY_FORMAT));
            bh.consume(isValid);
        }
    }

    @Benchmark
    public void validateMultipleInvalidEntry(Blackhole bh) {
        String[] invalidEntry = new String[]{
                "EUR 25.5A",
                "USD 150.0B",
                "GBP 120E0.N5",
                "JPY 320Q.99",
                "CAD 12C.45",
                "EUR 35R.5",
                "USD 122AA0.12",
                "GBP 120Y0.35",
                "JPY 9F99.99",
                "CAD 150LP00.45",
                "EUR 32YY.5",
                "USD 150WW00.0",
                "GBP 120000.3H",
                "JPY 32056EQ.99",
                "CAD 451GHB2.45",
                "EUR 16672L5.5",
                "USD 152T.1R2",
                "GBP 450T670.Y50",
                "JPY 78PA12.9P",
                "CAD 11D67.45",
                "EUR 1ZX251.24",
                "USD 4OL152.12",
                "GBP 45CB60.50",
                "JPY 71MN2.99",
                "CAD 16ZA07.45",
        };

        for (String entry : invalidEntry) {
            boolean isValid = currencyValidator.isValid(entry, String.valueOf(CurrencyValidator.CURRENCY_FORMAT));
            bh.consume(isValid);
        }
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(new String[]{
                "-f", "1", // "-f" specifica di eseguire una sola classe di benchmark, "1" indica l'indice della classe
                "benchmarking.CurrencyValidatorBenchmark" // Sostituire con il nome completo della vostra classe di benchmark
        });
    }
}

