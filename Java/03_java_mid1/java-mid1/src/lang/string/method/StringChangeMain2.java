package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String str = "Hello World! It's Java World";

        System.out.println("인덱서 7부터 부분 문자열: " + str.substring(7));
        System.out.println("인덱서 7부터 12까지 부분 문자열: " + str.substring(7, 12));

        System.out.println("문자열 결합: "+ str.concat("!!!"));
        System.out.println("'Java'를 'Python'으로 대체: " + str.replace("Java", "Python"));
        System.out.println("첫 번째 'World'를 'Java'로 대체: " + str.replaceFirst("World", "Java"));
    }
}
