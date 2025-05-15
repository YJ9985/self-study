package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BidgData bidgData = new BidgData();
        System.out.println("bigData.count = " + bidgData.count);
        System.out.println("bigData.data = " + bidgData.data);

        //NullPointerException
        System.out.println("bigData.data.value = " + bidgData.data.value);
    }
}
