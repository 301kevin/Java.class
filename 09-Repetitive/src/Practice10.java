import java.util.Random;
import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		int num2 = 0, num3 = 0, num4 = 0, num5 = 0;

		String select = "";
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		while (true) {
			int ans = 0, grade = 0;
			for (int i = 1; i <= 5; i++) {
				num2 = random.nextInt(9); // + 10;
				num3 = random.nextInt(9); // + 10;
				num5 = num2 + num3;
				System.out.println("<실행 결과>");

				int chances = 2;
				while (chances > 0) {
					System.out.printf("[%d] %d + %d = ", i, num2, num3);
					num4 = scanner.nextInt();
					if (num4 == num5) {
						System.out.println("딩동뎅");
						grade += 20;
						ans++;
						break;
					} else {
						chances--;
						if (chances > 0) {
							System.out.println("틀렷따...");
						} else {
							System.out.println("틀렷따... 정답 : " + num5);
						}
					}
				}
			}
			System.out.printf("당신은 총 %d문제를 맞추어서 %d점 입니다.", ans, grade);
			System.out.println();

			while (true) {
				System.out.print("continue(y/n) : ");
				select = scanner.next();
				if (select.equals("n")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				} else if (select.equals("y")) {
					System.out.println("다시 시작");
					break;
				} else {
					System.out.println("잘못된 입력 입니다.");
				}
			}
			scanner.close();
		}

	}
}
