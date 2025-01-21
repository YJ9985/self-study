package cond.ex2;

import java.util.Scanner;

public class ExchangeRateEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dollar: ");

        int dollar = sc.nextInt();
        int exchangeRate = 1300;

        if (dollar < 0) {
            System.out.println("Wrong amount");
        } else if (dollar == 0) {
            System.out.println("No money to exchange");
        } else {
            System.out.println("Exchange amount is " + dollar * exchangeRate);
        }
    }
}
