
public class Bank {
	private String name;
	private double balance;
	private double rate;

	public Bank(String name, double balance, double rate) {
		this.name = name;
		this.balance = balance;
		this.rate = rate;
	}

	public void print_account() {
		System.out.println(name + "\t" + balance + "원\t" + rate + "%");
	}

	// getter & setter
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

	protected double getRate() {
		return rate;
	}

	protected void setRate(double rate) {
		this.rate = rate;
	}

}
