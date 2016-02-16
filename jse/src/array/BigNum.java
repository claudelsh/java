package array;

import java.util.Scanner;

public class BigNum {
	public static void main(String[] args) {
		/**
		 * 입력된 숫자에서 가장 큰 수 구하기
		 * */
		Scanner scanner = new Scanner(System.in);
		System.out.println("3개의 숫자를 입력하시오.");
		
		int[] arr = new int[3];
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("3개의 숫자 중 가장 큰 수는? " + max);
	}
}
