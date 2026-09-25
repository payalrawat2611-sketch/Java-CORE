import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Payal");
        students.add("Rahul");
        students.add("Priya");
        students.add("Aman");

        // Create Iterator
        Iterator<String> iterator = students.iterator();

        // Traverse collection
        System.out.println("Students:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Create a new Iterator for removal
        iterator = students.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();

            if (name.equals("Rahul")) {
                iterator.remove();
            }
        }

        System.out.println("After removing Rahul: " + students);
    }
}