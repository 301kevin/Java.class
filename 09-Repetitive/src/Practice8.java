import java.util.Scanner;

public class Practice8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int select = 0;

		while (true) {
			System.out.println("<실행결과>");
			System.out.println("*************");
			System.out.println("1. 입력");
			System.out.println("2. 검색");
			System.out.println("3. 삭제");
			System.out.println("4. 종료");
			System.out.println("*************");

			System.out.print("번호 선택 : ");
			select = scanner.nextInt();
			System.out.println();

//			if (select == 1) {
//				System.out.println("입력을 선택하였습니다\n");
//			} else if (select == 2) {
//				System.out.println("검색을 선택하였습니다\n");
//			} else if (select == 3) {
//				System.out.println("삭제을 선택하였습니다\n");
//			} else if (select == 4) {
//				System.out.println("프로그램을 종료합니다.");
//			}else {
//				System.out.println("잘못입력하셨습니다.\n");
//			}
			
			switch (select) {
			case 1:
				System.out.println("입력을 선택하였습니다\n");
				break;
			case 2:
				System.out.println("검색을 선택하였습니다\n");
				break;
			case 3:
				System.out.println("삭제을 선택하였습니다\n");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.\n");
//				return;
				System.exit(0); 
			default:
				System.out.println("잘못입력하셨습니다\n");
				break;
			}
			scanner.close();

		}
	}
}
