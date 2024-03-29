package ch16Test.gamelevel;

public class MainBoardPlay {

    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);

        PlayerLevel advancedLevel = new AdvancedLevel();
        player.upgradeLevel(advancedLevel);
        player.play(2);

        PlayerLevel superLevel = new SuperLevel();
        player.upgradeLevel(superLevel);
        player.play(3);
    }
}