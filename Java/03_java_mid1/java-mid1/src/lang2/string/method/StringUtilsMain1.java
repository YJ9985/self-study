package lang2.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        String numString = String.valueOf(num);
        System.out.println("String value of num: " + numString);
        String boolString = String.valueOf(bool);
        System.out.println("String value of bool: " + boolString);
        String objString = String.valueOf(obj);
        System.out.println("String value of obj: " + objString);
        String numString2 = "" + num;
        System.out.println("Empty String + num: " + numString2);

        char[] strCharArray = str.toCharArray();
        System.out.println("String -> Char: " + strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println();

    }
}
