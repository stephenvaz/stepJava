import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;
import java.util.InputMismatchException;

class Test {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        Scanner sC = new Scanner(System.in);
        int ele = 0, n;
        boolean flag = false;
        while (true) {
            System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit");
            n = sC.nextInt();

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
                            } catch (java.lang.OutOfMemoryError e) {
                                System.out.println("Stack Overflow");
                                flag = true;
                                break;
                            }
                            
                            sC.nextLine();
                        }
                        if (flag) {
                            flag = false;
                            break;
                        }
                    }
                    break;
                case 2:
                    try {
                        if (stk.isEmpty()) {
                            throw new Exception("Stack is empty");
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
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        if (stk.isEmpty()) {
                            throw new Exception("Stack is empty");
                        } else {
                            System.out.println("Stack elements are: ");
                            try {
                                System.out.println(Arrays.toString(stk.toArray()));
                            } catch (java.lang.OutOfMemoryError e) {
                                System.out.println("Stack Overflow");
                                
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    sC.close();
                    return;
                case 5:
                    int i = 0;
                    while (true) {
                        try {
                            stk.push(i);
                            i += 1;
                        } catch (java.lang.OutOfMemoryError e) {
                            System.out.println("Stack Overflow");
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid input");
            }

        }

    }
}