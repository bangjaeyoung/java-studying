package chapter1.ch16;

import java.util.Scanner;

public class MyNewSwitchCase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		String term = switch(month) {
			case 1, 2 -> {
				System.out.println(month + "월달은 겨울방학");
				yield "겨울방학";
			}
			case 3, 4, 5, 6 -> {
				System.out.println(month + "월달은 1학기");
				yield "1학기";
			}
			case 7, 8 -> {
				System.out.println(month + "월달은 여름방학");
				yield "여름방학";
			}
			case 9, 10, 11, 12 -> {
				System.out.println(month + "월달은 2학기");
				yield "2학기";
			}
			default -> {
				System.out.println(month + "월달은 없는 학기");
				yield "없는 학기";
			}
            //switch, case, default, yield
            //업그레이드 버전의 switch(case)문
		};
        scanner.close();
	}
}