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

}
