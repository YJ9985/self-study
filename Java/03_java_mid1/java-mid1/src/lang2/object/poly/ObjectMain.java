package lang2.object.poly;

import lang2.Child;
import lang2.Parent;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        Parent parent = new Parent();
        parent.parentMethod();

        String string = child.toString();
        System.out.println(string);
    }
}
