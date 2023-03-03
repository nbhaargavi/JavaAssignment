package org.example.sets;

import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
 public class Hashmap {
    public void map() {
        Logger l = Logger.getLogger("kitty");
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1001, "Wings Of Fire");
        hmap.put(1002, "Harry Potter");
        hmap.put(1003, "Lord Of The Rings");
        hmap.put(1004, "Harry Potter");
        hmap.put(1005, "5am club");
        l.log(Level.INFO, () -> "Initial Hash Map :" + hmap);
        try {
            hmap.remove(1002);
            l.log(Level.INFO, () -> "Removing using key  :" + hmap);
            hmap.remove("Wings of fire");
            l.log(Level.INFO, () -> "Removing using value :" + hmap);
            hmap.remove(1005, "5am club");
            l.log(Level.INFO, () -> "Removing using key and value :" + hmap);
        }catch (NoSuchElementException e){
            e.getMessage();
        }
    }
}
