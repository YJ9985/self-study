package enumeration2.ex3;

public class DiscountService {
    public int discount(Grade grade, int price) {
        int discountPrice = 0;

        if (grade == Grade.BASIC) {
            discountPrice = 10;
        } else if (grade == Grade.GOLD) {
            discountPrice = 20;
        } else if (grade == Grade.DIAMOND) {
            discountPrice = 30;
        } else {
            System.out.println("No Discount");
        }

        return price * discountPrice / 100;
    }
}
