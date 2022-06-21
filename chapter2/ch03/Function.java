package chapter2.ch03;

public class Function {

    public static int addNum(int num1, int num2) {

        int result;
        result = num1 + num2;
        return result;
        
    }

    public static void sayHello(String greeting) {

            System.out.println(greeting);

    }

    public static int calcSum() {

        int sum = 0;

        for(int i = 1; i <= 100; i++) {
            sum += i;
        }

        return sum;

    }

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1, n2);      // total 변수에 반환값 저장
        System.out.println(total);          // addNum 함수 사용

        sayHello("Hi, Hello, Bonjour!");        // sayHello 함수 사용

        total = calcSum();                  // total 변수에 반환값 저장
        System.out.println(total);        // total 함수 사용

    }
}