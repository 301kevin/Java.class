import java.util.Scanner;

public class Pratice2 {
	public static void main(String[] args) {
		// 사용준비
		Scanner scanner = new Scanner(System.in);

		System.out.println("--입력--");
		System.out.println("***삼각형의 넓이 구하기***");

		// 선언 + 입력
		System.out.print("밑변 : ");
		double w = scanner.nextDouble();

		System.out.print("높이 : ");
		double h = scanner.nextDouble();

		System.out.println();

		// 연산 + 출력
		System.out.println("--출력--");
		System.out.printf("넓이 : %.2f", (w * h) / 2);

		scanner.close();
	}
}
