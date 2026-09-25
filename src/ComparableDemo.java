import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Sort students by marks
    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class ComparableDemo {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Payal", 85));
        students.add(new Student("Rahul", 72));
        students.add(new Student("Priya", 91));
        students.add(new Student("Aman", 78));

        System.out.println("Before sorting:");
        System.out.println(students);

        // Uses compareTo()
        Collections.sort(students);

        System.out.println("After sorting by marks:");
        System.out.println(students);
    }
}