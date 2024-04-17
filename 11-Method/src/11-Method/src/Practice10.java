import java.util.Scanner;

public class Practice10 {
	static int input_jumsu(int[] a) {
		Scanner sc = new Scanner(System.in);
		int tot = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "번 학생의 점수를 입력 : ");
			a[i] = sc.nextInt();
			tot += a[i];
		}
		return tot;
	}

	static double calc_avg(int tot, int[] a) {
		return (double) tot / a.length;
	}

	static void output(int tot, double avg) {
		System.out.printf("총점 : %d, 평균 : %.1f", tot, avg);
	}

	public static void main(String[] args) {
		int[] a = new int[5];
		int tot = 0;
		double avg = 0;

		tot = input_jumsu(a);

		avg = calc_avg(tot, a);

		output(tot, avg);

	}
}
