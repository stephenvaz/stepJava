import java.util.*;

class Date {
	static int year, date, hrs, min, sec, month;
	static String[] arr = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December"
	};
	static String temp;

	public Date() {
		year = 2000;
		month = 1;
		date = 1;
		hrs = 0;
		min = 0;
		sec = 0;
	}

	public void setDate(int year, int month, int date) {
		temp = arr[month - 1] + " " + String.valueOf(date) + ", " + String.valueOf(year);
	}

	public void setDate(int year, int month, int date, int hrs, int min) {
		temp = arr[month - 1] + " " + String.valueOf(date) + ", " + String.valueOf(year) + ", " + (hrs < 10 ? "0" : "")
				+ String.valueOf(hrs) + ":" + (min < 10 ? "0" : "") + String.valueOf(min);
	}

	public void setDate(int year, int month, int date, int hrs, int min, int sec) {
		temp = arr[month - 1] + " " + String.valueOf(date) + ", " + String.valueOf(year) + ", " + (hrs < 10 ? "0" : "")
				+ String.valueOf(hrs) + ":" + (min < 10 ? "0" : "") + String.valueOf(min) + ":" + (sec < 10 ? "0" : "")
				+ String.valueOf(sec);
	}

	public void displayDate() {
		System.out.println(temp);
	}

	public void eR() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}

class DateM {
	public static void main(String args[]) {
		Date dt = new Date();
		int year, date, hrs, min, sec, month;
		Scanner sC = new Scanner(System.in);
		while (true) {
			System.out.printf("1.YYYY/MM/DD\n2.YYYY/MM/DD/H/M\n3.YYYY/M/D/H/M/S\n4.Exit\n: ");
			int choice = sC.nextInt();
			dt.eR();
			switch (choice) {
				case 1:
					System.out.printf("Y, M, D: ");
					year = sC.nextInt();
					month = sC.nextInt();
					date = sC.nextInt();
					dt.setDate(year, month, date);
					break;
				case 2:
					System.out.printf("Y, M, D, H, Min: ");
					year = sC.nextInt();
					month = sC.nextInt();
					date = sC.nextInt();
					hrs = sC.nextInt();
					min = sC.nextInt();
					dt.setDate(year, month, date, hrs, min);
					break;
				case 3:
					System.out.printf("Y, M, D, H, Min, S: ");
					year = sC.nextInt();
					month = sC.nextInt();
					date = sC.nextInt();
					hrs = sC.nextInt();
					min = sC.nextInt();
					sec = sC.nextInt();
					dt.setDate(year, month, date, hrs, min, sec);
					break;
				case 4:
					sC.close();
					return;
				default:
					System.out.printf("Wrong Input");
			}
			dt.eR();
			dt.displayDate();
			sC.nextLine();
			sC.nextLine();
			dt.eR();
		}

	}
}
