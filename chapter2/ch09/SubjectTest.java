package chapter2.ch09;

public class SubjectTest {

    public static void main(String[] args) {

        Student studentLee = new Student(100, "Lee");
        studentLee.setScienceSubject("국어", 100);
        studentLee.setMathSubject("수학", 99);

        Student studentKim = new Student(101, "Kim");
        studentKim.setScienceSubject("국어", 30);
        studentKim.setMathSubject("수학", 91);

        studentLee.showScoreInfo();
        studentKim.showScoreInfo();

    }
}