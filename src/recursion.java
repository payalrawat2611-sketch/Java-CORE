public class recursion {
 // R19. Print characters of a string
    static void printString(String str, int index) {
        if (index == str.length()) {
            return;
        }

        System.out.println(str.charAt(index));
        printString(str, index + 1);
    }

    // R20. Print string in reverse
    static void printReverseString(String str, int index) {
        if (index == str.length()) {
            return;
        }

        printReverseString(str, index + 1);
        System.out.println(str.charAt(index));
    }

    // R21. Reverse a string
    static String reverseString(String str) {
        if (str.length() <= 1) {
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // R22. Check palindrome string
    static boolean isPalindromeString(String str, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return isPalindromeString(str, left + 1, right - 1);
    }

    // R23. Count vowels
    static int countVowels(String str, int index) {
        if (index == str.length()) {
            return 0;
        }

        char ch = Character.toLowerCase(str.charAt(index));

        int current = 0;

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
            current = 1;
        }

        return current + countVowels(str, index + 1);
    }

    // R24. Remove a character
    static String removeCharacter(String str, char target) {
        if (str.isEmpty()) {
            return "";
        }

        char first = str.charAt(0);

        if (first == target) {
            return removeCharacter(str.substring(1), target);
        }

        return first + removeCharacter(str.substring(1), target);
    }

    // R25. Replace a character
    static String replaceCharacter(String str, char oldChar, char newChar) {
        if (str.isEmpty()) {
            return "";
        }

        char first = str.charAt(0);

        if (first == oldChar) {
            first = newChar;
        }

        return first + replaceCharacter(str.substring(1), oldChar, newChar);
    }

    // R26. Print array
    static void printArray(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }

        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }

    // R27. Sum of array
    static int arraySum(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }

        return arr[index] + arraySum(arr, index + 1);
    }

    // R28. Maximum element
    static int arrayMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        return Math.max(arr[index], arrayMax(arr, index + 1));
    }

    // R29. Minimum element
    static int arrayMin(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        return Math.min(arr[index], arrayMin(arr, index + 1));
    }

    // R30. Check sorted array
    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] > arr[index + 1]) {
            return false;
        }

        return isSorted(arr, index + 1);
    }

    // R31. Linear search
    static int linearSearch(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return linearSearch(arr, index + 1, target);
    }

    // R32. First occurrence
    static int firstOccurrence(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return firstOccurrence(arr, index + 1, target);
    }

    // R33. Last occurrence
    static int lastOccurrence(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1;
        }

        int result = lastOccurrence(arr, index + 1, target);

        if (result != -1) {
            return result;
        }

        if (arr[index] == target) {
            return index;
        }

        return -1;
    }

    // R34. Reverse array
    static void reverseArray(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseArray(arr, left + 1, right - 1);
    }

    // R35. Binary Search
    static int binarySearch(
            int[] arr,
            int left,
            int right,
            int target) {

        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return binarySearch(arr, left, mid - 1, target);
        }

        return binarySearch(arr, mid + 1, right, target);
    }

    // R36. Merge Sort
    static void mergeSort(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    // Merge helper for R36
    static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
    }

    // R37. Quick Sort
    static void quickSort(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int pivotIndex = partition(arr, low, high);

        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    // Partition helper for R37
    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // R38. Tower of Hanoi
    static void towerOfHanoi(
            int n,
            char source,
            char helper,
            char destination) {

        if (n == 0) {
            return;
        }

        towerOfHanoi(
                n - 1,
                source,
                destination,
                helper
        );

        System.out.println(
                "Move disk " + n +
                        " from " + source +
                        " to " + destination
        );

        towerOfHanoi(
                n - 1,
                helper,
                source,
                destination
        );
    }
    // R39. Fibonacci sequence
    static void printFibonacci(int n, int a, int b) {

        if (n == 0) {
            return;
        }

        System.out.print(a + " ");

        printFibonacci(n - 1, b, a + b);
    }

    // R40. Print all subsequences
    static void subsequences(
            String str,
            int index,
            String current) {

        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // Do not take current character
        subsequences(
                str,
                index + 1,
                current
        );

        // Take current character
        subsequences(
                str,
                index + 1,
                current + str.charAt(index)
        );
    }

    // R41. Generate subsets
    static void subsets(
            int[] arr,
            int index,
            java.util.ArrayList<Integer> current) {

        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Do not include
        subsets(
                arr,
                index + 1,
                current
        );

        // Include
        current.add(arr[index]);

        subsets(
                arr,
                index + 1,
                current
        );

        // Backtrack
        current.removeLast();
    }

    // R42. Generate permutations
    static void permutations(
            String str,
            String current) {

        if (str.isEmpty()) {
            System.out.println(current);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String remaining =
                    str.substring(0, i) +
                            str.substring(i + 1);

            permutations(
                    remaining,
                    current + ch
            );
        }
    }


    // R43. Rat in a Maze
    static void ratMaze(
            int[][] maze,
            int row,
            int col,
            String path) {

        int n = maze.length;

        if (row < 0 ||
                col < 0 ||
                row >= n ||
                col >= n ||
                maze[row][col] == 0) {
            return;
        }

        if (row == n - 1 && col == n - 1) {
            System.out.println(path);
            return;
        }

        // Mark current cell as visited
        maze[row][col] = 0;

        ratMaze(
                maze,
                row + 1,
                col,
                path + "D"
        );

        ratMaze(
                maze,
                row - 1,
                col,
                path + "U"
        );

        ratMaze(
                maze,
                row,
                col + 1,
                path + "R"
        );

        ratMaze(
                maze,
                row,
                col - 1,
                path + "L"
        );

        // Backtrack
        maze[row][col] = 1;
    }

    void main() {

        System.out.println("\nR19 - Print String:");
        printString("JAVA", 0);

        System.out.println("\nR20 - Reverse String:");
        printReverseString("JAVA", 0);

        System.out.println("\nR21 - Reverse String:");
        System.out.println(reverseString("JAVA"));

        System.out.println("\nR22 - Palindrome String:");
        System.out.println(
                isPalindromeString(
                        "madam",
                        0,
                        4
                )
        );

        System.out.println("\nR23 - Count vowels:");
        System.out.println(
                countVowels("hello", 0)
        );

        System.out.println("\nR24 - Remove character:");
        System.out.println(
                removeCharacter("banana", 'a')
        );

        System.out.println("\nR25 - Replace character:");
        System.out.println(
                replaceCharacter(
                        "banana",
                        'a',
                        'x'
                )
        );

        int[] arr = {4, 8, 2, 9, 1};

        System.out.println("\nR26 - Print Array:");
        printArray(arr, 0);
        System.out.println();

        System.out.println("\nR27 - Array Sum:");
        System.out.println(
                arraySum(arr, 0)
        );

        System.out.println("\nR28 - Array Maximum:");
        System.out.println(
                arrayMax(arr, 0)
        );

        System.out.println("\nR29 - Array Minimum:");
        System.out.println(
                arrayMin(arr, 0)
        );

        int[] sorted = {1, 2, 3, 4, 5};

        System.out.println("\nR30 - Array Sorted:");
        System.out.println(
                isSorted(sorted, 0)
        );

        System.out.println("\nR31 - Linear Search:");
        System.out.println(
                linearSearch(arr, 0, 9)
        );

        System.out.println("\nR32 - First Occurrence:");

        int[] repeated = {2, 4, 2, 7, 2};

        System.out.println(
                firstOccurrence(
                        repeated,
                        0,
                        2
                )
        );

        System.out.println("\nR33 - Last Occurrence:");

        System.out.println(
                lastOccurrence(
                        repeated,
                        0,
                        2
                )
        );

        System.out.println("\nR34 - Reverse Array:");

        reverseArray(
                arr,
                0,
                arr.length - 1
        );

        printArray(arr, 0);
        System.out.println();

        int[] searchArray = {1, 3, 5, 7, 9};

        System.out.println("\nR35 - Binary Search:");

        System.out.println(
                binarySearch(
                        searchArray,
                        0,
                        searchArray.length - 1,
                        7
                )
        );

        int[] mergeArray = {5, 2, 8, 1, 3};

        mergeSort(
                mergeArray,
                0,
                mergeArray.length - 1
        );

        System.out.println("\nR36 - Merge Sort:");

        printArray(mergeArray, 0);
        System.out.println();

        int[] quickArray = {7, 2, 9, 1, 5};

        quickSort(
                quickArray,
                0,
                quickArray.length - 1
        );

        System.out.println("\nR37 - Quick Sort:");

        printArray(quickArray, 0);
        System.out.println();

        System.out.println("\nR38 - Tower of Hanoi:");

        towerOfHanoi(
                3,
                'A',
                'B',
                'C'
        );

        System.out.println("\nR39 - Fibonacci Sequence:");

        printFibonacci(
                10,
                0,
                1
        );

        System.out.println();

        System.out.println("\nR40 - Subsequences:");

        subsequences(
                "abc",
                0,
                ""
        );

        System.out.println("\nR41 - Subsets:");

        java.util.ArrayList<Integer> current =
                new java.util.ArrayList<>();

        subsets(
                new int[]{1, 2, 3},
                0,
                current
        );

        System.out.println("\nR42 - Permutations:");

        permutations(
                "ABC",
                ""
        );

        System.out.println("\nR43 - Rat in a Maze:");

        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        ratMaze(
                maze,
                0,
                0,
                ""
        );
    }
}