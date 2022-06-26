package chapter2.ch14;

public class Subway {

    String subwayColor;
    int money;
    int passengerCount;

    public Subway(String subwayColor) {
        this.subwayColor = subwayColor;
    }

    public void take(int money) {
    this.money += money;
        passengerCount++;
    }
    
    public void showPresentSituationOfSubway() {
        System.out.println(subwayColor + "색 지하철의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
    }
}