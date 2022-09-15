package lambdause;

@FunctionalInterface        // 컴파일러에게 정보를 주는 에너테이션, 메서드 두 개 이상 만드는 걸 방지
interface Add {

    int add(int x, int y);
}

public class AddTest {

    public static void main(String[] args) {

        Add addL = (x, y) -> x + y;         // 함수형 인터페이스 & 람다식 이용
        System.out.println(addL.add(2, 3));

    }
}