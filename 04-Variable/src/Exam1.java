
public class Exam1 {
	public static void main(String[] args) {
		// 변수의 선언 : 변수 만들기
		int num1;
		// 변수에 데이터 저장
		num1 = 100;
		// 저장된 데이터 확인
		System.out.println("num1 = " + num1);
		System.out.println("--------------------------");

		byte n1 = 100;
		System.out.println(n1);
		short n2 = 100;
		System.out.println(n2);
		int n3 = 100;
		System.out.println(n3);
		long n4 = 100;
		// 정수 상수를 사용할 떄 주의할 점
		// 4byte 크기(약 -20억 ~ 약 +20억)는 그냥 사용하지만,
		// 4byte가 넘을 떄는 숫자 뒤에 L을 붙여주어야 한다
		// => 8byte 데이터로 처리하라는 뜻
		System.out.println(n4);
		long n5 = 123456789123456789L;
		System.out.println(n5);
		System.out.println("--------------------------");

		// 실수 저장
		double num2 = 3.141592;
		System.out.println("num2 = " + num2);
		float num3 = 3.141592F;
		System.out.println(num3);

		// 문자 저장
		char ch1 = 'A';
		System.out.println("ch1 = " + ch1);

		// boolean 저장
		boolean b = true;
		System.out.println("b = " + b);

	}
}







