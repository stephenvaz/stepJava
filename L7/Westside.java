import java.util.Scanner;

class Westside {

}

abstract class Payment {
    double amount = 25000;
    // Payment() {
    // amount = 25000;
    // }

    abstract double paymentDetails();
}

class CashPayment extends Payment {
    double paymentDetails() {
        return amount;
    }
}

class CreditCardPayment extends Payment {
    String name, exp, cc;

    double paymentDetails() {
        return amount;
    }
}

class Person {
    String pName, phNo;     
}

class Main {
    public static void main(String[] args) {
        Scanner sC = new Scanner(System.in);
        Scanner tsC = new Scanner(System.in);
        while(true) {
            System.out.printf("Welcome to Westside!\n1.Purchase");

        }
    }

}