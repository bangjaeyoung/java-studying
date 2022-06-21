package chapter1.ch16;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        int day;
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
                System.out.println(month + "월은 31일입니다");
                day = 31;
                break;
        }
            case 2: {
                System.out.println(month + "월은 28일입니다");
                day = 28;
                break;
        }
            case 4: case 6: case 9: case 11: {
                System.out.println(month + "월은 30일입니다");
                day = 30;
                break;
        }
            default : {
                System.out.println(month + "월은 없는 달입니다");
                day = 0;
                break;
         }
         //switch, case, break, default
    }
    //System.out.println(month + "월은" + day + "일입니다");

    scanner.close();
}
}