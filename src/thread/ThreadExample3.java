package thread;

// 1. Runnable 익명 구현 객체를 활용한 스레드 생성 및 실행
public class ThreadExample3 {

    public static void main(String[] args) {

        // 익명 Runnable 구현 객체를 활용하여 스레드 생성
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print("#");
                }
            }
        });

        thread3.start();

        for (int i = 0; i < 100; i++) {
            System.out.print("@");
        }
    }
}
