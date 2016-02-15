package switchcase;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자 입력 : ");
		int firstNum = scanner.nextInt();
		System.out.println("연산자 입력 : ");
		String opcode = scanner.next();
		System.out.println("두 번째 숫자 입력 : ");
		int secondNum = scanner.nextInt();
		
		int result = 0;
		
		switch (opcode) {
		case "+":result = firstNum + secondNum; break;
		case "-":result = firstNum - secondNum; break;
		case "*":result = firstNum * secondNum; break;
		case "/":result = firstNum / secondNum; break;
		case "%":result = firstNum % secondNum; break;
		default:System.out.println("연산기호를 정확하게 입력해 주세요.");
			break;
		}
		System.out.println(firstNum + " " + opcode + " " + secondNum + " = " + result);
	}
}
