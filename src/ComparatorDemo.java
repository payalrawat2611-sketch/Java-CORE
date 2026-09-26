import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Stu {

    String name;
    int marks;

    Stu (String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class ComparatorDemo {

    void main() {

        ArrayList<Stu> students = new ArrayList<>();

        students.add(new Stu("Payal", 85));
        students.add(new Stu("Rahul", 72));
        students.add(new Stu("Priya", 91));
        students.add(new Stu("Aman", 78));

        System.out.println("Before sorting:");
        System.out.println(students);

        // Sort by marks in descending order
        Comparator<Stu> byMarksDescending =
                (s1, s2) -> s2.marks - s1.marks;

        Collections.sort(students, byMarksDescending);

        System.out.println("Sorted by marks:");
        System.out.println(students);
    }
}