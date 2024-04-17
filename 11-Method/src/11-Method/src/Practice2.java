import java.util.Scanner;

public class Practice2 {
	static String grade(double avg) {
		if (avg >= 90)
			return "A";
		else if (avg >= 80)
			return "B";
		else if (avg >= 70)
			return "C";
		else if (avg >= 60)
			return "D";
		else
			return "F";
	}
	static int input(String subject) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(subject + " 점수 입력 : ");
		int jumsu = scanner.nextInt();

		return jumsu;
	}
	static int calc_tot(int kor, int eng) {
		return kor + eng;
	}
	static double calc_avg(int tot) {
		return (double) tot / 2;
	}
	static void output(double avg) {
		System.out.println(grade(avg) + "학점입니다.");
	}
	public static void main(String[] args) {
		int kor, eng, tot;
		double avg;

		kor = input("국어");
		eng = input("영어");

		tot = calc_tot(kor, eng);
		avg = calc_avg(tot);

		output(avg);
	}
}
