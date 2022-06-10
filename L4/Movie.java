import java.util.Scanner;

class Data {
	String mv, tmov, hname, hename;
	double budget;

	// f1(Class-name ob[])
	/*
	 * {
	 * for(int i = 0; i<ob.length; i++)
	 * {
	 * }
	 * }
	 */
	Data() {
	}

	Data(String mv, String tmov, String hname, String hename, double budget) {
		this.mv = mv;
		this.tmov = tmov;
		this.hname = hname;
		this.hename = hename;
		this.budget = budget;
	}

	void sort(Data ob[]) {
		for (int i = 0; i < ob.length; i++) {
			for (int j = 0; j < ob.length - 1; j++) {
				if (ob[j].budget < ob[j + 1].budget) {
					Data temp = ob[j];
					ob[j] = ob[j + 1];
					ob[j + 1] = temp;
				}
			}
		}
	}

	void display(Data ob[]) {
		for (int i = 0; i < ob.length; i++) {
			System.out
					.println(ob[i].mv + " " + ob[i].tmov + " " + ob[i].hname + " " + ob[i].hename + " " + ob[i].budget);
		}
	}

}

class Movie {
	public static void main(String args[]) {
		Scanner sC = new Scanner(System.in);
		Scanner tsC = new Scanner(System.in);
		System.out.printf("Enter the number of movies: ");
		int n = sC.nextInt();
		Data dt[] = new Data[n];
		String mv, tmov, hname, hename;
		double budget;
		for (int i = 0; i < n; i++) {
			System.out.printf("Movie #%d\nName: ", i + 1);
			mv = tsC.nextLine();
			System.out.printf("Type: ");
			tmov = tsC.nextLine();
			System.out.printf("Hero: ");
			hname = tsC.nextLine();
			System.out.printf("Heroine: ");
			hename = tsC.nextLine();
			System.out.printf("BUdget: ");
			budget = sC.nextInt();
			dt[i] = new Data(mv, tmov, hname, hename, budget);
		}
		sC.close();
		tsc.close();
		Data d = new Data();
		d.sort(dt);
		d.display(dt);

	}
}
