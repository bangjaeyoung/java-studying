package chapter1.ch21;

public class ContinueTest {

    public static void main(String[] args) {

        //1부터 100까지 숫자 중 3의 배수를 출력하세요

        for (int i = 1; i <= 100 ; i++) {

            if ( (i % 3) != 0 ) {
                continue;
            }

            System.out.println(i);
        }
        
    }
    
}
