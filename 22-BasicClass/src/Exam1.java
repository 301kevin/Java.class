
public class Exam1 {
	public static void main(String[] args) {
		// 정수 데이터 저장
		int a = 5;
		System.out.println(a);

		Integer b = 7;
		System.out.println(b);

		Integer c = new Integer(9);
		System.out.println(c);

		Object object = b;
		System.out.println(object);

		Integer d = (Integer) object;
		System.out.println(d);
		// 숫자로 구성된 문자열 데이터를 정수로 변환
		String str_a = "127";
		int aa = Integer.parseInt(str_a); // 정수로 구성된 문자열을 정수로 변경하는 함수
		System.out.println(str_a + 100);
		System.out.println(aa + 100);

	}
}
