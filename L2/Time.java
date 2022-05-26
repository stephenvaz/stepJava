package L2;
import java.util.Scanner;

class Time{
	static void conversion1(int a){
		System.out.printf("%d hours and %d minutes %d seconds\n", a/3600, a%3600/60,a%3600%60);
	}
	static void conversion2(int a, int b, int c){
		System.out.printf("%d seconds\n", a*3600+b*60+c);
	}

	public static void main(String args[]){
		Scanner sC = new Scanner(System.in);
		System.out.printf("Enter number of seconds: ");
		int totSeconds = sC.nextInt();
		Time.conversion1(totSeconds);
		System.out.printf("Enter number of hours, minutes and seconds: ");
		int a = sC.nextInt();
		int b = sC.nextInt();
		int c = sC.nextInt();
		Time.conversion2(a,b,c);
		sC.close();
	}
}