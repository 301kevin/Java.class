import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("실행 결과");

		int[] jumsu = new int[5];
		int rank[] = new int[5];

		for (int i = 0; i < jumsu.length; i++) {
			System.out.print(i + 1 + "번 점수 입력 : ");
			jumsu[i] = scanner.nextInt();
			rank[i] = 1;
		}

		System.out.println("***결과***");
		for (int i = 0; i < jumsu.length; i++) {
			for (int j = 0; j < jumsu.length; j++) {
				if (jumsu[i] < jumsu[j]) {
					rank[i] += 1;

				}
			}
			System.out.println(jumsu[i] + "점 : " + rank[i] + "등");
		}

	}
}
