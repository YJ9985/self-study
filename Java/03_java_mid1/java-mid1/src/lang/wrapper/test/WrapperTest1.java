package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int num1 = Integer.valueOf(str1);
        int num2 = Integer.valueOf(str2);
        int result = num1 + num2;
        System.out.println("두 수의 합: " + result);
    }
}
