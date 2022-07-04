abstract class Course {
	String name, uid, year;
	Course(String name, String uid, String year) {
		this.name = name;
		this.uid = uid;
		this.year = year;
	}
	abstract void studentDetails(); 
}

class Comp extends Course {
	Comp(String name, String uid, String year) {
		super(name,uid,year);
	}
	void studentDetails(int n) {
		System.out.println("Name is " + name);
		System.out.println("UID is " + uid);
		System.out.println("Year is " + year);
	}
}

class IT extends Course {
	IT(String name, String uid, String year) {
		super(name,uid,year);
	}
	void studentDetails(int n) {
		System.out.println("Name is " + name);
		System.out.println("UID is " + uid);
		System.out.println("Year is " + year);
	}
}

class Student {
	
}

class Test {
	public static void main(String args[]) {
		Comp[] comp = new Comp[3];
		comp[0] = new Comp("Comp", "1", "1");
		comp[1] = new Comp("Comp", "2", "2");
		comp[2] = new Comp("Comp", "3", "3");
		IT[] it = new IT[3];
		it[0] = new IT("IT", "1", "1");
		it[1] = new IT("IT", "2", "2");
		it[2] = new IT("IT", "3", "3");
		for(int i=0;i<comp.length;i++) {
			comp[i].studentDetails();

		}
		for(int i=0;i<it.length;i++) {
			it[i].studentDetails();
		}
	}
}
