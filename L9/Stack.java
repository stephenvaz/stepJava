import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;
import java.util.InputMismatchException;

class Test {
    static void eR() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        Scanner sC = new Scanner(System.in);
        int ele = 0, n;
        while (true) {
            System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit");
            n = sC.nextInt();
            eR();
            switch (n) {
                case 1:
                    System.out.println("Enter the number of elements to be pushed");
                    n = sC.nextInt();
                    for (int i = 0; i < n; i++) {
                        while (true) {
                            System.out.printf("Element #%d: ", i + 1);
                            try {
                                ele = sC.nextInt();
                                stk.push(ele);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid Input");
                            }
                            sC.nextLine();
                        }
                    }
                    break;
                case 2:
                    if (stk.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Element to be popped: ");
                        ele = sC.nextInt();
                        try {
                            if (stk.search(ele) >= 0) {
                                stk.pop();
                                System.out.println("Element popped");
                            } else {
                                throw new Exception("Element not found");
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 3:
                    try {
                        if (stk.isEmpty()) {
                            throw new Exception("Stack is empty");
                        } else {
                            System.out.println("Stack elements are: ");
                            System.out.println(Arrays.toString(stk.toArray()));
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    sC.close();
                    return;
                default:
                    System.out.println("Invalid input");
            }
            sC.nextLine();
            sC.nextLine();
            eR();
        }

    }
}