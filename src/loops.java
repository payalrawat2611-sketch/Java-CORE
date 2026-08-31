public class loops {
    void main() {
        // 1. BASIC EXAMPLES
        System.out.println("\n--- Basic For Loop (1 to 10) ---");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();

        // using while loops

        System.out.println("\n--- Basic While Loop ---");
        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        // and Do-While loop - Executes at least once

        System.out.println("\n--- Do-While Loop ---");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
        System.out.println();

        //Enhanced for-loop (forEach) - Iterate through array
        System.out.println("\n--- Enhanced For Loop (forEach) ---");
        int[] arr = {10, 20, 30, 40, 50};
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Reverse iteration using for loop
        System.out.println("\n--- Reverse For Loop ---");
        for (int k = 5; k >= 1; k--) {
            System.out.print(k + " ");
        }
        System.out.println();
        /* there can be infinite loop iteration problem to prevent this situation,
         which leads to the system crash issue we must ensure base condition to handle it*/
    }
}
