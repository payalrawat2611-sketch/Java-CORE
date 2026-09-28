public class WildcardDemo {
    import java.util.ArrayList;
import java.util.List;

    public class WildcardDemo {

        // Accepts a List of any type
        public static void printList(List<?> list) {

            for (Object element : list) {
                System.out.print(element + " ");
            }

            System.out.println();
        }

        public static void main(String[] args) {

            List<Integer> numbers = new ArrayList<>();

            numbers.add(10);
            numbers.add(20);
            numbers.add(30);

            List<String> names = new ArrayList<>();

            names.add("Payal");
            names.add("Rahul");
            names.add("Priya");

            System.out.println("Numbers:");
            printList(numbers);

            System.out.println("Names:");
            printList(names);
        }
    }
}
