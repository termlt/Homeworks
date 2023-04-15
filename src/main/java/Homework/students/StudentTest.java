package Homework.students;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        student.setId(0);
        student.setAge(15);
        student.setName("aa");
        student.setSurname("adwd");

        Student student1 = new Student(1,10,"A", "B");

        System.out.println(student);
        System.out.println(student1);

        student1.print();
    }
}
