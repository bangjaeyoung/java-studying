package lambdause;

@FunctionalInterface
interface StringConcat {

    void makeString(String str1, String str2);
}

// 일반적인 인터페이스 구현
class StringConcatImpl implements StringConcat{

    @Override
    public void makeString(String str1, String str2) {
        System.out.println(str1 + str2);
    }
}

public class StringConcatTest {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";

        // 인터페이스를 구현한 클래스를 활용해서 메서드 호출 방법
        StringConcatImpl stringConcatImpl = new StringConcatImpl();
        stringConcatImpl.makeString(str1, str2);

        // 함수형 인터페이스와 람다식을 이용한 메서드 호출 방법
        StringConcat stringConcat = (s, v) -> System.out.println(s + v);
        stringConcat.makeString(str1, str2);
        // 함수형 인터페이스를 구현하는 클래스 없이 호출되는 건 아니다.
        // 람다식 내부적으로 익명 클래스가 쓰인다.
        // 람다식 구현 -> 클래스 생성 생략

        // 람다식은 인터페이스형 변수에 대입, 매개변수로 전달, 반환 값으로 사용될 수 있다.
    }
}
