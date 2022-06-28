package chapter2.ch17;

public class Employee {

    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String employeeDepartment;

    public Employee () {
        employeeId = serialNum;
        serialNum++;
    }

    public static int getSerialNum() {
        return serialNum;
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

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }
    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }
}