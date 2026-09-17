import java.util.ArrayList;
public class collections_01 {

    public static void main(String[] args) {

            // Creating an ArrayList
        ArrayList<String> names = new ArrayList<>();

            // Adding elements
        names.add("Payal");
        names.add("Rahul");
        names.add("Aman");
        names.add("Neha");
        System.out.println("Original ArrayList: " + names);

            // Accessing an element
        System.out.println("First name: " + names.get(0));

            // Updating an element
        names.set(1, "Riya");
        System.out.println("After updating: " + names);

            // Removing an element
        names.remove(2);
        System.out.println("After removing: " + names);

            // Finding size
        System.out.println("Size: " + names.size());

            // Checking whether an element exists
        System.out.println("Contains Payal: " + names.contains("Payal"));

            // Traversing ArrayList
        System.out.println("All names:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
