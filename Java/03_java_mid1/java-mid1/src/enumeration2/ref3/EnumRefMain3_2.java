package enumeration2.ref3;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;
        System.out.println("basic = " + Grade.BASIC.disocunt(price));
        System.out.println("gold = " + Grade.GOLD.disocunt(price));
        System.out.println("diamond = " + Grade.DIAMOND.disocunt(price));
    }
}
