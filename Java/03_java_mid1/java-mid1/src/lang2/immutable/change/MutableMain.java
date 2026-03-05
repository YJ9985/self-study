package lang2.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj mutableObj = new MutableObj(10);
        mutableObj.add(10);
        System.out.println("mutableObj = " + mutableObj.getValue());

    }
}
