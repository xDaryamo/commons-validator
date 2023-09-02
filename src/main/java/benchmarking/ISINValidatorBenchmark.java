package benchmarking;

import org.apache.commons.validator.routines.ISBNValidator;
import org.apache.commons.validator.routines.ISINValidator;
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
public class ISINValidatorBenchmark {

    private static final int WARMUP_ITERATIONS = 5;
    private static final int MEASUREMENT_ITERATIONS = 5;
    private ISINValidator isinValidator;
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int ISIN_LENGTH = 12;

    private String[] multipleValidIsin;
    private String[] multipleInvalidIsin;

    private String[] multipleMixedIsin;

    @Setup
    public void setup() {
        isinValidator =  ISINValidator.getInstance(true);

        // Generate a format ISIN dataset with a size of 1000
        multipleValidIsin = generateRandomValidISINs(1000); // CHECKSTYLE IGNORE MagicNumber
        multipleInvalidIsin = generateRandomInvalidISINs(1000); // CHECKSTYLE IGNORE MagicNumber
        multipleMixedIsin = generateRandomMixedISINs(1000);// CHECKSTYLE IGNORE MagicNumber

    }


    @Benchmark
    public void validateSingleValidISIN(Blackhole blackhole) {
        boolean isValid = isinValidator.isValid("US3453708600");
        blackhole.consume(isValid);
    }

    @Benchmark
    public void validateSingleInvalidISIN(Blackhole blackhole) {
        boolean isValid = isinValidator.isValid("INVALID1234567");
        blackhole.consume(isValid);
    }

    @Benchmark
    public void validateValidISINSet(Blackhole blackhole) {
        boolean isValid = true;
        for (String isin : multipleValidIsin) {
            isValid = isinValidator.isValid(isin);
            blackhole.consume(isValid);
        }

    }

    @Benchmark
    public void validateInvalidISINSet(Blackhole blackhole) {
        boolean isValid = true;
        for (String isin : multipleInvalidIsin) {
            isValid = isinValidator.isValid(isin);
            blackhole.consume(isValid);
        }
    }

    @Benchmark
    public void validateMixedISINSet(Blackhole blackhole) {
        boolean isValid = true;
        for (String isin : multipleMixedIsin) {
            isValid = isinValidator.isValid(isin);
            blackhole.consume(isValid);
        }
    }

    public String[] generateRandomMixedISINs(int count) {
        String[] isinList = new String[count];
        String[] validISIN = generateRandomValidISINs(count/2);
        String[] invalidISIN = generateRandomInvalidISINs(count/2);

        System.arraycopy(validISIN, 0, isinList, 0, validISIN.length);
        System.arraycopy(invalidISIN, 0, isinList, validISIN.length, invalidISIN.length);

        List<String> combinedList = Arrays.asList(isinList);
        Collections.shuffle(combinedList);

        isinList = combinedList.toArray(new String[0]);

        return isinList;

    }


    public static String[] generateRandomValidISINs(int count) {
        ISINValidator isinValidator = ISINValidator.getInstance(true);
        String[] isinArray = new String[count];
        Random random = new Random();

        for (int i = 0; i < count; ) {
            StringBuilder isin = new StringBuilder();

            // Generate the first two characters (country code)
            for (int j = 0; j < 2; j++) {
                isin.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
            }

            // Generate the next nine characters (NSIN)
            for (int j = 0; j < 9; j++) {
                isin.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
            }

            // Generate the check digit
            isin.append(random.nextInt(10)); // A random digit (0-9)

            // Validate the generated ISIN to ensure it's valid
            if (isinValidator.isValid(isin.toString())) {
                isinArray[i++] = isin.toString();
            }
        }

        return isinArray;
    }

    public static String[] generateRandomInvalidISINs(int count) {
        String[] isinArray = new String[count];
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            StringBuilder isin = new StringBuilder();

            // Generate random characters for the entire ISIN length
            for (int j = 0; j < ISIN_LENGTH; j++) {
                isin.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
            }

            isinArray[i] = isin.toString();
        }

        return isinArray;
    }


    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(new String[]{
                "-f", "1", // "-f" specifica di eseguire una sola classe di benchmark, "1" indica l'indice della classe
                "benchmarking.ISINValidatorBenchmark" // Sostituire con il nome completo della vostra classe di benchmark
        });
    }
}
