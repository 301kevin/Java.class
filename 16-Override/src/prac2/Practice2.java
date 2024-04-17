package prac2;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Test2[] op = new Test2[2];

		for (int i = 0; i < op.length; i++) {
			op[i] = new Test2();
			op[i].input();
			op[i].setProcess();
			Sales.cnt = op[i].qty + Sales.cnt;
		}
 
		Scanner sc = new Scanner(System.in);
		System.out.print("할인율 : ");
		double discount = sc.nextDouble();
		Sales.setDiscount(discount);

		System.out.println("[[판매가]]");
		for (int i = 0; i <op.length;i++) {
			op[i].getDisplay();
		}
		System.out.println("\n판매건수 : " + Sales.cnt + "건");
	}
}
