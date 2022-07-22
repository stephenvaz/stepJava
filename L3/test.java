public class test {
    void t1(int a, int b) {
        System.out.println(a + b);
    }
    void t1(double a, double b) {
        System.out.println(a * b);
    }
    public static void main(String[] args) {
        test t = new test();
        t.t1(3,4.2);
    }
}
