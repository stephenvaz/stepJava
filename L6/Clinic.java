class Person {
    int age, gender/*0 - M */;
    String name;
    
}

class Patient extends Person {
    String doc;

}

class Doctor extends Person{
    String spec;
}

class Billing {
    double amtDue;
    int n;
    Person[] p = new Person[n];
    Billing(int n){
        this.n = n;
    }


}

class Clinic {
    // double total(Billing[] b){
    //     double total = 0;
    //     for(int i : b){
    //         total += b.amtDue;
    //     }
    //     return total;
    // }
    public static void main(String[] args) {
        
    }
}

/*
Give the definition of two classes, Patient and Billing, whose objects are records for a clinic. 

Patient will be derived from the class Person. A Patient record has the patient’s name (inherited from the class Person) and primary physician, of type Doctor . A Billing object will contain a Patient object, a Doctor

object, and an amount due of type double. Be sure your classes have a reasonable

complement of constructors, accessor, and mutator member functions,

an overloaded assignment operator, and a copy constructor. First write a driver

program to test all your member functions, and then write a test program

that creates at least two patients, at least two doctors, and at least two Billing

records, then prints out the total income from the Billing records.
*/
