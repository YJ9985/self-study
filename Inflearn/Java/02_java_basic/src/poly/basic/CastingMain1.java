package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //단 자식의 기능 호출 불가
        //poly.childMethod();

        //예외: 다운캐스팅(부모 타입 -> 자식 타입 으로 강제 변환)
        Child child = (Child) poly;
        child.childMethod();
    }
}
