package time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime ofTime = LocalTime.of(23, 59, 59);

        System.out.println("현재 시간 : " + now);
        System.out.println("지정 시간 : " + ofTime);

        // 계산(불변)
        LocalTime ofTimePlus = ofTime.plusSeconds(1);
        System.out.println("지정시간 + 1초 : " + ofTimePlus);
    }
}
