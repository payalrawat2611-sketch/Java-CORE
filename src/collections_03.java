import java.util.LinkedList;
public class collections_03 {
   // LinkedListBasics
   void main() {
       // Creating a LinkedList
       LinkedList<String> names = new LinkedList<>();

            // Adding elements
       names.add("Payal");
       names.add("Rahul");
       names.add("Aman");
       names.add("Neha");

       System.out.println("Original LinkedList: " + names);

       // Adding element at the beginning
       names.addFirst("Riya");
       System.out.println("After addFirst(): " + names);

       // Adding element at the end
       names.addLast("Karan");
       System.out.println("After addLast(): " + names);

            // Accessing an element
       System.out.println("First element: " + names.getFirst());
       System.out.println("Last element: " + names.getLast());

            // Updating an element
       names.set(1, "Priya");
       System.out.println("After updating: " + names);

            // Removing first element
       names.removeFirst();
       System.out.println("After removeFirst(): " + names);

            // Removing last element
       names.removeLast();
       System.out.println("After removeLast(): " + names);

            // Checking size
       System.out.println("Size: " + names.size());

            // Checking whether an element exists
       System.out.println("Contains Payal: " + names.contains("Payal"));

            // Traversing LinkedList
       System.out.println("All names:");

       for (String name : names) {
           System.out.println(name);
       }
   }

}
