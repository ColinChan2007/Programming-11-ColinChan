import java.text.SimpleDateFormat;
import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    // Requires: amount (withdrawal amount), date (transaction date), account (checking/saving)
    // Modifies: this (Withdraw object)
    // Effects: Initializes a new Withdraw object with the given amount, date, and account
    Withdraw(double amount, Date date, String account) {
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    // Requires: None
    // Modifies: None
    // Effects: Returns a formatted string representation of the withdrawal
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        return "Withdraw:\nWithdrawal of: $" + amount + " Date: " + sdf.format(date) +
                " from account: " + account + " Current Balance in " + account + " is: $" + amount;
    }
}
