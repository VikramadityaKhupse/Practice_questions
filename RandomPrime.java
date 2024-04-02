class RandomPrime {
    static long prime_by_approach1 = 0;
    static long prime_by_approach2 = 0;
    static long non_prime_by_approach1 = 0;
    static long non_prime_by_approach2 = 0;
    static long[] numbers = createArray();

    // Function to create array
    private static long[] createArray() {
        long[] array = new long[1000000];
        for (int i = 0; i < 1000000; i++) {
            array[i] = random7Digit();
        }
        return array;
    }

    // Function to create a random 7 digit number
    private static long random7Digit() {
        String random_7_digit_number = "";

        for (int i = 0; i < 7; i++) {
            random_7_digit_number += System.nanoTime() % 10;
        }

        return Long.parseLong(random_7_digit_number);
    }

    // Function to check and update count of prime and non prime numbers using approach one
    private static void countPrimesApproach1(long[] arr) {
        for (long number : arr) {
            if (isPrimeApproach1(number)) {
                prime_by_approach1++;
            } else {
                non_prime_by_approach1++;
            }
        }
    }

    // Function to check and update count of prime and non prime numbers using approach two
    private static void countPrimesApproach2(long[] arr) {
        for (long number : arr) {
            if (isPrimeApproach2(number)) {
                prime_by_approach2++;
            } else {
                non_prime_by_approach2++;
            }
        }
    }

    // Function to check prime number
    private static boolean isPrimeApproach1(long number) {
        for (int i = 2; i < 10; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrimeApproach2(long number) {
        for (int i = 2; i < 10; i++) {
            if (number % i != 0) {
                continue;
            }else{
            	return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int i = 0;
        countPrimesApproach1(numbers);
        countPrimesApproach2(numbers);
        while (i < 10) {
            long starting_time1 = System.nanoTime();
            System.out.println("\nStarting time of approach1: " + starting_time1);
            System.out.println("Prime numbers: " + prime_by_approach1);
            System.out.println("Non - Prime numbers: " + non_prime_by_approach1);
            System.out.println("Total time taken: " + (System.nanoTime() - starting_time1));

            long starting_time2 = System.nanoTime();
            System.out.println("\nStarting time of approach2: " + starting_time2);
            System.out.println("Prime numbers: " + prime_by_approach2);
            System.out.println("Non - Prime numbers: " + non_prime_by_approach2);
            System.out.println("Total time taken: " + (System.nanoTime() - starting_time2));
            i++;
        }
    }
}

