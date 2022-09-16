package thread;

// 현재는 Thread 클래스를 상속받은 하위 클래스에서 run() 메서드를 구현하여 스레드를 생성하고 실행하는 방법을 사용
public class ThreadExample2 {
    public static void main(String[] args) {

        // Thread 클래스를 상속받은 클래스를 인스턴스화하여 스레드를 생성
        ThreadTask2 thread2 = new ThreadTask2();

        // 작업 스레드를 실행시켜, run() 내부의 코드를 처리하도록 함
        thread2.start();

        // 반복문 추가
        for (int i = 0; i < 100; i++) {
            System.out.print("@");
        }
    }
}

// Thread 클래스를 상속받는 클래스 작성
class ThreadTask2 extends Thread {

    // run() 메서드 바디에 스레드가 수행할 작업 내용 작성
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("#");
        }
    }
}
// 1번의 방법과는 달리, Thread 클래스를 직접 인스턴스화하지 않는다. ex) Thread tread1 = new Tread();