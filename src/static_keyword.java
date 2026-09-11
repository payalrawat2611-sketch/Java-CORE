/*
 * OOP - static Keyword
 *
 * static belongs to the class rather than to individual objects.
 *
 * Uses of static:
 * 1. Static variable
 * 2. Static method
 * 3. Static block
 */

class static_keyword {

    String name;
    int age;

    // Static variable
    static String college = "SGSITS";

    // Constructor
    static_keyword (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Instance method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }

    // Static method
    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    // Static block
    static {
        System.out.println("Static block executed.");
    }
    void main() {

        // Creating objects
        static_keyword student1 = new static_keyword("Payal", 20);
        static_keyword student2 = new static_keyword("Rahul", 21);

        System.out.println("Before changing college:");

        student1.displayDetails();

        System.out.println();

        student2.displayDetails();

        System.out.println();

        // Calling static method using class name
        static_keyword.changeCollege("IIT Indore");

        System.out.println("After changing college:");

        student1.displayDetails();

        System.out.println();

        student2.displayDetails();
    }
}
