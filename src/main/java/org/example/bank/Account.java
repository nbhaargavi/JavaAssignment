package org.example.bank;
import java.util.logging.*;
class AmntNotEnoughException extends Exception{
    public AmntNotEnoughException (String message) {
        super(message);
    }
}
public class Account {
    Logger l=Logger.getLogger("kitty");
    String accntholdername;
    int id;
    double balance;
    Account(String accntname, int newid, double newbalance) {
        accntholdername = accntname;
        id = newid;
        balance = newbalance;
    }
        public double getBalance() {
            return balance;
        }

        public double withdraw(int amount)
        {
            try {
                if (amount > balance) {
                    throw new AmntNotEnoughException("u dont have enough money to withdraw");
                } else {
                    balance = balance - amount;
                    return balance;

                }
            }catch (AmntNotEnoughException e) {
                l.log(Level.INFO, () -> e.getMessage());
                System.exit(0);
            }
            return amount;
        }

        public double deposit(int amount)
        {
            balance = balance + amount;
            return balance;
        }
}