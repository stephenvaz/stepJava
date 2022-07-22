package q1;

public class Faculty extends Employee {
    String desig;
    public Faculty(String name, int age, long ecNo, String doj, String desig) {
        super(name, age, ecNo, doj);
        this.desig = desig;
    }
    public void display () {
        super.display();
        System.out.printf("Designation: %s\n", desig);
    }
}
