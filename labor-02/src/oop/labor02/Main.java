package oop.labor02;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("OTP000001");

        System.out.println(account1.getAccountNumber() + ":" + account1.getBalance());

    }


}
