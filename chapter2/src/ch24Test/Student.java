package ch24Test;

import java.util.ArrayList;

public class Student {

    int studentNum;
    String name;

    ArrayList<Subject> subjectList;

    Student (int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();

        subject.setName(name);
        subject.setScore(score);
        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;

        for(Subject subject : subjectList) {

            total += subject.getScore();
            System.out.println("학생 " + name + "의 " + subject.getName() + "과목 성적은 " + subject.getScore() + "점입니다.");
        }

        System.out.println("학생 " + name + "의 총점은 " + total + "점입니다.");
    }
}
