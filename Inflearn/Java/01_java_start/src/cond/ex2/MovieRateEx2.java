package cond.ex2;

import java.util.Scanner;

public class MovieRateEx2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Target rate : ");
        double rate = sc.nextDouble();
        String movie = "";

        if (rate <= 7) {
            movie = "Godzilla";
            System.out.println("Recommend " + movie);
        } else if (rate <= 8) {
            movie = "Toy Story";
            System.out.println("Recommend " + movie);
        } else if (rate <= 9) {
            movie = "About Time";
            System.out.println("Recommend " + movie);
        }

    }
}
