import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        // Creating a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(101, "Payal");
        students.put(102, "Rahul");
        students.put(103, "Aman");

        System.out.println("HashMap: " + students);

        // Access value using key
        System.out.println("Student 101: " + students.get(101));

        // Update value
        students.put(102, "Riya");

        System.out.println("After update: " + students);

        // Check key
        System.out.println("Contains key 103: " + students.containsKey(103));

        // Check value
        System.out.println("Contains value Aman: " + students.containsValue("Aman"));

        // Remove using key
        students.remove(103);

        System.out.println("After remove: " + students);

        // Size
        System.out.println("Size: " + students.size());

        // Add null key
        students.put(null, "Unknown");

        // Add null value
        students.put(104, null);

        System.out.println("After null: " + students);

        // Iterate through keys
        for (Integer key : students.keySet()) {
            System.out.println(key);
        }

        // Iterate through values
        for (String value : students.values()) {
            System.out.println(value);
        }

        // Iterate through key-value pairs
        for (HashMap.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Remove all entries
        students.clear();

        System.out.println("After clear: " + students);
    }
}