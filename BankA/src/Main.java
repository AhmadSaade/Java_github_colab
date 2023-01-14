// Main.java
public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1000.0, "John Doe");

        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);

        System.out.println("Current balance: " + myAccount.getBalance());
        System.out.println("Account owner: " + myAccount.getOwner());


    }
}