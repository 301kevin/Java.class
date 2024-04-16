import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		System.out.print("배열 크기 : ");
		int s = scanner.nextInt();

		int[] ar = new int[s];
		int big = ar[0];
		int sm = ar[0];

		for (int i = 0; i < ar.length; i++) {
			System.out.printf("ar[%d] : ", i);
			ar[i] = scanner.nextInt();
			sum += ar[i];
			sm = ar[0];
			big = ar[0];
			if (big < ar[i]) {
				big = ar[i];
			}
			if (sm > ar[i]) {
				sm = ar[i];
			}
		}

		System.out.println();

		for (int v = 0; v < ar.length; v++) {
			System.out.printf("%d ", ar[v]);
		}

		System.out.println();
		System.out.println("합 = " + sum);
		System.out.println("최대값 = " + big);
		System.out.println("최솟값 = " + sm);

		scanner.close();

	}
}
