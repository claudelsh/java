package forloop;

import java.util.Scanner;

public class InputSum {
	/**
	 * 두 개의 정수를 입력받아서 그 범위내의 정수의 합 구하기
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 개의 정수를 입력하세요.");
		int firstNum = scanner.nextInt();
		int secondNum = scanner.nextInt();
		
		int min = (firstNum < secondNum) ? firstNum: secondNum;
		int max = (firstNum >= secondNum) ? firstNum: secondNum;
		
		int result = 0;
		for (int i = min; i <= max; i++) {
			result += i;
		}
		System.out.println(min + "부터 " + max + "까지의 합은 " + result + "입니다.");
	}
}