package prac2;

import java.util.Scanner;

public class Sales {
	String aticle; // 품명
	int qty; // 수량
	int cost; // 단가
	static int cnt; // 판매건수
	static double discount; // 할인율

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("품목 : ");
		aticle = sc.next();
		System.out.print("수량 : ");
		qty = sc.nextInt();
		System.out.print("단가 : ");
		cost = sc.nextInt();
	}

	public static int getCnt() {
		return cnt;
	}

	public static void setCnt(int cnt) {
		Sales.cnt = cnt;
	}

	public static void setDiscount(double discount) {
		Sales.discount = discount;
	}

}
