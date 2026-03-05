package lang2.wrapper;

public class WrapperVSPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000;
        long startTime, endTime;

        // primitive
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Sum primitive : " + sumPrimitive);
        System.out.println("Primitive Total time : " + (endTime - startTime));

        // Wrapper
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Sum Wrapper : " + sumWrapper);
        System.out.println("Wrapper Total time : " + (endTime - startTime));
    }
}
