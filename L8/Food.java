import java.util.Scanner;

interface EatItHere {
    public double dispatchOrder(double price);
}

interface TakeAway {
    public double deliverOrder(double price);
}

class Consumer implements EatItHere, TakeAway {
    int orderNo;
    double price;

    Consumer() {
    }

    Consumer(int orderNo) {
        this.orderNo = orderNo;
        this.price = 0;
    }

    public double dispatchOrder(double price) {
        return (45 > 0.05 * price ? 45 + price : 1.05 * price);
    }

    public double deliverOrder(double price) {
        return (500 <= 0.1 * price ? 500 + price : 1.1 * price);
    }

    void getOrder(String[] food, double[] p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order number: ");
        orderNo = sc.nextInt();
        new Consumer(orderNo);
        System.out.println("Enter the number of items you'd like to order: ");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Enter the item number: ");
            int item = sc.nextInt();
            item -= 1;
            if (item < food.length) {
                System.out.println("The item ordered is: " + food[item]);
                System.out.println("The price of the item ordered is: " + p[item]);
                price += p[item];
            } else {
                System.out.println("This item does not exist in our menu.");
            }
        }
    }
}

class Food {
    static void eR() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner sC = new Scanner(System.in);
        System.out.printf("Enter the no. of items on the menu: ");
        int mn = sC.nextInt();
        String[] item = new String[mn];
        double price[] = new double[mn];
        for (int i = 0; i < mn; i++) {
            System.out.printf("Enter the name of item %d: ", i + 1);
            item[i] = sC.next();
            System.out.printf("Enter the price of item %d: ", i + 1);
            price[i] = sC.nextDouble();
        }
        eR();
        Consumer c = new Consumer();
        while (true) {
            System.out.printf("1. TakeAway\n2. Restaurant\n3. Exit\n:");
            int choice = sC.nextInt();
            eR();
            switch (choice) {
                case 1:
                    c.getOrder(item, price);
                    System.out.printf("Total Price: %.2f\n", c.dispatchOrder(c.price));
                    c.price = 0;
                    break;
                case 2:
                    c.getOrder(item, price);
                    System.out.printf("Total Price: %.2f\n", c.deliverOrder(c.price));
                    c.price = 0;
                    break;
                case 3:
                    sC.close();
                    return;
                default:
                    System.out.printf("Wrong Input!");
            }
            sC.nextLine();
            sC.nextLine();
            eR();
        }
    }
}