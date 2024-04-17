
public class Exam3 {
	public static void main(String[] args) {
		String num = "9006071234567";

		String yy = num.substring(0, 2);
		String mm = num.substring(2, 4);
		String dd = num.substring(4, 6);
		String gender = num.substring(6, 7);

		switch (gender) {
		case "1":
			yy = "19" + yy;
			gender = "남자";
			break;
		case "2":
			yy = "19" + yy;
			gender = "여자";
			break;
		case "3":
			yy = "20" + yy;
			gender = "남자";
			break;
		case "4":
			yy = "20" + yy;
			gender = "여자";
			break;
		}

		System.out.printf("%s년 %s월 %s일 %s", yy, mm, dd, gender );

	}
}
