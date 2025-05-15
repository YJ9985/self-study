package extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a) {
        //super(); //상속받을 ClassA를 위한 기본 생성자. 생략 가능
        this(a, 20);
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 a = " + a + ", b = " + b);
    }
}
