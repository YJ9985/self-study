package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        //a : 지역변수
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changPrimitive(a);
        System.out.println("메서드 호출 후: a = " + a);
    }

    static void changPrimitive(int x) {
        //x : 지역변수
        x = 20;
    }
}
