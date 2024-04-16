import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		// 조건1 중간+기말/2 -> 0.6, 과제 -> 0.2, 출석 -> 0.2 / grade = (중간+기말)/2 * 0.6 + 과제 * 0.2
		// + 출석*0.2
		// 조건2 90<= A, 80<= B, 70<= C, 60<= D, else F
		// 조건3 A,B excellent / C,D good / F poor

		Scanner scanner = new Scanner(System.in);

		System.out.print("중간고사 점수를 입력하시오 : ");
		double mid = scanner.nextDouble();
		System.out.print("기말고사 점수를 입력하시오 : ");
		double fin = scanner.nextDouble();
		System.out.print("과제점수를 입력하시오 : ");
		double hom = scanner.nextDouble();
		System.out.print("출석점수를 입력하시오 : ");
		double att = scanner.nextDouble();
		System.out.println();

		double rec = ((mid + fin) / 2 * 0.6 + hom * 0.2 + att * 0.2);
		String grade = "";
		String comp = "";
		
		switch ((int)rec/10) {
		case 10:
		case 9:
			grade = "A";
			comp="excellent";
			break;
		case 8:
			grade = "B";
			comp="excellent";
			break;
		case 7:
			grade = "C";
			comp = "good";
			break;
		case 6:
			grade="D";
			comp = "good";
			break;
		default:
			grade="F";
			comp="poor";
			break;
		}
		
		System.out.printf("성적 : %.2f\n",rec);
		System.out.printf("학점 : %s\n",grade);
		System.out.printf("평가 : %s",comp);

		scanner.close();

	}

}
