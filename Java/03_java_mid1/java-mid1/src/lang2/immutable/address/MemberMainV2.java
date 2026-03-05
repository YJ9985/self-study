package lang2.immutable.address;

import lang.immutable.address.MemberV1;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress seoul = new ImmutableAddress("Seoul");
        MemberV2 a = new MemberV2("A", seoul);
        MemberV2 b = new MemberV2("B", seoul);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setAddress(new ImmutableAddress("Busan"));
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
