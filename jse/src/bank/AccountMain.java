package bank;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        
		// [ 한빛뱅크 ] 홍길동 : 1234계좌, 잔고 1000원
		System.out.println("이름 / 비밀번호");
		
		AccountService account = new AccountServiceImpl();
		System.out.println(account.open(scanner.next(), scanner.nextInt()));
		
		System.out.println("입금 금액 입력 : ");
		System.out.println("금액 : " + account.deposit(scanner.nextInt()));
		
		System.out.println("출금 금액 입력 : ");
		System.out.println("금액 : " + account.withdraw(scanner.nextInt()));
		
		System.out.println("\n잔액 : " + account.search());
		}
}
