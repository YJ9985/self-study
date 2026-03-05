package lang2.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception{
        Class clazz = String.class;
//        Class clazz = new String().getClass();
//        Class clazz = Class.forName("java.lang.String");

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field: " + field.getType() + " " + field.getName());
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method);
        }

        Class[] interfaces = clazz.getInterfaces();
        for (Class inter : interfaces) {
            System.out.println("Interface: " + inter.getName());
        }

    }
}
