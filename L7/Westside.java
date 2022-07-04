import java.util.Scanner;

class Westside {
    double price = 5000;
    int clothes = 10;
    int accessories = 10;
}

abstract class Payment {
    double amount = 25000;
    // Payment() {
    // amount = 25000;
    // }
    abstract double paymentDetails(int a, int b);
}

class CashPayment extends Payment {
    double paymentDetails(int a, int b) {
        if(amount > (a+b)*5000) {
            amount -= (a+b)*5000;
            return (a+b)*5000;
        } 
        else {
            return 0;
        }
    }
}

class CreditCardPayment extends Payment {
    String name, exp, cc;
    CreditCardPayment(String name, String exp, String cc){
        this.name = name;
        this.exp = exp;
        this.cc = cc;
    }
    double paymentDetails(int a, int b) {
        
        if(amount > (a+b)*5000) {
            amount -= (a+b)*5000;
            return (a+b)*5000;
        } 
        else {
            return 0;
        }
    }
}

class Person {
    String pName, phNo;     
}

class Main {
    static void eR() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
    public static void main(String[] args) {
        Scanner sC = new Scanner(System.in);
        Scanner tsC = new Scanner(System.in);
        Westside ws = new Westside();
        boolean login = false;
        int clothes = 0, accessories = 0;
        while(true) {
            System.out.printf("Welcome to Westside!");
            if(!(login)) {
                Person p = new Person();
                System.out.printf("\nName: ");
                p.pName = tsC.nextLine();
                System.out.printf("Phone number: ");
                p.phNo = tsC.nextLine();
                login = true;
                eR();
            }
            System.out.printf("1.Clothes\n2.Accessories\n3.Checkout\n4.Logout\n5.Exit\n: ");
            int choice = sC.nextInt();
            switch(choice){
                case 1:
                    System.out.printf("%d clothes left\n", ws.clothes);
                    System.out.printf("Enter number of clothes: ");
                     clothes = sC.nextInt();
                    if(clothes <= ws.clothes) {
                        ws.clothes -= clothes;
                        System.out.printf("%d clothes left\n", ws.clothes);
                    } else {
                        System.out.printf("Not enough clothes\n");
                    }
                    break;
                case 2:
                    System.out.printf("%d accessories left\n", ws.accessories);
                    System.out.printf("Enter number of accessories: ");
                     accessories = sC.nextInt();
                    if(accessories <= ws.accessories) {
                        ws.accessories -= accessories;
                        System.out.printf("%d accessories left\n", ws.accessories);
                    } else {
                        System.out.printf("Not enough accessories\n");
                    }
                    break;
                case 3:
                    System.out.printf("1.Cash\n2.Card\n: ");
                    int pChoice = sC.nextInt();
                    switch(pChoice) {
                        case 1:
                            CashPayment cp = new CashPayment();

                            System.out.printf("Payment: %.2f\n", cp.paymentDetails(clothes, accessories));
                            break;
                        case 2:
                            
                            System.out.printf("Enter name: ");
                            String name = tsC.nextLine();
                            System.out.printf("Enter expiry date: ");
                            String exp = tsC.nextLine();
                            System.out.printf("Enter credit card number: ");
                            String cc = tsC.nextLine();
                            CreditCardPayment ccp = new CreditCardPayment(name, exp, cc);
                            eR();
                            if(ccp.paymentDetails(clothes, accessories) != 0) {
                                System.out.printf("Payment of Rs. %.2f complete\nInvoice:- \nCard: %s\nExpiry: %s\n", ccp.paymentDetails(clothes, accessories), ccp.cc, ccp.exp,ccp.name);
                            } else {
                                System.out.printf("Not enough money\n");
                            }
                            break;
                        default:
                            System.out.printf("Wrong Input! Try Again\n");
                    }
                case 4:
                    login = false;
                    break;
                case 5:
                    sC.close();
                    tsC.close();
                    return;
                default:
                    System.out.printf("Invalid choice");
                    break;
            }
            eR();

        }
    }

}