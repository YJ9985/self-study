package lang2.wrapper.test;

import static java.lang.Integer.valueOf;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer i1 = valueOf(str);
        System.out.println("i1 = " + i1);

        int i2 = i1.intValue();
        System.out.println("i2 = " + i2);
    }
}
