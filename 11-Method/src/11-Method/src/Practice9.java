import java.util.Scanner;

public class Practice9 {
	static String input_name() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("품명을 입력하시오 : ");
		return scanner.next();
	}

	static int input_num(String name) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(name + "을 입력하시오 : ");
		return scanner.nextInt();
	}

	static int compute(int count, int price) {
		return count * price;
	}

	static void output(String name, int count, int price, int tot) {
		System.out.printf("품명 : %s\n", name);
		System.out.printf("수량 : %s\n", count);
		System.out.printf("단가 : %s\n", price);
		System.out.printf("총액 : %,d원\n", tot);
	}

	public static void main(String args[]) {
		// 선언
		int count = 0, price = 0, tot = 0;
		String name = "";
		// 입력
		name = input_name();
		count = input_num("수량");
		price = input_num("단가");
		System.out.println();
		// 연산
		tot = compute(count, price);
		// 출력
		output(name, count, price, tot);

	}
}
