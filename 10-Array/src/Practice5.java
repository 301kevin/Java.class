import java.util.Random;

public class Practice5 {
	public static void main(String[] args) {
		Random random = new Random();

		// 65~90
		int[] a = new int[50];
		int[] alph_count = new int[26];

		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(26) + 65;
		}

		for (int i = 0; i < a.length; i++) {
			// 알파벳 : 'A'~'Z' (65~90) = > 26개
			for (int j = 0; j < 26; j++) {
				if (a[i] == j + 65) {
					alph_count[j]++;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print((char) a[i] + " ");
			if (i % 10 == 9)
				System.out.println();
		}
		
		for(int i = 0; i<alph_count.length;i++) {
			System.out.printf("%c : %d\n",(char)(i+65), alph_count[i]);
		}
	}
}
