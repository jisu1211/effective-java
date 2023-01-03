package ch02.item1.week.domain;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDaysOfWeek {
    private static final Map<DayOfWeek, String> daysOfWeek = new EnumMap<>(DayOfWeek.class);

    static {
        daysOfWeek.put(DayOfWeek.MONDAY, "월요일");
        daysOfWeek.put(DayOfWeek.TUESDAY, "화요일");
        daysOfWeek.put(DayOfWeek.WEDNESDAY, "수요일");
        daysOfWeek.put(DayOfWeek.THURSDAY, "목요일");
        daysOfWeek.put(DayOfWeek.FRIDAY, "금요일");
        daysOfWeek.put(DayOfWeek.SATURDAY, "토요일");
        daysOfWeek.put(DayOfWeek.SUNDAY, "일요일");
    }

    public static String findName(DayOfWeek dayOfWeek) {
        return daysOfWeek.keySet().stream()
                .filter(d -> d == dayOfWeek)
                .findFirst()
                .map(d -> daysOfWeek.get(d))
                .orElseThrow(IllegalArgumentException::new);
    }
}
