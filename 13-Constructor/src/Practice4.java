import java.util.Scanner;

class Score {
	private String grade, comp;
	private double mid, fin, hom, att, avg;
	Scanner scanner = new Scanner(System.in);

	public void input() {
		System.out.print("중간고사를 입력하시오 : ");
		mid = scanner.nextDouble();
		System.out.print("기말고사를 입력하시오 : ");
		fin = scanner.nextDouble();
		System.out.print("과제점수를 입력하시오 : ");
		hom = scanner.nextDouble();
		System.out.print("출석점수를 입력하시오 : ");
		att = scanner.nextDouble();
	}

	public double setAvg() {
		avg = ((mid + fin) / 2) * 0.6 + hom * 0.2 + att * 0.2;
		return avg;
	}

	public String setGrade() {
		if (avg >= 90 && avg <= 100)
			grade = "A";
		else if (avg >= 80)
			grade = "B";
		else if (avg >= 70)
			grade = "C";
		else if (avg >= 60)
			grade = "D";
		else
			grade = "F";
		return grade;
	}

	public String setComp() {
		if (grade.equals("A") || grade.equals("B")) {
			comp = "excellent";
		} else if (grade.equals("C") || grade.equals("D")) { 
			comp = "good";
		} else if (grade.equals("F")) {
			comp = "poor";
		}
		return comp;   
	}

	public void view() {
		System.out.printf("성적 = %.2f\n", avg);
		System.out.println("학점 = " + grade);
		System.out.println("평가 = " + comp);
	}
}  

public class Practice4 {
	public static void main(String[] args) {
		Score s = new Score();
		s.input();
		s.setAvg();
		s.setGrade();
		s.setComp();
		s.view();
	}
}
