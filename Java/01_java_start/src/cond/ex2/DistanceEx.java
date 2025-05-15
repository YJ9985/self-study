package cond.ex2;

import java.util.Scanner;

public class DistanceEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("distance : ");
        int distance = sc.nextInt();

        String vechicle;

        if (distance <= 1) {
            vechicle = "your leg";
        } else if (distance <= 10) {
            vechicle = "bicycle";
        } else if (distance <= 100) {
            vechicle = "car";
        } else {
            vechicle = "airplane";
        }

        System.out.println("Use " + vechicle);
    }
}
