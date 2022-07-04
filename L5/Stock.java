import java.util.Scanner;

class Stock {
    String stockName;
    int stockArr[] /* = {1, 5, 2, 3, 7, 6, 4, 5} */;

    Stock(String stockName, int stockArr[]) {
        this.stockName = stockName;
        this.stockArr = stockArr;
    }
}

// 4+5+1
class Transaction extends Stock {
    Transaction(String stockName, int stockArr[]) {
        super(stockName, stockArr);

    }

    void findMaximumProfit(int arr[]) {
        int profit = 0, min = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                min = i;
                // System.out.println(min +", "+ arr[min]);
            }

            if (arr[i - 1] <= arr[i] && (i + 1 == arr.length || arr[i] > arr[i + 1])) {
                profit += arr[i] - arr[min];
                System.out.printf("Buy on day %d and sell on day %d\n", min + 1, i + 1);
            }
        }
        System.out.printf("Maximum profit: %d\n", profit);
    }
}

class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner tsc = new Scanner(System.in);
        System.out.print("Enter the no. of stocks you want to add: ");
        int n = sc.nextInt();
        Transaction t[] = new Transaction[n];
        for (int j = 0; j < n; j++) {
            System.out.printf("%d. Name of stock, Number of days:-\n", j + 1);
            String name = tsc.nextLine();
            int days = sc.nextInt();
            int[] price = new int[days];
            for (int i = 0; i < days; i++) {
                System.out.printf("Price of %s for Day %d: ", name, i + 1);
                price[i] = sc.nextInt();
            }
            t[j] = new Transaction(name, price);
            t[j].findMaximumProfit(t[j].stockArr);
        }
        sc.close();
        tsc.close();
    }
}
