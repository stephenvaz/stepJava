import java.util.Scanner;

class Book {
	String bName;
	double bavg;

	Book() {
	}

	Book(String name, double avg) {
		bavg = avg;
		bName = name;
	}
}

class Ratings {
	public static void main(String args[]) {
		Scanner sC = new Scanner(System.in);
		Scanner tsC = new Scanner(System.in);
		System.out.printf("Enter the number of books: ");
		int n = sC.nextInt();
		Book bk[] = new Book[n];
		String bn;
		for (int i = 0; i < n; i++) {
			double avg = 0;
			System.out.printf("Book #%d\nName:", i + 1);
			bn = tsC.nextLine();
			System.out.printf("No. of ratings: ");
			int t = sC.nextInt();
			for (int j = 0; j < t; j++) {
				System.out.printf("Rating #%d: ", j + 1);
				avg += sC.nextInt();
			}
			avg = avg / t;
			bk[i] = new Book(bn, avg);
		}
		sC.close();
		tsC.close();
		System.out.printf("Avg Rating:-\n");
		System.out.printf("Book Name\tAvg Rating\n");
		for (int i = 0; i < bk.length; i++) {
			System.out.printf("%s \t\t  %.2f\n", bk[i].bName, bk[i].bavg);
		}
		int max = 0;
		for (int i = 0; i < bk.length; i++) {
			if (bk[i].bavg > bk[max].bavg) {
				max = i;
			}
		}
		System.out.printf("Most Popular Book: %s\n", bk[max].bName);
	}
}