package oop.labor03.labor3_1;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("OTP000001");
            Customer customer1 = new Customer("John" ,"BLACK", account1);

            System.out.println(customer1);

            customer1.getAccount().Deposit(1000);
        System.out.println(customer1);




    }
}
