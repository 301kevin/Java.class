// 6/45 로또
// 1. 번호 1세트 생성 : 1~45, 번호가 중복되면 안됨
// 2. 번호 1세트 정렬

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	private int[] m = new int[6]; // 로또 번호 1세트 저장
	private int buyNum; // 구매 횟수 저장

	// 구매 횟수 입력
	public void input_buyNum() {
		System.out.print("구매 횟수 : ");
		buyNum = scanner.nextInt();
		System.out.println();
	}

	// 로또 번호 1세트 생성
	// => 1 ~ 45 사이의 중복되지 않은 정수 6개
	public void select_num() {
		boolean chk = false; // 중복여부 상태 저장, true : 중복, false : 중복 ㄴㄴ
		for (int i = 0; i < 6;) {
			m[i] = random.nextInt(45) + 1;
			chk = false;
			for (int j = 0; j < i; j++) {
				if (m[i] == m[j]) { // 번호가 같은지 검사
					chk = true;
					break;
				}
			}
			if (!chk)
				i++;
		}

	}

	// 오름차순 정렬
	// => 선택 정렬 알고리즘
	public void sort() {
		for (int i = 0; i < 5; i++) { // 기준값
			for (int j = i + 1; j < 6; j++) { // 비교값
				if (m[i] > m[j]) {// 기준값이 비교값보다 큰 숫자인지 검사
					// 두 변수값을 바꿈
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}

			}
		}
	}

	// 로또번호 1세트 출력
	public void outputRegult() {
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + " ");
		}
		System.out.println();
	}

	// 구매횟수만큼 반복
	public void doLotto() {
		input_buyNum();
		for (int i = 0; i < buyNum; i++) {
			select_num();
			sort();
			outputRegult();
		}
	}

}
