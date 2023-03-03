package org.example.shapes;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.*;
public class Shapes {
   public void sh() throws InputMismatchException{
       Scanner sc = new Scanner(System.in);
       Logger l = Logger.getLogger("kitty");
       double[] dimensions = new double[3];
       l.info("1.circle");
       l.info("2.rectangle");
       l.info("3.triangle");

           l.log(Level.INFO, () -> "Enter the type of shape");
           String type = sc.next();

           Shapedetails s1 = new Shapedetails(type, dimensions);

           if (type.equals("1")) {
               l.info("Enter the radius ");
               dimensions[0] = sc.nextInt();
               l.log(Level.INFO, () -> "Area of :" + type + ": " + s1.getArea());
               l.log(Level.INFO, () -> "Perimeter of" + type + ": " + s1.getPerimeter());
           } else if (type.equals("2")) {
               l.info("Enter the length ");
               dimensions[0] = sc.nextInt();
               l.info("Enter the breadth ");
               dimensions[1] = sc.nextInt();
               l.log(Level.INFO, () -> "Area of " + type + ": " + s1.getArea());
               l.log(Level.INFO, () -> "Perimeter of " + type + ": " + s1.getPerimeter());
           } else if (type.equals("3")) {
               l.info("Enter the base ");
               dimensions[0] = sc.nextInt();
               l.info("Enter the height ");
               dimensions[1] = sc.nextInt();
               l.info("Enter the length ");
               dimensions[2] = sc.nextInt();
               l.log(Level.INFO, () -> "Area of " + type + ": " + s1.getArea());
               l.log(Level.INFO, () -> "Perimeter of " + type + ": " + s1.getPerimeter());
           }
       else{
           l.info("Enter a valid shape");
           }
       }
   }

