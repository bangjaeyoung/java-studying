package chapter2.ch14;

public class Bus {

    String busNumber;
    int money;
    int passenger;

    public Bus(String busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.money += money;
        passenger++;
    }

    public void showBusInfo() {
        System.out.println(busNumber + "번 버스의 승객은 " + passenger + "명 이고, 수입은 " + money + "원 입니다");
    }
}