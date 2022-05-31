import java.io.*;

class Time {
    static void conversion1(int a) {
        System.out.printf("Hours: %d\nMinutes: %d\nSeconds: %d\n", a / 3600, a % 3600 / 60, a % 3600 % 60);
    }

    static void conversion2(int a, int b, int c) {
        System.out.printf("%d seconds\n", a * 3600 + b * 60 + c);
    }

    public static void main(String args[]) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        System.out.printf("Enter number of seconds: ");
        int totSeconds = Integer.parseInt(bf.readLine());
        Time.conversion1(totSeconds);
        System.out.printf("Enter number of hours, minutes and seconds:-\n");
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        Time.conversion2(a, b, c);

    }
}
