public class MethodOverloading {

    // 41. Add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // 42. Add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // 43. Add two doubles
    static double add(double a, double b) {
        return a + b;
    }

    // 44. Calculate area using overloaded methods

    // Area of square
    static int area(int side) {
        return side * side;
    }

    // Area of rectangle
    static int area(int length, int width) {
        return length * width;
    }

    // Area of circle
    static double area(double radius) {
        return Math.PI * radius * radius;
    }

    // 45. Calculate maximum using overloaded methods

    // Maximum of two integers
    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Maximum of three integers
    static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    // 46. Demonstrate different parameter types

    static void display(int n) {
        System.out.println("Integer: " + n);
    }

    static void display(double n) {
        System.out.println("Double: " + n);
    }

    static void display(String text) {
        System.out.println("String: " + text);
    }

    // 47. Demonstrate different number of parameters

    static int multiply(int a, int b) {
        return a * b;
    }

    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    static int multiply(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    // Main method
    void main() {

        // 41. Add two integers
        System.out.println(add(10, 20));

        // 42. Add three integers
        System.out.println(add(10, 20, 30));

        // 43. Add two doubles
        System.out.println(add(10.5, 20.5));

        // 44. Area of square
        System.out.println(area(5));

        // Area of rectangle
        System.out.println(area(10, 5));

        // Area of circle
        System.out.println(area(7.0));

        // 45. Maximum of two integers
        System.out.println(max(10, 20));

        // Maximum of three integers
        System.out.println(max(10, 20, 15));

        // 46. Different parameter types
        display(10);
        display(10.5);
        display("Hello Java");

        // 47. Different number of parameters
        System.out.println(multiply(2, 3));
        System.out.println(multiply(2, 3, 4));
        System.out.println(multiply(2, 3, 4, 5));
    }
}