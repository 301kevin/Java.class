import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("국어점수 입력 : ");
		int kor = scanner.nextInt();
		System.out.print("영어점수 입력 : ");
		int eng = scanner.nextInt();

		int sum = kor + eng;
		double avg = (double) sum / 2;
		String grade = "";

		if (avg >= 90) grade = "A";
		else if (avg >= 80) grade = "B";
		else if (avg >= 70) grade = "C";
		else if (avg >= 60) grade = "D";
		else grade = "F";
		
		System.out.println("총점 : " + sum);
		System.out.println("평군 : " + avg);
		System.out.println("학점 : " + grade);

		scanner.close();

	}
}
//import java.util.Scanner;
//
//public class Practice5 {
//   public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      
//      System.out.print("국어점수 입력: ");
//      int kor = sc.nextInt();
//      System.out.print("영어점수 입력: ");
//      int eng = sc.nextInt();
//      
//      int tot = kor+eng;
//      System.out.println("총점 = " + tot);
//      
//      int avg = tot/2;
//      System.out.println("평균 = " + avg);
//      
//      if (avg >=90) {
//         System.out.println("학점 = A" );
//      }else if(avg >=80) {
//         System.out.println("학점 = B");
//      }else if(avg >=70) {
//         System.out.println("학점 = C");
//      }else if(avg >=60) {
//         System.out.println("학점 = D");
//      }else {
//         System.out.println("학점 = F");
//      }      
//      
//   }
//
//}
