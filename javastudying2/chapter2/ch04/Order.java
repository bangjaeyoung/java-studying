package chapter2.ch04;

public class Order {

    public String clientName;
    public String clientID;
    public int clientNumber;
    public int productNumber;
    public int waitingNumber;

    public Order(String clientName, String clientID, int clientNumber, int productNumber, int waitingNumber) { // 직접 생성자 구현
       
        this.clientName = clientName;
        this.clientID = clientID;
        this.clientNumber = clientNumber;
        this.productNumber = productNumber;
        this.waitingNumber = waitingNumber;

    }

    public void setClientName(String name) {

        clientName = name;

    }

    public void showOrderInfo() {

        System.out.println(clientName + " 고객님의 주문내역\n" + "ID : " + clientID + "\n고객번호 : " + clientNumber + "\n상품번호 : " + productNumber + "\n대기번호 : " + waitingNumber + "\n------------------------------");

    }
}
