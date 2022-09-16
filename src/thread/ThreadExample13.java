package thread;

// wait(), notify() 메서드는 스레드 간 협업에 사용됨
// wait()는 자기 스레드를 일시 정지 상태로, notify()는 상대 스레드를 실행 대기 상태로 만듬
public class ThreadExample13 {

    public static void main(String[] args) {

        WorkObject sharedObject = new WorkObject();

        ThreadA threadA = new ThreadA(sharedObject);
        ThreadB threadB = new ThreadB(sharedObject);

        threadA.start();
        threadB.start();
    }
}

class WorkObject {
    public synchronized void methodA() {                 // 두 스레드가 동일한 데이터를 공유하게 되어 문제를 해결
        System.out.println("ThreadA의 methodA 실행");     // 스레드 동기화 synchronized 이용
        notify();
        try { wait(); } catch (Exception e) {}
    }

    public synchronized void methodB() {                 // 두 스레드가 동일한 데이터를 공유하게 되어 문제를 해결
        System.out.println("ThreadB의 methodB 실행");     // 스레드 동기화 synchronized 이용
        notify();
        try { wait(); } catch (Exception e) {}
    }
}

class ThreadA extends Thread {
    private WorkObject workObject;

    public ThreadA(WorkObject workObject) {
        this.workObject = workObject;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodA();
        }
    }
}

class ThreadB extends Thread {
    private WorkObject workObject;

    public ThreadB(WorkObject workObject) {
        this.workObject = workObject;
    }

    public void run() {
        workObject.methodB();
    }
}