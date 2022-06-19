package ch16;

public class SwitchCase2 {
    
    public static void main(String[] args) {

        String medal = "Bronze";

        switch(medal) {
            case "Gold": 
                System.out.println("금메달");
                break;
            
            case "Silver":
                System.out.println("은메달");
                break;

            case "Bronze":
                System.out.println("동메달");
                break;

            default:
                System.out.println("아무 메달도 아닙니다");
                break;
        }
    }
}