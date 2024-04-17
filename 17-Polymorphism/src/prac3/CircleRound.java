package prac3;

public class CircleRound extends Circle {

	public CircleRound(int r) {
		super(r);
	}

	@Override
	public void compute() {
		size = r * 2 * Pi;
	}
	
	@Override
	public void output() {
		System.out.println("원의 둘레 : " + size);
	}

}
