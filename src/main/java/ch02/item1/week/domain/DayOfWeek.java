package ch02.item1.week.domain;

public enum DayOfWeek {
    MONDAY(0),
    TUESDAY(1),
    WEDNESDAY(2),
    THURSDAY(3),
    FRIDAY(4),
    SATURDAY(5),
    SUNDAY(6);

    private int number;

    DayOfWeek(int number) {
        this.number = number;
    }

    public boolean matchNumber(int number) {
        return this.number == number;
    }

    public static void printAll() {
        for(DayOfWeek day : values()) {
            System.out.println(day.toString());
        }
    }
}
