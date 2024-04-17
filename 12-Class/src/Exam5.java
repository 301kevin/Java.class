import java.util.Scanner;

class Score {
	Scanner scanner = new Scanner(System.in);
	int num;
	String name;
	int kor, eng, mat, tot, avg;

	void set() { // void set(Score this)
		System.out.println(this);
		System.out.print("학번 : ");
		num = scanner.nextInt();
		System.out.print("이름 : ");
		name = scanner.next();
		System.out.print("국어 : ");
		kor = scanner.nextInt();
		System.out.print("영어 : ");
		eng = scanner.nextInt();
		System.out.print("수학 : ");
		mat = scanner.nextInt();
		this.tot = this.kor + this.eng + this.mat;
		this.avg = this.tot / 3;
	}

	void print() {
		System.out.println(this);
		System.out.println("학번\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\t %s", this.num, this.name, this.kor, this.eng, this.mat,
				this.tot, this. avg);
	}
}

public class Exam5 {
	public static void main(String[] args) {
		Score s1 = new Score();
		Score s2 = new Score();
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		s1.set();	// s1.set(s1);
		s2.set();	// s2.set(s2);
		s1.print();	// s1.print(s1);
		s2.print();	// s2.print(s2);
		
	}
}
