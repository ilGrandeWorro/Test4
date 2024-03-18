package src;

import org.junit.Test;
import src.Main;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MainTest {
    private String testDate = "2023-03-01T13:00:00Z";

    @Test
    public void testGetOffsetDateTimeParse() {
        OffsetDateTime expectedDate = OffsetDateTime.parse(testDate);
        OffsetDateTime actualDate = Main.getOffsetDateTimeParse(testDate);
        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void testGetOffsetDateTimeParseInvalid() {
        String invalidData = "invalid";
        assertThrows(DateTimeException.class, () -> Main.getOffsetDateTimeParse(invalidData));
    }


    @Test
    public void testGetYearFromDate() {
        int expectedYear = OffsetDateTime.parse(testDate).getYear();
        int actualYear = Main.getYearFromDate(testDate);
        assertEquals(expectedYear,actualYear);
    }

    @Test
    public void testGetMonthFromDate() {
        Month expectedMonth = OffsetDateTime.parse(testDate).getMonth();
        Month actualMonth = Main.getMonthFromDate(testDate);
        assertEquals(expectedMonth,actualMonth);
    }

    @Test
    public void testGetDayOfTheMonthFromDate() {
        int expectedDay = OffsetDateTime.parse(testDate).getDayOfMonth();
        int actualDay = Main.getDayOfTheMonthFromDate(testDate);
        assertEquals(expectedDay,actualDay);
    }

    @Test
    public void testGetDayOfTheWeekFromDate() {
        DayOfWeek expectedDay = OffsetDateTime.parse(testDate).getDayOfWeek();
        DayOfWeek actualDay = Main.getDayOfTheWeekFromDate(testDate);
        assertEquals(expectedDay,actualDay);
    }
}