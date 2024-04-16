import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 선언 입력
		System.out.print("첫 번째 수 : ");
		int num1 = scanner.nextInt();
		System.out.print("두 번째 수 : ");
		int num2 = scanner.nextInt();
		
		// 연산 출력
		if (num1 < num2)
			System.out.printf("첫 번째 수(%d)가 두 번째 수 (%d)보다 작은 수 입니다.", num1, num2);
		else {
			if (num1 > num2)
				System.out.printf("첫 번째 수(%d)가 두 번째 수 (%d)보다 큰 수 입니다.", num1, num2);
			else
				System.out.printf("첫 번째 수(%d)와 두 번째 수 (%d)가 같은수 입니다.", num1, num2);
		}
		scanner.close();
	}
}
