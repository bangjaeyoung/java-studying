package ch15;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buyer = customer;
        // 상위 클래스 Buy로 묵시적으로 업캐스팅 ( 형 변환 )

        buyer.buy();
        buyer.order();

        Buy seller = customer;
        // 상위 클래스 Sell로 묵시적으로 업캐스팅 ( 형 변환 )

        seller.buy();
        seller.order();
    }
    // 어떤 인터페이스를 오픈하느냐에 따라 그 오픈된 인터페이스만의 메서드만 쓸 수 있고, 아니라면 모든 메서드를 사용할 수 있다.
    // = 어떤 인터페이스를 선언해주느냐에 따라서 그에 한정된 메서드만 사용할 수 있다.
}
