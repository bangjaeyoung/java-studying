package thread;

// 실행 중인 스레드의 주소값을 사용해야 하는 상황이 발생하면 Thread 클래스의 정적 메서드인 currentThread()를 사용
public class ThreadExample7 {

    public static void main(String[] args) {

        Thread thread7 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        thread7.start();
        System.out.println(Thread.currentThread().getName());
    }
}
