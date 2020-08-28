package SimpleAlgorithms;

import java.math.BigInteger;

public class SimpleAlgorithms {

    //the solution below works fine for numbers up to 20. If we try something bigger than 20,
    //then it will fail because results would be too large to fit into a long, causing an overflow.
    //for larger values we can use the BinInteger class (solution below).
    public static long factorialN(long n) {

        if (n == 0)
            return 1;


        return n * factorialN(n - 1);
    }

    public static BigInteger bigFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }


    public static int MaxValueOfN() {
        int i;
        int fact = 1;
        for (i = 2; ; i++) {
            fact *= i;
            if (fact < 0) {
                return i - 1;
            }
        }

    }

    public static String isPrime(int n) {

        int i;
        int sqrt = (int) Math.sqrt(n) + 1;
        if (n <= 1) return "it is not prime";

        for (i = 2; i < sqrt; i++) {
            if (n % i == 0) return "it is not prime";
        }

        return "it is prime";
    }

    public static boolean checkPrime(int n) {

        int i;
        int sqrt = (int) Math.sqrt(n) + 1;
        if (n <= 1) return false;

        for (i = 2; i < sqrt; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static double sumN(double n) {
        int i;
        double sum = 0;

        for (i = 1; i <= n; i++)
            sum += (double) 1 / i;

        return sum;
    }

    public static int digitCounter(long n) {

        int i = 0;

        while (n != 0) {
            n /= 10;
            i++;
        }

        return i;
    }
}
