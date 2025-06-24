package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2020, 12, 31);
        System.out.println("startDate = " + startDate);
        System.out.println("endDate = " + endDate);

        Period period = Period.between(startDate, endDate);
        long days = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Left Period = " + period.getYears() + "Years " + period.getMonths() + "Months " + period.getDays() + "Days");
        System.out.println("D-DAY = " + days + "Days");
    }
}
