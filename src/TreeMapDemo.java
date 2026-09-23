import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        // TreeMap stores key-value pairs
        // and sorts entries according to their keys.
        TreeMap<Integer, String> students = new TreeMap<>();

        // Add elements
        students.put(103, "Aman");
        students.put(101, "Payal");
        students.put(104, "Priya");
        students.put(102, "Rahul");

        // Display TreeMap
        System.out.println("Students: " + students);

        // Get value using key
        System.out.println("Student with ID 102: " + students.get(102));

        // Check if key exists
        System.out.println("Contains ID 103: "
                + students.containsKey(103));

        // Remove an entry
        students.remove(104);

        System.out.println("After removing ID 104: " + students);

        // Display first and last keys
        System.out.println("First key: " + students.firstKey());
        System.out.println("Last key: " + students.lastKey());

        // Display keys
        System.out.println("Keys: " + students.keySet());

        // Display values
        System.out.println("Values: " + students.values());

        // Display entries
        System.out.println("Entries: " + students.entrySet());
    }
}