package chapter2.ch09;

public class Student {

    int studentID;
    String studentName;

    Subject science = new Subject();
    Subject math = new Subject();

    Student (int studentID, String studentName) {

        this.studentID = studentID;
        this.studentName = studentName;

    }
    
    public void setScienceSubject(String name, int score) {

        science.subjectName = name;
        science.score = score;

    }

    public void setMathSubject(String name, int score) {

        math.subjectName = name;
        math.score = score;

    }

    public void showScoreInfo() {

        int total = science.score + math.score;
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");

    }
}
