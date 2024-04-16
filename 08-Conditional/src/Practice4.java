import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 선언 입력
		System.out.print("국어 점수 : ");
		int kor = scanner.nextInt();
		System.out.print("영어 점수 : ");
		int eng = scanner.nextInt();
		System.out.print("수학 점수 : ");
		int mat = scanner.nextInt();
		//연산
		int sum = kor + eng + mat;
		// 연산 출력
		System.out.println();
		
		if(sum / 3 >= 60 && kor >= 40 && eng >= 40 && mat >= 40) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		scanner.close();
		
	}
}
