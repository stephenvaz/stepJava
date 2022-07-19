import q2.myPackage;
import java.util.Scanner;

class q2c {
    static void eR() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        myPackage gst = new myPackage();
        Scanner sC = new Scanner(System.in);
        while (true) {
            System.out.printf("1.CGST\n2.SGST\n3.UTGST\n4.IGST\n5.Exit\n");
            int n = sC.nextInt();
            if (n == 5) {
                return;
            } else {
                eR();
                System.out.printf("Enter the amount: ");
                double amt = sC.nextDouble();
                System.out.printf("Tax: %.2f\n", gst.calculateGST(n, amt));

                sC.nextLine();
                sC.nextLine();
                eR();
            }
        }
    }
}
