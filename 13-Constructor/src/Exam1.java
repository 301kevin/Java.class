class Book{
	String subject;
	String content;
	
	Book(){
		System.out.println("Book() 호출");
		subject = "Java 입문";
		content = "Java는 여러 방면에 사용됩니다.";
	}
	void read() {
		System.out.println(subject);
		System.out.println(content);
	}
}
public class Exam1 {
	public static void main(String[] args) {
		Book book = new Book();
		book.read();
//		book.Book();	생성자는 개별적으로 호출해서 사용할 수 없습니다.
	}
}
