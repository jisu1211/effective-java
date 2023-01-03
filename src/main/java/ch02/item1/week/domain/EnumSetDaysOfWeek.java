package ch02.item1.week.domain;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetDaysOfWeek {
    private static final Set<DayOfWeek> daysOfWeek = EnumSet.allOf(DayOfWeek.class);

    public static DayOfWeek findDayOfWeekByNumber(int number) {
        return daysOfWeek.stream()
                .filter(d -> d.matchNumber(number))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
