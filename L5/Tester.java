class Production {
    String title, director, writer;
    static int sP, sM = 0;

    Production(String title, String director, String writer) {
        this.title = title;
        this.director = director;
        this.writer = writer;
    }
    @Override
    public String toString() {
        return "Title: " + this.title + "\nDirector: " + this.director + "\nWriter: " + this.writer;
    }
}
class Play extends Production {
    int perfs;
    Play(String title, String director, String writer, int perfs) {
        super(title, director, writer);
        this.perfs = perfs;
        sP+=1;
    }
}

class Musical extends Play {
    int perfs;
    String composer, lyricist;
    Musical(String title, String director, String writer, int perfs, String composer, String lyricist) {
        super(title, director, writer,perfs);
        this.perfs = perfs;
        this.composer = composer;
        this.lyricist = lyricist;
        sM+=1;
    }
}

class Tester {
    public static void main(String[] args) {
        Play p1 = new Play("t1", "d1", "w1", perfs)
        Musical m1 = new Musical("The Nutcracker", "Walt Disney", "Judy Garland", 5, "Mozart", "Ludwig van Beethoven");
        Musical m2 = new Musical("The Nutcracker", "Walt Disney", "Judy Garland", 5, "Mozart", "Ludwig van Beethoven");
    }
}