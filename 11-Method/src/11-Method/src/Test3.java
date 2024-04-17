import java.util.Scanner;

public class Test3 {
	static int kor, eng, tot;
	static double avg;

	static char grade() {
		if (avg >= 90)
			return 'A';
		else if (avg >= 80)
			return 'B';
		else if (avg >= 70)
			return 'C';
		else if (avg >= 60)
			return 'D';
		else
			return 'F';
	}

	static int input(String subject) {
		Scanner sc = new Scanner(System.in);
		System.out.print(subject + " 점수 입력: ");
		int jumsu = sc.nextInt();
		return jumsu;
	}

	static void calc_tot() {
		tot = kor + eng;
	}

	static void calc_avg() {
		avg = (double) tot / 2;
	}

	static void output() {
		System.out.println(grade() + "학점입니다.");
	}

	public static void main(String[] args) {
		// 선언

		// 입력
		kor = input("국어");
		eng = input("영어");
		// 연산
		calc_tot();
		calc_avg();
		// 출력
		output();
	}
}
