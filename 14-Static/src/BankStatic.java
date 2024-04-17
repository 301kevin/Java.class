
public class BankStatic {
	private String name;
	private double balance;
	private static double rate; // 변동 금리를 저장하는 변수

	
	public BankStatic(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public void print_account() {
		System.out.println(name + "\t" + balance + "원\t" + BankStatic.rate + "%");
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected double getBalance() {
		return balance;
	}

	protected void setBalance(double balance) {
		this.balance = balance;
	}

	protected static double getRate() {
		return rate;
	}

	protected static void setRate(double rate) {
		BankStatic.rate = rate;
	}
	
	
}
