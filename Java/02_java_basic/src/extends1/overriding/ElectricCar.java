package extends1.overriding;

public class ElectricCar extends Car{

    //Override 없어도 동작하지만, 무조건 작성함.
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다");
    }

    public void charge() {
        System.out.println("충전합니다");
    }
}
