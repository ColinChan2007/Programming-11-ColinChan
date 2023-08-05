import java.text.SimpleDateFormat;
import java.util.Date;

public class Deposit {
    private double amount;
    private Date date;
    private String account;

    // Requires: amount (deposit amount), date (transaction date), account (checking/saving)
    // Modifies: this (Deposit object)
    // Effects: Initializes a new Deposit object with the given amount, date, and account
    Deposit(double amount, Date date, String account) {
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    // Requires: None
    // Modifies: None
    // Effects: Returns a formatted string representation of the deposit
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        return "Deposit:\nDeposit of: $" + amount + " Date: " + sdf.format(date) +
                " into account: " + account + " Current Balance in " + account + " is: $" + amount;
    }
}
