package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    List<SimpleTime> timeTable = new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        for (int hour = firstHour; hour <= lastHour; hour++) {
            timeTable.add(new SimpleTime(hour, everyMinute));
        }
    }

    public List<SimpleTime> getTimeTable() {
        return timeTable;
    }

    public SimpleTime nextBus(SimpleTime actual) {
        SimpleTime next = null;
        int minDiff = Integer.MAX_VALUE;
        for (SimpleTime time : timeTable) {
            int diff = time.difference(actual);
            if (diff > 0 && diff < minDiff) {
                next = time;
                minDiff = diff;
            }
        }
        if (next == null) {
            throw new IllegalStateException("No more buses today!");
        }
        return next;
    }
}
