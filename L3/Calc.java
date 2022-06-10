import java.lang.Math;

class Test {
	static double ans;
	double base;
	int power, logBase, argument;

	public Test() {
		base = 10;
		power = 2;
		logBase = 2;
		argument = 2;
	}

	double calculate(double base, int power) {
		ans = Math.pow(base, power);
		display();
		return 0;
	}

	double calculate(int logBase, int argument) {
		ans = Math.log(argument) / Math.log(logBase);
		display();
		return 0;
	}

	void display() {
		System.out.println(ans);
	}
}

class Calc {
	public static void main(String args[]) {
		Test t = new Test();
		t.calculate(2, 4);
		t.calculate(2.0, 4);
	}
}
