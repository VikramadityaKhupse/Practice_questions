package END_TERM;

public class Primenumber {
    public static void main(String[] args) {
        long starting_time;
        long ending1;
        int n = 100; // Find primes up to 100

        // First approach: Optimized trial division
        System.out.println("By first approach (Optimized trial division): ");
        starting_time = System.nanoTime();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        ending1 = System.nanoTime();
        System.out.println("\nTime taken: " + (ending1 - starting_time) / 1000 + " us");

        // Second approach: Limited trial division (less efficient)
        System.out.println("\nBy second approach (Limited trial division): ");
        starting_time = System.nanoTime();
        for (int i = 2; i <= n; i++) {
            if (isPrime2(i)) {
                System.out.print(i + " ");
            }
        }
        ending1 = System.nanoTime();
        System.out.println("\nTime taken: " + (ending1 - starting_time) / 1000 + " us");

        // Third approach: Basic approach
        System.out.println("\nBy third approach (Basic trial division): ");
        starting_time = System.nanoTime();
        for (int i = 2; i <= n; i++) {
            if (isPrimeBasic(i)) {
                System.out.print(i + " ");
            }
        }
        ending1 = System.nanoTime();
        System.out.println("\nTime taken: " + (ending1 - starting_time) / 1000 + " us");

        // Fourth approach: Sieve of Eratosthenes
        System.out.println("\nBy fourth approach (Sieve of Eratosthenes): ");
        starting_time = System.nanoTime();
        sieveOfEratosthenes(n);
        ending1 = System.nanoTime();
        System.out.println("Time taken: " + (ending1 - starting_time) / 1000 + " us");
    }

    // Optimized trial division
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Limited trial division (less efficient)
    public static boolean isPrime2(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= 9; i++) {
            if (num != i && num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Basic trial division
    public static boolean isPrimeBasic(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Sieve of Eratosthenes
    public static void sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
