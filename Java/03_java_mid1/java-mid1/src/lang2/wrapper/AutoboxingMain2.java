package lang2.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        int value = 7;
        Integer boxedValue = value; // autoboxing

        int unboxedValue = boxedValue; // autounboxking

        System.out.println("boxedValue: " + boxedValue);
        System.out.println("unboxedValue: " + unboxedValue);
    }
}
