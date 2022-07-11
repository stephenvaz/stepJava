import java.util.Scanner;

abstract class Course {
	String name, uid, year;
	String[] yr = { "FE", "SE", "TE" };

	Course() {
	}

	Course(String name, String uid, String year) {
		this.name = name;
		this.uid = uid;
		this.year = year;
	}

	abstract void studentDetails();
}

class Comp extends Course {
	Comp() {
	}

	Comp(String name, String uid, String year) {
		super(name, uid, year);
	}

	void studentDetails() {
		System.out.printf("Name: %s, UID: %s, Year: %s\n", name, uid, year);
	}

	void sort(Comp[] c) {
		for (int i = 0; i < yr.length; i++) {
			// yr[i]
			for (int j = 0; j < c.length; j++) {
				// c[j]
				for (int k = 0; k < c.length - 1; k++) {
					if (c[k].year.equals(yr[i])) {
						Comp temp = new Comp(c[j].name, c[j].uid, c[j].year);
						c[j] = c[k];
						c[k] = temp;
					}
				}
			}
		}
	}
}

class IT extends Course {
	IT() {
	}

	IT(String name, String uid, String year) {
		super(name, uid, year);
	}

	void studentDetails() {
		System.out.printf("Name: %s, UID: %s, Year: %s\n", name, uid, year);
	}

	void sort(IT[] it) {
		for (int i = 0; i < yr.length; i++) {
			// yr[i]
			for (int j = 0; j < it.length; j++) {
				for (int k = 0; k < it.length - 1; k++) {
					if (it[k].year.equals(yr[i])) {
						IT temp = new IT(it[j].name, it[j].uid, it[j].year);
						it[j] = it[k];
						it[k] = temp;
					}
				}
			}
		}
	}
}

class Test {

	public static void main(String args[]) {
		Scanner sC = new Scanner(System.in);
		Scanner tsC = new Scanner(System.in);
		System.out.println("No. of Comps students: ");
		int nC = sC.nextInt();
		Comp[] comp = new Comp[nC];
		for (int i = 0; i < nC; i++) {
			System.out.println("Student #" + (i + 1) + "\nName: ");
			String name = tsC.nextLine();
			System.out.println("UID: ");
			String uid = tsC.nextLine();
			System.out.println("Year:");
			String year = tsC.nextLine();
			comp[i] = new Comp(name, uid, year);
		}
		System.out.println("No. of IT students: ");
		int nI = sC.nextInt();
		IT[] it = new IT[nI];
		for (int i = 0; i < nI; i++) {
			System.out.println("Student #" + (i + 1) + "\nName: ");
			String name = tsC.nextLine();
			System.out.println("UID: ");
			String uid = tsC.nextLine();
			System.out.println("Year:");
			String year = tsC.nextLine();
			it[i] = new IT(name, uid, year);
		}
		Comp cc = new Comp();
		cc.sort(comp);
		IT ii = new IT();
		ii.sort(it);
		System.out.println("Comps:-");
		for (int i = 0; i < nC; i++) {
			comp[i].studentDetails();
		}
		System.out.println("IT:-");
		for (int i = 0; i < nI; i++) {
			it[i].studentDetails();
		}
		sC.close();
		tsC.close();
	}
}