package prac1;

public class Pyamid extends DrawData {
	void draw() {
		for (int i = 0; i < getHeight(); i++) {
			for (int j = 0; j < getHeight() - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print(getOutchar());

			}
			System.out.println();

		}
	}
}