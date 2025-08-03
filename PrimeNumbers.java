// Program to first 26 prime numbers
import java.util.ArrayList;
import java.util.List;
public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>();
        int number = 2; // Start checking for prime from 2

        while (primes.size() < 26) {
            if (isPrime(number)) {
                primes.add(number);
            }
            number++;
        }

        System.out.println("First 26 prime numbers: " + primes);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}