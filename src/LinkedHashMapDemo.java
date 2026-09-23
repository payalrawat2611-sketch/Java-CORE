import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        // Add key-value pairs
        students.put(101, "Payal");
        students.put(102, "Rahul");
        students.put(103, "Aman");
        students.put(104, "Priya");

        // Display LinkedHashMap
        System.out.println("Students: " + students);

        // Get value using key
        System.out.println("Student with ID 102: " + students.get(102));

        // Check key
        System.out.println("Contains ID 103: "
                + students.containsKey(103));

        // Check value
        System.out.println("Contains Payal: "
                + students.containsValue("Payal"));

        // Remove an entry
        students.remove(104);

        System.out.println("After removing ID 104: " + students);

        // Display keys
        System.out.println("Keys: " + students.keySet());

        // Display values
        System.out.println("Values: " + students.values());

        // Display entries
        System.out.println("Entries: " + students.entrySet());
    }
}
