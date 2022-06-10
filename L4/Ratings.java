import java.util.Scanner;

class Book{
	String bName;
	double bavg;
	//int size;
	//int[] ratingAr = new int[size];
	Book(){}
	Book(/*int s,int rating[],*/ String name, double avg){
		bavg = avg;
		//ratingAr = rating;
		bName = name;
	}
	/*void avg(Object arr[]){
		System.out.printf("Book Name\t\tAvg Rating");
		for(int i = 0; i<arr.length; i++){
			System.out.printf("%s \t\t%f",arr[i].bName, arr[i].bavg);
		}
	}*/
	void pop(){}
	
}

class Ratings{
	public static void main(String args[]){
		Scanner sC = new Scanner(System.in);
		Scanner tsC = new Scanner(System.in);
		System.out.printf("Enter the number of books: ");
		int n = sC.nextInt();
		Book bk[] = new Book[n];
		String bn;
		for(int i = 0; i < n; i++){
			double avg = 0;
			System.out.println("Name:");
			bn = tsC.nextLine();
			System.out.printf("no.of ratings: ");
			int t = sC.nextInt();
			//int[] arr = new int[t];
			for(int j = 0; j<t;j++){
				System.out.printf("Rating #%d: ",j+1);
				avg += sC.nextInt();
			}
			avg = avg/t;
			bk[i] = new Book(bn,avg);
			
		}
		System.out.printf("Avg Rating:-\n");
		System.out.printf("Book Name\tAvg Rating\n");
		for(int i = 0; i<bk.length; i++){
			System.out.printf("%s \t\t%.2f\n",bk[i].bName, bk[i].bavg);
		}
		int max = 0;
		for(int i = 0; i < bk.length; i++){
			if(bk[i].bavg > bk[max].bavg){
				max = i;
			}
		}
		System.out.printf("Most Popular Book: %s",bk[max].bName);
	}
}
