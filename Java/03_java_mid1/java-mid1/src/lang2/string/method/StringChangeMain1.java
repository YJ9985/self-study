package lang2.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java.";

        System.out.println("from index 7: " + str.substring(7));
        System.out.println("from index 7 to 12: " +  str.substring(7, 12));
        System.out.println("connect: " + str.concat("!!!"));
        System.out.println("replace Java to World: " + str.replace("Java", "World"));
        System.out.println("replace First Java to World: " + str.replaceFirst("Java", "World"));
        System.out.println("str: " + str);
    }
}
