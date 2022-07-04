import java.lang.Math;
import java.util.Scanner;

abstract class Shape {
	abstract double RectangleArea(double length, double breadth);

	abstract double SquareArea(double side);

	abstract double CircleArea(double radius);

	double area;
}

class Area extends Shape {
	double RectangleArea(double length, double breadth) {
		area = length * breadth;
		return area;
	}

	double SquareArea(double side) {
		area = side * side;
		return area;
	}

	double CircleArea(double r) {
		area = Math.PI * r * r;
		return area;
	}
}

class Test {
	static void eR() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void main(String args[]) {
		Area a = new Area();
		Scanner sC = new Scanner(System.in);
		int choice;
		double t1, t2;
		Test.eR();
		while (true) {
			System.out.printf("1. Rectangle\n2. Square\n3. Circle\n4. Exit\n: ");
			choice = sC.nextInt();
			eR();
			switch (choice) {
				case 1:
					System.out.printf("Enter L and B: ");
					t1 = sC.nextInt();
					t2 = sC.nextInt();
					System.out.println("Area = " + a.RectangleArea(t1, t2));
					break;
				case 2:
					System.out.printf("Enter side: ");
					t1 = sC.nextInt();
					System.out.println("Area = " + a.SquareArea(t1));
					break;
				case 3:
					System.out.printf("Enter radius: ");
					t1 = sC.nextInt();
					System.out.printf("Area = %.2f\n", a.CircleArea(t1));
					break;
				case 4:
					sC.close();
					return;
				default:
					System.out.println("Wrong Input! Try Again");
			}
			sC.nextLine();
			sC.nextLine();
			eR();
		}

	}
}
