package ch19Test;

public class CarFactory {

    private static CarFactory Instance = new CarFactory();

    private CarFactory() {}

    public static CarFactory getInstance() {
        if(Instance == null) {
            Instance = new CarFactory();
        }
        return Instance;
    }

    public Car createCar() {
        Car car = new Car();
        return car;
    }
}