package prac1;

public class Department extends Salary {
	String department;
	
	public Department(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	public void viewInformation() {
		System.out.printf("이름 : %s, 연봉 : %s, 부서 : %s", name, salary, department);
	}
	
	
	
}
