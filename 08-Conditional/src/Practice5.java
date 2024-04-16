import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("주민번호 7번째 자리를 입력하세요 : ");
		int num = scanner.nextInt();

		if (num == 1)
			System.out.println("1900년대 남성입니다");
		else if (num == 2)
			System.out.println("1900년대 여성입니다");
		else if (num == 3)
			System.out.println("2000년대 남성입니다");
		else if (num == 4)
			System.out.println("2000년대 여성입니다");
		else
			System.out.println("유효한 숫자가 아닙니다");
		
		scanner.close();
	}
}
