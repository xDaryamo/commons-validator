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

import org.apache.commons.validator.routines.UrlValidator;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.*;

import static org.openjdk.jmh.runner.Defaults.MEASUREMENT_ITERATIONS;
import static org.openjdk.jmh.runner.Defaults.WARMUP_ITERATIONS;

@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = WARMUP_ITERATIONS, time = 1)
@Measurement(iterations = MEASUREMENT_ITERATIONS, time = 1)
@Fork(1)
@State(Scope.Benchmark)
public class UrlValidatorBenchmark {

    private static final int WARMUP_ITERATIONS = 5;
    private static final int MEASUREMENT_ITERATIONS = 5;
    private UrlValidator urlValidator;
    private UrlValidator allow2SlashesValidator;
    private UrlValidator allowAllSchemesValidator;
    private UrlValidator noFragmentsValidator;
    private UrlValidator customSchemeValidator;
    private List<String> validUrls;
    private List<String> invalidUrls;
    private List<String> mixedUrls;

    @Setup
    public void setup() {

        urlValidator = UrlValidator.getInstance(); //default validator;

        // Initialize UrlValidator instances with different configuration options
        allow2SlashesValidator = new UrlValidator(UrlValidator.ALLOW_2_SLASHES);
        allowAllSchemesValidator = new UrlValidator(UrlValidator.ALLOW_ALL_SCHEMES);
        noFragmentsValidator = new UrlValidator(UrlValidator.NO_FRAGMENTS);
        customSchemeValidator = new UrlValidator(new String[]{"customscheme"});

        validUrls = generateValidURLs(100); // CHECKSTYLE IGNORE MagicNumber
        invalidUrls = generateInvalidURLs(100); // CHECKSTYLE IGNORE MagicNumber

        mixedUrls = new ArrayList<>(); // CHECKSTYLE IGNORE MagicNumber
        while (mixedUrls.size() < 100) { // CHECKSTYLE IGNORE MagicNumber
            String url = Math.random() < 0.5 ? generateRandomValidURL() : generateRandomInvalidURL(); // CHECKSTYLE IGNORE MagicNumber
            mixedUrls.add(url);
        }
        Collections.shuffle(mixedUrls);
    }

    public static List<String> generateValidURLs(int count) {
        List<String> validURLs = new ArrayList<>();
        while (validURLs.size() < count) {
            String url = generateRandomValidURL();
            validURLs.add(url);
        }
        return validURLs;
    }

    private static String generateRandomValidURL() {
        // Define valid URL components
        String[] schemes = {"http://", "https://"};
        String[] domains = {"example.com", "google.com", "yahoo.com"};
        String[] paths = {"/page1", "/page2", "/index.html"};
        String[] queryParameters = {"param1=value1&param2=value2", ""};
        String[] ipv4Addresses = {"192.168.1.1", "10.0.0.1"};
        String[] ipv6Addresses = {"[2001:0db8:85a3:0000:0000:8a2e:0370:7334]", "[::1]"};

        Random random = new Random();
        // Generate a random URL
        String scheme = schemes[random.nextInt(schemes.length)];
        String domain = domains[random.nextInt(domains.length)];
        String path = paths[random.nextInt(paths.length)];
        String query = queryParameters[random.nextInt(queryParameters.length)];

        String address = Math.random() < 0.5 ? ipv4Addresses[random.nextInt(ipv4Addresses.length)] // CHECKSTYLE IGNORE MagicNumber
                : ipv6Addresses[random.nextInt(ipv6Addresses.length)];

        return scheme + domain + path + "?" + query + address;
    }

    public static List<String> generateInvalidURLs(int count) {
        List<String> invalidURLs = new ArrayList<>();
        for (int i = 0; i < count; ++i) {
            String url;
            url = generateRandomInvalidURL();
            invalidURLs.add(url);
        }
        return invalidURLs;
    }

