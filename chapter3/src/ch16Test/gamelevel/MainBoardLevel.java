package ch16Test.gameLevel;

public class MainBoardLevel {

    public static void main(String[] args) {

        Player player1 = new Player();
        player1.play(1);

        AdvancedLevel advancedLevel = new AdvancedLevel();
        player1.upgradeLevel(advancedLevel);
        player1.play(2);

        SuperLevel superLevel = new SuperLevel();
        player1.upgradeLevel(superLevel);
        player1.play(3);
    }
}