package prac1;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Shape shape;

		while (true) {
			System.out.println("1.사각형  2.원  3.종료");
			System.out.print("select(1-3) : ");
			int select = scanner.nextInt();

			switch (select) {
			case 1:
				shape = new Rectangle();
				break;
			case 2:
				shape = new Circle();
				break;
			case 3:
				System.out.println("시스템 종료");
				System.exit(0);
			default:
				System.out.println("잘못된 선택입니다.");
				System.out.println();
				continue;
			}
			shape.onDraw();
			shape.onDelete();
			System.out.println();
		}
	}
}
 