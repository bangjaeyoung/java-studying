package chapter2.ch17;

public class EmployeeTest {

    public static void main(String[] args) {

        System.out.println(Employee.getSerialNum());
        // static 변수는 클래스 이름으로 참조한다.

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");
 
        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId());
    }
}