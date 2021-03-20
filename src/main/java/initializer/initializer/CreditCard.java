package initializer.initializer;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreditCard {

    public static final List<Rate> ACTUAL_RATES = new ArrayList<>();

    private long balance;


    static {
        Rate[] rates = {new Rate(Currency.HUF, 1.0),
                new Rate(Currency.EUR, 308.23),
                new Rate(Currency.SFR, 289.24),
                new Rate(Currency.GBP, 362.23),
                new Rate(Currency.USD, 289.77)};
        ACTUAL_RATES.addAll(Arrays.asList(rates));
    }

    public long getBalance() {
        return balance;
    }

    public CreditCard(long balance, Currency currency) {
        for (Rate rate : ACTUAL_RATES) {
            if (rate.getCurrency() == currency) {
                this.balance = (long) (balance * rate.getConversionFactor());
            }
        }
    }

    public CreditCard(long balance) {
        this(balance, Currency.HUF);
    }

    public boolean payment(long amount, Currency currency) {
        for (Rate rate : ACTUAL_RATES) {
            if (rate.getCurrency() == currency && balance > amount * rate.getConversionFactor()) {
                this.balance -= (long) (amount * rate.getConversionFactor());
                return true;
            }
        }
        return false;
    }

    public boolean payment(long amount) {
        return payment(amount, Currency.HUF);
    }


}
