package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple, banana, mango";
        String[] fruit = fruits.split(", ");
        for (String s : fruit) {
            System.out.println(s);
        }

        String joinedFruit = String.join("-", fruit);
        System.out.println(joinedFruit);
    }
}
