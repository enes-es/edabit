import java.util.stream.IntStream;

public class ChallengePrime {
    public static boolean PrimeNumberInRange(int n1, int n2) {

        return IntStream.rangeClosed(n1, n2).anyMatch(i -> isPrime(i));

        
    }

    /*
     * Runtime comparison:
     * using streams:   ~40 ms
     * CStyle:          ~2  ms
     */
    public static boolean PrimeNumberInRange_CStyle(int n1, int n2) {
        for (int i = n1; i <= n2; ++i) {
            if (isPrime(i))
                return true;
        }

        return false;
    }

    public static boolean isPrime(int n) {
        // if n isn't divisible by numbers up to n/2, it must be prime

        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
