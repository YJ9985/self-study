package lang.string.method;

import com.sun.security.jgss.GSSUtil;

public class StringSearchMain {

    public static void main(String[] args) {
        String str = "Hello World. It's Java World";

        System.out.println("str1 contains 'Hello': " + str.contains("Hello"));
        System.out.println("'Java'의 첫 번째 인덱스: " + str.indexOf("Java"));
        System.out.println("인덱스 10부터 'World'의 인덱스: " + str.indexOf("World", 10));
        System.out.println("'World'의 마지막 인덱스: " + str.lastIndexOf("World"));
    }
}
