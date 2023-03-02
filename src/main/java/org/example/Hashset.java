package org.example;
import java.util.*;
import java.util.logging.*;
import java.util.logging.Logger;
public class Hashset {
    public static void set()
    {
        Logger l=Logger.getLogger("kitty");
        HashSet<String> hset = new HashSet<String>();
        hset.add("timothee");
        hset.add("chalamet");
        hset.add("bhaargavi");
        hset.add("chalamet");
        hset.add("tim");
        l.info("INITIAL HASH SET :");
        l.log(Level.INFO,() -> " "+ hset);
        hset.remove("tim");
        l.log(Level.INFO,() -> " "+hset);
    }
}
