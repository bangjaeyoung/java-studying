package chapter2.ch14;

public class Subway {

    String subwayNumber;
    int money;
    int passenger;

    public Subway(String subwayNumber) {
        this.subwayNumber = subwayNumber;
    }

    public void take(int money) {
        this.money += money;
        passenger++;
    }

    public void showSubwayInfo() {
        System.out.println(subwayNumber + "번 버스의 승객은 " + passenger + "명 이고, 수입은 " + money + "원 입니다");
    }
}