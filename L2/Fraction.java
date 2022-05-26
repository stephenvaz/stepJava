package L2;
import java.util.Scanner;

class Fraction {
    static int num;
    static int den;

    public Fraction(int a, int b) {
        num = a;
        den = b;
    }

    static void eR() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void hcf(int a, int b) {
        int rem = 1;
        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;
        while (rem != 0) {
            rem = max % min;
            max = min;
            min = rem;
        }
        num = a / max;
        den = b / max;
    }

    static void add(int arr[]) {
        Fraction.hcf(arr[0] * arr[3] + arr[1] * arr[2], arr[1] * arr[3]);
        System.out.printf("Addition: %d/%d\n", num, den);
    }

    static void sub(int arr[]) {
        Fraction.hcf(arr[0] * arr[3] - arr[1] * arr[2], arr[1] * arr[3]);
        System.out.printf("Subtraction: %d/%d\n", num, den);
    }

    static void mult(int arr[]) {
        Fraction.hcf(arr[0] * arr[2], arr[1] * arr[3]);
        System.out.printf("Multiplication: %d/%d\n", num, den);
    }

    static void div(int arr[]) {
        Fraction.hcf(arr[0] * arr[3], arr[1] * arr[2]);
        System.out.printf("Division: %d/%d\n", num, den);
    }

    static void mult2(int a, int b, int c, int d) {
        Fraction.hcf(a * c, b * d);
    }

    static void table(int a) {
        num = 1;
        den = a;
        for (int i = 1; i < a; i++) {
            Fraction.hcf(i, a);
            System.out.printf("\t%d/%d", num, den);
        }
        System.out.println();
        for (int i = 1; i < a; i++) {
            Fraction.hcf(i, a);
            System.out.printf("\n%d/%d", num, den);
            int numT = num, denT = den;
            for (int j = 1; j < a; j++) {
                Fraction.mult2(numT, denT, j, a);
                System.out.printf("\t%d/%d", num, den);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sC = new Scanner(System.in);
        new Fraction(1, 1);
        int arr[] = new int[4];
        System.out.printf("Enter fraction (num1, den1, num2, den2): ");
        for (int i = 0; i < 4; i++) {
            arr[i] = sC.nextInt();
        }
        Fraction.eR();
        while (true) {
            System.out.printf("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Table\n6. Exit\n: ");
            int choice = sC.nextInt();
            Fraction.eR();
            switch (choice) {
                case 1:
                    Fraction.add(arr);
                    break;
                case 2:
                    Fraction.sub(arr);
                    break;
                case 3:
                    Fraction.mult(arr);
                    break;
                case 4:
                    Fraction.div(arr);
                    break;
                case 5:
                    System.out.printf("Enter denomintor for table: ");
                    int d = sC.nextInt();
                    Fraction.eR();
                    Fraction.table(d);
                    break;
                case 6:
                    sC.close();
                    return;
                default:
                    System.out.printf("Wrong Input, Try Again\n");

            }
            sC.nextLine();
            sC.nextLine();
            Fraction.eR();
        }
    }
}