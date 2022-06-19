package ch08;
public class Character {

    public static void main(String[] args) {

        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);
        //문자가 숫자로 인코딩됨
        //문자 A는 숫자로 65

        char ch2 = 66;
        System.out.println(ch2);
        System.out.println((char)ch2);
        //숫자가 문자로 디코딩됨
        //숫자 66은 문자로 B

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3);
        //숫자가 문자로 디코딩됨
        //숫자 67은 문자로 C

        char hangeul = '한';
        char ch = '\uD55C';         //유니코드로 \uD55C는 '한'

        System.out.println(hangeul);
        System.out.println(ch);
    }
    
}
