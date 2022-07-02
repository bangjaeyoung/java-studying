package ch06;

public class VIPCustomer extends Customer {

    private int agentID;
    double salesRatio;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    } // 클래스 오버라이딩

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    } // 메서드 오버라이딩

    public int getAgentID() {
        return agentID;
    }
}
