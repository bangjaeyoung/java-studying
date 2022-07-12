package chapter2.ch16test;

public class Employee {

    public static int serialNum = 1000;

    private int employeeId;
    private String employeeName;

    public Employee () {
        employeeId = serialNum;
        serialNum++;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}