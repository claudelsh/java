package date;

import java.util.Scanner;

public class DateController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DateService date = new DateServiceImpl();
		
		int year = 0, month = 0, select = 0;
		String result = "";
		
		while (true) {
			System.out.println("### 날짜 프로그램 ###");
			System.out.println("[메뉴]"
					+ "\n 1. 해당 년월의 마지막날 구하기"
					+ "\n 2. 현재 날짜와 시간 구하기"
					+ "\n 9. 종료");
			select = scanner.nextInt();
			switch (select) {
			case 1:
				System.out.println("년, 월을 입력하세요 : ");
				year = scanner.nextInt();
				month = scanner.nextInt();
				result = date.getEndDayOfMonth(year, month);
				System.out.println(year + "년 " + month + "월의 마지막은 " + result + "일입니다.");
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				break;
			}
		}
	}
}
