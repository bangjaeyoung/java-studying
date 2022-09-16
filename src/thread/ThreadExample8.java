package thread;

// 두 스레드가 동일한 데이터를 공유하게 되어 문제가 발생하는 예시 코드
public class ThreadExample8 {

    public static void main(String[] args) {

        Runnable threadTask8 = new ThreadTask8();
        Thread thread8_1 = new Thread(threadTask8);
        Thread thread8_2 = new Thread(threadTask8);

        thread8_1.setName("김멍멍");
        thread8_2.setName("박냥냥");

        thread8_1.start();
        thread8_2.start();
    }
}

class Account {

    // 잔액을 나타내는 변수
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    // 인출 성공 시 true, 실패 시 false 반환
    public boolean withdraw(int money) {

        // 인출 가능 여부 판단 : 잔액이 인출하고자 하는 금액보다 같거나 많아야 함
        if (balance >= money) {

            // if문의 실행부에 진입하자마자 해당 스레드를 일시 정지 시키고,
            // 다른 스레드에게 제어권을 강제로 넘김
            // 일부러 문제 상호아을 발생시키기 위해 추가한 코드
            try { Thread.sleep(1000); } catch (Exception error) {}

            // 잔액에서 인출금을 깎아 새로운 잔액을 기록
            balance -= money;

            return true;
        }
        return false;
    }
}

class ThreadTask8 implements Runnable {

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