package lang2.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception{
        Class helloClass = Class.forName("lang2.clazz.Hello");
        Hello hello = (Hello)helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
