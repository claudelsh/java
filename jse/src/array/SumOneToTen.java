package array;

public class SumOneToTen {
	public static void main(String[] args) {
		int[] arr;	// 배열의 선언
		arr = new int[3];
		// int[] a = new int[10];
		
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		/*for (int i = 0; i < 10; i++) {
			a[i] = i + 1;
		}*/
		
		int sum = 0;
		
		for (int i : a) {
			sum += i;
			System.out.println(i);
		}
		System.out.println(sum);
	}
}
