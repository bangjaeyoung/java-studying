package ch10;
public class TypeConversion {

    public static void main(String[] args) {

        byte bNum = 123;
        int iNum = bNum;

        System.out.println(iNum);
        //자동 형 변환

        int a = 255;
        byte b = (byte)a;

        System.out.println(b);
        //강제 형 변환

        double c = 3.14;

        System.out.println((int)c);
        //강제 형 변환
        //참조할 때 이렇게 변환하는 방법도 있음

        double d = 1.2;
        float e = 0.9F;

        int f = (int)d + (int)e;
        int g = (int)(d + e);

        System.out.println(f);
        System.out.println(g);
        //강제 형 변환
        //두 참조문의 결과값은 다름
    }
    
}
