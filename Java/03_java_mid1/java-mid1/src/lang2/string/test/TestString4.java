package lang2.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String sub1 = str.substring(0,5);
        String sub2 = str.substring(5);
        System.out.println("filename = " + sub1);
        System.out.println("extName = " + sub2);
    }
}
