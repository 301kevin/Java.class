import java.util.Scanner;

public class Practice6 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		boolean[] ju = new boolean[5];
		
		while (true) {

			System.out.println("<실행 결과>");
			System.out.println("주차 관리 프로그램");
			System.out.println("**************");
			System.out.println("  1. 입차");
			System.out.println("  2. 출차");
			System.out.println("  3. 리스트");
			System.out.println("  4. 종료");
			System.out.println("**************");

			System.out.print("메뉴 : ");
			int select = scanner.nextInt();

			switch (select) {
			case 1:
				System.out.print("위치 입력 : ");
				int location = scanner.nextInt();
				if (location <= 5 && location > 0) {
					if (ju[location - 1]) {
						System.out.println(location + "위치에 입차 : 이미 주차되어있습니다.");
						break;
					} else {
						ju[location - 1] = true;
						System.out.println(location + "위치에 입차 : 주차되었습니다.");
						break;
					}
				} else {
					System.out.println("위치를 다시 확인해주세요");
					break;
				}
			case 2:
				System.out.print("위치 입력 : ");
				int location2 = scanner.nextInt();
				if (location2 <= 5 && location2 > 0) {
					if (ju[location2 - 1]) {
						ju[location2 - 1] = false;
						System.out.println(location2 + "위치에 출차 : 출차되었습니다.");
						break;
					} else {
						System.out.println(location2 + "위치에 출차 : 주차되어 있지 않습니다.");
						break;
					}
				} else {
					System.out.println("위치를 다시 확인해주세요");
					break;
				}
			case 3:
				for (int i = 0; i < ju.length; i++) {
					System.out.println(i + 1 + "위치 : " + ju[i]);
				}
				break;
			case 4:
				System.out.println("프로그램 종료");
				System.exit(0);
			default:
				System.out.println("잘못된 메뉴 선택입니다.");
			}
			
			System.out.println();

//			if (select == 1) {
//				System.out.print("위치 입력 : ");
//				int location = scanner.nextInt();
//				if (location <= 5 && location > 0) {
//					if (ju[location - 1] == true) {
//						System.out.println(location + "위치에 입차 : 이미 주차 되어있습니다.");
//					} else {
//						ju[location - 1] = true;
//						System.out.println(location + "위치에 입차 : 주차되있습니다");
//					}
//				} else {
//					System.out.println("위치 오류 다시 선택해주세요");
//					continue;
//				}
//			} else if (select == 2) {
//				System.out.print("위치 입력 : ");
//				int location = scanner.nextInt();
//				if (location <= 5 && location > 0) {
//					if (ju[location - 1] == true) {
//						ju[location - 1] = false;
//						System.out.println(location + "위치에 입차 : 출차되었습니다.");
//					} else {
//						System.out.println(location + "위치에 입차 : 주차되어 있지 않습니다.");
//					}
//				} else {
//					System.out.println("위치 오류 다시 선택해주세요");
//				}
//			} else if (select == 3) {
//				for (int i = 0; i < ju.length; i++) {
//					System.out.println(i + 1 + "위치 : " + ju[i]);
//				}
//			} else if (select == 4) {
//				System.out.println("종료되었습니다.");
//				break;
//			} else {
//				System.out.println("잘못된 메뉴 입니다.");
//			}

		}

	}
}
