
public class practice1 {
	public static void main(String[] args) {
		String data = "D:/photo/2021/travel/food.jpg";

		int position1 = data.lastIndexOf("/");
		int position2 = data.indexOf(".");
		System.out.println("파일 이름 : " + data.substring(position1 + 1, position2));
		System.out.println("확장자 : " + data.substring(position2 + 1));
		System.out.println("폴더 이름 : " + data.substring(0, position1));
	}
}
