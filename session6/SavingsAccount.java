package session6;

class SavingsAccount extends Account {
    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Savings Account interest: " + interest);
    }
}