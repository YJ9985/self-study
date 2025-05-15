package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요: ");
        int count = sc.nextInt();
        sc.nextLine();
        ProductOrder[] productOrders = new ProductOrder[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            System.out.println("상품명: ");
            String productName = sc.nextLine();
            System.out.println(", 가격: ");
            int price = sc.nextInt();
            System.out.println(", 수량: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            productOrders[i] = creatOrder(productName, price, quantity);
        }

        printOrders(productOrders);
        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액: " + totalAmount);

    }

    static ProductOrder creatOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] productOrders) {
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + "가격: " + productOrder.price + "수량: " + productOrder.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] productOrders) {
        int sum = 0;
        for (ProductOrder productOrder : productOrders) {
            sum += productOrder.price * productOrder.quantity;
        }
        return sum;
    }

}
