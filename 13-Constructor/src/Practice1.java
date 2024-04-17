class Triangle {
	double b, h;

	Triangle() {

	}

	Triangle(int b, int h) {
		this.b = b;
		this.h = h;
	}

	void setTriangle(int b, int h) {
		this.b = b;
		this.h = h;
	}

	double getArea() {
		return b * h / 2;
	}
}

public class Practice1 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.setTriangle(5, 12);
		System.out.println("삼각형의 넓이 : " + t1.getArea());

		Triangle t2 = new Triangle(45, 7);
		System.out.println("삼각형의 넓이 : " + t2.getArea());
	}
}
