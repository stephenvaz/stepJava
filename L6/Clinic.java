class Person {
    int age, gender/* 0 - M */;
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
        Doctor[] d = new Doctor[2];
        d[0] = new Doctor(30, 0, "John", "Cardiology", 2000, 0);
        d[1] = new Doctor(40, 1, "Jane", "Neurology", 3000, 0);
        Patient[] p = new Patient[3];
        p[0] = new Patient(28, 0, "Tom", "Jane", 5);
        p[1] = new Patient(35, 1, "Jenny", "John", 3);
        p[2] = new Patient(25, 0, "Jack", "Jane", 2);
        Billing b = new Billing();
        for (int i = 0; i < p.length; i++) {
            System.out.println("Patient " + p[i].name + " is seen by " + p[i].doc);
            for (int j = 0; j < d.length; j++) {
                if (p[i].doc == d[j].name) {
                    System.out.printf("Total bill due: %.2f\n", b.billGen(p[i].days, d[j]));
                }
            }
        }
        for (int i = 0; i < d.length; i++) {
            System.out.printf("%d. Doctor: %s\n\tAge: %d, Gender: %s, Specialization: %s\n\tTotal Income: %.2f\n",
                    i + 1, d[i].name, d[i].age, (d[i].gender == 0 ? "Male" : "Female"), d[i].spec, d[i].income);
        }
    }
}

/*
 * Give the definition of two classes, Patient and Billing, whose objects are
 * records for a clinic.
 * 
 * Patient will be derived from the class Person. A Patient record has the
 * patient’s name (inherited from the class Person) and primary physician, of
 * type Doctor . A Billing object will contain a Patient object, a Doctor
 * 
 * object, and an amount due of type double. Be sure your classes have a
 * reasonable
 * 
 * complement of constructors, accessor, and mutator member functions,
 * 
 * an overloaded assignment operator, and a copy constructor. First write a
 * driver
 * 
 * program to test all your member functions, and then write a test program
 * 
 * that creates at least two patients, at least two doctors, and at least two
 * Billing
 * 
 * records, then prints out the total income from the Billing records.
 */

/*
 * Give the definition of four classes, Person, Doctor, Patient and Billing,
 * whose objects are records for a clinic.
 * 
 * Class Doctor will be derived from the class Person. A doctor have name and
 * Date (inherited from the class Person), it’s speciality; fees and income;
 * 
 * Patient will be derived from the class Person. A Patient record has the
 * patient’s name and Date (inherited from the class Person) and a Doctor
 * object.
 * 
 * A Billing object will contain a Patient object, a Doctor object, Date of bill
 * using date object and an amount due of type double. Be sure your classes have
 * a reasonable complement of constructors,override equals(check equality of
 * object) and toString methods and member functions.
 * 
 * First write a driver program to test all your member functions, and then
 * write a test program that creates at least two patients, at least two
 * doctors, and at least two Billing records, then prints out the total income
 * from the Billing records.
 * 
 * At the time of Billing the Patient name and doctor name equality should be
 * checked.
 * 
 * Total bill generated will be no of days the patient admitted (admitted date +
 * current date) * 2000+ doctore fees * no of days from the date of billing .
 * 
 * Update the Doctors income also simultaneously
 */