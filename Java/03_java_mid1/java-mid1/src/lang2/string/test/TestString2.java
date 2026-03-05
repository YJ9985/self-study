package lang2.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int totalLen = 0;
        for (String s : arr) {
            int len = s.length();
            totalLen += len;
            System.out.println(s + ":" + len);
        }

        System.out.println("sum = " + totalLen);
    }
}
