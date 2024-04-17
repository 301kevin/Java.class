package prac1;

public abstract class Circle {
	private int r;
	private double size;
	private final double Pi = 3.141592;

	public Circle(int r) {
		this.r = r;
	}

	public abstract void compute();

	public abstract void output();

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public double getPi() {
		return Pi;
	}

}
