package prac1;

public class Salary {
	String name;
	int salary;
	
	public Salary(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public void viewInformation() {
		System.out.printf("이름 : %s, 연봉 : %s", name, salary);
	}
	
	
}
