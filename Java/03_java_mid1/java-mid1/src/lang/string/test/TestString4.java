package lang.string.test;

public class TestString4 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String filename = str.substring(0, 5);
        String extName = str.substring(5, str.length());

        System.out.println("filename: " + filename + ", extName: " + extName);
    }
}
