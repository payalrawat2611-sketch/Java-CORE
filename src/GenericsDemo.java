import java.util.ArrayList;

class Box<T> {

    private T value;

    Box(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class GenericsDemo {

    void main() {

        // Generic collection
        ArrayList<String> names = new ArrayList<>();

        names.add("Payal");
        names.add("Rahul");
        names.add("Priya");

        System.out.println("Names: " + names);

        // Generic class
        Box<Integer> numberBox = new Box<>(100);
        Box<String> textBox = new Box<>("Java");

        System.out.println("Number: " + numberBox.getValue());
        System.out.println("Text: " + textBox.getValue());
    }
}