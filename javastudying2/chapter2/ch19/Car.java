package chapter2.ch19;

public class Car {
    
    private static int serialNum = 10000;

    private int carNum;

    public Car() {
        serialNum++;
        carNum = serialNum;  // 같이 증가되는 serialNum을 carNum에 저장해줌으로써, 같이 증가 방지, 하나씩 증가
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }
}