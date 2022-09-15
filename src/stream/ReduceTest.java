package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) return s1;
        else return s2;
    }
}

public class ReduceTest {

    public static void main(String[] args) {

        String greetings[] = {"안녕하세요", "Hello", "Good morning", "반갑습니다"};

        // 람다식 이용 직접 구현
        System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) ->

                {if (s1.getBytes().length >= s2.getBytes().length) return s1;
                else return s2;}
                ));

        // CompareString 클래스를 사용해서 구현
        String str = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(str);


        // reduce() 연산은 정의된 연산이 아닌 프로그래머가 직접 구현한 연산을 사용
    }
}
