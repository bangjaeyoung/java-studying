package thread;

// 스레드의 상태 변화 확인 예시 코드
// 스레드의 현재 상태는 getState() 메서드를 이용
public class ThreadExample11 {

    public static void main(String[] args) {

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    while (true) Thread.sleep(1000);        // 1. sleep()에 의해 일시 정지 (TIMED-WAITING) 상태
                }
                catch (Exception e) {}
                System.out.println("Woke Up!!!");       // 3. interrupt()에 의한 예외 발생으로, println 구문 실행
            }                                           // 4. run()의 마지막 코드를 실행했으므로, TERMINATED 상태로 변화
        };

        System.out.println("thread.getState() = " + thread.getState());

        thread.start();

        System.out.println("thread.getState() = " + thread.getState());

        while (true) {
            if (thread.getState() == Thread.State.TIMED_WAITING) {
                System.out.println("thread.getState() = " + thread.getState());
                break;
            }
        }

        thread.interrupt();     // 2. interrupt()에 의해 예외 발생하고, RUNNABLE 상태로 변화

        while (true) {
            if (thread.getState() == Thread.State.RUNNABLE) {
                System.out.println("thread.getState() = " + thread.getState());
                break;
            }
        }

        while (true) {
            if (thread.getState() == Thread.State.TERMINATED) {
                System.out.println("thread.getState() = " + thread.getState());
                break;
            }
        }
    }
}
