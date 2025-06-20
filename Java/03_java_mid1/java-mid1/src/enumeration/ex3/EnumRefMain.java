package enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC : " + Grade.BASIC.getClass());
        System.out.println("class GOLD : " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND : " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC : " + refValue(Grade.BASIC));
        System.out.println("ref GOLD : " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND : " + refValue(Grade.DIAMOND));
    }

    // 객체의 참조값을 숫자로 반환
    private static String refValue(Grade grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
