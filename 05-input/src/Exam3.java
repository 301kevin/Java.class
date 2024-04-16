// 사용 준비 1
import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		// 사용 준비 2
		Scanner sc = new Scanner(System.in);
		
		// 선언 + 입력
		System.out.print("이름 : ");
		String name = sc.next();		//문자열
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();			//정수
		
		System.out.print("영어 : ");
		double eng = sc.nextDouble();	//실수
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);	//문자
		
		System.out.print("boolean 값 : ");
		boolean b = sc.nextBoolean();	//boolean
		
		System.out.println();			//보기 좋으라고 한줄 넘기기
		
		// 출력
		System.out.println(name + " : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("문자 : " +ch);
		System.out.println("boolean 값 : " + b); 
		
		sc.close();
	}
}




