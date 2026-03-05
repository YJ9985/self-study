package lang2.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        Integer integerObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("i = " + i);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("=============");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);
        double doubleValue = doubleObj.doubleValue();
        System.out.println("doubleValue = " + doubleValue);

        System.out.println("=======compare=========");
        System.out.println("==: " + (i == integerObj));
        System.out.println("equals: " + (i.equals(integerObj)));
    }
}
