import java.util.*;
import java.lang.Math;

class GradeStatistics {
    public void gs() {
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        float median, avg, std, a, k, sum1 = 0;

        System.out.print("Enter the number of students: \n");
        n = sc.nextInt();
        // int marks[]=new int[n];
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the grade for student: ");
            marks[i] = sc.nextInt();
            sum = sum + marks[i];
        }

        avg = sum / n;
        System.out.printf("The average is %.2f", avg);

        int max = marks[0];
        int min = marks[0];
        for (int i = 1; i < n; i++) {
            if (marks[i] > max) {
                max = marks[i];
            } else if (marks[i] < min) {
                min = marks[i];
            }
        }

        if (n % 2 == 0) {
            median = (marks[(n - 2) / 2] + marks[n / 2]) / 2;
        }

        else {
            median = marks[(n - 1) / 2];
        }

        System.out.printf("The maximum is %d\n", max);
        System.out.printf("The minimum is %d\n", min);
        System.out.printf("The median is %.2f\n", median);

        for (int i = 0; i < n; i++) {
            a = marks[i] - avg;
            k = (float) Math.pow(a, 2);
            sum1 = sum1 + k;
        }
        float b = sum1 / (n - 1);
        std = (float) Math.pow(b, 0.5);
        System.out.printf("The standard deviation is %.2f\n", std);
    }
}

class Grade {
    public static void main(String args[]) {
        GradeStatistics G = new GradeStatistics();
        G.gs();
    }
}