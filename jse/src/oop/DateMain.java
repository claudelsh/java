package oop;

import java.util.Scanner;

public class DateMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("월을 입력하세요 : ");
		int month = scanner.nextInt();
		
		DateService service = new DateServiceImpl();
		int result = service.getEndDayOfMonth(month);
		
		System.out.println(month + "월의 마지막 날은 " + result + "일입니다.");
	}
}
