package staticattrmeth.bank;

public class BankTransaction {

    public static final long MIN = 1;
    public static final long MAX = 10_000_000;

    private static long currentMinValue;
    private static long currentMaxValue;
    private static long sumOfTrxs;
    private static long numberOfTrx;

    private long trxValue;


    public BankTransaction(long trxValue) {
        checkMinMax(trxValue);
        numberOfTrx++;
        sumOfTrxs += trxValue;
        checkCurrentMinValue(trxValue);
        checkCurrentMaxValue(trxValue);
        this.trxValue = trxValue;
    }

    private void checkMinMax(long trxValue) {
        if (trxValue < MIN || trxValue > MAX) {
            throw new IllegalArgumentException("Invalid data");
        }
    }

    public long getTrxValue() {
        return trxValue;
    }

    public static void initTheDay() {
        numberOfTrx = 0;
        sumOfTrxs = 0;
        currentMinValue = MAX;
        currentMaxValue = MIN;
    }

    public static long getCurrentMinValue() {
        return numberOfTrx == 0 ? 0 : currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return numberOfTrx == 0 ? 0 : currentMaxValue;
    }

    public static long getSumOfTrxs() {
        return sumOfTrxs;
    }

    public static long averageOfTransaction() {
        return numberOfTrx == 0 ? 0 : sumOfTrxs / numberOfTrx;
    }

    private void checkCurrentMaxValue(long trxValue) {
        if (trxValue > currentMaxValue) {
            currentMaxValue = trxValue;
        }
    }

    private void checkCurrentMinValue(long trxValue) {
        if (trxValue < currentMinValue) {
            currentMinValue = trxValue;
        }
    }


}
