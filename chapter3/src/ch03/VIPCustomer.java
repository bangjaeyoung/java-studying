package ch03;

public class VIPCustomer extends Customer {

    private int agentID;
    double salesRatio;

    public VIPCustomer() {
        /* super(); */
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    public int getAgentID() {
        return agentID;
    }
}