    private static String generateRandomInvalidURL() {

        Random random = new Random();
        // Define invalid URL components
        String[] invalidURLs = {
                "not-a-url", // Not a valid URL
                "htt://example.com", // Invalid scheme
                "http://example.c", // Invalid domain
                "http://example.com:port", // Invalid port
                "http:/example.com", // Missing double slashes after scheme
                "http://[::1]8000", // Invalid port with IPv6
                "http://example.com/ pa th", // Spaces in the path
                "http://example.com?query= value", // Spaces in query parameters
                "http://[invalid-ipv6]", // Invalid IPv6 address
                "http://example.com#fragment#", // Multiple fragments
                "http://example.com?query#fragment", // Invalid mix of query and fragment
                "://example.com", // Missing scheme
                "http://", // Missing domain
                "http://localhost::80", // Invalid double colons in IPv6
                "http://[::1]::80", // Invalid double colons in IPv6 with port
                "http://[::1]:80:90", // Invalid multiple colons in port
                "http://[::1]:abc", // Invalid characters in port
                "http://example..com", // Double dots in domain
                "http://[::1]:[::1]", // IPv6 address as port
                "http://example.com::80", // Double colons after domain
                "http://example.com:123456" // Port out of valid range
        };

        return invalidURLs[random.nextInt(invalidURLs.length)];
    }

    //Basic Url Validation
    @Benchmark
    public void validateValidBasicUrl(Blackhole bh) {
        boolean isValid =  urlValidator.isValid("https://www.google.com");
        bh.consume(isValid);
    }

    @Benchmark
    public void validateInvalidBasicUrl(Blackhole bh) {
        boolean isValid =  urlValidator.isValid("www.invalid-url");
        bh.consume(isValid);
    }

    @Benchmark
    public void validateValidIPv4(Blackhole bh) {
        boolean isValid = urlValidator.isValid("192.168.0.1");
        bh.consume(isValid);
    }

    @Benchmark
    public void validateInvalidIPv4(Blackhole bh) {
        boolean isValid = urlValidator.isValid("192.168.1");
        bh.consume(isValid);
    }

    @Benchmark
    public void validateValidIPv6(Blackhole bh) {
        boolean isValid = urlValidator.isValid("2001:0db8:85a3:0000:0000:8a2e:0370:7334");
        bh.consume(isValid);
    }

    @Benchmark
    public void validateInvalidIPv6(Blackhole bh) {
        boolean isValid = urlValidator.isValid("http://[FEDC:BA98:7654:3210:FEDC:BA98:7654:3210]:80:80/index.html");
        bh.consume(isValid);
    }

    @Benchmark
    public void validateAllow2Slashes(Blackhole bh) {
        boolean isValid = allow2SlashesValidator.isValid("http://example.com");
        bh.consume(isValid);
    }

    @Benchmark
    public void validateAllowAllSchemes(Blackhole bh) {
        boolean isValid = allowAllSchemesValidator.isValid("http://example.com");
        bh.consume(isValid);
    }

    @Benchmark
    public void validateNoFragmentsScheme(Blackhole bh) {
        boolean isValid = noFragmentsValidator.isValid("https://example.com");
        bh.consume(isValid);
    }

    @Benchmark
    public void validateUrlWithCustomScheme(Blackhole bh) {
        boolean isValid = customSchemeValidator.isValid("customscheme://example.com");
        bh.consume(isValid);
    }

    @Benchmark
    public void validateSetValidUrl(Blackhole bh) {
        for(String url: validUrls){
            boolean isValid = allowAllSchemesValidator.isValid(url);
            bh.consume(isValid);
        }
    }

    @Benchmark
    public void validateSetInvalidUrl(Blackhole bh) {
        for(String url: invalidUrls){
            boolean isValid = allowAllSchemesValidator.isValid(url);
            bh.consume(isValid);
        }
    }

    @Benchmark
    public void validateSetMixedUrl(Blackhole bh) {
        for(String url: mixedUrls){
            boolean isValid = allowAllSchemesValidator.isValid(url);
            bh.consume(isValid);
        }
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(new String[]{
                "-f", "1", // "-f" specifica di eseguire una sola classe di benchmark, "1" indica l'indice della classe
                "benchmarking.UrlValidatorBenchmark" // Sostituire con il nome completo della vostra classe di benchmark
        });
    }
}
