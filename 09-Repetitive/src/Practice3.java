import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("몇 단을 출력할지 입력하세요 : ");
			int gugu = scanner.nextInt();
			for (int i = 1; i < 10; i++)
				System.out.printf("%d * %d = %2d\n", gugu, i, gugu * i);
			System.out.println();
			System.out.print("계속할지 선택하세요 (y계속): ");
			String ask = scanner.next();

			if (ask.equals("y") || ask.equals("Y")) {
				continue;
			} else {
				System.out.println("종료");
				break;
			}
		}
		scanner.close();
	}

}
