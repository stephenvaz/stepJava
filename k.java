import java.util.*;
import java.lang.Math;

class Bank
{
   float get_rate_of_interest()
   {
      return 2;
   }
}

class SBI_Bank extends Bank
{
   double get_rate_of_interest(int t1)
   {
       double I1;

    //    if(7<t1<14)
    if(t1>7 && t1<14)
       I1=3;

       else if(15<t1<30)
       I1=3;

       else if(31<t1<45)
       I1=3;

       else if(46<t1<90)
       I1=4.05;

       else if(91<t1<120)
       I1=4.10;

       else if(121<t1<180)
       I1=4.10;

       return I1;
    }
}

class ICICI_Bank extends Bank
{
   double get_rate_of_interest(int t2)
   {
       double I2;

       if(7<t2<14)
       I2=3.10;

       else if(15<t2<30)
       I2=3.20;

       else if(31<t2<45)
       I2=3.50;

       else if(46<t2<90)
       I2=4.50;

       else if(91<t2<120)
       I2=4.70;

       else if(121<t2<180)
       I2=4.90;

       return I2;
    }
}

class AXIS_Bank extends Bank
{
   double get_rate_of_interest(int t3)
   {
       double I3;

       if(7<t3<14)
       I3=3.15;

       else if(15<t3<30)
       I3=3.15;

       else if(31<t3<45)
       I3=3.45;

       else if(46<t3<90)
       I3=4.05;

       else if(91<t3<120)
       I3=4.70;

       else if(121<t3<180)
       I3=5.00;

       return I3;
    }
}

class Calculate
{
    public static void main(String[] args)
    {
        int t,d,m,y;
        double I,x,k,z,fa;
        Scanner sc=new Scanner(System.in);

        SBI_Bank s=new SBI_Bank();  
        ICICI_Bank i=new ICICI_Bank();  
        AXIS_Bank a=new AXIS_Bank();

        System.out.print("Enter the time period for which the money has to be kept in bank: ");  
        t=sc.nextInt();
        System.out.println("Today's Date is: 25/6/2022");

        y=t/360;
        t=t%360;
        m=t/30;
        d=t%30;

        System.out.printf("Date of Maturity: %s/%s/%s",25+d,6+m,2022+y);

        I=s.get_rate_of_interest(t);
        x=(float)(Math.pow(1+I,t));
        fa=100000+x;
        System.out.printf("The final amount in SBI bank will be: %.2f",fa);

        fa=0;
        I=i.get_rate_of_interest(t);
        k=(float)(Math.pow(1+I,t));
        fa=125000+k;
        System.out.printf("The final amount in ICICI bank will be: %.2f",fa);

        fa=0;
        I=a.get_rate_of_interest(t);
        z=(float)(Math.pow(1+I,t));
        fa=200000+z;
        System.out.printf("The final amount in SBI bank will be: %.2f",fa);
    }
}