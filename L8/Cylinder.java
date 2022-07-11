import java.util.Scanner;
import java.lang.Math;

interface Volume {
	public double getVolume(double r, double h);

}

interface SurfaceArea {
	public double getSurfaceArea(double r, double h);
}

class Cylinder implements Volume, SurfaceArea {
	public double getVolume(double r, double h) {
		return Math.PI * r * r * h;
	}

	public double getSurfaceArea(double r, double h) {
		return 2 * Math.PI * r * (r + h);
	}
}

class Test {
	static void eR() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	public static void main(String args[]) {
		Cylinder c = new Cylinder();
		Scanner sC = new Scanner(System.in);
		double r, h;
		while (true) {
			System.out.printf("Cylinder\n1.Volume\n2.Surface Area\n3.Exit\n:");
			int choice = sC.nextInt();
			eR();
			switch (choice) {
				case 1:
					System.out.printf("Radius(r): ");
					r = sC.nextDouble();
					System.out.printf("Height(h): ");
					h = sC.nextDouble();
					System.out.printf("Volume: %.2f\n", c.getVolume(r, h));
					break;
				case 2:
					System.out.printf("Radius(r): ");
					r = sC.nextDouble();
					System.out.printf("Height(h): ");
					h = sC.nextDouble();
					System.out.printf("Surface Area: %.2f\n", c.getSurfaceArea(r, h));
					break;
				case 3:
					sC.close();
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
