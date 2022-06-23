package chapter2.ch04;

public class OrderTest {

    public static void main(String[] args) {

        Order clientBang = new Order();
            
            clientBang.setClientName("Bang");
            clientBang.clientID = "qkdqkd";
            clientBang.clientNumber = 46;
            clientBang.productNumber = 77;
            clientBang.waitingNumber = 3;
        
            clientBang.showOrderInfo();

            Order clientKim = new Order();
            
            clientKim.setClientName("Kim");
            clientKim.clientID = "Keem";
            clientKim.clientNumber = 23;
            clientKim.productNumber = 52;
            clientKim.waitingNumber = 2;
        
            clientKim.showOrderInfo();

            Order clientLee = new Order();
            
            clientLee.setClientName("Lee");
            clientLee.clientID = "Lee22";
            clientLee.clientNumber = 21;
            clientLee.productNumber = 54;
            clientLee.waitingNumber = 3;
        
            clientLee.showOrderInfo();

    }
}
