package ch09;

public class Desktop extends Computer {
    @Override
    public void display() {
        System.out.println("Desktop display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }

    @Override
    public void turnOff() {
        System.out.println("Desktop turnOff");  // 재정의
    }
    // 비로소 추상메서드가 없는 클래스가 됨
}
