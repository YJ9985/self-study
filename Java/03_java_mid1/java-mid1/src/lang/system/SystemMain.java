package lang.system;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간을 가져온다
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        long currentTimeNanos = System.nanoTime();
        System.out.println("currentTimeNanos = " + currentTimeNanos);

        // 환경 변수 (운영체제가 사용)
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성 읽기 (자바가 사용)
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version"));

        // 배열을 고속으로 복사
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // 배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("copiedArray.toString = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0); // 이후의 내용은 출력되지 않는다
        System.out.println("hello");
    }
}
