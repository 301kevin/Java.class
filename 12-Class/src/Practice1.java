import java.util.Scanner;

class Triangle {
	int base, height;
	static Scanner scanner = new Scanner(System.in);

	void setTriangle(int b, int h) {
		base = b;
		height = h;
	}

	void setTriangle() {
		System.out.print("밑변 : ");
		base = scanner.nextInt();
		System.out.print("높이 : ");
		height = scanner.nextInt();
	}

	int getArea() {
		return (base * height) / 2;
	}
	void output() {
		System.out.println("삼각형의 넓이 : " + getArea());
	}
}

public class Practice1 {
	public static void main(String[] args) {
		System.out.println("*** 삼각형 넓이 구하기 ***");

		Triangle t = new Triangle();
		t.setTriangle();

		t.output();
	}

}
