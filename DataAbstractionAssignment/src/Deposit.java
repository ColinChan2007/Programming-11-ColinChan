import java.text.SimpleDateFormat;
import java.util.Date;

public class Deposit {
    private double amount;
    private Date date;
    private String account;

    Deposit(double amount, Date date, String account) {
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        return "Deposit:\nDeposit of: $" + amount + " Date: " + sdf.format(date) +
                " into account: " + account + " Current Balance in " + account + " is: $" + amount;
    }
}
