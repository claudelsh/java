package switchcase;

import java.util.Scanner;

public class ReportCard {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신의 이름은 무엇입니까?");
		String name = scanner.next();
		
		System.out.println("국어점수 입력: ");
		int korean = scanner.nextInt();
		
		System.out.println("영어점수 입력: ");
		int english = scanner.nextInt();
		
		System.out.println("수학점수 입력: ");
		int math = scanner.nextInt();
		
		System.out.println("과학점수 입력: ");
		int science = scanner.nextInt();
		
		int total = korean + english + math + science;
		double average = total / 4;
		
		String result = "";
		/*
		String result = "이름 : "
				+ name + " / 총점 : " + total + " / 평균 : " + average + "점으로 ";
		
		if (average >= 90.0) {
			result = "장학생";
		} else if (average >= 60.0) {
			result = "합격";
		} else {
			result = "불합격";
		}
		*/
		int key = (int) (average / 10);		// 지역변수의 초기화
		switch (key) {
		case 10:
		case 9:result = "장학생";break;
		case 8:
		case 7:
		case 6:result = "합격";break;
		default:result = "불합격";break;
		}
		System.out.println("이름 : " + name + " / 총점 : " + total + " / 평균 : " + average + "점으로 " + result + "입니다.");
	}
}