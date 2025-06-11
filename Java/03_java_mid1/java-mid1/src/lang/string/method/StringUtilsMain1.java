package lang.string.method;

public class StringUtilsMain1 {

    public static void main(String[] args) {
        int num = 1000;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java";

        //valueOf
        String numStr = String.valueOf(num);
        System.out.println(numStr);
        String boolStr = String.valueOf(bool);
        System.out.println(boolStr);
        String objStr = String.valueOf(obj);
        System.out.println(objStr);

        String numStr2 = "" + num;
        System.out.println(numStr2);

        //toCharArray
        char[] setCharArray = str.toCharArray();
        System.out.println(setCharArray);
        for (char c : setCharArray) {
            System.out.println(c);

        }
    }
}
