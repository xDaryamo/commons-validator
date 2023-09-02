package benchmarking;

import org.apache.commons.validator.routines.ISBNValidator;
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
public class ISBNValidatorBenchmark {

    private static final int WARMUP_ITERATIONS = 5;
    private static final int MEASUREMENT_ITERATIONS = 5;
    private static final int ATTEMPTS = 10000; // Adjust as needed
    private static final String ISBN10FORMAT = "###-#-##-####-#"; // ISBN-10 format
    private static final String ISBN13FORMAT = "###-###-#####-#"; // ISBN-13 format
    private ISBNValidator isbnValidator;
    private String[] validISBNs;
    private String[] invalidISBNs;
    private String[] mixedISBNs;
    private String[] shortISBNs;
    private String[] mediumISBNs;
    private String[] longISBNs;
    private Set<String> dataSetValidISBN10s;
    private Set<String> dataSetValidISBN13s;
    private Set<String> dataSetMixedValidISBNs;

    @Setup
    public void setup() {
        isbnValidator = new ISBNValidator();

        // Generate valid ISBN strings (change as needed)
        validISBNs = new String[] {"978-0451450522", "978-0307346612", "978-1593275846"};

        // Generate invalid ISBN strings (change as needed)
        invalidISBNs = new String[] {"invalid-isbn-1", "invalid-isbn-2", "invalid-isbn-3"};

        // Combine valid and invalid ISBNs for mixed test
        mixedISBNs = new String[] {"978-0451450522", "invalid-isbn-1", "978-1593275846"};

        // Generate short ISBN strings (e.g., ISBN-10)
        shortISBNs = new String[] {"0451450522", "0307346612", "0123456789"};

        // Generate medium-length ISBN strings (e.g., ISBN-13)
        mediumISBNs = new String[] {"9780451450522", "9790307346612", "9780123456789"};

        // Generate long ISBN strings (e.g., custom formats)
        longISBNs = new String[] {"1234567890123456789012345678901234567890", "9876543210987654321098765432109876543210"};

        // Generate a mixed-format ISBN dataset with a size of 1000
        dataSetValidISBN10s = generateValidUniqueISBN10s(1000); // CHECKSTYLE IGNORE MagicNumber
        dataSetValidISBN13s = generateValidUniqueISBN13s(1000); // CHECKSTYLE IGNORE MagicNumber

        dataSetMixedValidISBNs = new HashSet<>();
        Set<String> isbn13 = generateValidUniqueISBN13s(500); // CHECKSTYLE IGNORE MagicNumber
        Set<String> isbn10 = generateValidUniqueISBN13s(500); // CHECKSTYLE IGNORE MagicNumber
        dataSetMixedValidISBNs.addAll(isbn13);
        dataSetMixedValidISBNs.addAll(isbn10);
        Collections.shuffle(Arrays.asList(dataSetMixedValidISBNs.toArray()));
    }

    public static Set<String> generateValidUniqueISBN10s(int count) {
        Set<String> uniqueISBNs = new HashSet<>();
        for (int i = 0; i < count; i++) {
            String isbn;
            int attempts = 0;
            do {
                isbn = generateValidRandomISBN10();
                attempts++;
                // Ensure we don't get stuck in an infinite loop
                if (attempts > ATTEMPTS) {
                    throw new RuntimeException("Unable to generate unique ISBN after too many attempts.");
                }
            } while (uniqueISBNs.contains(isbn));
            uniqueISBNs.add(isbn);
        }
        return uniqueISBNs;
    }

    private static String generateValidRandomISBN10() {
        StringBuilder isbnBuilder = new StringBuilder(ISBN10FORMAT);
        for (int i = 0; i < isbnBuilder.length(); i++) {
            if (isbnBuilder.charAt(i) == '#') {
                int digit = (int) (Math.random() * 10); // CHECKSTYLE IGNORE MagicNumber
                isbnBuilder.setCharAt(i, (char) ('0' + digit));
            }
        }
        return isbnBuilder.toString();
    }

