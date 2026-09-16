
    /*
 # OOP Integrated Mini Project
 # Student Management System

 --> This project demonstrates all four OOP principles:

 1. Encapsulation
 2. Inheritance
 3. Polymorphism
 4. Abstraction
 */


// ======================================================
// ABSTRACTION
// ======================================================

    abstract class student {

        private int rollNo;
        private String name;
        private double marks;

        // Constructor

        student(int rollNo, String name, double marks) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }

        // Getters

        public int getRollNo() {
            return rollNo;
        }

        public String getName() {
            return name;
        }

        public double getMarks() {
            return marks;
        }

        // Setters

        public void setMarks(double marks) {
            this.marks = marks;
        }

        // Abstract method

        abstract String calculateGrade();

        // Normal method

        void displayDetails() {

            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + calculateGrade());
        }
    }



    class EngineeringStudent extends student {

        EngineeringStudent(int rollNo, String name, double marks) {
            super(rollNo, name, marks);
        }

        @Override
        String calculateGrade() {

            if (getMarks() >= 90) {
                return "A+";
            } else if (getMarks() >= 80) {
                return "A";
            } else if (getMarks() >= 70) {
                return "B";
            } else if (getMarks() >= 60) {
                return "C";
            } else {
                return "D";
            }
        }
    }

    class ManagementStudent extends student {

        ManagementStudent(int rollNo, String name, double marks) {
            super(rollNo, name, marks);
        }

        @Override
        String calculateGrade() {

            if (getMarks() >= 85) {
                return "A+";
            } else if (getMarks() >= 75) {
                return "A";
            } else if (getMarks() >= 65) {
                return "B";
            } else if (getMarks() >= 55) {
                return "C";
            } else {
                return "D";
            }
        }
    }

    public class oops_miniIntegrated_project {

        public static void main(String[] args) {

            System.out.println();
            System.out.println("      STUDENT MANAGEMENT SYSTEM ");
            System.out.println();


            // Runtime Polymorphism

            student student1 =
                    new EngineeringStudent(101, "Payal", 88);

            student student2 =
                    new ManagementStudent(102, "Rahul", 78);


            // Display Engineering Student

            System.out.println("\n--- Engineering Student ---");

            student1.displayDetails();


            // Display Management Student

            System.out.println("\n--- Management Student ---");

            student2.displayDetails();
        }
    }
