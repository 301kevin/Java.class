import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		// 임의의 정수 만들기
		Random random = new Random();

		// 0~9 사이의 정수 1개 만들기
		int num1 = random.nextInt(10);
		System.out.println(num1);

		// 10~99사이의 정수 1개 만들기
		int num2 = random.nextInt(90) + 10;
		System.out.println(num2);

		// A~Z : 65~90
		char ch = (char) (random.nextInt(26) + 65);
		System.out.println(ch);

	}
}
