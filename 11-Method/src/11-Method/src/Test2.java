import java.util.Scanner;

public class Test2 {
	static int input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		return num;
	}

	static int plus(int a, int b) {
		return a + b;
	}

	static void output(int a, int b, int c) {
		System.out.printf("%d + %d = %d\n", a, b, c);
	}

	public static void main(String[] args) {

//		선언 : 변수 만들기
		int a = 0, b = 0, c = 0;
//		입력 : 변수에 데이터 저장하기
		a = input();
		b = input();
//		연산 : 변수에 저장된 데이터 가공하기
		c = plus(a, b);
//		출력 : 결과값 확인하기
		output(a,b,c);
	}
}
