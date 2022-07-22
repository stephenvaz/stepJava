class Test {
    final int i = 0;
}

class Main {
    public static void main(String[] args) {
        Test t = new Test();
        Test t1 = new Test();
        System.out.println(t.i.toString());
    }
}