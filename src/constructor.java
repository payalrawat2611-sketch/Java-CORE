class Student {

    String name;
    int age;
    double marks;

    // 1. Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
        marks = 0.0;
    }

    // 2. Parameterized Constructor
    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // 3. Constructor Overloading
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.marks = 0.0;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
    void main() {

        // Object using default constructor
        Student student1 = new Student();

        System.out.println("Student 1:");
        student1.displayDetails();

        System.out.println();

        // Object using parameterized constructor
        Student student2 = new Student("Payal", 20, 85.5);

        System.out.println("Student 2:");
        student2.displayDetails();

        System.out.println();

        // Object using overloaded constructor
        Student student3 = new Student("Rahul", 21);

        System.out.println("Student 3:");
        student3.displayDetails();
    }
}
