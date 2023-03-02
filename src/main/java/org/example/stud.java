package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class stud {
    static Logger l = Logger.getLogger("kitty");
    String name;
    int gradelvl;
    int gpa;

    public stud(String name, int gradelvl, int gpa) {
        this.name = name;
        this.gradelvl = gradelvl;
        this.gpa = gpa;
    }

    void update(int update) {
        gpa = update;
        l.log(Level.INFO, () -> "The updated GPA is " + gpa);
    }

    void stud() {
        l.log(Level.INFO, () -> name + " has a gpa of " + gpa);
    }

    public static void st() {
        try {
            Logger l = Logger.getLogger("kitty");
            Scanner scan = new Scanner(System.in);
            l.log(Level.INFO, () -> "Enter student's name");
            var str = scan.nextLine();
            l.log(Level.INFO, () -> "Enter student's gpa");
            var gpa = scan.nextInt();
            l.info("Enter student's updated gpa");
            var ugpa = scan.nextInt();
            stud s1 = new stud(str, gpa, ugpa);
            s1.update(ugpa);
            s1.stud();
        } catch (InputMismatchException e) {
            l.log(Level.INFO, () -> "input mismatch ! Please enter a valid input.");
        }
    }
}