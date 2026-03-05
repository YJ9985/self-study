package lang2.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int str1ToNum = Integer.parseInt(str1);
        int str2ToNum = Integer.parseInt(str2);

        int sum = str1ToNum + str2ToNum;

        System.out.println("두 수의 합: " + sum);
    }
}
