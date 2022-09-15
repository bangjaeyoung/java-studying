package chapter1.ch10;
public class Constant {

    public static void main(String[] args) {

        final int MAX_NUM = 100;        //상수(변하지 않는 수) 선언 final
        final int MIN_NUM;                  //상수는 모든 문자 대문자로

        MIN_NUM = 0;
        //MAX_NUM = 20; (x)             //상수이기에 초기화 다시 안됨

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);
    }
    
}
