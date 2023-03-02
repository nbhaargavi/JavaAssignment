package org.example;
import java.util.logging.*;
class AmntNotEnoughException extends Exception{
    public AmntNotEnoughException (String message) {
        super(message);
    }
}
class Account {
    static Logger l=Logger.getLogger("kitty");
    static String accntholdername;
    static int id;
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

    public static void bank1() {
        Account details=new Account("bhaargavi", 1122, 20000);
        l.log(Level.INFO, () -> "Account Holder name:" + " " + accntholdername);
        l.log(Level.INFO, () -> "Account ID:" + " " + id);
        l.log(Level.INFO, () -> "Initial Balance:" + details.getBalance());
        l.log(Level.INFO, () -> "Balance after Withdraw:" + " " + details.withdraw(2500));
        l.log(Level.INFO, () -> "Balance after deposit" + " " + details.deposit(3000));
    }
}