package lang2.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple, Banana, Orange";

        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }


    }
}
