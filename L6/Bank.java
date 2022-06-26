import java.lang.Math;
import java.util.Scanner;
import java.util.Calendar;

class Bank {
	double fAmt;

	double get_rate_of_interest(double p, double t) {
		fAmt = ci(p, 2.0, t);
		return fAmt;
	}

	double ci(double p, double r, double t) {
		return p * Math.pow(1 + r, t / 365);
	}

	double roi(double[] arr, double p, double t) {
		if (t >= 7 && t <= 14) {
			fAmt = ci(p, arr[0], t);
		} else if (t >= 15 && t <= 30) {
			fAmt = ci(p, arr[1], t);
		} else if (t >= 31 && t <= 45) {
			fAmt = ci(p, arr[2], t);
		} else if (t >= 46 && t <= 90) {
			fAmt = ci(p, arr[3], t);
		} else if (t >= 91 && t <= 120) {
			fAmt = ci(p, arr[4], t);
		} else {
			fAmt = ci(p, arr[5], t);
		}
		return fAmt;
	}
}

class SBI extends Bank {
	double[] sIn = { 3.00, 3.00, 3.00, 4.05, 4.10, 4.10 };

	double get_rate_of_interest(double p, double t) {
		return roi(sIn, p, t);
	}
}

class ICICI extends Bank {
	double[] iIn = { 3.10, 3.20, 3.50, 4.50, 4.70, 4.90 };

	double get_rate_of_interest(double p, double t) {
		return roi(iIn, p, t);
	}
}

class AXIS extends Bank {
	double[] aIn = { 3.15, 3.15, 3.45, 4.05, 4.70, 5.00 };

	double get_rate_of_interest(double p, double t) {
		return roi(aIn, p, t);
	}
}

class Cal {
	Calendar cal = Calendar.getInstance();

	void display() {
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		System.out.println("Today's date is " + day + "/" + month + "/" + year);
	}

	String increment_date(int days) {
		cal.add(Calendar.DATE, days);
		return cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.MONTH) + "/" + cal.get(Calendar.YEAR);
	}

	void decr(int days) {
		cal.add(Calendar.DATE, -days);
	}
}

class Test {
	public static void main(String args[]) {
		Scanner sC = new Scanner(System.in);
		Bank[] b = new Bank[3];
		b[0] = new SBI();
		b[1] = new ICICI();
		b[2] = new AXIS();
		String[] banks = { "SBI", "ICICI", "AXIS" };
		Cal dt = new Cal();
		dt.display();
		for (int i = 0; i < banks.length; i++) {
			System.out.printf("%s:\nAmt: ", banks[i]);
			double amt = sC.nextDouble();
			System.out.printf("Duration: ");
			int time = sC.nextInt();

			System.out.printf("Interest: %.2f\nDate of Maturity: %s\n", b[i].get_rate_of_interest(amt, time),
					dt.increment_date(time));
			dt.decr(time);
		}
		sC.close();
	}
}