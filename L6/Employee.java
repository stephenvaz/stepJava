class Employee {
    final double baseSalary = 10000;
    double bonus = 0;
    double sal = baseSalary;

    double getSalary() {
        return baseSalary;
    }

    double getBonus() {
        return bonus;
    }
}

class Manager extends Employee {
    double getSalary() {
        sal = baseSalary * 2;
        return sal;
    }

    double getBonus() {
        bonus = sal * 0.3;
        return bonus;
    }
}

class Clerk extends Employee {
    double getSalary() {
        sal = baseSalary * 0.5;
        return sal;
    }

    double getBonus() {
        bonus = sal * 0.2;
        return bonus;
    }
}

class Intern extends Employee {
    double getSalary() {
        sal = baseSalary * 0.75;
        return sal;
    }

    double getBonus() {
        bonus = sal * 0.1;
        return bonus;
    }
}

class Company {
    public static void main(String[] args) {
        Employee[] emp = new Employee[3];
        emp[0] = new Manager();
        emp[1] = new Clerk();
        emp[2] = new Intern();
        for (int i = 0; i < emp.length; i++) {
            System.out.printf("Salary of %s is %.2f\nBonus = %.2f\nTotal Salary = %.2f\n\n",
                    emp[i].getClass().getSimpleName(), emp[i].getSalary(), emp[i].getBonus(),
                    emp[i].getSalary() + emp[i].getBonus());
        }
    }
}