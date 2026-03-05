package lang2.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println(format1);

        String format2 = String.format("number: %.2f", 10.234);
        System.out.println(format2);

        System.out.printf("number: %.2f\n", 10.235);

        String regex = "Hello, (Java!|World!)";
        System.out.println("Is 'str' match? " + str.matches(regex));
    }
}


