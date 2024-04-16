import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] score = new int[3][3];
		String[] name = { "홍길동", "김철수", "이영희" };
//		행 : 1차원 배열의 갯수, 1차원 레퍼런스 배열의 크기
//		열 : 1차원 배열의 크기

//		[3][3] = 3*3 = 9개 만들어짐
//		100 [200][300][400]
//		200 [00][01][02]
//		300 [10][11][12]
//		400 [20][21][22]
//		for문으로 []의 두개의 숫자를 각각 돌린다
//		변수는 첫번쨰 웬만하면 첫번쨰 포문안에
//		

//		score[0][0] = 75;
//		score[0][1] = 82;
//		score[0][2] = 95;
//
//		score[1][0] = 88;
//		score[1][1] = 64;
//		score[1][2] = 70;
//
//		score[2][0] = 100;
//		score[2][1] = 95;
//		score[2][2] = 90;

		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			int avg = 0;
			for (int j = 0; j < score[i].length; j++) {
				System.out.print("점수입력:");
				score[i][j] = scanner.nextInt();
				sum += score[i][j];
			}
			avg = sum / score[i].length;
			System.out.printf("%s, 총점 = %s, 평균 = %s\n", name[i], sum, avg);
		}

	}
}
