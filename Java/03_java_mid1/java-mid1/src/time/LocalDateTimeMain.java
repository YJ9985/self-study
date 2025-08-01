package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("현재 날짜시간: " + nowDt);
        System.out.println("지정 날짜시간: " + ofDt);

        // 날짜와 시간 분리
        LocalDate localDate = nowDt.toLocalDate();
        LocalTime localTime = nowDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        // 계산(불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(100);
        System.out.println("지정 날짜시간 + 100일 = " + ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println("지정 날짜시간 + 1년 = " + ofDtPlus1Year);

        // 비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " + LocalDateTime.now().isBefore(ofDtPlus));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? " + LocalDateTime.now().isAfter(ofDtPlus));
        System.out.println("현재 날짜시간이 지정 날짜시간과 같은가? " + LocalDateTime.now().isEqual(ofDtPlus));
    }
}
