package org.example;
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
            System.out.println("1.Bank Account"+"\n2.Shapes"+"\n3.Student Gpa"+"\n4.Database Connection"+"\n5.Point"+"\n6.CreditCard"+"\n7.Student Test"+"\n8.Sets and maps"+"\n9.Calculator"+"\n10.Frequency"+"\n11.TicTacToe");
            System.out.println("Enter a choice:");
            ch= scan.nextInt();
            switch (ch)
            {
                case 1:
                    Account.bank1();
                    break;
                case 2:
                  shapes.sh();
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
                    Treeset.choice();
                    break;
                case 9:
                    Calculator.ca();
                    break;
                case 10:
                    Frequency.words();
                case 11:
                    tictactoe.tic();
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