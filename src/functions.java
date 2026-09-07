class function{
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
}