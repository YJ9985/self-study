package enumeration.ex3;

public class ClassGrade3_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // enum은 생성 불가
//        Grade grade = new Grade();
//        int result = discountService.discount(grade, price);
//        System.out.println(result);
    }
}
