package ch04;
public class BinaryTest {

    public static void main(String[] args) {

        int num = 10;
        int bNum = 0B1010;
        int oNum = 012;
        int xNum = 0XA;

        System.out.println(num);            //10진수
        System.out.println(bNum);          //2진수, 0B로 표현
        System.out.println(oNum);          //8진수, 0으로 표현
        System.out.println(xNum);          //16진수, 0X로 표현
        
    }
}