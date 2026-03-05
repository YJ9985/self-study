package lang2.string;

public class StringSearchMain {

    public static void main(String[] args) {
        String str = "Hello world, This is a test";
        System.out.println("Is str contains Java: " + str.contains("Java"));
        System.out.println("Index of 'world': " + str.indexOf("world"));
        System.out.println("Index from world to 5: " + str.indexOf("world", 5));
        System.out.println("Last index of world: " + str.lastIndexOf("world"));
    }
}
