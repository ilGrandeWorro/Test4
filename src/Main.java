package src;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        String date = "2023-03-01T13:00:00Z";
        System.out.println(getOffsetDateTimeParse(date));
        System.out.println(getYearFromDate(date));
        System.out.println(getMonthFromDate(date));
        System.out.println(getDayOfTheMonthFromDate(date));
        System.out.println(getDayOfTheWeekFromDate(date));
    }

    public static OffsetDateTime getOffsetDateTimeParse(String date) {
        return OffsetDateTime.parse(date);
    }

    public static int getYearFromDate(String date) {
        return getOffsetDateTimeParse(date).getYear();
    }

    public static Month getMonthFromDate(String date) {
        return getOffsetDateTimeParse(date).getMonth();
    }

    public static int getDayOfTheMonthFromDate(String date) {
        return getOffsetDateTimeParse(date).getDayOfMonth();
    }

    public static DayOfWeek getDayOfTheWeekFromDate(String date) {
        return getOffsetDateTimeParse(date).getDayOfWeek();
    }
}
