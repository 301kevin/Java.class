
class Charactor {
	String name;
	int age;

}

public class Exam2 {
	public static void main(String[] args) {
		// 객체 배열
		Charactor[] charactors = new Charactor[2];
		charactors[0] = new Charactor();
		charactors[1] = new Charactor();

		charactors[0].name = "돌리";
		charactors[0].age = 19;

		charactors[1].name = "희동";
		charactors[1].age = 3;

		for (int i = 0; i < charactors.length; i++) {
			System.out.println("이름 : " + charactors[i].name + ", 나이 : " + charactors[i].age);
		}
		System.out.println();

	}
}
