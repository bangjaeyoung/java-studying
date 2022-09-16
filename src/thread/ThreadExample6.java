package thread;

// Thread의 이름은 스레드의 참조값.setName()으로 설정 가능
public class ThreadExample6 {

    public static void main(String[] args) {

        Thread thread6 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Set And Get Thread Name");
            }
        });

        thread6.start();

        System.out.println("thread6.getName : " + thread6.getName());

        thread6.setName("BangBang");

        System.out.println("thread6.getName : " + thread6.getName());
    }
}
