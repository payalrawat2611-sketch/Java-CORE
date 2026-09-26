import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    void main() {

        // Creating a LinkedHashSet
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        // Add elements
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        // Duplicate is ignored
        numbers.add(10);

        System.out.println("LinkedHashSet: " + numbers);

        // Check element
        System.out.println("Contains 20: " + numbers.contains(20));

        // Remove element
        numbers.remove(30);

        System.out.println("After remove: " + numbers);

        // Size
        System.out.println("Size: " + numbers.size());

        // Check empty
        System.out.println("Is empty: " + numbers.isEmpty());

        // Iterate in insertion order
        System.out.println("Elements:");

        for (int number : numbers) {
            System.out.println(number);
        }

        // Remove all elements
        numbers.clear();

        System.out.println("After clear: " + numbers);
    }
}

//Remember :
//LinkedHashSet
//→ Unique elements
//→ Maintains insertion order
