package org.example;
import org.example.bank.mainacc;
import org.example.calculator.Calculator;
import org.example.creditcard.Credit;
import org.example.db.Creation;
import org.example.frequency.Frequency;
import org.example.point.Point;
import org.example.sets.Treeset;
import org.example.shapes.shapes;
import org.example.stud.stud;
import org.example.studentTest.StudentTest;
import org.example.tictactoe.Tictactoe;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws NoSuchElementException,FileNotFoundException {
        Scanner scan=new Scanner(System.in);
        Logger l=Logger.getLogger("kitty");
        int ch;
        do {
            l.info("1.Bank Account"+"\n2.Shapes"+"\n3.Student Gpa"+"\n4.Database Connection"+"\n5.Point"+"\n6.CreditCard"+"\n7.Student Test"+"\n8.Sets and maps"+"\n9.Calculator"+"\n10.Frequency"+"\n11.TicTacToe");
            l.info("Enter a choice:");
            ch= scan.nextInt();
            switch (ch)
            {
                case 1:
                    mainacc ma=new mainacc();
                    ma.bank1();
                    break;
                case 2:
                  shapes s=new shapes();
                  s.sh();
                  break;
                case 3:
                    stud.st();
                    break;
                case 4:
                    Creation.db1();
                    break;
                case 5:
                    Point.point();
                    break;
                case 6:
                    Credit.details();
                    break;
               case 7:
                   StudentTest.stu();
                   break;
                case 8:
                    Treeset tt=new Treeset();
                    tt .choice();
                    break;
                case 9:
                    Calculator.ca();
                    break;
                case 10:
                    Frequency.words();
                    break;
                case 11:
                    Tictactoe.tic();
                    break;
                case 12:
                    System.exit(0);
                default:
                    l.info("Invalid choice");
            }
        }while (ch!=12);
    }
}
// jdbc:mysql://localhost:3306/bhaargavi