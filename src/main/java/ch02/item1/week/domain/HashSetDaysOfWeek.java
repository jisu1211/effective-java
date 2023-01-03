package ch02.item1.week.domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDaysOfWeek {
    private static final Set<DayOfWeek> daysOfWeek = new HashSet<>();

    static {
        daysOfWeek.addAll(Arrays.asList(DayOfWeek.values()));
    }

    public static DayOfWeek findDayOfWeekByNumber(int number) {
        return daysOfWeek.stream()
                .filter(d -> d.matchNumber(number))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
