package lang2.immutable.test;

public class MyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2026, 01, 27);
        ImmutableMyDate date2 = date1;
        System.out.println("date1: " + date1);
        System.out.println("date2: " + date2);

        System.out.println("2027 -> date2");
        date1 = date1.setYear(2027);
        System.out.println("date1: " + date1);
        System.out.println("date2: " + date2);
    }
}
