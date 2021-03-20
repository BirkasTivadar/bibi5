package constructoroverloading.bus;

public class SimpleTime {
    private int hours;
    private int minutes;

    public SimpleTime(int hours) {
        this.hours = hours;
    }

    public SimpleTime(int hours, int minutes) {
        this(hours);
        this.minutes = minutes;
    }

    public SimpleTime(SimpleTime time) {
        this(time.hours, time.minutes);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    private int getTimeInMinutes() {
        return hours * 60 + minutes;
    }

    public int difference(SimpleTime time) {
        return this.getTimeInMinutes() - time.getTimeInMinutes();
    }

    @Override
    public String toString() {
        return String.format("%d:%d", hours, minutes);
    }
}
