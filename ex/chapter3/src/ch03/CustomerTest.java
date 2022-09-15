package ch03;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;

        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;

        System.out.println(customerKim.showCustomerInfo()); // 상속을 받았기 때문에, Customer 클래스의 메서드 사용 가능하다.

        Customer vc = new VIPCustomer(12345, "noname");  // 하위 클래스로 생성은 했지만, 상위 클래스로 형 변환 가능하다. 업 캐스팅

        vc.bonusRatio = 0.2; // 형이 상위 클래스이기 때문에, agentID와 같은 하위 클래스의 변수는 사용 못한다. 다운 캐스팅 필요
    }
}