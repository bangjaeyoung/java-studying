package ch16Test.gamelevel;

public class BeginnerLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("걷습니다.");
    }

    @Override
    public void jump() {
        System.out.println("못 뜁니다.");
    }

    @Override
    public void turn() {
        System.out.println("못 돕니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("****** 초급자 레벨 ******");
    }
}