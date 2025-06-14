package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append("!");
        sb.append("!");
        sb.append("Java!!");

        System.out.println("sb = " + sb);

        sb.insert(4, "New");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
