package ch02.item1.week.ui;

import ch02.item1.week.domain.DayOfWeek;
import ch02.item1.week.domain.EnumMapDaysOfWeek;
import ch02.item1.week.domain.EnumSetDaysOfWeek;
import ch02.item1.week.domain.HashSetDaysOfWeek;

public class WeekMain {
    public static void main(String args[]) {
        measureRunningTimeOfHashMap();
        measureRunningTimeOfEnumMap();
        measureRunningTimeOfHashSet();
        measureRunningTimeOfEnumSet();
    }

    public static void measureRunningTimeOfHashMap() {
        long start = System.currentTimeMillis();
        EnumMapDaysOfWeek.findName(DayOfWeek.SATURDAY);
        long end = System.currentTimeMillis();

        System.out.printf("HashMap Running Time: %d ms \n", (end - start));
    }

    public static void measureRunningTimeOfEnumMap() {
        long start = System.currentTimeMillis();
        EnumMapDaysOfWeek.findName(DayOfWeek.SATURDAY);
        long end = System.currentTimeMillis();

        System.out.printf("EnumMap Running Time: %d ms \n", (end - start));
    }

    public static void measureRunningTimeOfHashSet() {
        long start = System.currentTimeMillis();
        HashSetDaysOfWeek.findDayOfWeekByNumber(5);
        long end = System.currentTimeMillis();

        System.out.printf("HashSet Running Time %d ms \n", (end - start));
    }

    public static void measureRunningTimeOfEnumSet() {
        long start = System.currentTimeMillis();
        EnumSetDaysOfWeek.findDayOfWeekByNumber(5);
        long end = System.currentTimeMillis();

        System.out.printf("EnumSet Running Time %d ms \n", (end - start));
    }
}
