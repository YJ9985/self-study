package lang2.string;

public class StringEqualsMain {
    public static void main(String[] args) {
        String string = new String("hello");
        String string1 = new String("hello");
        System.out.println("==: " + (string == string1));
        System.out.println("equals: " + (string.equals(string1)));

        String str2 = "hello";
        String str3 = "hello";
        System.out.println("==: " + (str2 == str3));
        System.out.println("equals: " + (str2.equals(str3)));
    }
}
