package enumeration2.ref3;

public class EnumRefMain3_3 {
    public static void main(String[] args) {
        int price = 10000;
        priceDiscount(Grade.BASIC, price);
        priceDiscount(Grade.GOLD, price);
        priceDiscount(Grade.DIAMOND, price);
    }

    private static void priceDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " grade discount price: " + grade.disocunt(price));
    }
}
