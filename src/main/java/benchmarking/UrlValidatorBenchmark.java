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

import org.apache.commons.validator.routines.DomainValidator;
import org.apache.commons.validator.routines.RegexValidator;
import org.apache.commons.validator.routines.UrlValidator;
import org.openjdk.jmh.annotations.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static org.openjdk.jmh.runner.Defaults.MEASUREMENT_ITERATIONS;
import static org.openjdk.jmh.runner.Defaults.WARMUP_ITERATIONS;

@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = WARMUP_ITERATIONS, time = 1)
@Measurement(iterations = MEASUREMENT_ITERATIONS, time = 1)
@Fork(1)
@State(Scope.Benchmark)
public class UrlValidatorBenchmark {

    private static final int WARMUP_ITERATIONS = 5;
    private static final int MEASUREMENT_ITERATIONS = 5;

    private static final UrlValidator URL_VALIDATOR = UrlValidator.getInstance();

    @Benchmark
    public void benchmarkIsValid() {
        URL_VALIDATOR.isValid("http://www.google.com");
    }

    @Benchmark
    public void benchmarkIsValidScheme() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String scheme = "http";

        Method method = UrlValidator.class.getDeclaredMethod("isValidScheme", String.class);
        method.setAccessible(true);
        method.invoke(URL_VALIDATOR, scheme);

    }

    @Benchmark
    public void benchmarkValidator202() {
        URL_VALIDATOR.isValid("http://l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.l.org");
    }

    @Benchmark
    public void benchmarkValidator204() {
        URL_VALIDATOR.isValid("http://tech.yahoo.com/rc/desktops/102;_ylt=Ao8yevQHlZ4On0O3ZJGXLEQFLZA5");
    }

    @Benchmark
    public void benchmarkValidator218() {
        URL_VALIDATOR.isValid("http://somewhere.com/pathxyz/file(1).html");
    }

    @Benchmark
    public void benchmarkValidator235() {
        final String version = System.getProperty("java.version");
        if (version.compareTo("1.6") < 0) {
            System.out.println("Cannot run Unicode IDN tests");
            return; // Cannot run the test
        }

        URL_VALIDATOR.isValid("http://xn--d1abbgf6aiiy.xn--p1ai");
        URL_VALIDATOR.isValid("http://президент.рф");
        URL_VALIDATOR.isValid("http://www.bücher.ch");
        URL_VALIDATOR.isValid("http://www.\uFFFD.ch");
        URL_VALIDATOR.isValid("ftp://www.bücher.ch");
        URL_VALIDATOR.isValid("ftp://www.\uFFFD.ch");
    }

    @Benchmark
    public void benchmarkValidator248() {
        final RegexValidator regex = new RegexValidator("localhost", ".*\\.my-testing");
        UrlValidator validator = new UrlValidator(regex, 0);

        validator.isValid("http://localhost/test/index.html");
        validator.isValid("http://first.my-testing/test/index.html");
        validator.isValid("http://sup3r.my-testing/test/index.html");
        validator.isValid("http://broke.my-test/test/index.html");
        validator.isValid("http://www.apache.org/test/index.html");

        // Now check using options
        validator = new UrlValidator(UrlValidator.ALLOW_LOCAL_URLS);

        validator.isValid("http://localhost/test/index.html");
        validator.isValid("http://machinename/test/index.html");
        validator.isValid("http://www.apache.org/test/index.html");
    }

    @Benchmark
    public void benchmarkValidator288() {
        UrlValidator validator = new UrlValidator(UrlValidator.ALLOW_LOCAL_URLS);

        validator.isValid("http://hostname");
        validator.isValid("http://hostname/test/index.html");
        validator.isValid("http://localhost/test/index.html");
        validator.isValid("http://first.my-testing/test/index.html");
        validator.isValid("http://broke.hostname/test/index.html");
        validator.isValid("http://www.apache.org/test/index.html");

        // Turn it off, and check
        validator = new UrlValidator(0);

        validator.isValid("http://hostname");
        validator.isValid("http://localhost/test/index.html");
        validator.isValid("http://www.apache.org/test/index.html");
    }

    @Benchmark
    public void benchmarkValidator276() {
        // file:// isn't allowed by default
        UrlValidator validator = new UrlValidator();

        validator.isValid("http://www.apache.org/test/index.html");
        validator.isValid("file:///C:/some.file");
        validator.isValid("file:///C:\\some.file");
        validator.isValid("file:///etc/hosts");
        validator.isValid("file://localhost/etc/hosts");
        validator.isValid("file://localhost/c:/some.file");

        // Turn it on, and check
        validator = new UrlValidator(new String[]{"http", "file"}, UrlValidator.ALLOW_LOCAL_URLS);

        validator.isValid("http://www.apache.org/test/index.html");
        validator.isValid("file:///C:/some.file");
        validator.isValid("file:///C:\\some.file");
        validator.isValid("file:///etc/hosts");
        validator.isValid("file://localhost/etc/hosts");
        validator.isValid("file://localhost/c:/some.file");
    }

    @Benchmark
    public void benchmarkValidator391OK() {
        final String[] schemes = {"file"};
        final UrlValidator urlValidator = new UrlValidator(schemes);
        urlValidator.isValid("file:///C:/path/to/dir/");
    }

    @Benchmark
    public void benchmarkValidator391FAILS() {
        final String[] schemes = {"file"};
        final UrlValidator urlValidator = new UrlValidator(schemes);
        urlValidator.isValid("file:/C:/path/to/dir/");
    }

    @Benchmark
    public boolean benchmarkValidator309() {

        return URL_VALIDATOR.isValid("http://sample.ondemand.com/")
                && URL_VALIDATOR.isValid("hTtP://sample.ondemand.CoM/")
                && URL_VALIDATOR.isValid("httpS://SAMPLE.ONEMAND.COM/")
                && URL_VALIDATOR.isValid("http://sample.ondemand.com/")
                && URL_VALIDATOR.isValid("hTtP://sample.ondemand.CoM/")
                && URL_VALIDATOR.isValid("httpS://SAMPLE.ONEMAND.COM/");
    }

    @Benchmark
    public boolean benchmarkValidator339() {

        return URL_VALIDATOR.isValid("http://www.cnn.com/WORLD/?hpt=sitenav") // without
                && URL_VALIDATOR.isValid("http://www.cnn.com./WORLD/?hpt=sitenav") // with
                && !URL_VALIDATOR.isValid("http://www.cnn.com../") // doubly dotty
                && !URL_VALIDATOR.isValid("http://www.cnn.invalid/")
                && !URL_VALIDATOR.isValid("http://www.cnn.invalid./"); // check . does not affect invalid domains
    }

    @Benchmark
    public boolean benchmarkValidator339IDN() {

        return URL_VALIDATOR.isValid("http://президент.рф/WORLD/?hpt=sitenav") // without
                && URL_VALIDATOR.isValid("http://президент.рф./WORLD/?hpt=sitenav") // with
                && !URL_VALIDATOR.isValid("http://президент.рф..../") // very dotty
                && !URL_VALIDATOR.isValid("http://президент.рф.../") // triply dotty
                && !URL_VALIDATOR.isValid("http://президент.рф../"); // doubly dotty
    }

    @Benchmark
    public boolean benchmarkValidator342() {

        return URL_VALIDATOR.isValid("http://example.rocks/")
                && URL_VALIDATOR.isValid("http://example.rocks");
    }

    @Benchmark
    public boolean benchmarkValidator411() {

        return URL_VALIDATOR.isValid("http://example.rocks:/")
                && URL_VALIDATOR.isValid("http://example.rocks:0/")
                && URL_VALIDATOR.isValid("http://example.rocks:65535/")
                && !URL_VALIDATOR.isValid("http://example.rocks:65536/")
                && !URL_VALIDATOR.isValid("http://example.rocks:100000/");
    }

    @Benchmark
    public boolean benchmarkValidator464() {
        final String[] schemes = {"file"};
        final UrlValidator urlValidator = new UrlValidator(schemes);

        final String fileNAK = "file://bad ^ domain.com/label/test";
        return !urlValidator.isValid(fileNAK);
    }

    @Benchmark
    public boolean benchmarkValidator452() {

        return URL_VALIDATOR.isValid("http://[::FFFF:129.144.52.38]:80/index.html");
    }

    @Benchmark
    public boolean benchmarkValidator4731() { // reject null DomainValidator
        try {
            new UrlValidator(new String[]{}, null, 0L, null);
            return false;
        } catch (IllegalArgumentException e) {
            return e.getMessage().equals("DomainValidator must not be null");
        }
    }

    @Benchmark
    public boolean benchmarkValidator4732() { // reject null DomainValidator with mismatched allowLocal
        final List<DomainValidator.Item> items = new ArrayList<>();
        try {
            new UrlValidator(new String[]{}, null, 0L, DomainValidator.getInstance(true, items));
            return false;
        } catch (IllegalArgumentException e) {
            return e.getMessage().equals("DomainValidator disagrees with ALLOW_LOCAL_URLS setting");
        }
    }

    @Benchmark
    public boolean benchmarkValidator4733() {
        final List<DomainValidator.Item> items = new ArrayList<>();
        try {
            new UrlValidator(new String[]{}, null, UrlValidator.ALLOW_LOCAL_URLS, DomainValidator.getInstance(false, items));
            return false;
        } catch (IllegalArgumentException e) {
            return e.getMessage().equals("DomainValidator disagrees with ALLOW_LOCAL_URLS setting");
        }
    }

    @Benchmark
    public boolean benchmarkValidator290() {

        return URL_VALIDATOR.isValid("http://xn--h1acbxfam.idn.icann.org/")
                && URL_VALIDATOR.isValid("http://test.xn--lgbbat1ad8j")
                && URL_VALIDATOR.isValid("http://test.xn--fiqs8s")
                && URL_VALIDATOR.isValid("http://test.xn--fiqz9s")
                && URL_VALIDATOR.isValid("http://test.xn--wgbh1c")
                && URL_VALIDATOR.isValid("http://test.xn--j6w193g")
                && URL_VALIDATOR.isValid("http://test.xn--h2brj9c")
                && URL_VALIDATOR.isValid("http://test.xn--mgbbh1a71e")
                && URL_VALIDATOR.isValid("http://test.xn--fpcrj9c3d")
                && URL_VALIDATOR.isValid("http://test.xn--gecrj9c")
                && URL_VALIDATOR.isValid("http://test.xn--s9brj9c")
                && URL_VALIDATOR.isValid("http://test.xn--xkc2dl3a5ee0h")
                && URL_VALIDATOR.isValid("http://test.xn--45brj9c")
                && URL_VALIDATOR.isValid("http://test.xn--mgba3a4f16a")
                && URL_VALIDATOR.isValid("http://test.xn--mgbayh7gpa")
                && URL_VALIDATOR.isValid("http://test.xn--mgbc0a9azcg")
                && URL_VALIDATOR.isValid("http://test.xn--ygbi2ammx")
                && URL_VALIDATOR.isValid("http://test.xn--wgbl6a")
                && URL_VALIDATOR.isValid("http://test.xn--p1ai")
                && URL_VALIDATOR.isValid("http://test.xn--mgberp4a5d4ar")
                && URL_VALIDATOR.isValid("http://test.xn--90a3ac")
                && URL_VALIDATOR.isValid("http://test.xn--yfro4i67o")
                && URL_VALIDATOR.isValid("http://test.xn--clchc0ea0b2g2a9gcd")
                && URL_VALIDATOR.isValid("http://test.xn--3e0b707e")
                && URL_VALIDATOR.isValid("http://test.xn--fzc2c9e2c")
                && URL_VALIDATOR.isValid("http://test.xn--xkc2al3hye2a")
                && URL_VALIDATOR.isValid("http://test.xn--ogbpf8fl")
                && URL_VALIDATOR.isValid("http://test.xn--kprw13d")
                && URL_VALIDATOR.isValid("http://test.xn--kpry57d")
                && URL_VALIDATOR.isValid("http://test.xn--o3cw4h")
                && URL_VALIDATOR.isValid("http://test.xn--pgbs0dh")
                && URL_VALIDATOR.isValid("http://test.xn--mgbaam7a8h");
    }

    @Benchmark
    public boolean benchmarkValidator361() {

        return URL_VALIDATOR.isValid("http://hello.tokyo/");
    }

    @Benchmark
    public boolean benchmarkValidator363() {

        return URL_VALIDATOR.isValid("http://www.example.org/a/b/hello..world")
                && URL_VALIDATOR.isValid("http://www.example.org/a/hello..world")
                && URL_VALIDATOR.isValid("http://www.example.org/hello.world/")
                && URL_VALIDATOR.isValid("http://www.example.org/hello..world/")
                && URL_VALIDATOR.isValid("http://www.example.org/hello.world")
                && URL_VALIDATOR.isValid("http://www.example.org/hello..world")
                && URL_VALIDATOR.isValid("http://www.example.org/..world")
                && URL_VALIDATOR.isValid("http://www.example.org/.../world")
                && !URL_VALIDATOR.isValid("http://www.example.org/../world")
                && !URL_VALIDATOR.isValid("http://www.example.org/..")
                && !URL_VALIDATOR.isValid("http://www.example.org/../")
                && !URL_VALIDATOR.isValid("http://www.example.org/./..")
                && !URL_VALIDATOR.isValid("http://www.example.org/././..")
                && URL_VALIDATOR.isValid("http://www.example.org/...");
    }

    @Benchmark
    public boolean benchmarkValidator375() {

        String url = "http://[FEDC:BA98:7654:3210:FEDC:BA98:7654:3210]:80/index.html";
        if (!URL_VALIDATOR.isValid(url)) {
            return false;
        }
        url = "http://[::1]:80/index.html";
        if (!URL_VALIDATOR.isValid(url)) {
            return false;
        }
        url = "http://FEDC:BA98:7654:3210:FEDC:BA98:7654:3210:80/index.html";
        return !URL_VALIDATOR.isValid(url);
    }

    @Benchmark
    public boolean benchmarkValidator353() {

        return URL_VALIDATOR.isValid("http://www.apache.org:80/path")
                && URL_VALIDATOR.isValid("http://user:pass@www.apache.org:80/path")
                && URL_VALIDATOR.isValid("http://user:@www.apache.org:80/path")
                && URL_VALIDATOR.isValid("http://user@www.apache.org:80/path")
                && URL_VALIDATOR.isValid("http://us%00er:-._~!$&'()*+,;=@www.apache.org:80/path")
                && !URL_VALIDATOR.isValid("http://:pass@www.apache.org:80/path")
                && !URL_VALIDATOR.isValid("http://:@www.apache.org:80/path")
                && !URL_VALIDATOR.isValid("http://user:pa:ss@www.apache.org/path")
                && !URL_VALIDATOR.isValid("http://user:pa@ss@www.apache.org/path");
    }

    @Benchmark
    public boolean benchmarkValidator382() {

        return URL_VALIDATOR.isValid("ftp://username:password@example.com:8042/over/there/index" +
                ".dtb?type=animal&name=narwhal#nose");
    }

    @Benchmark
    public boolean benchmarkValidator380() {

        return URL_VALIDATOR.isValid("http://www.apache.org:80/path")
                && URL_VALIDATOR.isValid("http://www.apache.org:8/path")
                && URL_VALIDATOR.isValid("http://www.apache.org:/path");
    }

    @Benchmark
    public boolean benchmarkValidator420() {

        return !URL_VALIDATOR.isValid("http://example.com/serach?address=Main Avenue")
                && URL_VALIDATOR.isValid("http://example.com/serach?address=Main%20Avenue")
                && URL_VALIDATOR.isValid("http://example.com/serach?address=Main+Avenue");
    }

    @Benchmark
    public boolean benchmarkValidator467() {

        return URL_VALIDATOR.isValid("https://example.com/some_path/path/")
                && URL_VALIDATOR.isValid("https://example.com//somepath/path/")
                && URL_VALIDATOR.isValid("https://example.com//some_path/path/")
                && URL_VALIDATOR.isValid("http://example.com//_test"); // VALIDATOR-429
    }

    @Benchmark
    public boolean benchmarkValidator283() {

        return !URL_VALIDATOR.isValid("http://finance.yahoo.com/news/Owners-54B-NY-housing-apf-2493139299" +
                ".html?x=0&ap=%fr")
                && URL_VALIDATOR.isValid("http://finance.yahoo.com/news/Owners-54B-NY-housing-apf-2493139299" +
                ".html?x=0&ap=%22");
    }

    @Benchmark
    public boolean benchmarkFragments() {
        final String[] schemes = {"http", "https"};
        UrlValidator urlValidator = new UrlValidator(schemes, UrlValidator.NO_FRAGMENTS);
        return !urlValidator.isValid("http://apache.org/a/b/c#frag")
                && urlValidator.isValid("http://apache.org/a/b/c#frag");
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }
}
