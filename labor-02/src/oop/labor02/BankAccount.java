package oop.labor02;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance =22;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    void Deposit(double amount){
        this.balance += amount;
    }

    boolean Withdraw(double amount){
        if(amount <0){
            return false;
        }
        if(amount > balance){
            return false;
        }
        this.balance -= amount;
        return true;
    }

}
