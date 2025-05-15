package final1;

public class FieldInit {
    static final int CONST_VALUE = 10; //static final이 붙으면 대문자로 씀
    final int value = 10;

    //final 변수 초기화 한 경우에는 생성자를 통해서도 초기화가 불가능하다.
//    public FieldInt(int value) {
//        this.value = value;
//    }
}
