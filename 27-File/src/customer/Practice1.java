package customer;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Customer customer = new CustomerImpl();
		int num = 0;

		while (true) {
			do {
				System.out.println("1. 입력");
				System.out.println("2. 출력");
				System.out.println("3. 고객번호 검색");
				System.out.println("4. 이름 검색");
				System.out.println("5. 번호 검색");
				System.out.println("6. 이름 내림차순 정렬");
				System.out.println("7. 고객번호 오름차순 정렬");
				System.out.println("8. 파일 저장");
				System.out.println("9. 파일 읽기");
				System.out.println("10. 종료");
				System.out.println("-------------------");
				System.out.print("번호 : ");
				num = sc.nextInt();
			} while (num < 1 || num > 10);
			System.out.println();

			switch (num) {
			case 1:
				customer.input();
				break;
			case 2:
				customer.print();
				break;
			case 3:
				customer.searchCN();
				break;
			case 4:
				customer.searchN();
				break;
			case 5:
				customer.searcgT();
				break;
			case 6:
				customer.descSortN();
				break;
			case 7:
				customer.ascSortCN();
				break;
			case 8:
				customer.write();
				break;
			case 9:

				break;
			case 10:
				System.out.println("프로그램 종료");
				System.exit(0);
				sc.close();
			}
			System.out.println();
		}
	}
}
