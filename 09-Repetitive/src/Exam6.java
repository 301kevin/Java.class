
public class Exam6 {
	public static void main(String[] args) {
		// 1 ~ 10 사이의 홀수의 합 구하기
		int sum = 0;
		
		// continue
		// for : 증감식으로 이용
		// while : 조건식으로 이용
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				continue;
			sum += i;
		}

		System.out.println("sum = " + sum);
	}
}
