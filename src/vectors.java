import java.util.Vector;

class VectorDemo {

    void main() {

        // Creating a Vector of Integer type
        Vector<Integer> numbers = new Vector<>();

        // 1. ADD ELEMENT--->  add() adds an element at the end of Vector
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Vector: " + numbers);

        // 2. ADD ELEMENT AT SPECIFIC INDEX -->  add(index, element) inserts element at given index
        numbers.add(1, 15);

        System.out.println("After inserting 15: " + numbers);

        // 3. ACCESS ELEMENT ---> get(index) returns the element at the given index
        System.out.println("Element at index 2: " + numbers.get(2));

        // 4. UPDATE ELEMENT --->  set(index, element) replaces an existing element
        numbers.set(2, 25);

        System.out.println("After updating: " + numbers);

        // 5. REMOVE ELEMENT USING INDEX --->  remove(index) removes the element at the given index
        numbers.remove(1);

        System.out.println("After removing index 1: " + numbers);

        // 6. REMOVE ELEMENT USING VALUE --->  remove(Integer.valueOf(value)) removes a particular value
        numbers.remove(Integer.valueOf(30));

        System.out.println("After removing 30: " + numbers);

        // 7. SIZE --->  size() returns the number of elements
        System.out.println("Size: " + numbers.size());

        // 8. CHECK WHETHER ELEMENT EXISTS --->  contains() checks whether an element exists
        System.out.println("Contains 25: " + numbers.contains(25));

        // 9. FIND INDEX --->  indexOf() returns the first index of an element
        System.out.println("Index of 25: " + numbers.indexOf(25));


        // 10. CHECK EMPTY ---->  isEmpty() returns true if Vector has no elements
        System.out.println("Is Vector empty: " + numbers.isEmpty());

        // 11. FIRST ELEMENT --->  firstElement() returns the first element
        System.out.println("First element: " + numbers.firstElement());

        // 12. LAST ELEMENT ---> lastElement() returns the last element
        System.out.println("Last element: " + numbers.lastElement());

        // 13. ITERATING USING FOR LOOP

        System.out.println("Elements:");

        for (Integer integer : numbers) {
            System.out.println(integer);
        }

        // 14. ITERATING USING FOR-EACH LOOP

        System.out.println("Using for-each:");

        for (int number : numbers) {
            System.out.println(number);
        }
        // 15. REMOVE ALL ELEMENTS  ---> clear() removes all elements from Vector
        numbers.clear();

        System.out.println("After clear: " + numbers);

        System.out.println("Is Vector empty: " + numbers.isEmpty());
    }
}