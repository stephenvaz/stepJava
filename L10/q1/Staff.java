package q1;

public class Staff extends Employee {
    String dept;
    public Staff(String name, int age, long ecNo, String doj, String dept) {
        super(name, age, ecNo, doj);
        this.dept = dept;
    }
    public void display () {
        super.display();
        System.out.printf("Designation: %s\n", dept);
    }
}
