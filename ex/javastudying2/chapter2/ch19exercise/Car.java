package chapter2.ch19exercise;

public class Car {

    private static int serialNum = 10000;

    public int carNum;

    public Car() {
        serialNum++;
        carNum = serialNum;
    }

    public int getCarNum() {
        return carNum;
    }
}
