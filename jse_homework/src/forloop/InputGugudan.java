package forloop;

import java.util.Scanner;

public class InputGugudan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("단수를 입력하세요");
		int num = scanner.nextInt();
		
		if (num < 0) {
			System.out.println("잘못된 입력입니다.");
		} else {
			for (int i = 1; i <= 9; i++) {
				System.out.println(num + " * " + i + " = " );
			}
		}
	}
}
