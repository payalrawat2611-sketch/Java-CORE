/*
 # OOP Principle - Inheritance
 -> Inheritance allows a child class to acquire properties and methods of a parent class.
 Parent Class  -> Superclass
 Child Class   -> Subclass

 -> Syntax: class Child extends Parent
 */
class inheritance{
// Parent class
    class Animal {

        String name;
        int age;

        void eat() {
            System.out.println(name + " is eating.");
        }

        void sleep() {
            System.out.println(name + " is sleeping.");
        }
    }

    // Child class
    class Dog extends Animal {

        void bark() {
            System.out.println(name + " is barking.");
    }

        void main() {

            // Creating object of child class
            Dog dog = new Dog();

            // Properties inherited from Animal
            dog.name = "Bruno";
            dog.age = 3;

            // Methods inherited from Animal
            dog.eat();
            dog.sleep();

            // Method of Dog class
            dog.bark();

            System.out.println("Age: " + dog.age);
        }
    }
}