package forloop;

public class PrintOneToTen {
	public static void main(String[] args) {
		// escape 문자 : \t => tab
		int odd = 0, even = 0;
		
		for (int i = 0; i <= 10; i++) {
			// System.out.print(i + "\t");
			if ((i % 2) == 0) {
				odd += i;
			} else {
				even += i;
			}
		}
		System.out.println("짝수의 합 : " + odd);
		System.out.println("홀수의 합 : " + even);
	}
}