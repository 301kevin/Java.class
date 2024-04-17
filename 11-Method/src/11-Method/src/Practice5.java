import java.util.Scanner;

public class Practice5 {
	static double input(String a) {
		Scanner sc = new Scanner(System.in);
		System.out.print(a + "점수를 입력하시오 : ");
		return sc.nextDouble();
	}

	static double calc_avg(double mid, double fin) {
		return (mid + fin) / 2;
	}

	static double calc_final_score(double avg, double hom, double att) {
		return (avg * 0.6 + hom * 0.2 + att * 0.2);
	}

	static String calc_grade(double rec) {
		String grade = "";
		if (rec >= 90 && rec <= 100)
			grade = "A";
		else if (rec >= 80)
			grade = "B";
		else if (rec >= 70)
			grade = "C";
		else if (rec >= 60)
			grade = "D";
		else
			grade = "F";
		return grade;
	}

	static String get_review(String grade) {
		String comp = "";
		if (grade.equals("A") || grade.equals("B")) {
			comp = "excellent";
		} else if (grade.equals("C") || grade.equals("D")) {
			comp = "good";
		} else if (grade.equals("F")) {
			comp = "poor";
		}
		return comp;
	}

	static void output(double rec, String grade, String comp) {
		System.out.printf("성적 = %.2f\n", rec);
		System.out.println("학점 = " + grade);
		System.out.println("평가 = " + comp);
	}

	public static void main(String[] args) {
		double mid = input("중간고사 ");
		double fin = input("기말고사 ");
		double hom = input("과제 ");
		double att = input("출석 ");

		System.out.println();

		double avg = calc_avg(mid, fin);
		double rec = calc_final_score(avg, hom, att);

		String grade = calc_grade(rec);

		String comp = get_review(grade);

		output(rec, grade, comp);
	}

}
