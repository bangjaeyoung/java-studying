package ch06;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customerT = new Customer(10010, "Tomas");
        Customer customerJ = new Customer(10020, "James");
        Customer customerE = new GoldCustomer(10030, "Edward");
        Customer customerP = new GoldCustomer(10040, "Percy");
        Customer customerK = new VIPCustomer(10050, "Kim");

        customerList.add(customerT);
        customerList.add(customerJ);
        customerList.add(customerE);
        customerList.add(customerP);
        customerList.add(customerK);

        // 상위 클래스 Customer 2명, 하위 클래스 GoldCustomer 2명, 하위 클래스 VIPCustomer 1명을 생성하고, ArrayList에 추가한다.

        for(Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }
    }
}