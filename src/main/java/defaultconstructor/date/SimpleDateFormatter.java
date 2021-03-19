package defaultconstructor.date;

public class SimpleDateFormatter {

    public String formatDateString(SimpleDate simpleDate) {
        return String.format("%d-%d-%d", simpleDate.getYear(), simpleDate.getMonth(), simpleDate.getDay());
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        if (countryCode == CountryCode.US) {
            return String.format("%d-%d-%d", simpleDate.getMonth(), simpleDate.getDay(), simpleDate.getYear());
        }
        if (countryCode == CountryCode.EN) {
            return String.format("%d-%d-%d", simpleDate.getDay(), simpleDate.getMonth(), simpleDate.getYear());
        }
        return formatDateString(simpleDate);
    }

}
