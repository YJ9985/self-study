package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple, Banana, Orange";

        //split
        String[] split = str.split(", ");
        for (String s : split) {
            System.out.println(s);
        }

        String joinStr = "";
        for (int i = 0; i < split.length; i++) {
            String string = split[i];
            joinStr += string;
            if (i != split.length - 1) {
                joinStr += "-";
            }
        }

        System.out.println(joinStr);

        //join
        String joinedStr = String.join("-", split);
        System.out.println(joinedStr);
    }
}
