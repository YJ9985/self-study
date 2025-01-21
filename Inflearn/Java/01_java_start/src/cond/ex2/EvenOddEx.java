package cond.ex2;

import java.util.Scanner;

public class EvenOddEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("x = " + num + ", Even");
        } else {
            System.out.println("x = " + num + ", Odd");
        }

        String result = num % 2 ==0 ? "EVEN" : "ODD";
        System.out.println(result);

    }
}
