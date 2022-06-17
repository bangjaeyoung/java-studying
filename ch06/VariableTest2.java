package ch06;
public class VariableTest2 {

    public static void main(String[] args) {

        byte bNum = 127;

        System.out.println(bNum);

        //int num = 12345678900;
        //long num = 12345678900;
        long lNum = 12345678900L;
        //기본적으로 정수 리터럴은 int로 저장되어있기 때문에 더 큰 자료형으로 선언할 때는 숫자 뒤에 L을 써줌

        System.out.println(lNum);

    }
}