// Project: Payment System using Polymorphism

class Payment {

    void pay() {
        System.out.println("Processing payment...");
    }
}

class UPI extends Payment {

    @Override
    void pay() {
        System.out.println("Payment made using UPI.");
    }
}

class CreditCard extends Payment {

    @Override
    void pay() {
        System.out.println("Payment made using Credit Card.");
    }
}

class Cash extends Payment {

    @Override
    void pay() {
        System.out.println("Payment made using Cash.");
    }
}

public class polymorphism_project {

    void main() {

        Payment payment;

        payment = new UPI();
        payment.pay();

        payment = new CreditCard();
        payment.pay();

        payment = new Cash();
        payment.pay();
    }
}