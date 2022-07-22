package q1;

public class Student extends Person {
    int rollNo;
    String branch;
    public Student(String name, int age, int rollNo, String branch) {
        super(name, age);
        this.rollNo = rollNo;
        this.branch = branch;
    }
    public void display () {
        super.display();
        System.out.printf("Roll No: %d\nBranch: %s\n", rollNo, branch);
    }
}
