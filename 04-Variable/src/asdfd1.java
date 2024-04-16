import java.util.Random;
import java.util.Scanner;

public class asdfd1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int sNum = random.nextInt(100) + 1;
		int guess;
		int attepmts = 0;
		
		do {
			System.out.println("숫자 입력 : ");
			guess = scanner.nextInt();
			attepmts++;
			
			if(guess < sNum) {
				System.out.println("더 큰 수를 입력하시오");
			}else if(guess > sNum) {
				System.out.println("더 작은수를 입력하시오");
			}else {
				System.out.println("정답입니다!" + attepmts + "번만에 맞추셨습니다!");
			}
		}while(guess != sNum);
		
		scanner.close();

	}

}
