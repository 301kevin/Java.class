import java.util.Scanner;

public class Test1 {
	static int input(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		return scanner.nextInt();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 선언
		int a, b, c;
		// 입력
		a = input();
		System.out.print("정수 입력 : ");
		b = scanner.nextInt();
		// 연산
		c = a + b;
		// 출력
		System.out.printf("%d + %d = %d\n", a, b, c);
	}
//	// 결과자료형 : 컴퓨터에게 리턴값의 자료형을 알려주는 것
//	// plus = 매개변수 : 다른 함수에서 전달된 데이터를 저장하는 변수
//	static int plus(int x, int y) {
//		return x + y;	 // return : 호출된 곳으로 되돌아 가라는 명령어 만일, 결과값이 있다면 그 값을 가지고 되돌아감
//	}		// 결과값 (= return값)
//	
//	static void output (int a) {
//		System.out.println(a);
////		return; // 함수의 마지막 줄에 있는 리턴값이 없는 return은 생략가능함
//	}
//
//	public static void main(String[] args) {
//		// 선언;
//		int a = 0;
//		// 입력
//		// 연산
//		a = plus(5, 7); // 함수의 호출 : 함수의 사용법 소괄호 안에 데이터가 있을 경우, 그 데이터를 가지고 함수로 이동함
//		// 출력
//		output(a);
//	}
}
