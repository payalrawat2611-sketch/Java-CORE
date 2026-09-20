import java.util.HashSet;

class HashSetDemo {

    public static void main(String[] args) {

        // Creating a HashSet of Integer type
        HashSet<Integer> numbers = new HashSet<>();


        // 1. ADD ELEMENT - add() adds an element to the HashSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("HashSet: " + numbers);

        // 2. ADD DUPLICATE -  HashSet does not allow duplicate elements
        numbers.add(20);

        System.out.println("After adding duplicate 20: " + numbers);

        // 3. ADD MORE ELEMENTS

        numbers.add(40);
        numbers.add(50);

        System.out.println("After adding elements: " + numbers);


        // 4. CHECK ELEMENT -  contains() checks whether an element exists
        System.out.println("Contains 30: " + numbers.contains(30));

        System.out.println("Contains 100: " + numbers.contains(100));


        // 5. REMOVE ELEMENT

        // remove() removes the specified element
        numbers.remove(40);

        System.out.println("After removing 40: " + numbers);

        // 6. SIZE -  size() returns the number of elements
        System.out.println("Size: " + numbers.size());


        // 7. CHECK EMPTY - isEmpty() returns true if HashSet is empty
        System.out.println("Is empty: " + numbers.isEmpty());


        // 8. ADD NULL -  HashSet allows one null value
        numbers.add(null);

        System.out.println("After adding null: " + numbers);


        // 9. ADD NULL AGAIN - Only one null is stored
        numbers.add(null);

        System.out.println("After adding null again: " + numbers);

        // 10. ITERATE USING FOR-EACH

        System.out.println("Elements:");

        for (int number : numbers) {

            // null cannot be directly assigned to int
            // so this loop is only safe when there is no null.
        }


        // 11. ITERATE SAFELY

        System.out.println("Using Object:");

        for (Object value : numbers) {
            System.out.println(value);
        }


        // 12. REMOVE ALL ELEMENT -  clear() removes all elements

        numbers.clear();

        System.out.println("After clear: " + numbers);

        System.out.println("Is empty: " + numbers.isEmpty());
    }
}