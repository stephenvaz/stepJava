package L1;

import java.util.Scanner;
import java.lang.Math;

class Armstrong {
	static void arm() {
		Scanner sC = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int a = sC.nextInt();
		int b = sC.nextInt();
		sC.close();
		System.out.printf("Printing Armstrong numbers from %d to %d\n", a, b);
		for (int i = a; i <= b; i++) {
			int d = (int) (Math.log10(i)) + 1;
			int test = i;
			int sum = 0;
			while (test > 0) {
				int mod = test % 10;
				test = test / 10;
				sum = sum + ((int) (Math.pow(mod, d)));
			}
			if (sum == i) {
				System.out.println(i);
			}
		}
	}
	public static void main(String args[]) {
		Armstrong.arm();
	}
}
