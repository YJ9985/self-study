package enumeration2.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] grades = AuthGrade.values();
        for (AuthGrade grade : grades) {
            System.out.println("grade = " + grade.name() + ", level = " + grade.getLevel() + ", description = " + grade.getDescription());
        }
    }
}
