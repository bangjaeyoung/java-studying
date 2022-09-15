package ch06;

public class GoldCustomer extends Customer {

    double salesRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        salesRatio = 0.1;
        bonusRatio = 0.02;
        customerGrade = "GOLD";
    } // 생성자 오버라이딩(재정의)

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    } // 메서드 오버라이딩(재정의)
}