class Student {
	String name = "홍길동";
	int age = 25;
}

public class Exam1 {
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.name);
		System.out.println(student.age);

		student.name = "김철수";
		student.age = 30;
		System.out.println(student.name);
		System.out.println(student.age);
		
	}
}
