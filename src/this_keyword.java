/*
  OOP - this Keyword

 -> this' refers to the current object.
 " Uses of this keyword " :
  1. To refer to current object's variables
  2. To call current object's method
  3. To call another constructor of the same class
 */

class this_keyword {

    String name;
    int age;

    // Parameterized Constructor
    this_keyword(String name, int age) {

        // this.name refers to instance variable
        // name refers to constructor parameter
        this.name = name;
        this.age = age;
    }

    // Method
    void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Calling current object's method using this
    void showDetails() {
        this.displayDetails();
    }

    // Calling another constructor using this()
    this_keyword() {
        this("Unknown", 0);
    }
    void main(){

        // Object using parameterized constructor
        this_keyword student1 = new this_keyword("Payal", 20);

        System.out.println("Student 1:");
        student1.displayDetails();

        System.out.println();

        // another example
        this_keyword student2 = new this_keyword("Aashu" , 21);

        System.out.println("Student 2:");
        student2.showDetails();

        // Object using default constructor
        this_keyword student3 = new this_keyword();

        System.out.println("Student 3:");
        student3.showDetails();
    }
}
