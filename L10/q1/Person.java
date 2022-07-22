package q1;

public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display () {
        System.out.printf("Name: %s\nAge: %d\n", name, age);
    }
}
