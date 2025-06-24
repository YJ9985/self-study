package time.test;

import java.time.LocalDateTime;

public class TestPlus {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.of(2024, 1, 1, 00, 00, 00);
        System.out.println("now = " + now);
        LocalDateTime future = now.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("future = " + future);
    }
}
