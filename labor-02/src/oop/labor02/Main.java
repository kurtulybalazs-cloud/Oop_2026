package oop.labor02;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("OTP000001");

        System.out.println(account1.getAccountNumber() + ":" + account1.getBalance());

        account1.Deposit(1000);

        System.out.println(account1.getAccountNumber() + ":" + account1.getBalance());

        boolean result = account1.Withdraw(500);
        if(!result){
            System.out.println("nincs eleg penzed ehhez a parancshoz ");
        }

        System.out.println(account1.getAccountNumber() + ":" + account1.getBalance());


    }


}
