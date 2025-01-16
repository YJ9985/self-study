package access.b;

//import access.a.DefaultClass1;
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        //default -> 다른 패키지에서 접근 불가
        //DefaultClass1 defualtclass1 = new DefualtClass1();
    }
}
