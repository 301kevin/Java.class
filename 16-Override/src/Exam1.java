
public class Exam1 {
	public static void main(String[] args) {
		Score score = new Score("홍길동", 90, 80, 70);
		score.output_result();
		System.out.println("---------------------------");
		
		Score2 score2 = new Score2("고길동", 90, 80, 80, 90, 70);
		score2.output_result();
		
	}
}
