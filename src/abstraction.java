
    /*
 # OOP Principle - Abstraction
 --> Abstraction means hiding implementation details
     and showing only the essential features.

 -> Abstraction is mainly achieved using:
 1. Abstract Class
 2. Interface

 */

// Abstract Class


    abstract class animal {

        // Abstract method
        // It does not have a body

        abstract void sound();
        abstract void eat();
    }


// Child class

    class goat extends animal {

        @Override
        void sound() {
            System.out.println("meeheee meei meehe meeeei");
        }
        @Override
        void eat() {
            System.out.println("Animal is eating.");}
    }


// Child class

        class donkey extends animal {

            @Override
            void sound() {
                System.out.println("dhechu dechu dhechuuu...");
            }
            @Override
            void eat() {
                System.out.println("Animal is eating.");
            }
        }
        public class abstraction {

        void main() {

            System.out.println("Abstraction using Abstract Class:");

            animal animal1 = new goat();
            animal1.sound();
            animal1.eat();

            System.out.println();

            animal animal2 = new donkey();
            animal2.sound();
            animal2.eat();
        }
    }

