import java.util.Scanner;

class Employee {
    String name, id;
    int age, type;

    Employee() {
    }

    Employee(String name, String id, int age, int type) {
        this.type = type;
        this.name = name;
        this.id = id;
        this.age = age;
    }
}

class SalariedEmployee extends Employee {
    private double empSalary;

    SalariedEmployee() {
    }

    public SalariedEmployee(String name, String id, int age, int type, double eS) {
        super(name, id, age, type);
        this.empSalary = (type == 0) ? eS : eS + 2000;

    }

    double getSalary() {
        return empSalary;
    }

    void top(SalariedEmployee arr[], int n) {
        int i, j;
        SalariedEmployee temp;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i].empSalary > arr[j].empSalary) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sC = new Scanner(System.in);
        Scanner tsC = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        n = sC.nextInt();
        SalariedEmployee[] emp = new SalariedEmployee[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\nName, ID, Age, Type, Salary:-\n", i + 1);
            String name = tsC.next();
            String id = tsC.next();
            int age = sC.nextInt();
            int type = sC.nextInt();
            double empSalary = sC.nextDouble();
            emp[i] = new SalariedEmployee(name, id, age, type, empSalary);
        }

        sC.close();
        tsC.close();
        SalariedEmployee sE = new SalariedEmployee();
        sE.top(emp, n);
        System.out.printf("Name: %s\nID: %s\nAge: %d\nSalary: %f\n", emp[0].name, emp[0].id, emp[0].age,
                emp[0].empSalary);
    }
}
