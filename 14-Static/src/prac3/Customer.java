package prac3;

import java.util.Scanner;

public class Customer {
	Scanner sc = new Scanner(System.in);
	CustomerVO[] arr = new CustomerVO[10];
	int customercnt = 0;

	void input() {
		if (customercnt < 10) {
			arr[customercnt] = new CustomerVO();
			System.out.print("고객변호 : ");
			arr[customercnt].setCustomerNum(sc.next());
			System.out.print("이름 : ");
			arr[customercnt].setName(sc.next());
			System.out.print("전화번호 : ");
			arr[customercnt].setTel(sc.next());

			customercnt++;
		} else {
			System.out.println("인원은 10명까지 입니다.");
		}
	}

	void output() {
		System.out.println("고객번호\t이름\t전화번호");
		for (int i = 0; i < customercnt; i++) {
			System.out.println(arr[i].toString());
		}
	}

	void change() {
		System.out.print("수정할 이름? ");
		String nn = sc.next();
		System.out.println();
		boolean finding = false;
		
		for (int i = 0; i < customercnt; i++) {
			if (arr[i].getName().equals(nn)) {
				finding = true;
				System.out.println("고객번호\t이름\t전화번호");
				System.out.println(arr[i]);
				System.out.print("고객번호 : ");
				arr[i].setCustomerNum(sc.next());
				System.out.print("이름 : ");
				arr[i].setName(sc.next());
				System.out.print("전화번호 : ");
				arr[i].setTel(sc.next());
			}

		}
		if (!finding) {
			System.out.println("입력한 이름의 고객은 없습니다.");
		}
	}

	void find() {
		System.out.print("검색할 이름? ");
		String nn = sc.next();
		System.out.println();
		boolean finding = false;
		System.out.println("고객번호\t이름\t전화번호");
		for (int i = 0; i < customercnt; i++) {
			if (arr[i].getName().equals(nn)) {
				finding = true;
				System.out.println(arr[i]);
			}
		}  
		if (!finding) {
			System.out.println("입력한 이름의 고객은 없습니다.");
		}
	}
}
