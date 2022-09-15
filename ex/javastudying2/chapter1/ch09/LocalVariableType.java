package chapter1.ch09;
public class LocalVariableType {
    
    public static void main(String[] args) {

        var i = 10;
        var j = 10.0;
        var str = "Hi";         //지역 변수 사용

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        var str2  = str;
        System.out.println(str2);

        str = "Hello";
        //str = 3; (x)
        //한 번 선언해서 추론된 변수는 다른 타입의 값을 대입할 수 없음

        System.out.println(str);
    }
}
