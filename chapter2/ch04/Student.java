package chapter2.ch04;

public class Student {

    public int studentID;
    public String studentName;
    public String address;
    public String getStudentName;

    public void showStudentInfo() {
  
        System.out.println("학생 ID는 " + studentID + " 이고, 이름은 " + studentName + " 이고, 주소는 " + address + " 이다.");
  
    }
    
    public void setStudentName(String name) {

        studentName = name;

    }

    public String getStudentName() {

        return studentName;

    }
}