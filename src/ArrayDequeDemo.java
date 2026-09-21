import java.util.ArrayDeque;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        // Creating an ArrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Add elements at the end
        deque.add(20);
        deque.add(30);

        // Add elements at the beginning
        deque.addFirst(10);
        deque.addLast(40);

        System.out.println("Deque: " + deque);

        // View first and last elements
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        // Remove first element
        System.out.println("Removed first: " + deque.removeFirst());

        // Remove last element
        System.out.println("Removed last: " + deque.removeLast());

        System.out.println("After removal: " + deque);

        // Add elements using offer methods
        deque.offerFirst(5);
        deque.offerLast(50);

        System.out.println("After offer: " + deque);

        // Check element
        System.out.println("Contains 20: " + deque.contains(20));

        // Size
        System.out.println("Size: " + deque.size());

        // Iterate
        for (int number : deque) {
            System.out.println(number);
        }

        // Remove all elements
        deque.clear();

        System.out.println("After clear: " + deque);
    }
}