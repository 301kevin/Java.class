
public class Exam2 {
	public static void main(String[] args) {
		String email = "student@java.com";
		
		// split() 사용
		String[] result1 = email.split("@");
		System.out.println(result1[0]);
		System.out.println(result1[1]);
		System.out.println("-----------------");
		
		// indexOf() + substring()
		int position = email.indexOf("@");
		System.out.println(email.substring(0,position));
		System.out.println(email.substring(position));
	}
}
