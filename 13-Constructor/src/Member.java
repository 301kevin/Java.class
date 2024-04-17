
public class Member {
	private String name;
	private int age;

	public Member() {
	}

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter & setter
	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

}
