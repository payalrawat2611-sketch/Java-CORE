/*
 # OOP Principle - Polymorphism
 --> Polymorphism means "many forms".
 -> There are two main types:
 1. Compile-time Polymorphism
     -> Method Overloading
 2. Runtime Polymorphism
     -> Method Overriding
 */

// Compile-time Polymorphism


class Calculator {

    // Same method name with different parameters

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
// Runtime Polymorphism

class Animal {

    void sound() {
        System.out.println("Animal makes a sound.");
    }
}
// Child class
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}


// Child class
class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}


public class Polymorphism {

    public static void main(String[] args) {

        // 1. Compile-time Polymorphism

        Calculator calculator = new Calculator();

        System.out.println("Compile-time Polymorphism:");

        System.out.println("Addition of 2 integers: "
                + calculator.add(10, 20));

        System.out.println("Addition of 3 integers: "
                + calculator.add(10, 20, 30));

        System.out.println("Addition of 2 doubles: "
                + calculator.add(10.5, 20.5));


        System.out.println();

        // 2. Runtime Polymorphism

        System.out.println("Runtime Polymorphism:");

        Animal animal1 = new Dog();
        animal1.sound();

        Animal animal2 = new Cat();
        animal2.sound();

        Animal animal3 = new Animal();
        animal3.sound();
    }
}
