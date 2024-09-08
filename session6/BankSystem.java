package session6;

public class BankSystem {
    public static void main(String[] args) {
        Account[] accounts = { new SavingsAccount("SA123", 1000), new CurrentAccount("CA123", 1500) };

        for (Account account : accounts) {
            account.calculateInterest();  // Polymorphic behavior
        }
    }
}
