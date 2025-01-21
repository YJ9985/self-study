package cond.ex2;

import java.util.Scanner;

public class GradeSwitchEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade: ");
        String grade = sc.nextLine();

        switch (grade) {
            case "A":
                System.out.println("Brilliant!");
                break;
            case "B":
                System.out.println("Great!");
                break;
            case "C":
                System.out.println("Good.");
                break;
            case "D":
                System.out.println("Need more work");
                break;
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Not a valid grade");
        }
    }
}
