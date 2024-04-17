package prac3;

public class CircleArea extends Circle {

	public CircleArea(int r) {
		super(r);
	}
	
	@Override
	public void compute() {
		size = r * r * Pi;
	}
	
	@Override
	public void output() {
		System.out.println("원의 넓이 : " + size);
	}
	
}
