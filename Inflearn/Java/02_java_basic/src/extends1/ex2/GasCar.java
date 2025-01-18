package extends1.ex2;

public class GasCar extends Car{
    //extends: 화살표 방향 ->
    //GasCar -> Car , GasCar가 Car의 기능을 상속받음

    public void fillUp() {
        System.out.println("기름을 주유합니다");
    }
}
