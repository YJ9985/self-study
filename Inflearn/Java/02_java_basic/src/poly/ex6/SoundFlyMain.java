package poly.ex6;

public class SoundFlyMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        flyAnimal(bird);
        flyAnimal(chicken);

    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("test start");
        animal.sound();
        System.out.println("test end");
    }

    //fly 인터페이스 있으면 사용 가능
    private static void flyAnimal(Fly fly) {
        System.out.println("test start");
        fly.fly();
        System.out.println("test end");
    }
}
