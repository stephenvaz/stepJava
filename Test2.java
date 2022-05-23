import java.util.Scanner;

class EvenOdd{
	public void evenOdd(){
		Scanner sC = new Scanner(System.in);
		System.out.print("Enter the range: ");
		int a = sC.nextInt();
		int b = sC.nextInt();
		int count = 0;
		System.out.println("Printing even numbers");
		for(int i = a; i<=b; i++){
			if(i%2 == 0){
				System.out.println(i);
				count++;
			}
		}
		System.out.print("No. of Even Numbers:");
		System.out.println(count);
		count = 0;
		System.out.println("Printing odd numbers");
		for(int i = a; i<=b; i++){
			if(i%2 != 0){
				System.out.println(i);
				count++;
			}
		}
		System.out.print("No. of Odd Numbers:");
		System.out.println(count);
		
	}
}

class Test2{
	public static void main(String args[]){
		EvenOdd e = new EvenOdd();
		e.evenOdd();
	}
}
