package enumeration2.test;

import enumeration2.ex3.Grade;

import java.io.*;

public class AuthGradeMain2 {
    public static void main(String[] args) throws IOException{
        System.out.println("Write down your grade[GUEST, LOGIN, ADMIN]: " );
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine(); //  입력받은 등급

        AuthGrade grade = AuthGrade.valueOf(input.toUpperCase());
        System.out.println("Your grade is : " + grade.getDescription());
        System.out.println("== MENU ==");
        System.out.println("MAIN PAGE");
        if (grade == AuthGrade.LOGIN) {
            System.out.println("- Email PAGE");
        } if (grade == AuthGrade.ADMIN) {
            System.out.println("- Admin PAGE");
        }

    }
}
