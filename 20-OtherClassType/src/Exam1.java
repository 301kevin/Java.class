class Outer1 {
	int x = 10;
	Inner1 inner1 = new Inner1();

	void ex() {
		inner1.output();
	}

	class Inner1 {
		int y = 20;

		void output() {
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}

	}
}

public class Exam1 {
	public static void main(String[] args) {
		Outer1 outer1 = new Outer1();
		outer1.ex();
	}
}
