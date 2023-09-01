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

import static org.openjdk.jmh.runner.Defaults.MEASUREMENT_ITERATIONS;
import static org.openjdk.jmh.runner.Defaults.WARMUP_ITERATIONS;


@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = WARMUP_ITERATIONS, time = 1)
@Measurement(iterations = MEASUREMENT_ITERATIONS, time = 1)
@Fork(1)
@State(Scope.Benchmark)
public class EmailValidatorBenchmark {
    private static final int WARMUP_ITERATIONS = 5;
    private static final int MEASUREMENT_ITERATIONS = 5;
    private static final EmailValidator EMAIL_VALIDATOR = EmailValidator.getInstance();

    // Valid email
    String validEmail = "jsmith@apache.org";

    // Email with numeric domain
    String emailWithNumericDomain = "someone@[216.109.118.76]";

    // Email with valid extension
    String emailWithValidExtension = "jsmith@apache.org";

    String emailWithInvalidExtension = "jsmith@apache.c";

    // Email with dash in the address
    String emailWithDash = "andy.noble@data-workshop.com";

    // Email with dot at the end
    String emailWithDotAtEnd = "andy.noble@data-workshop.com.";

    // Email with invalid character
    String emailWithInvalidCharacter = "andy.noble@\u008fdata-workshop.com";

    // Email with "+" in the address
    String emailWithPlusSymbol = "foo+bar@i.am.not.in.us.example.com";

    // Email with "+" in the extension
    String emailWithPlusSymbolExt = "foo+bar@i.am.not.in.us.ex+ample.com";

    // Email with spaces
    String emailWithSpaces = "joeblow @apache.org";

    // Email with ASCII control characters
    String emailWithControlCharacters = "foo" + ((char) 1) + "bar@domain.com";

    // Email with localhost allowed
    EmailValidator validatorAllowLocalhost = EmailValidator.getInstance(true);
    EmailValidator validatorNotAllowLocalhost = EmailValidator.getInstance(false);
    String emailLocalhost = "joe@localhost.localdomain";


    @Benchmark
    public boolean benchmarkEmailValidation() {
        return EMAIL_VALIDATOR.isValid(validEmail);
    }

    @Benchmark
    public boolean benchmarkEmailValidationWithNumericAddress() {
        return EMAIL_VALIDATOR.isValid(emailWithNumericDomain);
    }

    @Benchmark
    public boolean benchmarkEmailValidationExtension() {
        return EMAIL_VALIDATOR.isValid(emailWithValidExtension);
    }

    @Benchmark
    public boolean benchmarkEmailValidationInvalidExtension() {
        return EMAIL_VALIDATOR.isValid(emailWithInvalidExtension);
    }

    @Benchmark
    public boolean benchmarkEmailValidationWithDash() {
        return EMAIL_VALIDATOR.isValid(emailWithDash);
    }

    @Benchmark
    public boolean benchmarkEmailValidationWithDotAtEnd() {
        return EMAIL_VALIDATOR.isValid(emailWithDotAtEnd);
    }

    @Benchmark
    public boolean benchmarkEmailValidationWithInvalidCharacter() {
        return EMAIL_VALIDATOR.isValid(emailWithInvalidCharacter);
    }

    @Benchmark
    public boolean benchmarkEmailValidationWithPlusAddress() {
        return EMAIL_VALIDATOR.isValid(emailWithPlusSymbol);
    }

    @Benchmark
    public boolean benchmarkEmailValidationWithPlusExtension() {
        return EMAIL_VALIDATOR.isValid(emailWithPlusSymbolExt);
    }

    @Benchmark
    public boolean benchmarkEmailValidationWithSpaces() {
        return EMAIL_VALIDATOR.isValid(emailWithSpaces);
    }

    @Benchmark
    public boolean benchmarkEmailValidationControlChars() {
        return EMAIL_VALIDATOR.isValid(emailWithControlCharacters);
    }

    @Benchmark
    public boolean benchmarkEmailValidationLocalHostAllowed() {
        return validatorAllowLocalhost.isValid(emailLocalhost);
    }

    @Benchmark
    public boolean benchmarkEmailValidationLocalHostNotAllowed() {
        return validatorNotAllowLocalhost.isValid(emailLocalhost);
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }
}

