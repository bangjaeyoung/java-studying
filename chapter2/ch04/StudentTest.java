package chapter2.ch04;

public class StudentTest {
    
    public static void main(String[] args) {

        Student studentLee = new Student();
        studentLee.studentID = 12345;
        studentLee.studentName = "Lee";
        studentLee.address = "서울 강남구";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentID = 54321;
        studentKim.setStudentName("Kim");
        studentKim.address = "경기 성남시";

        studentKim.showStudentInfo();

        Student studentBang = new Student();
        studentBang.studentID = 20184215;
        studentBang.setStudentName("Bang");
        studentBang.address = "인천 연수구";

        studentBang.showStudentInfo();

    }
}
