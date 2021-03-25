package inheritancemethods.bankaccount;

public class CreditAccount extends DebitAccount {
    private long overdraftLimit;

    public CreditAccount(String accountNumber, long balance, long overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public long getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public boolean transaction(long amount) {
        if (super.transaction(amount)) {
            return true;
        } else {
            return getSuccesWithOverdraftLimit(amount);
        }
    }

    private boolean getSuccesWithOverdraftLimit(long amount) {
        long rest = amount + costOfTransaction(amount) - getBalance();
        if (rest <= overdraftLimit) {
            balanceToZero();
            overdraftLimit -= rest;
            return true;
        }
        return false;
    }
}
