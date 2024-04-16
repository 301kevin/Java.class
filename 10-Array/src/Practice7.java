
public class Practice7 {
	public static void main(String[] args) {
		int[][] num = { { 1, 2, 3, 0 }, { 4, 5, 6, 0 }, { 7, 8, 9, 0 }, { 0, 0, 0, 0 } };

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num[i].length - 1; j++) {
				num[i][3] += num[i][j];
				num[3][j] += num[i][j];
				num[3][3] += num[i][j];
			}
		 }
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.printf("%2s ", num[i][j]);
			}
			System.out.println();
		}
//		num[0][3] = num[0][0] + num[0][1] + num[0][2];
//		num[1][3] = num[1][0] + num[1][1] + num[1][2];
//		num[2][3] = num[2][0] + num[2][1] + num[2][2];
//
//		num[3][0] = num[0][0] + num[1][0] + num[2][0];
//		num[3][1] = num[0][1] + num[1][1] + num[2][1];
//		num[3][2] = num[0][2] + num[1][2] + num[2][2];
//
//		num[3][3] = num[3][0] + num[3][1] + num[3][2];
//
//		for (int i = 0; i < num.length; i++) {
//			for (int j = 0; j < num[i].length; j++) {
//				System.out.printf("%2s ", num[i][j]);
//			}
//			System.out.println();
//		}
	}
}
