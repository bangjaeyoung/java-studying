package ch14;

public class CalculatorTest {

    public static void main(String[] args) {

//        int num1 = 10;
//        int num2 = 2;
//
//        Calc calc = new CompleteCalc();     //  타입 상속을 받았기 때문에, 타입을 Calc로 가능
//
//        System.out.println(calc.add(num1,num2));
//        System.out.println(calc.substract(num1,num2));
//        System.out.println(calc.times(num1,num2));
//        System.out.println(calc.divide(num1,num2));
//
//        calc.description();
//        //  디폴트 메서드 사용

        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr));
        // 정적 메서드 사용
        // 정적 메서드이기 때문에, 인터페이스명을 참조한다.
        // 윗부분을 모두 주석처리 (인스턴스 생성을 안해줘도) 해줘도 돌아가는 이유는 이 메서드는 정적 메서드이기 때문이다.
    }
}
