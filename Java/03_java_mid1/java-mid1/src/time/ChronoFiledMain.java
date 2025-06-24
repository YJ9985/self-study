package time;

import java.time.temporal.ChronoField;

public class ChronoFiledMain {

    public static void main(String[] args) {
        ChronoField[] values = ChronoField.values();
        for (ChronoField value : values) {
            System.out.println(value + ", range = " + value.range());
        }
    }

}
