package switchcase;

import java.util.Scanner;

public class Gender {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = scanner.next();
		System.out.println("주민번호 : ");
		String number = scanner.next();
		char index = number.charAt(7);
		
		String result = "";
		switch (index) {
		case '1':
		case '3':result = "남자";
			break;
		case '2':
		case '4':result = "여자";
			break;
		case '5':
		case '6':result = "외국인";
			break;
		default:System.out.println("잘못된 주민등록번호입니다.");
			break;
		}
		
		System.out.println(name + "은 " + result + "입니다.");
	}
}
