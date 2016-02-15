package operation;

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
		
		String result = "이름 : "
				+ name + " / 총점 : " + total + " / 평균 : " + average + "점으로 ";
		
		if (average >= 90.0) {
			System.out.println(result + "장학생입니다.");
		} else if (average >= 60.0) {
			System.out.println(result + "합격입니다.");
		} else {
			System.out.println(result + "불합격입니다.");
		}
	}
}
