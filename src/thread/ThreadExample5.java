package thread;

// Thread 이름은 스레드의 참조값.getName()으로 조회 가능
// 결과 "Thread-n"
public class ThreadExample5 {

    public static void main(String[] args) {

        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Get Thread Name");
            }
        });

        thread5.start();

        System.out.println("thread5.getName() = " + thread5.getName());
    }
}
