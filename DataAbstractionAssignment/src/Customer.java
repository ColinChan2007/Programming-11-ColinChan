import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer() {
        // create default constructor
        deposits = new ArrayList<>();
        withdraws = new ArrayList<>();
    }

    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.deposits = new ArrayList<>();
        this.withdraws = new ArrayList<>();
        deposit(checkDeposit, new Date(), CHECKING);
        deposit(savingDeposit, new Date(), SAVING);
    }

    public double deposit(double amt, Date date, String account) {
        if (amt <= 0) {
            System.out.println("Invalid deposit amount!");
            return -1;
        }

        if (account.equals(CHECKING)) {
            checkBalance += amt;
        } else if (account.equals(SAVING)) {
            savingBalance += amt;
        } else {
            System.out.println("Invalid account type!");
            return -1;
        }

        deposits.add(new Deposit(amt, date, account));
        return amt;
    }

    public double withdraw(double amt, Date date, String account) {
        if (amt <= 0) {
            System.out.println("Invalid withdrawal amount!");
            return -1;
        }

        double currentBalance;
        if (account.equals(CHECKING)) {
            currentBalance = checkBalance;
        } else if (account.equals(SAVING)) {
            currentBalance = savingBalance;
        } else {
            System.out.println("Invalid account type!");
            return -1;
        }

        if (currentBalance - amt < OVERDRAFT) {
            System.out.println("Overdraft not allowed!");
            return -1;
        }

        if (account.equals(CHECKING)) {
            checkBalance -= amt;
        } else {
            savingBalance -= amt;
        }

        withdraws.add(new Withdraw(amt, date, account));
        return amt;
    }

    private boolean checkOverdraft(double amt, String account) {
        double currentBalance;
        if (account.equals(CHECKING)) {
            currentBalance = checkBalance;
        } else if (account.equals(SAVING)) {
            currentBalance = savingBalance;
        } else {
            return false;
        }

        return currentBalance - amt < OVERDRAFT;
    }

    public void displayDeposits() {
        for (Deposit d : deposits) {
            System.out.println(d);
        }
    }

    public void displayWithdraws() {
        for (Withdraw w : withdraws) {
            System.out.println(w);
        }
    }
}
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
