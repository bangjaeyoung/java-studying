package chapter2.ch07;

public class StudentInfo {

    public String studentName;
    public String studentCode;
    public String studentNumber;

    public StudentInfo(String studentName, String studentCode, String studentNumber) {

    this.studentName = studentName;
    this.studentCode = studentCode;
    this.studentNumber = studentNumber;

    }

    public String showStudentInfo() {

        return studentName + " " + studentCode + " " + studentNumber;
    }
}