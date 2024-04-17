package prac1;

public class Practice1 {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setR(10);

		Circle areaCircle = new Circle() {
			@Override
			public void compute() {
				setSize(getR() * getR() * getPi());
			}

			@Override
			public void output() {
				System.out.println("원의 넓이 : " + getSize());
			}
		};
		areaCircle.setR(10);
		areaCircle.compute();
		areaCircle.output();

		Circle roundCircle = new Circle() {
			@Override
			public void compute() {
				setSize(getR() * 2 * getPi());
			}

			@Override
			public void output() {
				System.out.println("원의 둘레 : " + getSize());
			}
		};

		roundCircle.setR(10);
		roundCircle.compute();
		roundCircle.output();

	}
}
