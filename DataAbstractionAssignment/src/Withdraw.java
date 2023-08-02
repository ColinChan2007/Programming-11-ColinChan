import java.text.SimpleDateFormat;
import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account) {
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        return "Withdraw:\nWithdrawal of: $" + amount + " Date: " + sdf.format(date) +
                " from account: " + account + " Current Balance in " + account + " is: $" + amount;
    }
}