class a {
    private void af() {
        System.out.println("af");
    }
    void get_af() {
         af();
    }
}

class b extends a{
    protected void bf() {
        System.out.println("bf");
    }
}
class c extends a{

}
    


class d {
    public static void main(String[] args) {
        c c = new c();
        c.get_af();
        c.bf();
    }
}