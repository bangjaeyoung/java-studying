package chapter2.ch16;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        System.out.println(Employee.serialNum); // static 변수는 클래스 이름을 참조해서 쓴다.

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
        Employee.serialNum++;

        System.out.println(Employee.serialNum);               // 결과값 1001
        System.out.println(Employee.serialNum);              // 결과값 1001
        // 두 개의 인스턴스가 하나의 메모리를 공유하는 걸 알 수 있다. (static 변수)

        //지역 변수 employeeLee, employeeKim은 스택 메모리에 저장된다.
        //이것들로 인해서 참조되는 인스턴스(employeeLee.~, employeeKim.~)는 힙 메모리(동적 메모리)에 저장, 다 쓰면 소멸된다.
        //employeeLee, employeeKim이 참조할 수 있는 static 변수는 공유 메모리에 저장된다.
        //static 변수는 클래스 이름으로 참조해서 쓴다.
    }
}