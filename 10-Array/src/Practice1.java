import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		// 학생 성적 저장할 변수 배열
		Scanner scanner = new Scanner(System.in);
		double sum = 0;
		double avg = 0;
		int[] jumsu = new int[5];

		for (int i = 0; i <= 4; i++) {
			System.out.printf("%d번 학생의 점수를 입력 : ", i + 1);
			jumsu[i] = scanner.nextInt();
			sum += jumsu[i];
		}
		avg = sum / jumsu.length;
		System.out.println();
		System.out.printf("총점 : %d, 평군 : %.1f", (int) sum, avg);

		scanner.close();
	}
}
