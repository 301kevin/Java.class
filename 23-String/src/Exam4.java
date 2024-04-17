
public class Exam4 {
	public static void main(String[] args) {
		int a = 5;
		double b = 3.14;
		char c = 'A';
		boolean d = true;

		System.out.println(String.valueOf(a) instanceof String);
		System.out.println("---------------------");

		String str_a = String.valueOf(a);
		String str_b = String.valueOf(b);
		String str_c = String.valueOf(c);
		String str_d = String.valueOf(d);

		System.out.println(str_a);
		System.out.println(str_b);
		System.out.println(str_c);
		System.out.println(str_d);

	}
}
