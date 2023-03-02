package org.example;
import java.util.Scanner;
import java.util.logging.*;
import java.util.logging.Logger;

public class Credit implements Cloneable {
    Logger l=Logger.getLogger("kitty");
    private String cname;
    private Integer cno;
    private Integer cnum = 501005463;
    private Integer expdate;

    public Credit( String cname,Integer cno, Integer expdate) {
        this.cname=cname;
        this.cno=cno;
        this.expdate=expdate;
    }
    public void eq()
    {
        if(cnum.equals(cno)) {
            l.info("Credit card number matched!");
        }
        else
        {
            l.info("OOPS! Credit card number doesn't match");
        }
    }
    Credit cr()
    {
        try
        {
            return (Credit) super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            l.info("cloned error");
            return this;
        }
    }

   public static void details(){
        Logger l=Logger.getLogger("kitty");
        Scanner sc=new Scanner(System.in);
        l.info("Enter the credit card holder name:");
        String cname = sc.next();
        l.info("Enter the credit card number:");
        Integer cno = sc.nextInt();
        l.info("Enter the expiration date:");
        Integer expdate = sc.nextInt();
        Credit c1=new Credit(cname,cno,expdate);
        Credit c2 = c1.cr();
        c2.eq();
    }
}