package chapter2.ch08;

import java.io.InputStream;

public class Order {

    String    orderNumber;
    String orderPhoneNumber;
    String orderAddress;
    String orderDate;
    String orderTime;
    String orderPrice;
    String menuNumber;

    public Order (String orderNumber, String orderPhoneNumber, String orderAddress, String orderDate, String orderTime, String orderPrice, String menuNumber) {

        this.orderNumber = orderNumber;
        this.orderPhoneNumber = orderPhoneNumber;
        this.orderAddress = orderAddress;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.menuNumber = menuNumber;

    }

    public Order(InputStream in) {
    }

    public void showOrderInfo () {

        System.out.println("주문 접수 번호 : " + orderNumber + "\n주문 핸드폰 번호 : " + orderPhoneNumber + "\n주문 집 주소 : " + orderAddress + "\n주문 날짜 : " + orderDate + "\n주문 시간 : " + orderTime + "\n주문 가격 : " + orderPrice + "\n메뉴 번호 : " + menuNumber);

    }
}
