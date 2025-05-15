package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        super(10, 20); //기본 생성자가 있으므로 무조건 정의해줘야 함
        System.out.println("ClassC 생성자");

    }
}
