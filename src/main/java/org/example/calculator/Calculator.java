package org.example.calculator;
import java.util.*;
import java.util.logging.*;
import java.util.logging.Logger;

public class Calculator {
    private Calculator() {

    }
    public static void ca() throws ArithmeticException
    {
   Logger l=Logger.getLogger("kitty");
        Scanner sc=new Scanner(System.in);
        l.info("Enter the number 1 :");
        int a=sc.nextInt();
        l.info("Enter the number 2 :");
        int b=sc.nextInt();
        l.info("1.Addition");
        l.info("2.Subtraction");
        l.info("3.Multiplication");
        l.info("4.Division");
        l.info("Enter a choice");
        int ch=sc.nextInt();

        switch(ch)
        {
            case 1:
                Add a1=new Add();
                a1.sett(a,b);
                l.log(Level.INFO,()->"Addition of two numbers :"+a1.cal(a1.get1(),a1.get2()));
                break;
            case 2:
                Sub s=new Sub();
                s.sett(a,b);
                l.log(Level.INFO,()->"Subtraction of two numbers :" + s.cal(s.get1(),s.get2()));
                break;
            case 3:
                Mul m=new Mul();
                m.sett(a,b);
                l.log(Level.INFO,()->"Multiplication of two numbers :"+m.cal(m.get1(),m.get2()));
                break;
            case 4:
                try {
                    Div d = new Div();
                    d.sett(a, b);
                    l.log(Level.INFO, () -> "Division of two numbers :" + d.cal(d.get1(), d.get2()));
                }catch(ArithmeticException e)
                {
                    l.log(Level.INFO, () -> "Can't divide 1 by 0 !") ;
                }
                break;
            default:
                l.info("Valid input required ");
                break;
        }
    }
}