package q1;

public class Employee extends Person {
    long ecNo;
    String doj;
    public Employee(String name, int age, long ecNo, String doj) {
        super(name, age);
        this.ecNo = ecNo;
        this.doj = doj;
    }
    public void display () {
        super.display();
        System.out.printf("EC No: %d\nDOJ: %s\n", ecNo, doj);
    }
}