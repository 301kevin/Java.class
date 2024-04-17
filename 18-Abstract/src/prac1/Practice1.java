package prac1;

public class Practice1 {
	public static void main(String[] args) {
		// 1. 부모 클래스 기준 사용 (다양성 방법)
		Circle[] circle = new Circle[2];
		circle[0]= new CircleArea(10);
		circle[1]= new CircleRound(10);
		for (int i = 0; i < circle.length; i++) {
			circle[i].compute();
			circle[i].output();
		}
		System.out.println("----------------");

		// 2. 자식 클래스 기준 사용 (기본 사용법)
		CircleArea circleArea = new CircleArea(10);
		circleArea.compute();
		circleArea.output();
		CircleRound circleRound = new CircleRound(10);
		circleRound.compute();
		circleRound.output();
	}
}
