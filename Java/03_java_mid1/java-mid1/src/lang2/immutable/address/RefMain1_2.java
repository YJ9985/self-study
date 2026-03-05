package lang2.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        Address seoul = new Address("Seoul");
        Address busan = new Address("Seoul");
        System.out.println("seoul = " + seoul);
        System.out.println("busan = " + busan);

        busan.setValue("Busan");
        System.out.println("Busan -> busan");
        System.out.println("seoul = " + seoul);
        System.out.println("busan = " + busan);
    }
}
