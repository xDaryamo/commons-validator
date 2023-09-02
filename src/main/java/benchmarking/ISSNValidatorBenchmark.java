package benchmarking;

import org.apache.commons.validator.routines.ISSNValidator;
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
public class ISSNValidatorBenchmark {

    private static final int ATTEMPTS = 10000;
    private static final String ISSNFORMAT = "####-####";
    private static final String INVALIDFORMAT = "####-####-##"; // Invalid format
    private ISSNValidator issnValidator;
    private String[] validISSNs;
    private String[] invalidISSNs;
    private String[] mixedISSNs;
    private String[] shortISSNs;
    private String[] mediumISSNs;
    private String[] longISSNs;
    private String[] customFormatISSNs;
    private Set<String> uniqueValidISSNs;
    private Set<String> uniqueInvalidISSNs;
    private Set<String> uniqueMixedISSNs;

    @Setup
    public void setup() {
        issnValidator = new ISSNValidator();

        // Generate valid ISSN strings (change as needed)
        validISSNs = new String[] {"0378-5955", "1558-5646", "1043-4656"};

        // Generate invalid ISSN strings (change as needed)
        invalidISSNs = new String[] {"invalid-issn-1", "invalid-issn-2", "invalid-issn-3"};

        // Combine valid and invalid ISSNs for mixed test
        mixedISSNs = new String[] {"0378-5955", "invalid-issn-1", "1558-5646"};

        // Generate short ISSN strings (e.g., 7 characters)
        shortISSNs = new String[] {"0378595", "1558564", "1043465"};

        // Generate medium-length ISSN strings (e.g., 8 characters)
        mediumISSNs = new String[] {"03785955", "15585646", "10434651"};

        // Generate long ISSN strings (e.g., 9 characters)
        longISSNs = new String[] {"037859550", "155856462", "104346510"};

        // Generate ISSN strings in custom formats (change as needed)
        customFormatISSNs = new String[] {"1234-567X", "9876-5432Y", "ABCD-EFGH"};

        // Generate a mixed-format ISSN dataset with a size of 1000
        uniqueValidISSNs = generateUniqueISSNs(1000); // CHECKSTYLE IGNORE MagicNumber

        // Generate an invalid ISSN dataset with a size of 1000
        uniqueInvalidISSNs = generateInvalidISSNs(1000); // CHECKSTYLE IGNORE MagicNumber

        uniqueMixedISSNs = new HashSet<>();

        Set<String> tmpValid = generateUniqueISSNs(500);  // CHECKSTYLE IGNORE MagicNumber
        Set<String> tmpInvalid = generateInvalidISSNs(500);  // CHECKSTYLE IGNORE MagicNumber
        uniqueMixedISSNs.addAll(tmpValid);
        uniqueMixedISSNs.addAll(tmpInvalid);
        Collections.shuffle(Arrays.asList(uniqueMixedISSNs.toArray()));
    }

    public static Set<String> generateUniqueISSNs(int count) {
        Set<String> uniqueISSNs = new HashSet<>();
        for (int i = 0; i < count; i++) {
            String issn;
            int attempts = 0;
            do {
                issn = generateRandomISSN();
                attempts++;
                // Ensure we don't get stuck in an infinite loop
                if (attempts > ATTEMPTS) {
                    throw new RuntimeException("Unable to generate unique ISSN after too many attempts.");
                }
            } while (uniqueISSNs.contains(issn));
            uniqueISSNs.add(issn);
        }
        return uniqueISSNs;
    }

    private static String generateRandomISSN() {
        StringBuilder issnBuilder = new StringBuilder(ISSNFORMAT);
        for (int i = 0; i < issnBuilder.length(); i++) {
            if (issnBuilder.charAt(i) == '#') {
                int digit = (int) (Math.random() * 10); // CHECKSTYLE IGNORE MagicNumber
                issnBuilder.setCharAt(i, (char) ('0' + digit));
            }
        }
        return issnBuilder.toString();
    }

