package anonymousclass;

// 메서드 호출 이후에도 사용해야하는 경우가 있을 수 있으므로,
// 지역 내부 클래스에서 사용하는 메서드의 지역 변수나 매개 변수는 final로 선언됨
class Outer2 {

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(/*final*/ int i) {

        /*final*/ int num = 10;

        return new Runnable() {     // == class MyRunnalbe implements Runnable
                                    // 익명 내부 클래스 선언 방법 1

            int localNum = 1000;

            @Override
            public void run() {

                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outer2.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
            }
        };
    }

    // 익명 내부 클래스 선언 방법 2
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable Class");
        }
    };
}

public class AnonymousInnerTest {

    public static void main(String[] args) {

        Outer2 outer2 = new Outer2();

        // 방법 1 메서드 실행
        Runnable runnable = outer2.getRunnable(100);

        runnable.run();

        // 방법 2 메서드 실행
        outer2.runnable.run();
    }
}
