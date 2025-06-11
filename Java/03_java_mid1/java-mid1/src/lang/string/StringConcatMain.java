package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = "world";

        String result = a.concat(b);
        String reuslt2 = a + b;

        System.out.println("result = " + result);
        System.out.println("reuslt2 = " + reuslt2);
    }
}
