class Bookshop {
	private String bookName;
	private String author;
	private int price;

	void setBook(String bookName, String author, int price) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	void viewBook() {
		System.out.println("책이름 : " + bookName);
		System.out.println("저자 : " + author);
		System.out.println("가격 : " + price + "원");
	}

	void setBookName(String bookName) {
		this.bookName = bookName;
	}

	String getBookName() {
		return bookName;
	}

	void setAuthor(String author) {
		this.author = author;
	}

	String getAuthor() {
		return author;
	}

	void setPrice(int price) {
		this.price = price;
	}

	int getPrice() {
		return price;
	}
}

public class Practice3 {
	public static void main(String[] args) {
		Bookshop book = new Bookshop();
		book.setBook("자바완성", "황완성", 25000);
		book.viewBook();
		System.out.println();

		book.setBookName("JSP잡기");
		book.setAuthor("송길동");
		book.setPrice(35000);
		System.out.println("책이름 : " + book.getBookName());
		System.out.println("저자 : " + book.getAuthor());
		System.out.println("가격 : " + book.getPrice() + "원");

	}
}
