package session6;

class CurrentAccount extends Account {
    CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("Current Account: No interest applied.");
    }
}
