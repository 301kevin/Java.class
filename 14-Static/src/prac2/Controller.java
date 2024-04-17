package prac2;

import java.util.Scanner; 

public class Controller {
	Scanner sc = new Scanner(System.in);
	EmpVO[] arr = new EmpVO[5];
	int EmpCnt = 0;
	
	void input() {
		if (EmpCnt < 5) {
			arr[EmpCnt] = new EmpVO();
			System.out.print("이름 : ");
			arr[EmpCnt].setName(sc.next());
			System.out.print("연봉 : ");
			arr[EmpCnt].setSalary(sc.nextInt());
			System.out.print("부서명 : ");
			arr[EmpCnt].setDepartment(sc.next());

			EmpCnt++;
		} else {
			System.out.println("인원은 5명까지 입니다.");
		}
	}
	
	void output() {
		for (int i = 0; i < EmpCnt; i++) {
			System.out.println(arr[i].toString());
		}
	}
	
}
