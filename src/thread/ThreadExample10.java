package thread;

// 스레드 동기화로 코드 개선, synchronized 이용
// 임계 영역 : 오로지 하나의 스레드만 코드를 실행할 수 있는 코드 영역
// 락 : 임계 영역을 포함하고 있는 객체에 접근할 수 있는 권한

// 1. 메서드 전체를 임계 영역으로 지정하는 방법
// 2. 특정한 영역을 임계 영역으로 지정하는 방법 - 현재 코드는 이 방법 이용
public class ThreadExample10 {

    public static void main(String[] args) {

        Runnable threadTask10 = new ThreadTask10();
        Thread thread10_1 = new Thread(threadTask10);
        Thread thread10_2 = new Thread(threadTask10);

        thread10_1.setName("김멍멍");
        thread10_2.setName("박냥냥");

        thread10_1.start();
        thread10_2.start();
    }
}

class Account10 {

    // 잔액을 나타내는 변수
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    // 인출 성공 시 true, 실패 시 false 반환
    public boolean withdraw(int money) {

        synchronized (this) {
            // 인출 가능 여부 판단 : 잔액이 인출하고자 하는 금액보다 같거나 많아야 함
            if (balance >= money) {

                // if문의 실행부에 진입하자마자 해당 스레드를 일시 정지 시키고,
                // 다른 스레드에게 제어권을 강제로 넘김
                // 일부러 문제 상호아을 발생시키기 위해 추가한 코드
                try {
                    Thread.sleep(1000);
                } catch (Exception error) {
                }

                // 잔액에서 인출금을 깎아 새로운 잔액을 기록
                balance -= money;

                return true;
            }
            return false;
        }
    }
}

class ThreadTask10 implements Runnable {

    Account10 account = new Account10();

    @Override
    public void run() {
        while (account.getBalance() > 0) {

            // 100 ~ 300원의 인출금을 랜덤으로 정함
            int money = (int) (Math.random() * 3 + 1) * 100;

            // withdraw를 실행시키는 동시에 인출 성공 여부를 변수에 할당
            boolean denied = !account.withdraw(money);

            // 인출 결과 확인
            // 만약, withdraw가 false 리턴하면, 즉 인출에 실패하면,
            // 해당 내역에 -> denied를 출력
            System.out.println(String.format("Withdraw %dwon By %s. Balance : %d %s",
                    money, Thread.currentThread().getName(), account.getBalance(), denied ? "-> DENIED" : "")
            );
        }
    }
}