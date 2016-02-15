package operation;

import java.util.Scanner;

public class FirstGrade {
	public static void main(String[] args) {
		/**
		 * 첫번째 학생 이름, 평균
		 * 두번째 학생 이름, 평균
		 * 세번째 학생 이름,  평균
		 * 
		 * 결과 : 홍길동이 1등입니다.
		 * */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 학생 이름 : ");
		String name1 = scanner.next();
		System.out.println("첫 번째 학생 평균 : ");
		int student1 = scanner.nextInt();
		
		System.out.println("두 번째 학생 이름 : ");
		String name2 = scanner.next();
		System.out.println("두 번째 학생 평균 : ");
		int student2 = scanner.nextInt();
		
		System.out.println("세 번째 학생 이름 : ");
		String name3 = scanner.next();
		System.out.println("세 번째 학생 평균 : ");
		int student3 = scanner.nextInt();

		String result = "";		// 지역변수 (local variable)
									// 지역변수는 반드시 초기화를 해야 함
									// 초기화란 최초 지역변수를 선언할 때 NULL값을 할당하는 것
									// 변수는 카멜표기법으로 표기
									// 클래스는 파스칼표기법으로 표기
		
		if ((student1 > student2) && (student1 > student3)) {
			result = name1;
		} else if (student2 > student3) {
			result = name2;
		} else {
			result = name3;
		}
		
		System.out.println(result + "이 1등입니다.");
	}
}
