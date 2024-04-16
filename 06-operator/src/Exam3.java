
public class Exam3 {
	public static void main(String[] args) {
		int num1 = 100;
		System.out.println(num1);

		num1 = num1 + 100;
		System.out.println(num1);

		num1 += 100; // +가 우선 연산자임으로 num1 + 100이 먼저 처리되고 200(num1 + 100) = num1이 된다.
		System.out.println(num1);

		num1 -= 100; // -가 우선 연산자임으로 num1 - 100이 먼저 처리되고 300(num1 - 100) = num1이 된다.
		System.out.println(num1);

		num1 *= 2; // *가 우선 연산자임으로 num1 * 2 이 먼저 처리되고 200(num1 * 2) = num1이 된다.
		System.out.println(num1);

		num1 /= 100; // /가 우선 연산자임으로 num1 / 100이 먼저 처리되고 400(num1 / 100) = num1이 된다.
		System.out.println(num1);
		
		num1 %= 5; // %가 우선 연산자임으로 num1 % 100이 먼저 처리되고 4(num1 % 100) = num1이 된다.
		System.out.println(num1);
		
	}
}
