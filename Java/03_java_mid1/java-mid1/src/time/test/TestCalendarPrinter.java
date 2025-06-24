package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class TestCalendarPrinter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        System.out.print("Enter Month: ");
        int month = sc.nextInt();

        printCalendar(year, month);
    }

    public static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("    ");
        }

        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%4d", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }

    }
}
