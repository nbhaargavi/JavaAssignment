package org.example.stud;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Stud {
    static Logger l = Logger.getLogger("kitty");
    String name;
    int gradelvl;
    int gpa;

   Stud(String name, int gradelvl, int gpa) {
        this.name = name;
        this.gradelvl = gradelvl;
        this.gpa = gpa;
    }

    public void update(int update) {
        gpa = update;
        l.log(Level.INFO, () -> "The updated GPA is " + gpa);
    }

   public void gpadisplay() {
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
            Stud s1 = new Stud(str, gpa, ugpa);
            s1.update(ugpa);
            s1.gpadisplay();
        } catch (InputMismatchException e) {
            l.log(Level.INFO, () -> "input mismatch ! Please enter a valid input.");
        }
    }
}