package L1;

import java.util.Scanner;

class Prime {
	public void printPrime() {
		Scanner sC = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int a = sC.nextInt();
		int b = sC.nextInt();
		sC.close();
		int count = 0;
		for (int i = a; i <= b; i++) {
			int flag = 1;
			if (i < 2) {
				flag = 0;
			} else {
				for (int j = 2; j * j <= i; j++) {
					if (i % j == 0) {
						flag = 0;
						break;
					}
				}
			}
			if (flag == 1) {
				count++;
				System.out.println(i);
			}
		}
		System.out.printf("Total Primes from %d to %d is %d\n", a, b, count);
	}
}

class Test {
	public static void main(String args[]) {
		Prime p = new Prime();
		p.printPrime();
	}
}