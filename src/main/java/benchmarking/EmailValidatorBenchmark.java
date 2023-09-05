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
    private static EmailValidator emailValidator;

    private String[] multipleValidEmails;
    private String[] multipleInvalidEmails;


    @Setup
    public void setup() {
        emailValidator = EmailValidator.getInstance();
        multipleValidEmails = generateValidEmails(1000); // CHECKSTYLE IGNORE MagicNumber
        multipleInvalidEmails = generateInvalidEmails(1000); // CHECKSTYLE IGNORE MagicNumber
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

        int veryLongUsername = 1000; // CHECKSTYLE IGNORE MagicNumber
        for (int i = 0; i < veryLongUsername; i++) {
            username.append("a");
        }
        String email = username.toString() + "@example.com";

        boolean isValid = emailValidator.isValid(email);
        bh.consume(isValid);
    }

    @Benchmark
    public void validateMultipleValidEmails(Blackhole bh) {

        for (String email : multipleValidEmails) {
            boolean isValid = emailValidator.isValid(email);
            bh.consume(isValid);
        }
    }

    @Benchmark
    public void validateMultipleInvalidEmails(Blackhole bh) {
        for (String email : multipleInvalidEmails) {
            boolean isValid = emailValidator.isValid(email);
            bh.consume(isValid);
        }
    }
    private static String generateValidEmail() {
        String[] validLocalParts = {
                "user",
                "john.doe",
                "jane.smith",
                "test",
                "user1234",
                "alice",
                "support",
                "contact",
                "developer",
                "info",
                "contact",
                "user5678",
                "marketing",
                "name.lastname",
                "customer.service",
                "webmaster",
                "team",
                "contactus",
                "manager",
                "sales",
                "techsupport",
                "firstname.lastname",
                "office",
                "hello",
                "info",
                "customer.support"
        };

        String[] validDomains = {
                "example.com",
                "mail.co",
                "domain.org",
                "example.net",
                "subdomain.com",
                "mywebsite.io",
                "company.com",
                "webpage.org",
                "techfirm.net",
                "myblog.com",
                "forum.org",
                "business.co",
                "startup.io",
                "example.info",
                "bigcompany.com",
                "website.org",
                "myteam.co",
                "onlinestore.net",
                "company.org",
                "shoponline.io",
                "softwarefirm.net",
                "domainname.io",
                "corporation.co",
                "startupcompany.org",
                "personalblog.net",
                "ecommercestore.io"
        };

        String localPart = validLocalParts[(int) (Math.random() * validLocalParts.length)];
        String domain = validDomains[(int) (Math.random() * validDomains.length)];


        return localPart + "@" + domain;
    }

    private static String generateInvalidEmail() {
        String[] invalidEmails = {
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

        return invalidEmails[(int) (Math.random() * invalidEmails.length)];
    }

    private static String[] generateValidEmails(int count) {

        String[] emails = new String[count];

        for (int i = 0; i < count; i++) {
            String email = generateValidEmail();
            if (emailValidator.isValid(email)) {
                emails[i] = email;
            }
        }

        return emails;
    }

    private static String[] generateInvalidEmails(int count) {
        String[] emails = new String[count];

        for (int i = 0; i < count; i++) {
            String email = generateInvalidEmail();
            if (!emailValidator.isValid(email)) {
                emails[i] = email;
            }
        }
        return emails;
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(new String[]{
                "-f", "1", // "-f" specifica di eseguire una sola classe di benchmark, "1" indica l'indice della classe
                "benchmarking.EmailValidatorBenchmark" // Sostituire con il nome completo della vostra classe di benchmark
        });
    }
}

