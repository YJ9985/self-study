package lang2.string.test;

public class TestString1 {
    public static void main(String[] args) {
        String url = "https://url.com";

        boolean answer = url.startsWith("https");

        System.out.println("answer: " + answer);
    }
}
