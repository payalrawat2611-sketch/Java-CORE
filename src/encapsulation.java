/*
  OOP - Encapsulation

 -> Encapsulation means wrapping data and methods together
    inside a class and controlling access to the data.

 >>> We commonly achieve encapsulation using:
  1. private variables
  2. public getter methods
  3. public setter methods
 */

class encapsulation {

    // Private variables
    private String name;
    private int age;
    private double marks;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for marks
    public void setMarks(double marks) {

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks.");
        }
    }

    // Getter for marks
    public double getMarks() {
        return marks;
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    void main() {

        // Creating object
        encapsulation student = new encapsulation();

        // Setting values using setter methods
        student.setName("Payal");
        student.setAge(20);
        student.setMarks(95.5);

        // Getting values using getter methods
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Marks: " + student.getMarks());

        System.out.println();

        // Display all details
        student.displayDetails();

        System.out.println();

        // Testing validation
        student.setAge(-5);
        student.setMarks(120);
    }
}
