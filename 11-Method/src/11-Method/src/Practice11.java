import java.util.Scanner;

public class Practice11 {
	static int meun() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("상품 관리 프로그램");
		System.out.println("**************");
		System.out.println("   1. 입고");
		System.out.println("   2. 출고");
		System.out.println("   3. 목록");
		System.out.println("   4. 종료");
		System.out.println("**************");
		System.out.print("메뉴 : ");
		return scanner.nextInt();
	}

	static void in_goods(String[] n, int[] c, int[] p, int i) {
		Scanner scanner = new Scanner(System.in);
		int cc, pp;
		String name;

		if (i >= n.length) {
			System.out.println("더 이상 입고 시킬수가 없습니다.");
			return;
		}
		System.out.print("품명 : ");
		name = scanner.nextLine();
		System.out.print("수량 : ");
		cc = scanner.nextInt();
		System.out.print("단가 : ");
		pp = scanner.nextInt();
		n[i] = name;
		c[i] = cc;
		p[i] = pp;
		System.out.println("입고 되었습니다.");
	}

	static void out_goods(String[] n, int[] c, int[] p, int i) {
		Scanner scanner = new Scanner(System.in);
		int qq, flag = -1;
		String name;
		System.out.print("품명 : ");
		name = scanner.next();

		for (int y = 0; y < i; y++) {
			if (n[y].equals(name)) {
				flag = y;
				break;
			}
		}
		if (flag == -1) {
			System.out.println(name + " 물품 없음");
			return;
		}

		System.out.print("수량 : ");
		qq = scanner.nextInt();

		if (qq > c[flag]) {
			System.out.println("재고가 부족합니다. 재고 : " + c[flag]);
			return;
		}
		c[flag] -=  qq;
		System.out.println("출고 완료, 재고 : " + c[flag]);
	}

	static void compute(String[] n, int[] c, int[] p, int[] t, int i) {
		for (int x = 0; x < i; x++) {
			t[x] = c[x] * p[x];
		}
	}

	static void output_list(String[] n, int[] c, int[] p, int[] t, int i) {
		System.out.println("품명\t수량\t단가(원)\t총액(원)");
		for (int x = 0; x < i; x++) {
			System.out.printf("%s\t%s\t%s\t%d\n", n[x], c[x], p[x], t[x]);
		}
	}

	public static void main(String[] args) {
		int m = 0; // 메뉴번호
		int i = 0; // 품목개수
		String[] n = new String[5]; // 품명
		int[] c = new int[5]; // 수량
		int[] p = new int[5]; // 단가
		int[] t = new int[5]; // 총액

		while (true) {
			m = meun(); // 번호입력
			System.out.println();
			switch (m) {
			case 1: // 입고
				in_goods(n, c, p, i);
				i++;
				break;
			case 2: // 출고
				out_goods(n, c, p, i);
				System.out.println();
				break;
			case 3: // 목록보기
				compute(n, c, p, t, i);
				output_list(n, c, p, t, i);
				System.out.println();
				break;
			case 4: // 종료
				System.out.println("프로그램 종료");
				System.exit(0);
			default:
				System.out.println("메뉴 번호를 확인해주세요");
			}
			System.out.println();
		}
	}

}