    public static Set<String> generateInvalidISSNs(int count) {
        Set<String> invalidISSNs = new HashSet<>();
        for (int i = 0; i < count; i++) {
            String issn;
            int attempts = 0;
            do {
                issn = generateRandomInvalidISSN();
                attempts++;
                // Ensure we don't get stuck in an infinite loop
                if (attempts > ATTEMPTS) {
                    throw new RuntimeException("Unable to generate unique invalid ISSN after too many attempts.");
                }
            } while (invalidISSNs.contains(issn));
            invalidISSNs.add(issn);
        }
        return invalidISSNs;
    }

    private static String generateRandomInvalidISSN() {
        StringBuilder issnBuilder = new StringBuilder(INVALIDFORMAT);
        for (int i = 0; i < issnBuilder.length(); i++) {
            if (issnBuilder.charAt(i) == '#') {
                int digit = (int) (Math.random() * 10); // CHECKSTYLE IGNORE MagicNumber
                issnBuilder.setCharAt(i, (char) ('0' + digit));
            }
        }
        return issnBuilder.toString();
    }

    @Benchmark
    public void benchmarkValidISSNValidation(Blackhole blackhole) {
        for (String issn : validISSNs) {
            boolean isValid = issnValidator.isValid(issn);
            blackhole.consume(isValid);
        }
    }

    @Benchmark
    public void benchmarkInvalidISSNValidation(Blackhole blackhole) {
        for (String issn : invalidISSNs) {
            boolean isValid = issnValidator.isValid(issn);
            blackhole.consume(isValid);
        }
    }

    @Benchmark
    public void benchmarkMixedISSNValidation(Blackhole blackhole) {
        for (String issn : mixedISSNs) {
            boolean isValid = issnValidator.isValid(issn);
            blackhole.consume(isValid);
        }
    }

    @Benchmark
    public void benchmarkShortISSNValidation(Blackhole blackhole) {
        for (String issn : shortISSNs) {
            boolean isValid = issnValidator.isValid(issn);
            blackhole.consume(isValid);
        }
    }

    @Benchmark
    public void benchmarkMediumISSNValidation(Blackhole blackhole) {
        for (String issn : mediumISSNs) {
            boolean isValid = issnValidator.isValid(issn);
            blackhole.consume(isValid);
        }
    }

    @Benchmark
    public void benchmarkLongISSNValidation(Blackhole blackhole) {
        for (String issn : longISSNs) {
            boolean isValid = issnValidator.isValid(issn);
            blackhole.consume(isValid);
        }
    }

    @Benchmark
    public void benchmarkCustomFormatISSNValidation(Blackhole blackhole) {
        for (String issn : customFormatISSNs) {
            boolean isValid = issnValidator.isValid(issn);
            blackhole.consume(isValid);
        }
    }

    @Benchmark
    public void benchmarkDataSetISSNValidation(Blackhole blackhole) {
        for (String issn : uniqueValidISSNs) {
            boolean isValid = issnValidator.isValid(issn);
            blackhole.consume(isValid);
        }
    }

    @Benchmark
    public void benchmarkDataSetInvalidISSNValidation(Blackhole blackhole) {
        for (String issn : uniqueInvalidISSNs) {
            boolean isValid = issnValidator.isValid(issn);
            blackhole.consume(isValid);
        }
    }

    @Benchmark
    public void benchmarkDataSetMixedISSNValidation(Blackhole blackhole) {
        for (String issn : uniqueMixedISSNs) {
            boolean isValid = issnValidator.isValid(issn);
            blackhole.consume(isValid);
        }
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(new String[]{
                "-f", "1", // "-f" specifica di eseguire una sola classe di benchmark, "1" indica l'indice della classe
                "benchmarking.ISSNValidatorBenchmark" // Sostituire con il nome completo della vostra classe di benchmark
        });
    }

}
