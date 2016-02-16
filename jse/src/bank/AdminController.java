package bank;

import java.util.Scanner;

public class AdminController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AdminService admin = new AdminServiceImpl();
		
		while (true) {
			System.out.println("업무 선택 : \n 1. 전체 계좌 수 조회\n 2. 계좌번호로 해당 계좌 정보 조회"
					+ "\n 3. 이름으로 계좌 정보 조회\n 4. 계좌 삭제\n 5. 종료");
			switch (scanner.nextInt()) {
			case 1:
				admin.countAll();
				break;
			case 2:
				admin.searchAccountByAccountNo(scanner.nextInt());
				break;
			case 3:
				admin.searchAccountByName(scanner.next());
				break;
			case 4:
				admin.closeAccount(scanner.nextInt());
				break;
			case 5:System.out.println("종료합니다.");return;
			default:
				System.out.println("1~5번 사이에서 선택 가능합니다.");
				System.out.println("다시 선택해 주세요.");
				break;
			}
		}
	}
}
