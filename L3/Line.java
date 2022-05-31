import java.util.Scanner;
class Line {
    void s1(double slope, double intercept) {
        System.out.printf("y = %.2fx + %.2f\n", slope, intercept);
    }
    void s1(double slope, double x1, double y1){
        System.out.printf("y - %.2f = %.2f(x - %.2f)\n", y1, slope, x1);
    }
    void s1(double x1, double y1,double x2, double y2){
        System.out.printf("(y - %.2f)/(x - %.2f) = (%.2f/%.2f)\n", y1, x1, (y2-y1),(x2-x1));
    }
    void eR(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

class LineMain{
    public static void main(String args[]) {
        Line l = new Line();
        Scanner sC = new Scanner(System.in);
        double x1,y1,x2,y2,slope,intercept;
        while(true){
            System.out.printf("1. Slope Intercept\n2. Slope Point\n3. Two Points\n4. Exit\n");
            int choice = sC.nextInt();
            l.eR();
            switch(choice){
                case 1:
                    System.out.printf("Enter slope and intercept:-\n");
                    slope = sC.nextDouble();
                    intercept = sC.nextDouble();
                    l.s1(slope, intercept);
                    break;
                case 2:
                    System.out.printf("Enter slope and points(x1, y1):-\n");
                    slope = sC.nextDouble();
                    x1 = sC.nextDouble();
                    y1 = sC.nextDouble();
                    l.s1(slope, x1, y1);
                    break;
                case 3:
                    System.out.printf("Enter points(x1, y1, x2, y2):-\n");
                    x1 = sC.nextDouble();
                    y1 = sC.nextDouble();
                    x2 = sC.nextDouble();
                    y2 = sC.nextDouble();
                    l.s1(x1, y1, x2, y2);
                    break;
                case 4:
                    sC.close();
                    return;
                default:
                    System.out.printf("Invalid choice\n");
            }
            sC.nextLine();
            sC.nextLine();
            l.eR();
        }
    }
}

