package chapter1.ch11;
public class Operator {

    public static void main(String[] args) {

        int gameScore = 150;
		int lastScore = ++gameScore;	//gameScore += 1;	gameScore = gameScore + 1;
		
		System.out.println(lastScore);
		System.out.println(gameScore);
		
		int gameScore2 = 150;
		int lastScore2 = gameScore2++;	// gameScore1이 먼저 저장이 되고 그 후에 증가함		
		System.out.println(lastScore2);
		System.out.println(gameScore2);

    }
    
}
