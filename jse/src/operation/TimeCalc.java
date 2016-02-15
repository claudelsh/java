package operation;

import java.util.Scanner;

public class TimeCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*** 초를 시간, 분, 초로 바꾸어 주는 프로그램 ***");
		System.out.println("초를 입력하세요 : ");
		int second = scanner.nextInt();
		/**
		 * [ + - * / % ]
		 * second, min, hour
		 * 
		 * */
		
		int min = second / 60;
		// sec %= 60;
		int hour = min / 60;
		// min %= 60;
		int rsec = second % 60;
		int rmin = min % 60;
		
		if (second < 60) {
			System.out.println("입력한 초는 " + second + "초입니다.");
		} else {
			System.out.println("입력한 " + second + "초는 " + hour + "시간 " + rmin + "분 " + rsec + "초입니다.");
			// System.out.println("입력한 " + second + "초는 " + hour + "시간 " + min + "분 " + sec + "초입니다.");
		}

	}
}
