import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		double jumsu = scanner.nextDouble();
		String grade = "";
		
		switch((int)jumsu/10) {
		case 10:
		case 9: grade = "A";break;
		case 8: grade = "B";break;
		case 7: grade = "C";break;
		case 6: grade = "D";break;
		default: grade = "F";break;
		}
		
		System.out.println("학점 : " + grade);
		
		scanner.close();
	}
}
