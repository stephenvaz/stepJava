import java.util.*;

class book {
   public void br() {
      Scanner sc = new Scanner(System.in);

      int[] book1 = new int[5];
      int[] book2 = new int[5];
      int[] book3 = new int[5];
      int sum1 = 0, sum2 = 0, sum3 = 0;
      double[] avg = new double[3];
      double temp;
      String[] name = new String[3];
      String temp1;

      System.out.println("Enter the name of the books: ");
      for (int i = 0; i < 3; i++) {
         name[i] = sc.nextLine();
      }

      for (int i = 0; i < 5; i++) {
         System.out.println("Enter the rating for book1");
         book1[i] = sc.nextInt();
         sum1 = sum1 + book1[i];
      }

      for (int i = 0; i < 5; i++) {
         System.out.println("Enter the rating of book2");
         book2[i] = sc.nextInt();
         sum2 = sum2 + book2[i];
      }

      for (int i = 0; i < 5; i++) {
         System.out.println("Enter the rating for book3");
         book3[i] = sc.nextInt();
         sum3 = sum3 + book3[i];
      }

      avg[0] = sum1 / 5;
      avg[1] = sum2 / 5;
      avg[2] = sum3 / 5;

      for (int i = 0; i < 3; i++) {
         for (int j = i + 1; j < 2; j++) {
            if (avg[j] < avg[i]) {
               temp = avg[j];
               avg[j] = avg[i];
               avg[i] = temp;

               temp1 = name[j];
               name[j] = name[i];
               name[i] = temp1;
            }
         }
      }

      System.out.printf("The highest rating is: %.2f", avg[0]);
      System.out.println();
      System.out.printf("The book with highest rating is: %s", name[0]);
   }
}

class Bookrating {
   public static void main(String args[]) {
      book B = new book();
      B.br();
   }
}