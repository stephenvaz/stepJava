import java.util.Scanner;

interface SavingAccount {
    public double getSimpleInterest();
}

interface CurrentAccount {
    public double getCompoudInterest();
}

class Customer implements SavingAccount, CurrentAccount {
    int accType;
    double roI;
    double balance;

    Customer(int accType, double roI, double balance) {
        this.accType = accType;
        this.roI = roI;
        this.balance = balance;
    }

    public double getSimpleInterest() {
        return balance * roI / 100;
    }

    public double getCompoudInterest() {
        return balance * (1 + roI / 100);
    }
}

class Bank {
    static void eR() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner sC = new Scanner(System.in);
        int accType;
        double roI, balance;
            System.out.printf("Enter Account Type (1.Saving Account 2.Current Account): ");
            accType = sC.nextInt();
            System.out.printf("Enter Rate of Interest: ");
            roI = sC.nextDouble();
            System.out.printf("Enter Balance: ");
            balance = sC.nextDouble();
            eR();
            Customer c = new Customer(accType, roI, balance);
            switch (accType) {
                case 1:
                    System.out.printf("Interest: %.2f\n", c.getSimpleInterest());
                    break;
                case 2:
                    System.out.printf("Interest: %.2f\n", c.getCompoudInterest());
                    break;
            }
            sC.nextLine();
            sC.nextLine();
            eR();
    }
}
