import java.util.Scanner;

class AAA {
	static Scanner scanner = new Scanner(System.in);
	// 선언
	static int a, b, c;

	// 입력
	void input() {
		System.out.print("정수 입력 : ");
		a = scanner.nextInt();
		System.out.print("정수 입력 : ");
		b = scanner.nextInt();
	}

	// 연산
	void plus() {
		c = a + b;
	}

	// 출력
	void output() {
		System.out.printf("%d + %d = %d\n", a, b, c);
	}
}

public class Test1 {

	public static void main(String[] args) {
		AAA aa = new AAA();
		aa.input();
		aa.plus();
		aa.output();

	}
}
