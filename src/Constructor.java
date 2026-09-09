class Constructor {

    String name;
    int age;
    double marks;

    // 1. Default Constructor
    Constructor() {
        name = "Unknown";
        age = 0;
        marks = 0.0;
    }

    // 2. Parameterized Constructor
    Constructor(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // 3. Constructor Overloading
    Constructor(String name, int age) {
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
        Constructor student1 = new Constructor();

        System.out.println("Student 1:");
        student1.displayDetails();

        System.out.println();

        // Object using parameterized constructor
        Constructor student2 = new Constructor("Payal", 20, 85.5);

        System.out.println("Student 2:");
        student2.displayDetails();

        System.out.println();

        // Object using overloaded constructor
        Constructor student3 = new Constructor("Rahul", 21);

        System.out.println("Student 3:");
        student3.displayDetails();
    }
}
