import java.util.Scanner;

public class Practice9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int select = 0;
		int money = 0;
		int withdraw = 0;
		int balance = 0;

		while (select != 4) {
			System.out.println("<실행 결과>");
			System.out.println("1.입금 2.출금 3.잔고 4. 종료");

			System.out.print("번호선택 : ");
			select = scanner.nextInt();

			switch (select) {
			case 1:
				System.out.print("입금액 : ");
				money = scanner.nextInt();
				balance += money;
				break;
			case 2:
				System.out.print("출금할 금액 :  ");
				withdraw = scanner.nextInt();
				balance -= withdraw;
				break;
			case 3:
				System.out.println("잔고액 : " + balance);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
			System.out.println();
		}
		scanner.close();

	}
}
