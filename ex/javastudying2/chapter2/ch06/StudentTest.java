package chapter2.ch06;

public class StudentTest {

    public static void main(String[] args) {

        Student studentLee = new Student();

        studentLee.studentNumber = 123;
        studentLee.studentName = "Lee";
        studentLee.grade = 3;
        
        System.out.println(studentLee.showStudentInfo());

        Student studentKim = new Student(12345, "Kim", 3);

        System.out.println(studentKim.showStudentInfo());

    }
    
}
