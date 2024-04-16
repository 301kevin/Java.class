import java.util.Scanner;

public class asdfd {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1, num2, result;
		char operator;
		
		System.out.println("첫 번째 숫자를 입력하세요 : ");
		num1 = scanner.nextDouble();
		
		System.out.println("두 번째 숫자를 입력하세요 : ");
		num2 = scanner.nextDouble();
		
		System.out.println("사칙연산 중 하나를 선택하세요");
		operator = scanner.next().charAt(0);
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if(num2 != 0) {
				result =num1 / num2;
			}else {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
			break;
			default:
				System.out.println("잘못된 연산자입니다");
				return;
		}
		System.out.println("결과 : " + result);
		scanner.close();
	}
	

}
