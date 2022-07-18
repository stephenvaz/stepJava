import java.util.Scanner;
import java.lang.Math;

interface Volume {
	public double getVolume(double r, double h);

}

interface SurfaceArea {
	public double getSurfaceArea(double r, double h);
}

class Cylinder implements Volume, SurfaceArea {
	double r, h;

	public double getVolume(double r, double h) {
		return Math.PI * r * r * h;
	}

	public double getSurfaceArea(double r, double h) {
		return 2 * Math.PI * r * (r + h);
	}

	Cylinder() {
		Scanner sC = new Scanner(System.in);
		System.out.printf("Radius(r): ");
		r = sC.nextDouble();
		System.out.printf("Height(h): ");
		h = sC.nextDouble();
	}
}

class Test {

	static void eR() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void main(String args[]) {
		Scanner sC = new Scanner(System.in);
		while (true) {
			System.out.printf("Cylinder\n1.Volume\n2.Surface Area\n3.Exit\n:");
			int choice = sC.nextInt();
			eR();
			switch (choice) {
				case 1:
					Cylinder c = new Cylinder();
					System.out.printf("Volume: %.2f\n", c.getVolume(c.r, c.h));
					break;
				case 2:
					Cylinder c1 = new Cylinder();
					System.out.printf("Surface Area: %.2f\n", c1.getSurfaceArea(c1.r, c1.h));
					break;
				case 3:
					return;
				default:
					System.out.printf("Wrong Input!");

			}
			sC.nextLine();
			sC.nextLine();
			eR();
		}
	}
}
