package org.example.studentest;
import java.util.*;
import java.util.logging.*;
import java.util.logging.Logger;
import java.util.Scanner;

public class StudentTest {
    private StudentTest()
    {

    }
    public static void stu() {
        Logger l = Logger.getLogger("kitty");
        List<Studgetset> mylist = new ArrayList<Studgetset>();
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        l.info("enter the number of students");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            l.info("Enter the student name");
            String name = in.nextLine();

            l.info("Enter the student age");
            int age = sc.nextInt();

            l.info("Enter the student gpa");
            int gpa = sc.nextInt();

            Studgetset s = new Studgetset(name, age, gpa);
            mylist.add(s);

            l.log(Level.INFO, () -> "Name :" + s.getname());
            l.log(Level.INFO, () -> "age  :" + s.getage());
            l.log(Level.INFO, () -> "gpa :" + s.getgpa());
        }
        Collections.sort(mylist, new Comparator<Studgetset>() {
            public int compare(Studgetset s1, Studgetset s2) {
                return Double.compare(s2.getgpa(), s1.getgpa());
            }
        });
        l.info("After sorted :");
        for (int i = 0; i < n; i++) {

            int finalI = i;
            l.log(Level.INFO, () -> "Name :" + mylist.get(finalI).getname());
            int finalI1 = i;
            l.log(Level.INFO, () -> "Gpa :" + mylist.get(finalI1).getgpa());
        }

    }
}

