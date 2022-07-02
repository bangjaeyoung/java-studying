package chapter2.ch17;

public class Employee {

    private static int serialNum = 1000;
    // private으로 static 변수 생성

    private int employeeId;
    private String employeeName;

    public Employee () {
        employeeId = serialNum;
        serialNum++;
    }

    public static int getSerialNum() {
        return serialNum;
    }
    /*public static void setSerialNum(int serialNum) {
        Employee.serialNum = serialNum;
    }*/
    // static 변수는 여러 인스턴스가 공유하고 있는 변수이기에 외부에 의해서 수정이 되면 안되므로, set 메서드는 써주지 않는다.
    
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