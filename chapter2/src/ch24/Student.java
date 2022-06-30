package ch24;

import java.util.ArrayList;
public class Student {

    int studentNum;
    String studentName;

    ArrayList<Subject> subjectList;
    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int score) {

        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);

        subjectList.add(subject);
    }

    public void showScoreInfo() {

        int total = 0;

        for(Subject subject : subjectList) {

            total += subject.getScore();
            System.out.println(studentName + "학생의 " + subject.getName() + "과목 성적은 " + subject.getScore() + "점입니다.");
        }
        System.out.println(studentName + "학생의 총 성적의 합계는 " + total + "점입니다.");
    }
}