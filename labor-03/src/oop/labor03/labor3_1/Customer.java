package oop.labor03.labor3_1;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;

    public Customer(String firstName, String lastName, BankAccount account){
            this.firstName = firstName;
            this.lastName = lastName;
            this.account = account;
    }


    public BankAccount getAccount(){
        return  account;
    }

    public void closeAccount(){
            account = null;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                '}';
    }


}
