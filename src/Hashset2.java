import java.util.HashSet;

class HashSetDemo {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Duplicate is ignored
        numbers.add(20);

        System.out.println("HashSet: " + numbers);

        // Checking element
        System.out.println("Contains 20: " + numbers.contains(20));

        // Removing element
        numbers.remove(10);

        System.out.println("After remove: " + numbers);

        // Size
        System.out.println("Size: " + numbers.size());

        // Iterating
        for (int number : numbers) {
            System.out.println(number);
        }

        // Clear all elements
        numbers.clear();

        System.out.println("After clear: " + numbers);
    }
}