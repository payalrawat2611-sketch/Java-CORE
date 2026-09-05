public class patterns {
    void main() {
    }
    // pattern 1 :

    static void pattern1(int n){
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // pattern 2:
    static void pattern2(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // pattern 3

    static void pattern3(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1) + " ");
            }

            System.out.println();
        }
    }

    // pattern 4
    static void pattern4(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print((i + 1) + " ");
            }

            System.out.println();
        }
    }

    // pattern 5 :
    static void pattern5(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // pattern 6 :
    static void pattern6(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print((j + 1) + " ");
            }

            System.out.println();
        }
    }

    // pattern 7 :
    static void pattern7(int n) {

        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // pattern 8 :
    static void pattern8(int n) {

        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // pattern 9 :
    static void pattern9(int n) {

        // upper half
        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // lower half
        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < 2 * (n - i - 1) + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // pattern 10 :
    static void pattern10(int n) {

        // increasing
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // decreasing
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    // pattern 11 :
    static void pattern11(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            System.out.println();
        }
    }

    // pattern 13 :
    static void pattern13(int n) {

        int number = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }

            System.out.println();
        }
    }

    // pattern 14 :
    static void pattern14(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j));
            }

            System.out.println();
        }
    }

    // pattern 15 :
    static void pattern15(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print((char) ('A' + j));
            }

            System.out.println();
        }
    }

    // pattern 16 :
    static void pattern16(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + i));
            }

            System.out.println();
        }
    }

    // pattern 17 :
    static void pattern17(int n) {

        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // characters
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j));
            }

            // characters in reverse
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char) ('A' + j));
            }

            System.out.println();
        }
    }

}
