package prac1;

public class Practice1 {
	public static void main(String[] args) {

		DrawData drawData;

		drawData = new IsoTriangle();
		drawData.setHeight(10);
		drawData.setOutchar('x');
		drawData.draw();

		drawData = new Pyamid();
		drawData.setHeight(10);
		drawData.setOutchar('#');
		drawData.draw();

	}
}  