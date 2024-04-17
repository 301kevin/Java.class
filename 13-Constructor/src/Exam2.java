class Article {
	int seq;
	String subject;
	String writer;

	Article() {
		System.out.println("Article() 호출");
	}

	Article( String subject, String writer) {
		this();
		System.out.println("String subject, String writer");
		this.subject = subject;
		this.writer = writer;
	}

	Article(int seq, String subject, String writer) {
		this(subject,writer);
		System.out.println("int seq,String subject, String writer");
		this.subject = subject;
		this.writer = writer;
	}

	void print() {
		System.out.println(seq);
		System.out.println(subject);
		System.out.println(writer);
	}
}

public class Exam2 {
	public static void main(String[] args) {
		Article article = new Article(1, "자바는 객체 지향 언어입니다.", "자바강사");
		article.print();
		Article article2 = new Article();
		article2.print();
	}
}
