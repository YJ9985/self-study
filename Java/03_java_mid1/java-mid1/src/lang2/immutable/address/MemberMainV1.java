package lang2.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address seoul = new Address("Seoul");

        MemberV1 A = new MemberV1("A", seoul);
        MemberV1 B = new MemberV1("B", seoul);

        System.out.println("A: " + A);
        System.out.println("B = " + B);

        B.getAddress().setValue("Busan");
        System.out.println("Busna -> B.address");
        System.out.println("A: " + A);
        System.out.println("B = " + B);
    }
}
