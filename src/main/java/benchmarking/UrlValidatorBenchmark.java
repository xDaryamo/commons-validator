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
    private Set<String> validUrls;
    private Set<String> invalidUrls;
    private Set<String> mixedUrls;
    private List<String> validSchemes;
    private  List<String> invalidSchemes;

    @Setup
    public void setup() {

        urlValidator = UrlValidator.getInstance(); //default validator;

        // Initialize UrlValidator instances with different configuration options
        allow2SlashesValidator = new UrlValidator(UrlValidator.ALLOW_2_SLASHES);
        allowAllSchemesValidator = new UrlValidator(UrlValidator.ALLOW_ALL_SCHEMES);
        noFragmentsValidator = new UrlValidator(UrlValidator.NO_FRAGMENTS);
        customSchemeValidator = new UrlValidator(new String[]{"customscheme"});

        validUrls = generateUniqueURLs(1000); // CHECKSTYLE IGNORE MagicNumber
        invalidUrls = generateInvalidURLs(1000); // CHECKSTYLE IGNORE MagicNumber

        mixedUrls = new HashSet<>();
        Set<String> tmpValid = generateUniqueURLs(500); // CHECKSTYLE IGNORE MagicNumber
        Set<String> tmpInvalid = generateInvalidURLs(500); // CHECKSTYLE IGNORE MagicNumber
        mixedUrls.addAll(tmpValid);
        mixedUrls.addAll(tmpInvalid);
        Collections.shuffle(Arrays.asList(mixedUrls.toArray()));

        validSchemes = new ArrayList<>();
        // Add valid URL schemes to the list
        validSchemes.add("http");
        validSchemes.add("https");
        validSchemes.add("ftp");
        validSchemes.add("file");
        validSchemes.add("mailto");
        validSchemes.add("tel");
        validSchemes.add("data");

        invalidSchemes = new ArrayList<>();
        // Add invalid URL schemes to the list
        invalidSchemes.add("htp"); // Invalid scheme
        invalidSchemes.add("invalidscheme"); // Invalid scheme
        invalidSchemes.add("123scheme"); // Invalid scheme
        invalidSchemes.add("htt:p");    // Colon in the wrong place
        invalidSchemes.add("ht-tp");   // Dash not allowed
        invalidSchemes.add("ft p");    // Space not allowed
        invalidSchemes.add("123");     // Numbers not allowed as scheme
    }


    public static Set<String> generateUniqueURLs(int count) {
        Set<String> uniqueURLs = new HashSet<>();
        for (int i = 0; i < count; i++) {
            String url;
            do {
                url = generateRandomURL();
            } while (uniqueURLs.contains(url));
            uniqueURLs.add(url);
        }
        return uniqueURLs;
    }

    private static String generateRandomURL() {
        // Define URL components
        String[] schemes = {"http://", "https://", "ftp://"};
        String[] domains = {"example.com", "google.com", "yahoo.com", "github.com", "stackoverflow.com"};
        String[] paths = {"/page1", "/page2", "/index.html", "/docs", "/blog"};
        String[] queryParameters = {"param1=value1&param2=value2", "", "query"};
        String[] ipv4Addresses = {"192.168.1.1", "10.0.0.1", "172.16.0.1", "8.8.8.8"};
        String[] ipv6Addresses = {"[2001:0db8:85a3:0000:0000:8a2e:0370:7334]", "[::1]", "[2001:0db8::1]", "[2606:2800:220:1:248:1893:25c8:1946]"};

        // Generate a random URL
        String scheme = schemes[(int) (Math.random() * schemes.length)];
        String domain = domains[(int) (Math.random() * domains.length)];
        String path = paths[(int) (Math.random() * paths.length)];
        String query = queryParameters[(int) (Math.random() * queryParameters.length)];

        String address = Math.random() < 0.5 ? ipv4Addresses[(int) (Math.random() * ipv4Addresses.length)] // CHECKSTYLE IGNORE MagicNumber
                : ipv6Addresses[(int) (Math.random() * ipv6Addresses.length)];

        return scheme + domain + path + "?" + query + address;
    }

    public static Set<String> generateInvalidURLs(int count) {
        Set<String> invalidURLs = new HashSet<>();
        for (int i = 0; i < count; i++) {
            String url;
            do {
                url = generateRandomInvalidURL();
            } while (invalidURLs.contains(url));
            invalidURLs.add(url);
        }
        return invalidURLs;
    }

    private static String generateRandomInvalidURL() {
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

        return invalidURLs[(int) (Math.random() * invalidURLs.length)];
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

    //Schemes Validation
    @Benchmark
    public void benchmarkIsValidatorForValidSchemes(Blackhole bh) {
        for(String scheme: validSchemes){
            boolean isValid = urlValidator.isValid(scheme);
            bh.consume(isValid);
        }
    }

    @Benchmark
    public void benchmarkIsValidatorForInvalidSchemes(Blackhole bh) {
        for(String scheme: invalidSchemes){
            boolean isValid = urlValidator.isValid(scheme);
            bh.consume(isValid);
        }
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
            boolean isValid = urlValidator.isValid(url);
            bh.consume(isValid);
        }
    }

    @Benchmark
    public void validateSetInvalidUrl(Blackhole bh) {
        for(String url: invalidUrls){
            boolean isValid = urlValidator.isValid(url);
            bh.consume(isValid);
        }
    }

    @Benchmark
    public void validateSetMixedUrl(Blackhole bh) {
        for(String url: mixedUrls){
            boolean isValid = urlValidator.isValid(url);
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
