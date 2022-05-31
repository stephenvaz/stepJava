import java.util.Scanner;
import java.lang.Math;

class Bank{
	static double bal;
	static double roi;
	static boolean wDerr = true;
	public Bank(double a, double b){
		bal = a;
		roi = b;
	}
	static void bal(double dWAmt){
		bal += dWAmt;
	}
	static void wDraw(double dWAmt){
		if(dWAmt<bal){
			bal -= dWAmt;
		}
		else{
			Bank.eR();
			System.out.println("Withdraw amount is greater than balance amount");
			wDerr = false;
		}
	}
	static double cI(double t){
		return bal*Math.pow(1 +roi/100,t) - bal;
	}
	static void eR(){
		System.out.print("\033[H\033[2J");  
		System.out.flush();
	}
	public static void main(String args[]){
		double iniBal, iniRoi, dWAmt;
		Scanner sC = new Scanner(System.in);
		System.out.printf("Enter Balance and ROI: ");
		iniBal = sC.nextDouble();
		iniRoi = sC.nextDouble();
		Bank.eR();
		new Bank(iniBal,iniRoi);
	while(true){
		System.out.printf("Hi! I'm your banking assistant\nChoose from the options below:-\n1.Deposit\n2.Withdraw\n3.C.I\n4.Balance\n5.Exit");
		System.out.print("\n:");
		int choice = sC.nextInt();
		Bank.eR();
		switch(choice) {
			case 1:
				System.out.printf("Enter Amount to be deposited: ");
				dWAmt = sC.nextDouble();
				Bank.bal(dWAmt);
				dWAmt = 0;
				break;
			case 2:
				System.out.printf("Enter Amount to be Withdrawn: ");
				dWAmt = sC.nextDouble();
				Bank.wDraw(dWAmt);
				dWAmt = 0;
				break;
			case 3:
				System.out.printf("Enter number of years: ");
				dWAmt = sC.nextDouble();
				System.out.printf("C.I is %f\n",Bank.cI(dWAmt));
				dWAmt = 0;
				break;
			case 4:
				System.out.printf("Current Balance is: %.2f\n", bal);
				break;
			case 5:
				System.out.printf("Thank You\n");
				sC.close();
				return;
			default:
				System.out.println("Wrong Input");
		}
		if(choice>2 || !(wDerr)){sC.nextLine();
		sC.nextLine();
		Bank.eR();}
		else{
			sC.nextLine();
			Bank.eR();
		}
		}
		
	}
}
