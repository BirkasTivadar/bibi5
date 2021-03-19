package defaultconstructor.date;

public class SimpleDate {

    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(int year, int month, int day) {
        if (!checkDate(year, month, day)) {
            throw new IllegalArgumentException(String.format("One or more given parameter cannot be applied! %d, %d, %d", year, month, day));
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    private boolean checkDate(int year, int month, int day) {
        if (year < 1900 || month < 1 || month > 12) {
            return false;
        }
        int numberOfDaysOfMonth = getnumberOfDaysOfMonth(year, month);
        if (day < 1 || day > numberOfDaysOfMonth) {
            return false;
        }
        return true;
    }

    private int getnumberOfDaysOfMonth(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return isLeapYear(year) ? 29 : 28;
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

}
