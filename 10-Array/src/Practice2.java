import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int a = 0;
		System.out.println("---일수 구하기---");
		System.out.print("월 : ");
		int m = scanner.nextInt();
		System.out.print("일 : ");
		int d = scanner.nextInt();

		for (int i = 0; i < m - 1; i++) {
			a += months[i];
		}
		a += d;

		System.out.println();
		System.out.printf("1월1일부터 %d월%d일까지는 %d일 입니다", m, d, a);

		scanner.close();

	}
}
