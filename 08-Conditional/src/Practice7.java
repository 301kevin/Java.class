import java.util.Scanner;

public class Practice7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.printf("첫 번쨰 수 : ");
		double num1 = scanner.nextDouble();
		System.out.printf("두 번째 수 : ");
		double num2 = scanner.nextDouble();
		System.out.printf("연산자 : ");
		char oper = scanner.next().charAt(0);
		
		double result = 0;
		
		switch (oper) {
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
			result = num1 /num2;
		default:
			oper = 'E';
			break;
		}
		
		if(oper != 'E') {
			System.out.printf("%s %s %s = %s",num1,oper,num2,result);
		}else {
			System.out.println("연산자를 확인해주세요");
		}
		
		scanner.close();

		
	}
}
