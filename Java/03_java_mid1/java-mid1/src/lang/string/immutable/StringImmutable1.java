package lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        //String 객체는 불변이다.
        String newStr = str.concat(" world");
        System.out.println("str = " + str);
        System.out.println("newStr = " + newStr);
    }
}
