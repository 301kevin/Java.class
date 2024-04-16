import java.util.Scanner;

public class Pratice3 {
	public static void main(String[] args) {
		// 사용준비
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("<실행결과>");
		
		// 선언 + 입력
		System.out.print("이름? ");
		String name = scanner.next();
		
		System.out.print("국어? ");
		int kor = scanner.nextInt();
		
		System.out.print("영어? ");
		int eng = scanner.nextInt();
		
		System.out.print("수학? ");
		int mat = scanner.nextInt();
		
		System.out.println();
		
		// 연산 + 출력
		System.out.println("이름 : " + name + "\n총점 : " + (kor+eng+mat));
		
		scanner.close();
	}
}