    public static Set<String> generateValidUniqueISBN13s(int count) {
        Set<String> uniqueISBNs = new HashSet<>();
        for (int i = 0; i < count; i++) {
            String isbn;
            int attempts = 0;
            do {
                isbn = generateValidRandomISBN13();
                attempts++;
                // Ensure we don't get stuck in an infinite loop
                if (attempts > ATTEMPTS) {
                    throw new RuntimeException("Unable to generate unique ISBN after too many attempts.");
                }
            } while (uniqueISBNs.contains(isbn));
            uniqueISBNs.add(isbn);
        }
        return uniqueISBNs;
    }

    private static String generateValidRandomISBN13() {
        StringBuilder isbnBuilder = new StringBuilder(ISBN13FORMAT);
        for (int i = 0; i < isbnBuilder.length(); i++) {
            if (isbnBuilder.charAt(i) == '#') {
                int digit = (int) (Math.random() * 10); // CHECKSTYLE IGNORE MagicNumber
                isbnBuilder.setCharAt(i, (char) ('0' + digit));
            }
        }
        return isbnBuilder.toString();
    }

    @Benchmark
    public void benchmarkValidISBNValidation(Blackhole blackhole) {
        for (String isbn : validISBNs) {
            boolean isValid = isbnValidator.isValid(isbn);
            blackhole.consume(isValid);
        }
    }

    @Benchmark
    public void benchmarkInvalidISBNValidation(Blackhole blackhole) {
        for (String isbn : invalidISBNs) {
            boolean isValid = isbnValidator.isValid(isbn);
            blackhole.consume(isValid);
        }
    }

    @Benchmark
    public void benchmarkMixedISBNValidation(Blackhole blackhole) {
        for (String isbn : mixedISBNs) {
            boolean isValid = isbnValidator.isValid(isbn);
            blackhole.consume(isValid);
        }
    }

    @Benchmark
    public void benchmarkISBN10Validation(Blackhole blackhole) {
        boolean isValid = isbnValidator.isValid("0451450522");
        blackhole.consume(isValid);
    }

    @Benchmark
    public void benchmarkISBN13Validation(Blackhole blackhole) {
        boolean isValid = isbnValidator.isValid("9790307346612");
        blackhole.consume(isValid);
    }

    @Benchmark
    public void benchmarkShortISBNValidation(Blackhole blackhole) {
        for (String isbn : shortISBNs) {
            boolean isValid = isbnValidator.isValid(isbn);
            blackhole.consume(isValid);
        }
    }

    @Benchmark
    public void benchmarkMediumISBNValidation(Blackhole blackhole) {
        for (String isbn : mediumISBNs) {
            boolean isValid = isbnValidator.isValid(isbn);
            blackhole.consume(isValid);
        }
    }

    @Benchmark
    public void benchmarkLongISBNValidation(Blackhole blackhole) {
        for (String isbn : longISBNs) {
            boolean isValid = isbnValidator.isValid(isbn);
            blackhole.consume(isValid);
        }
    }

    @Benchmark
    public void benchmarkISBN13ValidSetValidation(Blackhole blackhole) {
        for (String isbn : dataSetValidISBN13s) {
            boolean isValid = isbnValidator.isValid(isbn);
            blackhole.consume(isValid);
        }
    }

    @Benchmark
    public void benchmarkISBN10ValidSetValidation(Blackhole blackhole) {
        for (String isbn : dataSetValidISBN10s) {
            boolean isValid = isbnValidator.isValid(isbn);
            blackhole.consume(isValid);
        }
    }

    @Benchmark
    public void benchmarkISBNMixedValidSetValidation(Blackhole blackhole) {
        for (String isbn : dataSetMixedValidISBNs) {
            boolean isValid = isbnValidator.isValid(isbn);
            blackhole.consume(isValid);
        }
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(new String[]{
                "-f", "1", // "-f" specifica di eseguire una sola classe di benchmark, "1" indica l'indice della classe
                "benchmarking.ISBNValidatorBenchmark" // Sostituire con il nome completo della vostra classe di benchmark
        });
    }
}
