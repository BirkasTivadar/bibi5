package inheritancemethods.bankaccount;

public class DebitAccount {

    public static final double COST = 3.0;
    public static final long MIN_COST = 200;

    private String accountNumber;
    private long balance;

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public final long costOfTransaction(long amount) {
        long cost = (long) (amount * COST / 100);
        return cost > MIN_COST ? cost : MIN_COST;
    }

    public boolean transaction(long amount) {
        long tempBalance = balance - amount - costOfTransaction(amount);
        if (tempBalance >= 0) {
            balance = tempBalance;
            return true;
        }
        return false;
    }

    public void balanceToZero() {
        balance = 0;
    }
}
