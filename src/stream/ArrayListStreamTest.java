package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

    public static void main(String[] args) {

        List<String> sList = new ArrayList<String>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.print(s + "\t"));
        System.out.println();

        sList.stream().sorted().forEach(s -> System.out.print(s + "\t"));
        System.out.println();

        sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        sList.stream().map(s -> s.length() >= 5).forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        // 연산이 이루어진다고 해서, 기존 데이터 자체가 바뀌지는 않는다.
        // 최종 연산이 끝나면, 다시 스트림을 생성해서 연산해주어야 한다.
    }
}
