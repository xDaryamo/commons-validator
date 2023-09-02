package benchmarking;

import org.apache.commons.validator.routines.ISBNValidator;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
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
    private ISBNValidator isbnValidator;
    private String[] validISBNs;
    private String[] invalidISBNs;
    private String[] mixedISBNs;
    private String[] isbn10s;
    private String[] isbn13s;
    private String[] shortISBNs;
    private String[] mediumISBNs;
    private String[] longISBNs;
    private String[] dataSetISBNs;

    @Setup
    public void setup() {
        isbnValidator = new ISBNValidator();

        // Generate valid ISBN strings (change as needed)
        validISBNs = new String[] {"978-0451450522", "978-0307346612", "978-1593275846"};

        // Generate invalid ISBN strings (change as needed)
        invalidISBNs = new String[] {"invalid-isbn-1", "invalid-isbn-2", "invalid-isbn-3"};

        // Combine valid and invalid ISBNs for mixed test
        mixedISBNs = new String[] {"978-0451450522", "invalid-isbn-1", "978-1593275846"};

        // Generate ISBN-10 strings (change as needed)
        isbn10s = new String[] {"0451450522", "0307346612", "0123456789"};

        // Generate ISBN-13 strings (change as needed)
        isbn13s = new String[] {"9780451450522", "9790307346612", "9780123456789"};

        // Generate short ISBN strings (e.g., ISBN-10)
        shortISBNs = new String[] {"0451450522", "0307346612", "0123456789"};

        // Generate medium-length ISBN strings (e.g., ISBN-13)
        mediumISBNs = new String[] {"9780451450522", "9790307346612", "9780123456789"};

        // Generate long ISBN strings (e.g., custom formats)
        longISBNs = new String[] {"1234567890123456789012345678901234567890", "9876543210987654321098765432109876543210"};

        // Generate a mixed-format ISBN dataset with a size of 1000
        dataSetISBNs = generateMixedISBNs(1000); // CHECKSTYLE IGNORE MagicNumber
    }

    private String[] generateMixedISBNs(int size) {
        String[] isbnArray = new String[size];
        for (int i = 0; i < size; i++) {
            // Alternate between ISBN-10 and ISBN-13 formats for the mixed dataset
            String format = (i % 2 == 0) ? "0451450522" : "9780307346612";
            isbnArray[i] = format + i;
        }
        return isbnArray;
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
        for (String isbn : isbn10s) {
            boolean isValid = isbnValidator.isValid(isbn);
            blackhole.consume(isValid);
        }
    }

    @Benchmark
    public void benchmarkISBN13Validation(Blackhole blackhole) {
        for (String isbn : isbn13s) {
            boolean isValid = isbnValidator.isValid(isbn);
            blackhole.consume(isValid);
        }
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
    public void benchmarkMixedISBNDataSetValidation(Blackhole blackhole) {
        for (String isbn : dataSetISBNs) {
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
