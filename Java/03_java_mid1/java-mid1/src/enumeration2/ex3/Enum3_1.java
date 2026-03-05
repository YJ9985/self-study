package enumeration2.ex3;

import java.util.ArrayList;
import java.util.List;

public class Enum3_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("BASIC discount = " + basic);
        System.out.println("gold discount = " + gold);
        System.out.println("diamond discount = " + diamond);

    }
}
