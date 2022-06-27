class Person {
    int age, gender;
    String name;

    Person(int age, int gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }
}

class Doctor extends Person {
    String spec;
    double fees, income;

    Doctor(int age, int gender, String name, String spec, double fees, double income) {
        super(age, gender, name);
        this.spec = spec;
        this.fees = fees;
        this.income = income;
    }
}

class Patient extends Person {
    String doc;
    int days;

    Patient(int age, int gender, String name, String doc, int days) {
        super(age, gender, name);
        this.doc = doc;
        this.days = days;
    }
}

class Billing {
    double amtDue;

    double billGen(int days, Doctor doc) {
        amtDue = days * 2000 + doc.fees * days;
        doc.income += amtDue;
        return amtDue;
    };
}

class Clinic {
    public static void main(String[] args) {
        double totalIncome = 0;
        Doctor[] d = new Doctor[2];
        d[0] = new Doctor(30, 0, "John", "Cardiology", 2000, 0);
        d[1] = new Doctor(40, 1, "Jane", "Neurology", 3000, 0);
        Patient[] p = new Patient[3];
        p[0] = new Patient(28, 0, "Tom", "Jane", 5);
        p[1] = new Patient(35, 1, "Jenny", "John", 3);
        p[2] = new Patient(25, 0, "Jack", "Jane", 2);
        Billing b = new Billing();
        for (int i = 0; i < p.length; i++) {
            System.out.printf("Patient #%d: %s\n\t    ", i + 1, p[i].name);
            System.out.println("Patient " + p[i].name + " is seen by " + p[i].doc);
            for (int j = 0; j < d.length; j++) {
                if (p[i].doc == d[j].name) {
                    System.out.printf("\t    Total bill due: %.2f\n", b.billGen(p[i].days, d[j]));
                    totalIncome += d[j].income;
                }
            }
        }
        for (int i = 0; i < d.length; i++) {
            System.out.printf(
                    "Doctor #%d:  %s\n\t    Age: %d, Gender: %s, Specialization: %s\n\t    Total Income: %.2f\n",
                    i + 1, d[i].name, d[i].age, (d[i].gender == 0 ? "Male" : "Female"), d[i].spec, d[i].income);
        }
        System.out.printf("Total Income of Clinic: %.2f\n", totalIncome);
    }
}