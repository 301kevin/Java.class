
public class Exam3 {
	public static void main(String[] args) {
		// for문 대신 사용하는 while문
		// 1~10 합 구하기		
		int sum=0;
		int i=1;
		
		while(i<=10) {
			sum += i;
			i++;
		}
		
		System.out.println(sum);
	}
}
