package lang2.string.test;

import java.util.Arrays;

public class TestString7 {
    public static void main(String[] args) {
        String original = "      HEllo java!";
        System.out.println(original.trim());

        String input = "hello java spring jpa java";
        String replaceInput = input.replace("java", "jvm");
        System.out.println(replaceInput);

        String email = "hello@example.com";
        String[] parts = email.split("@");
        String id = parts[0];
        id = email.split("@")[0];
        String domain = parts[1];
        System.out.println("id = " + id);
        System.out.println("domain = " + domain);

        String fruits = "apple, banana, mango";
        String[] fruit = fruits.split(",");
        System.out.println("fruit = " + Arrays.toString(fruit));
        String joinedString = String.join("->" , fruit);
        System.out.println("joinedString = " + joinedString);
    }
}
