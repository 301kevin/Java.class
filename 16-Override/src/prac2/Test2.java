package prac2;

public class Test2 extends Sales {
	int amount;

	public void setProcess() {
		amount = qty * cost;
	}

	public void getDisplay() {
		int resultSales = (int) (amount - amount * Sales.discount);
		System.out.println(aticle + "\t" + resultSales + "원");
	}
}
