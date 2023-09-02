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
    private EmailValidator emailValidator;


    @Setup
    public void setup() {
        emailValidator = EmailValidator.getInstance();
    }

    @Benchmark
    public void validateSingleValidEmail(Blackhole bh) {
        String email = "test@example.com";

        boolean isValid = emailValidator.isValid(email);
        bh.consume(isValid);
    }


    @Benchmark
    public void validateSingleInvalidEmail(Blackhole bh) {
        String email = "user@.com";

        boolean isValid = emailValidator.isValid(email);
        bh.consume(isValid);
    }

    @Benchmark
    public void validateShortValidEmail(Blackhole bh) {
        String email = "a@a.com";

        boolean isValid = emailValidator.isValid(email);
        bh.consume(isValid);
    }
    @Benchmark
    public void validateShortInvalidEmail(Blackhole bh) {
        String email = "a@b";

        boolean isValid = emailValidator.isValid(email);
        bh.consume(isValid);
    }

    @Benchmark
    public void validateLongValidEmail(Blackhole bh) {

        String email = "max_username_len_x64_aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@example.com";


        boolean isValid = emailValidator.isValid(email);
        bh.consume(isValid);
    }

    @Benchmark
    public void validateLongInvalidEmail(Blackhole bh) {


        String email = "invalidusernamelongerthanallowedbyvalidator123456789012345678901@example.c";


        boolean isValid = emailValidator.isValid(email);
        bh.consume(isValid);
    }

    @Benchmark
    public void validateVeryLongInvalidEmail(Blackhole bh) {


        StringBuilder username = new StringBuilder();

        for (int i = 0; i < 1000; i++) {
            username.append("a");
        }
        String email = username.toString() + "@example.com";

        boolean isValid = emailValidator.isValid(email);
        bh.consume(isValid);
    }

    @Benchmark
    public void validateMultipleValidEmails(Blackhole bh) {
        String[] validEmails = new String[]{
                "user@example.com",
                "john.doe@mail.co",
                "jane.smith@domain.org",
                "test@example.net",
                "user1234@subdomain.com",
                "alice@mywebsite.io",
                "support@company.com",
                "contact@webpage.org",
                "developer@techfirm.net",
                "info@myblog.com",
                "contact@forum.org",
                "user5678@business.co",
                "marketing@startup.io",
                "name.lastname@example.info",
                "customer.service@bigcompany.com",
                "webmaster@website.org",
                "team@myteam.co",
                "contactus@onlinestore.net",
                "manager@company.org",
                "sales@shoponline.io",
                "techsupport@softwarefirm.net",
                "firstname.lastname@domainname.io",
                "office@corporation.co",
                "hello@startupcompany.org",
                "info@personalblog.net",
                "customer.support@ecommercestore.io"
        };

        for (String email : validEmails) {
            boolean isValid = emailValidator.isValid(email);
            bh.consume(isValid);
        }
    }

    @Benchmark
    public void validateMultipleInvalidEmails(Blackhole bh) {
        String[] invalidEmails = new String[]{
                "invalidemail",
                "user@mail",
                "name@.org",
                "@example.com",
                "user@.com",
                "user@domain.",
                "user@.io",
                "user@.company",
                "user@co",
                "user@bigcorporation.muchtoolongextension",
                "user with spaces@example.com",
                "user@example.c",
                "user@@example.com",
                "user@exa^mple.com",
                "user@_example.com",
                "user@-example.com",
                "user@subdomain..com",
                "user@.example.com",
                "user@company.c",
                "user@.com.",
                "user@company..com",
                "user@company.c-",
                "user@company.c_",
                "user@company.c@",
                "user@example[dot]com",
                "user@website(dot)com"
        };

        for (String email : invalidEmails) {
            boolean isValid = emailValidator.isValid(email);
            bh.consume(isValid);
        }
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(new String[]{
                "-f", "1", // "-f" specifica di eseguire una sola classe di benchmark, "1" indica l'indice della classe
                "benchmarking.EmailValidatorBenchmark" // Sostituire con il nome completo della vostra classe di benchmark
        });
    }
}

