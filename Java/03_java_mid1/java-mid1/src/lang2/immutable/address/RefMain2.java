package lang2.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress seoul = new ImmutableAddress("Seoul");
        ImmutableAddress seoul2 = seoul;
        System.out.println("seoul = " + seoul);
        System.out.println("seoul2 = " + seoul2);

        seoul2 = new ImmutableAddress("Busan");
        System.out.println("Busan -> seoul2");
        System.out.println("seoul = " + seoul);
        System.out.println("seoul2 = " + seoul2);
    }
}
