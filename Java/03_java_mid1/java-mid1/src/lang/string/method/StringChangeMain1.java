package lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String strWithSpaces = "      Hello Java!    ";

        System.out.println("소문자로 변환: " + strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환: " + strWithSpaces.toUpperCase());

        System.out.println("공백 제거: " + strWithSpaces.trim());
        System.out.println("공백 제거: " + strWithSpaces.strip());
        System.out.println("공백 제거(앞): " + strWithSpaces.stripLeading());
        System.out.println("공백 제거(뒤): " + strWithSpaces.stripTrailing());
    }
}
