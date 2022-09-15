package ch14;

public class CompleteCalc extends Calculator {
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2 == 0)
            return ERROR;

        return num1 / num2;
    }

    public void showInfo() {
        System.out.println("모든 메서드를 구현했습니다.");
    }

    public void description() {
        System.out.println("CompleteCalc overriding");
    }
    //  인터페이스의 디폴트 메서드를 재정의(오버라이딩) 할 수도 있다.
}
