class Production {
    String title, director, writer;
    static int perfs, seats, sP, sM = 0;

    Production() {
    }

    Production(String title, String director, String writer, int seats) {
        this.title = title;
        this.director = director;
        this.writer = writer;
        Production.seats += seats;
    }
}

class Play extends Production {
    Play(String title, String director, String writer, int seats) {
        super(title, director, writer, seats);
        perfs += 1;
        sP += seats;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + "\nDirector: " + this.director + "\nWriter: " + this.writer + "\n";
    }
}

class Musical extends Play {

    String composer, lyricist;

    Musical(String title, String director, String writer, String composer, String lyricist, int seats) {
        super(title, director, writer, seats);
        this.composer = composer;
        this.lyricist = lyricist;
        sM += seats;
        sP -= seats;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + "\nDirector: " + this.director + "\nWriter: " + this.writer + "\nComposer: "
                + this.composer + "\nLyricist: " + this.lyricist + "\n";
    }
}

class Tester {
    public static void main(String[] args) {
        Play p1 = new Play("t1", "d1", "w1", 1);
        Play p2 = new Play("t2", "d2", "w2", 2);
        Play p3 = new Play("t3", "d3", "w3", 3);
        Musical m1 = new Musical("m1", "md1", "mw1", "c1", "l1", 4);
        Musical m2 = new Musical("m2", "md2", "mw2", "c2", "l2", 5);
        System.out.println(p1+"\n"+p2+"\n"+p3+"\n"+m1+"\n"+m2);
        System.out.printf("Total no. of performances: %d\nBox office collection: %d\n", Production.perfs,
                Production.sP * 500 + Production.sM * 800);
    }
}