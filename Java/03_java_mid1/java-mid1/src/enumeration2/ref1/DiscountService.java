package enumeration2.ref1;

public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {
        return price * classGrade.discountPercent() / 100;
    }
}
