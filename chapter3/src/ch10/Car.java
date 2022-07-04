package ch10;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {}
    //  추상클래스가 아니다. 세미콜론으로 끝난 게 아닌, 중괄호를 사용했고, 구현부가 있지만 구현내용이 없는 것이다. 일반 메서드이다.
    //  이런 메서드를 왜 써주냐? 필요한 경우에 하위 클래스에서 재정의 한다.
    //  '훅 메서드'라고 한다.

    final public void run() {
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
        washCar();
    }
    // 정해진 시나리오 생성
    // 하위클래스에서 재정의 불가
}