package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //MathArrayUtils 인스턴스 생성 하지 못 하도록 막음
    }

    static int sum(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static double average(int[] array) {
        int sum = sum(array);
        double average = (double) sum / array.length;
        return average;
    }

    static int min(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    static int max(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }
}
