import java.util.*;
import java.lang.Math;

class BankAccount
{
   static double balance,interest;

   public BankAccount(double mybalance,double myinterest)
   {
      balance=mybalance;
      interest=myinterest;
   }

   static void deposit(double d)
   {
       balance+=d;
   }

   static void withdraw(double w)
   {
       if(balance>w)
       {
          balance-=w;
       }
       else
       {
          System.out.println("You don't have enough balance in your account");
       }
   }

   static double ci(double t)
   {
      return balance*Math.pow(1 +interest/100,t) - balance;
   }
     
public static void main(String args[])
{
    double bal,roi,d,w,t;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your balance: ");
    bal=sc.nextDouble();
    System.out.println("Enter the rate of interest: ");
    roi=sc.nextDouble();

    BankAccount ba=new BankAccount(bal,roi);

    System.out.println("1-To deposit\n2-To withdraw\n3-To find compound interest\n4-To know the balance in your account\n5-Exit");
    System.out.println("Choose the option you want to perform: ");
    int choice=sc.nextInt();
    switch(choice)
    {
       case 1:
              System.out.println("Enter the amount to be deposited: ");
              d=sc.nextDouble();
              BankAccount.deposit(d);
              d=0;
              break;
       case 2:
              System.out.println("Enter the amount to be withdrawn: ");
              w=sc.nextDouble();
              BankAccount.withdraw(w);
              w=0;
              break;
       case 3:
              System.out.println("Enter the number of years: ");
              t=sc.nextDouble();
              System.out.printf("Compound interest is : %f",BankAccount.ci(t));
              t=0;
              break;
       case 4:
              System.out.printf("Current balance is: %.2f",balance);
              break;
       case 5:
              System.out.println("Thankyou");
              sc.close();
              return;
       default: 
              System.out.println("Invalid choice");
     }
  }
}