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

    // pattern 12 :
    static void pattern12(int n) {

        for (int i = 1; i <= n; i++) {

            // left numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // right numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
