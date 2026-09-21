import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        // Creating a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        // Duplicate is ignored
        numbers.add(20);

        System.out.println("TreeSet: " + numbers);

        // First and last elements
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());

        // Check element
        System.out.println("Contains 30: " + numbers.contains(30));

        // Remove element
        numbers.remove(20);

        System.out.println("After remove: " + numbers);

        // Size
        System.out.println("Size: " + numbers.size());

        // Elements smaller than 30
        System.out.println("Lower than 30: " + numbers.lower(30));

        // Elements greater than 30
        System.out.println("Higher than 30: " + numbers.higher(30));

        // Smallest element greater than or equal to 30
        System.out.println("Ceiling of 30: " + numbers.ceiling(30));

        // Largest element smaller than or equal to 30
        System.out.println("Floor of 30: " + numbers.floor(30));

        // Iterate in sorted order
        for (int number : numbers) {
            System.out.println(number);
        }

        // Remove all elements
        numbers.clear();

        System.out.println("After clear: " + numbers);
    }
}