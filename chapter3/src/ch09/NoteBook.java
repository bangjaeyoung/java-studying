package ch09;

public abstract class NoteBook extends Computer{
    // 상위클래스의 추상메서드를 하나라도 재정의 안해줄 경우, 자동으로 이 클래스 또한 추상클래스가 되어버린다.
    @Override

    public void display() {
        System.out.println("NoteBook display");
    }
}