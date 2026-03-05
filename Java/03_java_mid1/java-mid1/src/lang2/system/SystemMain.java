package lang2.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("Current time Millis: " + currentTimeMillis);

        long currentTimeNano = System.nanoTime();
        System.out.println("Current time Nanos: " + currentTimeNano);

        System.out.println("getenv = " + System.getenv());
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version"));

        char[] originalArray = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] copyArray = new char[originalArray.length];
        System.arraycopy(originalArray, 0, copyArray, 0, originalArray.length);

        System.out.println("copyArray = " + Arrays.toString(copyArray));
        System.out.println("Arrays.toString = " + Arrays.toString(copyArray));

        System.exit(0);
    }
}
