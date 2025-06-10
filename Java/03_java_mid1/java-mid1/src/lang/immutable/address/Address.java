package lang.immutable.address;

public class Address {

    private String value;

    public Address(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }

    public static class PrimitiveMain {
        public static void main(String[] args) {
            // 기본형은 절대로 같은 값을 공유하지 않는다
            int a = 10;
            int b = a;
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            b = 20;
            System.out.println("20 -> b");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

        }
    }
}
