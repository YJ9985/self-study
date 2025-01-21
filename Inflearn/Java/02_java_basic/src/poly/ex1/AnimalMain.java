package poly.ex1;

public class AnimalMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cow cow = new Cow();
        Cat cat = new Cat();

        soundDog(dog);

        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void soundDog(Dog dog) {
        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
