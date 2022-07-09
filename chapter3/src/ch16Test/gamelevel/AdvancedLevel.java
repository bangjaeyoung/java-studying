package ch16Test.gameLevel;

public class AdvancedLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("조금 뜁니다.");
    }

    @Override
    public void turn() {
        System.out.println("반만 돕니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("****** 중급자 레벨 ******");
    }
}