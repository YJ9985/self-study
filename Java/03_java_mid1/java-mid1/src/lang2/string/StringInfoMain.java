package lang2.string;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "hello, java";
        System.out.println("length: " + str.length());
        System.out.println("is Empty: " + str.isEmpty());
        System.out.println("is Balnk 1: " + str.isBlank());
        System.out.println("is Blank 2: " + "     ".isBlank());

        char c = str.charAt(7);
        System.out.println("index 6: " + c);
    }
}
