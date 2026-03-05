package lang2.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj immutableObj = new ImmutableObj(10);
        immutableObj.add(20);

        System.out.println("immutableObj: " + immutableObj.getValue());
    }
}
