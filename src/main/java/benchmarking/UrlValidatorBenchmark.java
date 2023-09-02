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
import java.util.ArrayList;
import java.util.List;
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
    private  List<String> invalidUrls;
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

        validUrls = new ArrayList<>();
        // Add valid URLs to the list
        validUrls.add("http://www.amazon.com");
        validUrls.add("https://www.google.com");
        validUrls.add("ftp://ftp.example.org");
        validUrls.add("http://www.apache.org");
        validUrls.add("https://www.github.com");
        validUrls.add("ftp://ftp.gnu.org");
        validUrls.add("2001:0db8:85a3:0000:0000:8a2e:0370:7334"); //Full IPv6 Address
        validUrls.add("2001:0db8:0:0:0:0:0:1"); //Full IPv6 Address
        validUrls.add("::1");  //Shorthand Notation and Loopback address
        validUrls.add("fe80::1%eth0"); //Link-local address with zone ID
        validUrls.add("ff02::1%wlan0"); //Multicast address with zone ID
        validUrls.add("192.168.0.1"); //IPv4
        validUrls.add("10.0.0.2"); //IPv4

        invalidUrls = new ArrayList<>();
        // Add invalid URLs to the list
        invalidUrls.add("www.invalid-url"); // Missing scheme
        invalidUrls.add("http://"); // Missing host
        invalidUrls.add("http://example.com:8080/path?query"); // Missing path
        invalidUrls.add("htp://www.example.com"); // Invalid scheme
        invalidUrls.add("http://www.example.com:80/<>"); // Invalid characters in path
        invalidUrls.add("ftp://www.example.com:invalidport"); // Invalid port
        invalidUrls.add("http://[FEDC:BA98:7654:3210]:80/index.html"); // Missing square brackets
        invalidUrls.add("http://[FEDC:BA98:7654:3210:FEDC:BA98:7654:3210]:80/index.html"); // Extra colon
        invalidUrls.add("http://[FEDC:BA98:7654:3210:FEDC:BA98:7654:3210]:80:80/index.html"); // Extra colon
        invalidUrls.add("http://[::1]:80/index.html"); // Valid IPv6 but missing square brackets
        invalidUrls.add("192.168.0.300"); // Invalid range
        invalidUrls.add("172.16.0.256");   // Invalid range
        invalidUrls.add("10.0.0.0.1");     // Extra digits
        invalidUrls.add("192.168.1");       // Incomplete

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
    public void validateMultipleValidMixedUrl(Blackhole bh) {
        for(String url: validUrls){
            boolean isValid = urlValidator.isValid(url);
            bh.consume(isValid);
        }
    }

    @Benchmark
    public void validateMultipleInalidMixedUrl(Blackhole bh) {
        for(String url: invalidUrls){
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
