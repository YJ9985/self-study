package lang2.string.method;

public class StringChangeMethod2 {
    public static void main(String[] args) {
        String strWithSpaces = "   Java Programming   ";
        System.out.println("to Lower: " + strWithSpaces.toLowerCase());
        System.out.println("to Upper: " + strWithSpaces.toUpperCase());
        System.out.println("trim: " + "'" + strWithSpaces.trim() + "'");
        System.out.println("strip: " + "'" + strWithSpaces.strip() + "'");
        System.out.println("strip front: " + "'" + strWithSpaces.stripLeading() + "'");
        System.out.println("strip back: " + "'" + strWithSpaces.stripTrailing() + "'");
    }
}
