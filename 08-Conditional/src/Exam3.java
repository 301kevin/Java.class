import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 선언 입력
		System.out.print("정수 입력 : ");
		int jumsu = scanner.nextInt();
		
		// 연산 출력
		if (jumsu >= 90) {
			System.out.println("A학점");
		} else if (jumsu >= 80) {
			System.out.println("B학점");
		} else if (jumsu >= 70) {
			System.out.println("C학점");
		} else if (jumsu >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		
		scanner.close();
	}
}
