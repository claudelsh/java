package operation;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신의 이름은 무엇입니까?");
		String name = scanner.next();
		System.out.println(name + "입니다.");

		System.out.println("나이는?");
		int age = scanner.nextInt();
		System.out.println(age + "입니다");
		System.out.println("이름은" + name + ", 나이는" + age + "입니다.");
	}
}
