import q1.*;

class Test {
    public static void main(String[] args) {
        Student s = new Student("John", 20, 1, "CSE");
        s.display();
        System.out.println();
        Faculty f = new Faculty("John", 20, 1, "CSE", "Professor");
        f.display();
        System.out.println();
        Staff st = new Staff("John", 20, 1, "CSE", "Technical");
        st.display();
    }
}
