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

    // Requires: None
    // Modifies: this (Customer object)
    // Effects: Initializes a new Customer object with default constructor
    Customer() {
        deposits = new ArrayList<>();
        withdraws = new ArrayList<>();
    }

    // Requires: name (customer name), accountNumber (account number), checkDeposit (initial checking deposit),
    //           savingDeposit (initial saving deposit)
    // Modifies: this (Customer object)
    // Effects: Initializes a new Customer object with the given parameters,
    //          creates initial deposits for checking and saving accounts
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.deposits = new ArrayList<>();
        this.withdraws = new ArrayList<>();
        deposit(checkDeposit, new Date(), CHECKING);
        deposit(savingDeposit, new Date(), SAVING);
    }

    // Requires: amt (deposit amount), date (transaction date), account (checking/saving)
    // Modifies: this (Customer object), deposits, checkBalance, savingBalance
    // Effects: Deposits the specified amount into the given account, updates balance, and creates a new Deposit object
    public double deposit(double amt, Date date, String account) {
        // Method implementation
    }

    // Requires: amt (withdrawal amount), date (transaction date), account (checking/saving)
    // Modifies: this (Customer object), withdraws, checkBalance, savingBalance
    // Effects: Withdraws the specified amount from the given account, updates balance,
    //          creates a new Withdraw object, and checks for overdraft
    public double withdraw(double amt, Date date, String account) {
        // Method implementation
    }

    // Requires: amt (withdrawal amount), account (checking/saving)
    // Modifies: None
    // Effects: Checks if an overdraft would occur for the given withdrawal amount and account
    private boolean checkOverdraft(double amt, String account) {
        // Method implementation
    }

    // Requires: None
    // Modifies: None
    // Effects: Displays all the deposits made by the customer using the Deposit.toString() method
    public void displayDeposits() {
        // Method implementation
    }

    // Requires: None
    // Modifies: None
    // Effects: Displays all the withdrawals made by the customer using the Withdraw.toString() method
    public void displayWithdraws() {
        // Method implementation
    }
}

