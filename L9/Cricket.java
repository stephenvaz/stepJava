import java.util.Scanner;
import java.util.InputMismatchException;

class Cricketer {
    String player_name;
    int runs_hit, innings_count, not_out_count;
    double batting_average;

    void get_avg() {
        batting_average = (double) runs_hit / innings_count;
    }

    void sort_by_avg(Cricketer c[]) {
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - i - 1; j++) {
                if (c[j].batting_average > c[j + 1].batting_average) {
                    Cricketer temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sC = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int n = sC.nextInt();
        boolean flag = false;
        Cricketer c[] = new Cricketer[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("Enter the name,runs,inn,not out" + (i + 1) + ": ");
                    c[i] = new Cricketer();
                    c[i].player_name = sC.next();
                    c[i].runs_hit = sC.nextInt();
                    c[i].innings_count = sC.nextInt();
                    c[i].not_out_count = sC.nextInt();
                    if ((c[i].runs_hit < 0) || (c[i].innings_count < 0) || (c[i].not_out_count < 0)) {
                        throw new Exception("Invalid input (Negative number)");
                    }
                    c[i].get_avg();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                sC.nextLine();
            }
        }
        Cricketer cc = new Cricketer();
        cc.sort_by_avg(c);
        for (int i = 0; i < n; i++) {
            System.out.printf("%s %.2f %d %d %d\n", c[i].player_name, c[i].batting_average, c[i].runs_hit,
                    c[i].innings_count, c[i].not_out_count);

        }
    }
}