import java.util.Scanner;

public class Pratice2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("금액 입력(10000원 미만으로) : ");
			int s = scanner.nextInt();
			int a = s / 1000;
			int b = (s % 1000) / 100;
			int c = (s % 100) / 10;
			int d = s % 10;

			if (s > 10000) {
				System.out.println("10000원 미만으로 적어주세요");
			} else {

				System.out.printf("금액 : %d원\n", s);
				System.out.printf("천원 : %d장\n", a);
				System.out.printf("백원 : %d개\n", b);
				System.out.printf("십원 : %d개\n", c);
				System.out.printf("일원 : %d개\n", d);
				break;
			}

		}
		scanner.close();

	}
}
