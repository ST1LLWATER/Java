import java.util.*;

class AccountTester {
    public static void main(String[] args) {
        Account stillwater = new Account(786,500);
        System.out.println("Creating Account Stillwater With ID: 786 And Balance: 500");
        Date dateCreatedStillwater=stillwater.getDate();
        System.out.println("Date Created Stillwater: "+dateCreatedStillwater);
        stillwater.deposit(500);
        stillwater.withdraw(200);
        System.out.println("Stillwater's ID: "+stillwater.getId());
        System.out.println("Stillwater's Balance: "+stillwater.getBalance());
        System.out.println("Stillwater's Current Annual Interest Rate: "+stillwater.getAnnualInterestRate());
        stillwater.setAnnualInterestRate(30);
        System.out.println("Stillwater's Current Annual Interest Rate: "+stillwater.getAnnualInterestRate()+"%");
        System.out.println("Stillwater's Monthly Interest Rate: "+stillwater.getMonthlyInterestRate()+"%");
        System.out.println("Stillwater's Monthly Interest Is: "+stillwater.getMonthlyInterest());


    }
}

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }


    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDate() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 12);
    }

    public double getMonthlyInterest() {
        return (((annualInterestRate / 12) / 100) * balance);
    }

    public void withdraw(double amount) {
        System.out.println("Current Balance: " + balance);
        System.out.println("Withdrawing: " + amount);
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful, Current Balance: " + balance);
        } else {
            System.out.println("Error! Not Enough Balance");
        }
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited " + amount + ", Current Balance: " + balance);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        System.out.println("Setting Annual Interest Rate To: " + annualInterestRate + "%");
        this.annualInterestRate = annualInterestRate;
    }

}