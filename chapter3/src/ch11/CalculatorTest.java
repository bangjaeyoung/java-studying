package ch11;

public class CalculatorTest {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalc();     //  타입 상속을 받았기 때문에, 타입을 Calc로 가능

        System.out.println(calc.add(num1,num2));
        System.out.println(calc.substract(num1,num2));
        System.out.println(calc.times(num1,num2));
        System.out.println(calc.divide(num1,num2));
    }
}
