package ch14;

public interface Calc {

    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() {
        System.out.println("정수의 사칙연산을 제공합니다.");
        myMethod();
    }
    //  디폴트 메서드
    
    static int total(int[] arr) {
        
        int total = 0;
        for(int num : arr) {
            total += num;
        }
        myStaticMethod();
        return total;
    }
    //  정적 메서드

    private void myMethod() {
        System.out.println("myMethod");
    }
    // 일반적인 private 메서드 ( 구현하는 코드에서 재정의 불가 )

    private static void myStaticMethod() {
        System.out.println("myStaticMethod");
    }
    // static 메서드에서 사용되는 private 메서드 ( static 키워드가 들어가야 한다. )
    // 인스턴스 생성과 상관없이 호출이 될 수 있다.
}
