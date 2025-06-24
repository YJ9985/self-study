package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {

    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId = " + zoneId);

        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println("nowOdt = " + nowOdt);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println("ldt = " + ldt);

        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+08:00"));
        System.out.println("odt = " + odt);
    }
}
