package poly.ex5;

public class InterfaceMain {

    public static void main(String[] args) {
        //Interface 생성 불가
//        InterfaceAnimal animal = new InterfaceAnimal();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("sound start");
        animal.sound();
        System.out.println("sound end");
    }
}
