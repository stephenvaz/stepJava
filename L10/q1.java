class Person {
    String name;
    int age;
    void display () {
        System.out.printf("Name: %s\nAge: %d\n", name, age);
    }
}

class Student extends Person {
    int rollNo;
    String branch;
    void display () {
        super.display();
        System.out.printf("Roll No: %d\nBranch: %s", rollNo, branch);
    }

}

class Employee extends Person {}

class Staff extends Employee {
    long ecNo;
    
}

class Faculty extends Employee {}


