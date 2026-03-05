package lang2.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        Address seoul = new Address("Seoul");
        Address b = seoul;
        System.out.println("seoul = " + seoul);
        System.out.println("b = " + b);

        b.setValue("Busan");
        System.out.println("Busan -> b");
        System.out.println("seoul = " + seoul); // Busan
        System.out.println("b = " + b);
    }
}
