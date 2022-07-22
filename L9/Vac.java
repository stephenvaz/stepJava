import java.util.Scanner;
import java.util.Calendar;
import java.util.InputMismatchException;

class myException extends Exception {
	String err;
	myException (int a) {
		super(err);
		if(a == 1){
			err = "Invalid input (Negative number)";
		}
		
	}
}

class Vaccine {
	public static void main(String args[]) {
		Scanner sC = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		// int day = cal.get(Calendar.DAY_OF_MONTH);
		// int month = cal.get(Calendar.MONTH) + 1;
		// int year = cal.get(Calendar.YEAR);
		int d = 0;
		while (true) {
			try {
				System.out.println("Enter the number of days between 1st & 2nd dose:");
				d = sC.nextInt();
				if (d < 0) {
					throw new myException("Invalid input (Negative number)");
				} else if (d < 1) {
					throw new myException("Input should be greater than equal to 1");
				} else if (d > 84) {
					throw new myException("Input should be less than equal to 84");
				}
				cal.add(Calendar.DATE, d);
				System.out.println("Next dose will be given on " + cal.get(Calendar.DAY_OF_MONTH) + "/"
						+ (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(Calendar.YEAR));
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input (Not an integer)");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		sC.close();
	}
}
