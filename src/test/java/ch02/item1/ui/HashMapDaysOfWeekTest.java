package ch02.item1.ui;

import ch02.item1.week.domain.DayOfWeek;
import ch02.item1.week.domain.EnumMapDaysOfWeek;
import ch02.item1.week.domain.HashMapDaysOfWeek;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("HashMap 일급 컬렉션 테스트")
class HashMapDaysOfWeekTest {

    @DisplayName("DayOfWeek과 일치하는 요일명을 찾는다.")
    @ParameterizedTest
    @CsvSource(value = { "MONDAY:월요일", "TUESDAY:화요일", "WEDNESDAY:수요일", "THURSDAY:목요일",
            "FRIDAY:금요일", "SATURDAY:토요일", "SUNDAY:일요일" }, delimiter = ':')
    void findName(DayOfWeek dayOfWeek, String expected) {
        assertEquals(expected, HashMapDaysOfWeek.findName(dayOfWeek));
    }
}
