class Student {

    // Attributes / data members
    String name;
    int age;
    double marks;

    // Method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    void main() {

        // Creating first object
        Student student1 = new Student();

        // Assigning values to first object
        student1.name = "Payal";
        student1.age = 20;
        student1.marks = 85.5;

        // Calling method using object
        student1.displayDetails();

        System.out.println();

        // Creating second object
        Student student2 = new Student();

        // Assigning values to second object
        student2.name = "Rahul";
        student2.age = 21;
        student2.marks = 78.0;

        // Calling method using object
        student2.displayDetails();
    }
}
