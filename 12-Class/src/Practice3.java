class Triangle3 {
	double base = 5.0;
	double height = 3.5;
	
	//입력
	void set(double b, double h) {
		base = b;
		height = h;
	}

	double getARea() {
		return (base * height) / 2;
	}

	double getHypotenuse() {
		return Math.sqrt(base * base + height * height);
	}

	double getPerimeter() {
		return getHypotenuse() + base + height;
	}

	void output() {
		System.out.printf("삼각형의 넓이 : %.2f\n", getARea());
		System.out.printf("삼각형의 빗변 : %.2f\n", getHypotenuse());
		System.out.printf("삼각형의 둘레 : %.2f", getPerimeter());
	}
}

public class Practice3 {
	public static void main(String[] args) {
		// 선언
		Triangle3 ob = new Triangle3();
		// 입력
		ob.set(10.5, 20.5);
		// 연산
		// 출력
		ob.output();

	}

//	공식 
//	넚이 = (밑변-높이)/2
//	빗변길이 = math.sqrt(밑변*밑변+높이+높이)
//	둘레길이 = 밑변+높이+빗변

//	결과
//	높이
//	빗변
//	둘레
}
