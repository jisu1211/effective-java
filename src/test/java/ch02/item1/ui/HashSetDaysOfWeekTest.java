package ch02.item1.ui;

import ch02.item1.week.domain.DayOfWeek;
import ch02.item1.week.domain.EnumSetDaysOfWeek;
import ch02.item1.week.domain.HashSetDaysOfWeek;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("HashSet 일급 컬렉션 테스트")
class HashSetDaysOfWeekTest {

    @DisplayName("입력된 숫자 값과 일치하는 DayOfWeek을 찾는다.")
    @ParameterizedTest
    @CsvSource(value = { "0:MONDAY", "1:TUESDAY", "2:WEDNESDAY", "3:THURSDAY", "4:FRIDAY",
            "5:SATURDAY", "6:SUNDAY" }, delimiter = ':')
    void findDayOfWeekByNumber(int number, DayOfWeek expected) {
        assertEquals(expected, HashSetDaysOfWeek.findDayOfWeekByNumber(number));
    }
}
