import java.util.Scanner;

public class Pratice1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("이름 입력 : ");
		String n = scanner.next();

		System.out.print("기본급 입력 : ");
		int b = scanner.nextInt();

		double t = b * 0.033;

		System.out.printf("*** %s의 월급 ***\n", n);
		System.out.println("기본급 : " + b + "원");
		System.out.println("세금 : " + (int) t + "원");
		//System.out.printf("세금 : %.0f원\n", t);
		System.out.println("월급 : " + (int) (b - t) + "원");
		
		scanner.close();

	}

}
