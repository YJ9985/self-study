package lang.object.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args){
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();

        Object[] objects = {dog, car, object};

        size(objects);
    }

    // 모든 객체를 받을 수 있는 메서드
    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: " + objects.length);
    }
}
