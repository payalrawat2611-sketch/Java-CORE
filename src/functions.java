class function {

    // methods practice

    // 1. no parameter, no return
    static void greet() {
        System.out.println("Hello, Java!");
    }

    // 2. parameter, no return
    static void greetUser(String name) {
        System.out.println("Hello " + name);
    }

    // 3. return value
    static int add(int a, int b) {
        return a + b;
    }

    // 4. multiple parameters
    static int calculateSum(int a, int b, int c) {
        return a + b + c;
    }

    // 5. boolean return
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // 6. String return
    static String getName() {
        return "Payal";
    }

    // 7. char return
    static char getGrade() {
        return 'A';
    }

    // 8. double return
    static double calculateAverage(int a, int b) {
        return (a + b) / 2.0;
    }

    // 9. method calling another method
    static int square(int n) {
        return n * n;
    }

    static void printSquare(int n) {
        System.out.println(square(n));
    }

    // 10. method inside loop
    static void printEvenNumbers(int n) {

        for (int i = 1; i <= n; i++) {

            if (isEven(i)) {
                System.out.println(i);
            }
        }
    }

    // 12. Find maximum of two numbers
    static int maxOfTwo(int a, int b) {

        if (a > b) {
            return a;
        }

        return b;
    }

    // 13. Find maximum of three numbers
    static int maxOfThree(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        }
        else if (b >= a && b >= c) {
            return b;
        }
        else {
            return c;
        }
    }

    // 14. Check positive / negative
    static String checkNumber(int n) {

        if (n > 0) {
            return "Positive";
        }
        else if (n < 0) {
            return "Negative";
        }
        else {
            return "Zero";
        }
    }

    // 15. Check prime
    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // 16. Print factors
    static void printFactors(int n) {

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // 17. Count digits
    static int countDigits(int n) {

        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        return count;
    }

    // 18. Sum of digits
    static int sumOfDigits(int n) {

        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }

    // 19. Reverse a number
    static int reverseNumber(int n) {

        int reverse = 0;

        while (n != 0) {

            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        return reverse;
    }

    // 20. Check palindrome number
    static boolean isPalindrome(int n) {

        int original = n;
        int reverse = 0;

        while (n != 0) {

            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        return original == reverse;
    }
    // 21. Check Armstrong number
    static boolean isArmstrong(int n) {

        int original = n;
        int digits = countDigits(n);
        int sum = 0;

        while (n != 0) {

            int digit = n % 10;
            sum = sum + (int) Math.pow(digit, digits);
            n = n / 10;
        }

        return original == sum;
    }


    // 22. Find factorial
    static long factorial(int n) {

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }


    // 23. Generate Fibonacci series
    static void fibonacci(int n) {

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }


    // 24. Find GCD
    static int gcd(int a, int b) {

        while (b != 0) {

            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }


    // 25. Find LCM
    static int lcm(int a, int b) {

        return (a * b) / gcd(a, b);
    }


    // 26. Check perfect number
    static boolean isPerfect(int n) {

        int sum = 0;

        for (int i = 1; i < n; i++) {

            if (n % i == 0) {
                sum = sum + i;
            }
        }

        return sum == n;
    }


    // 27. Check strong number
    static boolean isStrong(int n) {

        int original = n;
        int sum = 0;

        while (n != 0) {

            int digit = n % 10;
            sum = sum + (int) factorial(digit);
            n = n / 10;
        }

        return original == sum;
    }


    // 28. Calculate power
    static long power(int base, int exponent) {

        long result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        return result;
    }


    // 29. Calculate sum from 1 to n
    static int sumToN(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }


    // 30. Count frequency of a digit
    static int digitFrequency(int n, int target) {

        int count = 0;

        while (n != 0) {

            int digit = n % 10;

            if (digit == target) {
                count++;
            }

            n = n / 10;
        }

        return count;
    }
}