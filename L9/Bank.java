import java.util.Scanner;

abstract class Account {
	String name;
	double bal;
	int acNo;

	Account(String name, int acNo) {
		this.name = name;
		this.acNo = acNo;
	}

	abstract void deposit(double amt);

	abstract void withdraw(double amt);

	abstract void display();
}

class SavingsAccount extends Account {
	double inR, minBal;

	SavingsAccount(String name, int acNo, double minBal, double inR) {
		super(name, acNo);
		this.minBal = minBal;
		this.inR = inR;
		bal = minBal;
	}

	void deposit(double amt) {
		bal += amt;
		// System.out.println("Balance: " + bal);
	}

	void withdraw(double amt) {
		bal -= amt;
	}

	void display() {
		System.out.printf("Current Balance: %.2f\n", bal);
	}

	void addInterest() {
		bal += bal * inR / 100;
	}

	void transfer() {
	}
}

class Test {
	static void eR() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void main(String args[]) {
		boolean pers = false;
		Scanner sC = new Scanner(System.in);
		String name = "";
		int acNo = 0;
		double minBal = 0, inR = 0, amt = 0;
		SavingsAccount sA = null;
		while (true) {
			if (!pers) {
				eR();
				System.out.println("Name: ");
				name = sC.nextLine();
				System.out.println("Account Number: ");
				acNo = sC.nextInt();
				System.out.println("Min. Balance: ");
				minBal = sC.nextDouble();
				System.out.println("Interest Rate: ");
				inR = sC.nextDouble();
				pers = true;
				eR();
				sA = new SavingsAccount(name, acNo, minBal, inR);
			}

			System.out.printf("1. Deposit\n2. Withdraw\n3. Balance\n4. Interest\n5. Logout\n6. Exit\n:");
			int ch = sC.nextInt();
			switch (ch) {
				case 1:
					try {
						System.out.printf("Enter the amount to be deposited: ");
						amt = sC.nextDouble();
						if (amt < 0) {
							throw new Exception("Invalid amount");
						}
						sA.deposit(amt);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 2:
					try {
						System.out.printf("Enter the amount to be withdrawn: ");
						amt = sC.nextDouble();
						if(sA.bal < sA.minBal) {
							throw new Exception("Please maintain minimum balance");
						}
						else if (amt < 0) {
							throw new Exception("Invalid amount");
						}
						else if(amt > sA.bal) {
							throw new Exception("Insufficient balance");
						}
						sA.withdraw(amt);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 3:
					sA.display();
					if(sA.bal < sA.minBal) {
						System.out.println("Please maintain minimum balance");
					}
					break;
				case 4:
					break;
				case 5:
					System.out.print("Logged out successfully");
					pers = false;
					break;
				case 6:
					eR();
					return;
				default:
					System.out.printf("Wrong Input!");
					break;
			}
			sC.nextLine();
			sC.nextLine();
			eR();

		}
	}
}
