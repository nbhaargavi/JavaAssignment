package org.example.sets;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Treeset  {
    Logger l = Logger.getLogger("kitty");
    public void ts() {
        TreeSet<String> tset = new TreeSet<String>();
        tset.add("timothee");
        tset.add("chalamet");
        tset.add("bhaargavi");
        tset.add("chalamet");
        tset.add("tim");
        l.info("INITIAL TREE SET :");
        l.log(Level.INFO, () -> " " + tset);
        tset.pollFirst();
        l.log(Level.INFO, () -> "After removing First element :" + tset);
        tset.pollLast();
        l.log(Level.INFO, () -> "After removing Last element :" + tset);
        tset.clone();
        l.log(Level.INFO, () -> "Cloned tree set : " + tset);
    }

    public void choice() {
        Scanner scan=new Scanner(System.in);
       l.info("1.HashMap");
        l.info("2.HashSet");
        l.info("1.TreeSet");
        l.info("enter a choice");
        int ch = scan.nextInt();
        boolean con=true;
        do {
            switch (ch) {
                case 1:
                    Hashmap hm=new Hashmap();
                    hm.map();
                    con=false;
                    break;
                case 2:
                    Hashset hs=new Hashset();
                    hs.set();
                    con=false;
                    break;
                case 3:
                    Treeset te=new Treeset();
                    te.ts();
                    con=false;
                    break;
                default:
                    l.info("Enter a valid case");
            }
            System.exit(0);
        }while(con);
    }
}