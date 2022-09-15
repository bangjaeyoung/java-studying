package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        // 일반적인 for문을 이용한 순회
        for (int num : arr) {
            System.out.println(num);
        }

        // stream 메서드를 활용한 순회
        Arrays.stream(arr).forEach(n -> System.out.println(n));

        // 위와 동일
        IntStream intStream = Arrays.stream(arr);
        intStream.forEach(n -> System.out.println(n));

        // sum 메서드를 사용하기 위해서는 스트림을 다시 생성해야 한다.
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
