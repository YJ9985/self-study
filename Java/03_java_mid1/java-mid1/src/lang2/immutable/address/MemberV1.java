package lang2.immutable.address;

import lang2.immutable.address.Address;

public class MemberV1 {
    private String name;
    private Address address;

    public MemberV1(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "MemverV1{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
