package lang2.immutable.address;

public class ImmutableAddress {
    private final String value; //불변 객체 생성

    // 값을 변경할 수 있는 함수가 없음. 따라서 생성자를 통해서만 값 설정 가능
    // 이후 값 변경 불가능

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
