public class recursion {
    // R1. Print 1 to N
    static void print1ToN(int n) {
        if (n == 0) {
            return;
        }

        print1ToN(n - 1);
        System.out.print(n + " ");
    }

    // R2. Print N to 1
    static void printNTo1(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printNTo1(n - 1);
    }

    // R3. Print 1 to N
    static void printAscending(int current, int n) {
        if (current > n) {
            return;
        }

        System.out.print(current + " ");
        printAscending(current + 1, n);
    }

    // R4. Print N to 1
    static void printDescending(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printDescending(n - 1);
    }

    // R5. Sum of first N numbers
    static int sumN(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sumN(n - 1);
    }

    // R6. Factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    // R7. Power
    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }

    // R8. Count digits
    static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return 1 + countDigits(n / 10);
    }

    // R9. Sum of digits
    static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumDigits(n / 10);
    }

    // R10. Reverse a number
    static int reverseNumber(int n, int reverse) {
        if (n == 0) {
            return reverse;
        }

        return reverseNumber(n / 10, reverse * 10 + n % 10);
    }

    // ============================================================
    // LEVEL 2 — BASIC PROBLEM SOLVING
    // ============================================================

    // R11. Check palindrome number
    static boolean isPalindrome(int n) {
        return n == reverseNumber(n, 0);
    }

    // R12. Fibonacci
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // R13. GCD using Euclid's algorithm
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    // R14. Maximum digit
    static int maxDigit(int n) {
        if (n < 10) {
            return n;
        }

        int lastDigit = n % 10;
        int maxOfRemaining = maxDigit(n / 10);

        return Math.max(lastDigit, maxOfRemaining);
    }

    // R15. Minimum digit
    static int minDigit(int n) {
        if (n < 10) {
            return n;
        }

        int lastDigit = n % 10;
        int minOfRemaining = minDigit(n / 10);

        return Math.min(lastDigit, minOfRemaining);
    }

    // R16. Multiply two numbers without using *
    static int multiply(int a, int b) {
        if (b == 0) {
            return 0;
        }

        return a + multiply(a, b - 1);
    }

    // R17. Decimal to binary
    static void decimalToBinary(int n) {
        if (n == 0) {
            return;
        }

        decimalToBinary(n / 2);
        System.out.print(n % 2);
    }

    // R18. Count zeroes in a number
    static int countZeroes(int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 10) {
            return 0;
        }

        if (n % 10 == 0) {
            return 1 + countZeroes(n / 10);
        }

        return countZeroes(n / 10);
    }


    public static void main(String[] args) {

        System.out.println("R1 - Print 1 to N:");
        print1ToN(5);
        System.out.println();

        System.out.println("\nR2 - Print N to 1:");
        printNTo1(5);
        System.out.println();

        System.out.println("\nR5 - Sum:");
        System.out.println(sumN(5));

        System.out.println("\nR6 - Factorial:");
        System.out.println(factorial(5));

        System.out.println("\nR7 - Power:");
        System.out.println(power(2, 5));

        System.out.println("\nR8 - Count digits:");
        System.out.println(countDigits(12345));

        System.out.println("\nR9 - Sum digits:");
        System.out.println(sumDigits(12345));

        System.out.println("\nR10 - Reverse number:");
        System.out.println(reverseNumber(12345, 0));

        System.out.println("\nR11 - Palindrome number:");
        System.out.println(isPalindrome(121));

        System.out.println("\nR12 - Fibonacci:");
        System.out.println(fibonacci(7));

        System.out.println("\nR13 - GCD:");
        System.out.println(gcd(48, 18));

        System.out.println("\nR14 - Maximum digit:");
        System.out.println(maxDigit(58329));

        System.out.println("\nR15 - Minimum digit:");
        System.out.println(minDigit(58329));

        System.out.println("\nR16 - Multiplication:");
        System.out.println(multiply(4, 3));

        System.out.println("\nR17 - Decimal to Binary:");
        decimalToBinary(10);
        System.out.println();

        System.out.println("\nR18 - Count zeroes:");
        System.out.println(countZeroes(10020));
    }
}