import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Payal");
        students.add("Rahul");
        students.add("Priya");
        students.add("Aman");

        ListIterator<String> iterator = students.listIterator();

        // Forward traversal
        System.out.println("Forward:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Backward traversal
        System.out.println("Backward:");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}