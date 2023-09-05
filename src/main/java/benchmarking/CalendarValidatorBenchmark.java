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
import org.apache.commons.validator.routines.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import static org.openjdk.jmh.runner.Defaults.MEASUREMENT_ITERATIONS;
import static org.openjdk.jmh.runner.Defaults.WARMUP_ITERATIONS;


@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = WARMUP_ITERATIONS, time = 1)
@Measurement(iterations = MEASUREMENT_ITERATIONS, time = 1)
@Fork(1)
@State(Scope.Benchmark)
public class CalendarValidatorBenchmark {
    private static final int WARMUP_ITERATIONS = 5;
    private static final int MEASUREMENT_ITERATIONS = 5;
    private CalendarValidator calendarValidator;

    private String[] multipleValidDates;
    private String[] multipleInvalidDates;

    @Setup
    public void setup() {
        calendarValidator = CalendarValidator.getInstance();

        multipleValidDates = generateValidDates(1000);// CHECKSTYLE IGNORE MagicNumber
        multipleInvalidDates = generateInvalidDates(1000);// CHECKSTYLE IGNORE MagicNumber
    }

    @Benchmark
    public void validateSingleValidDate(Blackhole bh) {
        boolean valid = calendarValidator.isValid("2023-09-02", "yyyy-MM-dd");
        bh.consume(valid);
    }

    @Benchmark
    public void validateSingleInvalidDate(Blackhole bh) {
        boolean valid = calendarValidator.isValid("2023-09-32", "yyyy-MM-dd");
        bh.consume(valid);
    }

    @Benchmark
    public void validateSingleValidDateWrongFormat(Blackhole bh) {
        boolean valid = calendarValidator.isValid("02/09/2023", "yyyy-MM-dd");
        bh.consume(valid);
    }

    @Benchmark
    public void validateMultipleValidDates(Blackhole bh) {
        for (String date : multipleValidDates) {
            boolean valid = calendarValidator.isValid(date, "yyyy-MM-dd");
            bh.consume(valid);
        }
    }

    @Benchmark
    public void validateMultipleInvalidDates(Blackhole bh) {
        for (String date : multipleInvalidDates) {
            boolean valid = calendarValidator.isValid(date, "yyyy-MM-dd");
            bh.consume(valid);
        }
    }


    private String[] generateValidDates(int count) {
        String[] dates = new String[count];
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Random random = new Random();

        Calendar startDate = Calendar.getInstance();
        startDate.set(2000, Calendar.JANUARY, 1);// CHECKSTYLE IGNORE MagicNumber

        Calendar endDate = Calendar.getInstance();
        endDate.set(2022, Calendar.DECEMBER, 31);// CHECKSTYLE IGNORE MagicNumber

        long startMillis = startDate.getTimeInMillis();
        long endMillis = endDate.getTimeInMillis();

        for (int i = 0; i < count; i++) {
            long randomMillis = startMillis + (long) (random.nextDouble() * (endMillis - startMillis));
            Calendar randomDate = Calendar.getInstance();
            randomDate.setTimeInMillis(randomMillis);
            dates[i] = dateFormat.format(randomDate.getTime());
        }

        return dates;
    }

    private String[] generateInvalidDates(int count) {
        String[] dates = new String[count];
        Random random = new Random();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        for (int i = 0; i < count; i++) {
            int randomYear = 2023 + random.nextInt(10); // Genera un anno tra 2023 e 2032 // CHECKSTYLE IGNORE MagicNumber
            int randomMonth = 1 + random.nextInt(12); // Genera un mese tra 1 e 12  // CHECKSTYLE IGNORE MagicNumber
            int randomDay = 1 + random.nextInt(31); // Genera un giorno tra 1 e 31 // CHECKSTYLE IGNORE MagicNumber

            // Simulare errori comuni
            if (randomMonth > 12) { // CHECKSTYLE IGNORE MagicNumber
                randomMonth = random.nextInt(12) + 13; // Genera un mese tra 13 e 24 // CHECKSTYLE IGNORE MagicNumber
            }
            if (randomDay > 31) { // CHECKSTYLE IGNORE MagicNumber
                randomDay = random.nextInt(31) + 32; // Genera un giorno tra 32 e 62 // CHECKSTYLE IGNORE MagicNumber
            }

            String date = String.format("%04d-%02d-%02d", randomYear, randomMonth, randomDay);
            dates[i] = date;
        }

        return dates;
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(new String[]{
                "-f", "1", // "-f" specifica di eseguire una sola classe di validate, "1" indica l'indice della classe
                "benchmarking.CalendarValidatorBenchmark" // Sostituire con il nome completo della vostra classe di validate
        });
    }
}

