package time.test;

import java.time.*;

public class TestZone {

    public static void main(String[] args) {
        ZonedDateTime seoulTime = ZonedDateTime.of(LocalDate.of(2024, 1,1), LocalTime.of(9, 0), ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime nyTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));


        System.out.println("Seoul: " + seoulTime);
        System.out.println("London: " + londonTime);
        System.out.println("Ny: " + nyTime);
    }
}
