package ch02.item1.domain;

import ch02.item1.week.domain.DayOfWeek;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("요일 Enum 테스트")
class DayOfWeekTest {

    @Test
    void 동일성_테스트() {
        assertTrue(DayOfWeek.MONDAY == DayOfWeek.MONDAY);
    }

}
