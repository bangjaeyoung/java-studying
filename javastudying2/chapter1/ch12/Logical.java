package chapter1.ch12;


public class Logical {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1 > 0) && (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 < 0) && (num2 > 0);
		System.out.println(flag);
		//&&는 and의 의미
		
		flag = (num1 > 0) || (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 < 0) || (num2 > 0);
		System.out.println(flag);
		//||는 or의 의미
		
		flag = !(num1 > 0);
		System.out.println(flag);
		//!는 반대의 의미
		
	}

}