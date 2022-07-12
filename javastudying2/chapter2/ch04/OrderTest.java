package chapter2.ch04;

public class OrderTest {

    public static void main(String[] args) {

             Order clientBang = new Order("Bang", "qkdqkd", 46, 77, 3);
            
            clientBang.showOrderInfo();

              Order clientKim = new Order("Kim", "Keem", 23, 52, 2);
            
            clientKim.showOrderInfo();

            Order clientLee = new Order("Lee", "Lee22", 21, 54, 3);
        
            clientLee.showOrderInfo();

    }
}
// 생성자를 만들고 구현
// 장점 : setClientName 이라는 메서드를 모르는 사용자에게 좋음 ( 이 클래스의 사용자가 사용법을 인지하지 못하고 있고, 그로 인해 반드시 거쳐야하는 일을 생략하지 않도록 도움 )