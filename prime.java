public class PrimeNumbers1To100 {

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        // 0 and 1 are not prime numbers
        if (num <= 1) {
            return false;
        }
        // Check for divisibility from 2 up to the square root of the number
        // This optimizes the check as any factor greater than the square root
        // would have a corresponding factor smaller than the square root.
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // Not a prime number if divisible
            }
        }
        return true; // Is a prime number
    }
}