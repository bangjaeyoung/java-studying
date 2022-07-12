package chapter2.ch15;

public class Taxi {

    String taxiCompany;
    int money;

    public Taxi(String taxiCompany) {
        this.taxiCompany = taxiCompany;
    } 

    public void take(int money) {
        this.money += 10000;
    }

    public void showTaxiCompanyInfo() {
        System.out.println(taxiCompany + " 수입은 " + money + "원 입니다.");
    }
    
}
