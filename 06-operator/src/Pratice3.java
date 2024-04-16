import java.util.Scanner;

public class Pratice3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num1 = scanner.nextInt();
		System.out.print("정수 입력 : ");
		int num2 = scanner.nextInt();

		String stra = ("첫 번째 수(" + num1 + ")가 두번째 수(" + num2 + ")보다 작은 수 입니다.");
		String strb = ("첫 번째 수(" + num1 + ")가 두번째 수(" + num2 + ")보다 큰 수 입니다.");
		String strc = ("첫 번째 수(" + num1 + ")가 두번째 수(" + num2 + ") 같은 수 입니다.");

		System.out.printf(num1 > num2 ? strb : (num1 == num2 ? strc : stra));
		
		scanner.close();

	}

}
