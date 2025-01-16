package ref;

public class Method2 {

    public static void main(String[] args) {
        Student student1 = createStudnet("학생1", 18, 20);
        Student student2 = createStudnet("학생2", 19, 50);

        printStudnet(student1);
        printStudnet(student2);
    }

    static Student createStudnet(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void printStudnet(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
