import java.util.*;

public class AccessModifiers {
    public static void main(String[] args) {
        Account rimdhima = new Account(786,500);
        Date dateCreatedRimdhima=rimdhima.showDate();
        System.out.println(dateCreatedRimdhima);
    }
}

class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    Account(){
        id=0;
        balance=0;
        annualInterestRate=0;
        dateCreated=new Date();
    }

    Account(int id,double balance){
        this();
        this.id=id;
        this.balance=balance;
    }



    public int showId(){ return id; }

    public double getBalance(){
      return balance;
    }

    public double getAnnualInterestRate(){
       return annualInterestRate;
    }

    public Date showDate(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate/12);
    }

    public double getMonthlyInterest(){
        return (((annualInterestRate/12)/100)*balance);
    }

    public void withdraw(double amount){
        System.out.println("Current Balance: "+ balance);
        System.out.println("Withdrawing: " + amount);
        if(balance<=amount){
            balance=balance-amount;
            System.out.println("Withdrawal Successful, Current Balance: " + balance);
        }else{
            System.out.println("Error! Not Enough Balance");
        }
    }

    public void deposit(double amount){
        balance=balance+amount;
        System.out.println("Deposited "+amount+", Current Balance: "+balance);
    }

    public void setId(int id){
        this.id=id;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }




}