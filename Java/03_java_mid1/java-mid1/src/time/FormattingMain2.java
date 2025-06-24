package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {

    public static void main(String[] args) {
        // Formatting: Date, Time -> String
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Format date and time is " + formattedDateTime);

        // Parsing: String -> Date, Time
        String dateTimeString = "2030-01-01 11:30:49";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("Parse date and time is " + parsedDateTime);
    }
}
