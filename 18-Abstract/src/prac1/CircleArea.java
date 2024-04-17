package prac1;

public class CircleArea extends Circle{

	public CircleArea(int r) {
		super(r);
	}

	@Override
	public void compute() {
		setSize(getR() * getR() * getPi());
		
	}

	@Override
	public void output() {
		System.out.println("원의 넓이 : " + getSize());
		
	}

}
