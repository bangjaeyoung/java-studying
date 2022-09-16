package thread;

// 다른 스레드의 작업이 끝날 때까지 기다리는 join() 메서드 이용
// join() vs sleep()
// 둘 다 호출한 스레드가 일시 중지 상태가 되고, try-catch문으로 감싸서 사용해야 하고, interrupt()에 의해 실행 대기 상태로 복귀할 수 있음
// sleep()은 Thread 클래스의 static 메서드인 반면, join()은 특정 스레드에 대해 동작하는 인스턴스 메서드임
// ex) Thread.sleep(1000);  thread1.join();
public class ThreadExample12 {

    public static void main(String[] args) {

        SumThread sumThread = new SumThread();

        sumThread.setTo(10);

        sumThread.start();

        // 메인 스레드가 sumThread의 작업이 끝날 때까지 기다림
        try { sumThread.join(); } catch (Exception e) {}

        System.out.printf("1부터 %d까지의 합 : %d", sumThread.getTo(), sumThread.getSum());
    }
}

class SumThread extends Thread {
    private long sum;
    private int to;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public void run() {
        for (int i = 1; i <= to; i++) {
            sum += i;
        }
    }
}
