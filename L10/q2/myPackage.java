package q2;

public class myPackage{
    public double calculateGST(int type, double amount) {
        switch(type) {
            case 1:
                return amount * 0.05;
            case 2:
                return amount * 0.1;
            case 3:
                return amount * 0.12;
            case 4:
                return amount * 0.15;
            default:
                return 0;
        }
    }
}