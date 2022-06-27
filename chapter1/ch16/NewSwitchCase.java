package chapter1.ch16;

import java.util.Scanner;

public class NewSwitchCase {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day;
		switch(month) {
		
			case 1, 3, 5, 7, 9, 10, 12 -> {
				System.out.println(month + "월은 31일입니다");
				day = 31;	
			}
			case 2 -> {
				System.out.println(month + "월은 28일입니다");
				day = 28;
			}
			case 4, 6, 8, 11 -> {
				System.out.println(month + "월은 30일입니다");
				day = 30;
			}
			default -> {
				System.out.println("월은 없는 달입니다");
				day = 0;
			}
		}
		System.out.println(day);
        scanner.close();
		}
	}