package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2025, 6, 18);
        System.out.println("오늘 날짜 : " + date);
        System.out.println("지정 날짜 : " + ofDate);

        // 계산 (불변)
        ofDate = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10일 : " + ofDate);
    }
}
