import java.util.Scanner;

public class Exam5 {
	static void input(int[] nn) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < nn.length; i++) {
			System.out.print(i + 1 + "번째 숫자 입력 : ");
			nn[i] = scanner.nextInt();
		}
	}

	static void output(int[] nn) {
		for(int i = 0;i<nn.length;i++) {
			System.out.print(nn[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] n = new int[5];
		input(n);
		output(n);
	}
}
