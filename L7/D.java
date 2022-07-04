import java.util.*;

abstract class course {
    String coursename, dept;

    abstract void studentdetails(comps[] c);

    //abstract void studentdetails(it[] i);
}

class comps extends course

{
    int n, y, uid;
    String sname, cname;

    comps() {}

    comps(int n, int y, String sname, int uid, String cname) {
        this.n = n;
        this.y = y;
        this.sname = sname;
        this.uid = uid;
        this.cname = cname;
    }

    public void studentdetails(comps[] com) {
        String course;
        int i, j;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter course name which is needed");
        course = ob.nextLine();

        if (course == cname) {
            for (i = 1; i <= 3; i++) {
                for (j = 0; j < com.length; j++) {
                    if (com[j].y == i) {
                        System.out.println("Year is " + i);
                        System.out.println("Name is " + sname);
                        System.out.println("UID is " + uid);

                    }
                }
            }
        }
    }
}

class it extends course {
    int n, y, uid;
    String sname, cname;

    it() {
    }

    it(int n, int y, String sname, int uid, String cname) {
        this.n = n;
        this.y = y;
        this.sname = sname;
        this.uid = uid;
        this.cname = cname;
    }

    public void studentdetails(it[] itt) {
        String course;
        int i, j;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter course name which is needed");
        course = ob.nextLine();

        if (course == cname) {
            for (i = 1; i <= 3; i++) {
                for (j = 0; j < itt.length; j++)
                    if (itt[j].y == i) {
                        System.out.println("Year is " + i);
                        System.out.println("Name is " + sname);
                        System.out.println("UID is " + uid);

                    }
            }
        }
    }
}

class details {
    public static void main(String args[]) {
        int i, j, y, n, m, uid;
        String cname, sname;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number of courses");
        int c = ob.nextInt();

        for (i = 0; i < c; i++) {
            System.out.println("Enter name of course");
            cname = ob.nextLine();

            System.out.println("Enter 1 if comps course , 2 if IT course");
            m = ob.nextInt();

            if (m == 1) {

                System.out.println("Enter number of students in course" + (i + 1));

                n = ob.nextInt();
                comps[] com = new comps[n];
                for (j = 0; j < n; j++) {
                    System.out.println("Enter year of student :- 1 for FE , 2 for SE , 3 for BE ");
                    y = ob.nextInt();
                    System.out.println("Enter name of student ");
                    sname = ob.nextLine();

                    System.out.println("Enter UID");
                    uid = ob.nextInt();

                    com[j] = new comps(n, y, sname, uid, cname);

                }

            }

            else {
                System.out.println("Enter number of students in course" + (i + 1));

                n = ob.nextInt();
                it[] itt = new it[n];
                for (j = 0; j < n; j++) {
                    System.out.println("Enter year of student :- 1 for FE , 2 for SE , 3 for BE ");
                    y = ob.nextInt();
                    System.out.println("Enter name of student ");
                    sname = ob.nextLine();

                    System.out.println("Enter UID");
                    uid = ob.nextInt();

                    itt[j] = new it(n, y, sname, uid, cname);

                }

            }

        }
        comps co = new comps();
        co.studentdetails(com);

        it ii = new it();
        ii.studentdetails(itt);

    }

}