package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Creation
{
    String dname;
    String uname;
    String pw;
    Connection conn;
    static Creation frst=null;
    Logger l=Logger.getLogger("kitty");
    public static void db1()
    {
        String dname;
        String uname;
        String pw;
        Scanner s = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Logger l = Logger.getLogger("kitty");
        l.info("Enter the database name:");
        dname = s.next();
        l.info("Enter your username:");
        uname = c.next();
        l.info("Enter your password:");
        pw = c.next();
        Creation c1 = Creation.in(dname, uname, pw);
        c1.connect();
        c1.cl();

    }
    private Creation(String dname, String uname, String pw)
    {
        this.dname = dname;
        this.uname = uname;
        this.pw = pw;
    }

    public static Creation in(String dname, String uname, String pw)
    {
        if(frst==null)
        {
            frst=new  Creation(dname, uname, pw);
        }
        return frst;
    }
    public void connect()
    {
        try {
            conn = DriverManager.getConnection(dname, uname, pw);
            l.info("Connection established successfully ");
        } catch (Exception e) {
            l.log(Level.INFO,() -> String.valueOf(e));
        }
    }
    public void cl()
    {
        try {
            conn.close();
            l.info("Closed");
        }
        catch(Exception e)
        {
            l.log(Level.INFO,() -> String.valueOf(e));
        }
    }
}
