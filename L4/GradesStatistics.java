import java.util.Scanner;
import java.lang.Math;

class Grades {
	int arr_size;
	int[] arr = new int[arr_size];
	double temp = 0;
	double temp2 = 0;

	Grades(int size, int[] array) {
		arr_size = size;
		arr = array;
	}

	void calc() {
		for (int i = 0; i < arr_size - 1; i++) {
			int temp, min_idx = i;
			for (int j = i + 1; j < arr_size; j++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		for (int i = 0; i < arr_size; i++) {
			temp += arr[i];
		}
		for (int i = 0; i < arr_size; i++) {
			temp2 += Math.pow(arr[i] - temp / arr_size, 2);
		}
		System.out.printf("The average is %.2f\nThe Minimum is %d\nThe Maximum is %d\nThe Median is %d\nS.D is %.2f\n",
				temp / arr_size, arr[0], arr[arr_size - 1], arr[arr_size / 2], Math.sqrt(temp2 / arr_size));

	}

	void eR() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

}

class GradeMain {
	public static void main(String args[]) {
		Scanner sC = new Scanner(System.in);

		System.out.printf("Enter the number of grades: ");
		int n = sC.nextInt();

		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sC.nextInt();
		}
		sC.close();
		Grades g = new Grades(n, ar);
		g.eR();
		g.calc();
	}
}
