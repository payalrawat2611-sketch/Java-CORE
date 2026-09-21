import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        // Creating a PriorityQueue
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Add elements
        queue.add(30);
        queue.add(10);
        queue.add(20);
        queue.add(40);

        System.out.println("PriorityQueue: " + queue);

        // View highest-priority element
        System.out.println("Peek: " + queue.peek());

        // Remove highest-priority element
        System.out.println("Removed: " + queue.poll());

        System.out.println("After poll: " + queue);

        // Add another element
        queue.offer(5);

        System.out.println("After offer: " + queue);

        // Check element
        System.out.println("Contains 20: " + queue.contains(20));

        // Size
        System.out.println("Size: " + queue.size());

        // Remove a specific element
        queue.remove(30);

        System.out.println("After remove: " + queue);

        // Remove elements according to priority
        System.out.println("Removing elements:");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}