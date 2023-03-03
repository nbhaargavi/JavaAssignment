package org.example.bank;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mainacc {
    Logger l=Logger.getLogger("kitty");
    public void bank1() {

        Account details=new Account("bhaargavi", 1122, 20000);
        l.log(Level.INFO, () -> "Account Holder name:" + " " + Account.accntholdername);
        l.log(Level.INFO, () -> "Account ID:" + " " + Account.id);
        l.log(Level.INFO, () -> "Initial Balance:" + details.getBalance());
        l.log(Level.INFO, () -> "Balance after Withdraw:" + " " + details.withdraw(2500));
        l.log(Level.INFO, () -> "Balance after deposit" + " " + details.deposit(3000));
    }
}
