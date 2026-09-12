/*
 # OOP Project - Employee Management System

-> Concept Used: inheritance

 * Parent Class  -> Employee
 * Child Classes -> Developer, Manager
  { Developer and Manager inherit common properties  and methods from Employee. }
 */

// Parent class
class Employee {

    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: ₹" + salary);
    }

    void work() {
        System.out.println(name + " is working.");
    }
}

// Child class 1
class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int employeeId, double salary,
              String programmingLanguage) {

        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void writeCode() {
        System.out.println(name + " is writing " +
                programmingLanguage + " code.");
    }
}

// Child class 2
class Manager extends Employee {

    int teamSize;

    Manager(String name, int employeeId, double salary,
            int teamSize) {

        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    void manageTeam() {
        System.out.println(name + " is managing a team of "
                + teamSize + " employees.");
    }
}

class EmployeeManagement {

    void main() {

        // Developer object
        Developer developer =
                new Developer("Payal", 101, 180000, "Java");

        System.out.println("----- Developer Details -----");

        developer.displayEmployeeDetails();
        developer.work();
        developer.writeCode();

        System.out.println();

        // Manager object
        Manager manager =
                new Manager("Aashu", 102, 120000, 10);

        System.out.println("----- Manager Details -----");

        manager.displayEmployeeDetails();
        manager.work();
        manager.manageTeam();
    }
}
