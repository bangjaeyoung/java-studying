package thread;

// 작업 스레드를 생성하고 실행하는 방법
// 1. Runnable 인터페이스를 구현한 객체에서 run() 메서드를 구현하여 스레드를 생성하고 실행하는 방법
// 2. Thread 클래스를 상속 받은 하위 클래스에서 run() 메서드를 구현하여 스레드를 생성하고 실행하는 방법
// run() 메서드 내에 스레드가 처리할 작업을 작성하도록 규정되어 있음

// 현재는 Runnable 인터페이스를 구현한 객체에서 run() 메서드를 구현하여 스레드를 생성하고 실행하는 방법을 사용
public class ThreadExample1 {
    public static void main(String[] args) {

        // 1. Runnable 인터페이스를 구현한 객체 생성
        Runnable task1 = new ThreadTask1();
        // 2. Runnable 구현 객체를 인자로 전달하면서 Thread 클래스를 인스턴스화하여 스레드를 생성
        Thread thread1 = new Thread(task1);

//        1, 2를 한 줄로 축약한 형태
//        Thread thread2 = new Thread(new ThreadTask1());

        // 작업 스레드를 실행시켜, run() 내부의 코드를 처리하도록 함
        thread1.start();

        // 반복문 추가
        for (int i = 0; i < 100; i++) {
            System.out.print("@");
        }
    }
}

// Runnable 인터페이스를 구현하는 클래스
class ThreadTask1 implements Runnable {

    // run() 메서드 바디에 스레드가 수행할 작업 내용 작성
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("#");
        }
    }
}
