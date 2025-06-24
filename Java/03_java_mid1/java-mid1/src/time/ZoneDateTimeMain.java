package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeMain {

    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("nowZdt = " + nowZdt);

        LocalDateTime localDateTime = LocalDateTime.of(2018, 10, 10, 10, 10);
        System.out.println("localDateTime = " + localDateTime);

        ZonedDateTime zdt1 = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt1 = " + zdt1);

        ZonedDateTime zdt2 = ZonedDateTime.of(2030, 1, 1, 0, 0, 0, 0, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt2 = " + zdt2);

        ZonedDateTime zdt3 = zdt2.withZoneSameInstant(ZoneId.of("Asia/Seoul"));
        System.out.println("zdt3 = " + zdt3);
    }

}
