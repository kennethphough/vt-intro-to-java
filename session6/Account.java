package session6;

class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void calculateInterest() {
        System.out.println("Calculating interest for a generic account.");
    }
}
