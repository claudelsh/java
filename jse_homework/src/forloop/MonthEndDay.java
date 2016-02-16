package forloop;

import java.util.Scanner;

public class MonthEndDay {
	public static void main(String[] args) {
		/**
		 * 월을 입력하면 해당 월의 끝날이 몇일인지 출력하는 프로그램
		 * 단, 2월은 29일로 입력
		 * 주의점 : 입력값이 1~12를 넘어가면 잘못 입력
		 * */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("년, 월을 입력하세요 : ");
		int year = scanner.nextInt(), month = scanner.nextInt();
		int result = 0;
		
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			result = 31;
			break;
		case 2:
	         result = 28;
	         if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400) == 0)) {
				result = 29;
			}
	         break;
		case 4:case 6:case 9:case 11:
			result = 30;
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		System.out.println(month + "월의 마지막은 " + result + "일입니다.");
	}
}
