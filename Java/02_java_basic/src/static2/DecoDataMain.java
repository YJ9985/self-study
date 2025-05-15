package static2;

import static static2.DecoData.*;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall(); //import static을 해서 DecoData 생략가능
        DecoData.staticCall(); //위와 동일한 코드임

        System.out.println("2. 인스턴스 호출1");
        DecoData decoData = new DecoData();
        decoData.instanceCall();

        System.out.println("3. 인스턴스 호출 2");
        DecoData decoData2 = new DecoData();
        decoData2.instanceCall();

        staticCall(decoData);

        //추가
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();

        //클래스를 통한 접근
        staticCall();
    }

}
