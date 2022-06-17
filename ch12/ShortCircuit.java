package ch12;

public class ShortCircuit {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean val = ((num1 += 10) < 10) && ((i += 2) < 10);
		
		
		System.out.println(val);
		System.out.println(num1);
		System.out.println(i);
		//&&(논리 곱)의 경우, 앞 항의 결과가 false 이면 뒷 항은 평가되지 않음
		
		val = ((num1 += 10) < 10) || ((i += 2) < 10);
		
		System.out.println(val);
		System.out.println(num1);
		System.out.println(i);
		//||(논리 합)의 경우, 앞 항의 결과가 false 이면 뒷 항까지 평가함
		
	}

}