import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        // Creating a Stack of Integer type
        Stack<Integer> stack = new Stack<>();

        // 1. PUSH --->  push() adds an element to the top of Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);


        // 2. PEEK ---> peek() returns the top element
        // It does NOT remove the element
        System.out.println("Top element: " + stack.peek());

        System.out.println("Stack after peek: " + stack);


        // 3. POP ---->  pop() removes and returns the top element
        int removed = stack.pop();

        System.out.println("Removed element: " + removed);
        System.out.println("Stack after pop: " + stack);

        // 4. PUSH ANOTHER ELEMENT

        stack.push(40);

        System.out.println("After pushing 40: " + stack);


        // 5. SEARCH ----> search() searches an element from the TOP (Position starts from 1)
        System.out.println("Position of 20: " + stack.search(20));


        // 6. CHECK EMPTY --->  empty() returns true if Stack contains no elements
        System.out.println("Is Stack empty: " + stack.empty());

        // 7. SIZE --->  size() returns number of elements
        System.out.println("Stack size: " + stack.size());


        // 8. ACCESS ELEMENT USING INDEX ---> Since Stack extends Vector, we can also use get()
        System.out.println("Element at index 0: " + stack.get(0));


        // 9. UPDATE ELEMENT --->  set() replaces an element at a particular index
        stack.set(0, 100);

        System.out.println("After updating: " + stack);


        //  10. ITERATE USING FOR-EACH

        System.out.println("Stack elements:");

        for (int value : stack) {
            System.out.println(value);
        }

        // 11. REMOVE ALL ELEMENTS ----> clear() removes all elements
        stack.clear();

        System.out.println("After clear: " + stack);

        System.out.println("Is Stack empty: " + stack.empty());
    }
}