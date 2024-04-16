import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		System.out.print("년도 입력 : ");
		int year = scanner.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			System.out.println(year + "년도는 윤년입니다");
		else
			System.out.println(year + "년도는 평년입니다");

		scanner.close();
	}

}
