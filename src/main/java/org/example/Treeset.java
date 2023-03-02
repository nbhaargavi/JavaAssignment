package org.example;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Treeset  {
    public static void ts() {
        Logger l = Logger.getLogger("kitty");
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

    public static void choice() {
        Scanner scan=new Scanner(System.in);
        System.out.println("1.HashMap");
        System.out.println("2.HashSet");
        System.out.println("1.TreeSet");
        System.out.println("enter a choice");
        int ch = scan.nextInt();
        int a;
        boolean con=true;
        do {
            switch (ch) {
                case 1:
                    Hashmap.map();
                    con=false;
                    break;
                case 2:
                    Hashset.set();
                    con=false;
                    break;
                case 3:
                    Treeset.ts();
                    con=false;
                    break;
            }
            System.exit(0);
        }while(con);
    }
}