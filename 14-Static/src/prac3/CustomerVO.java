package prac3;

public class CustomerVO {
	private String customerNum;
	private String name;
	private String tel;

	@Override
	public String toString() {
		return  customerNum + "\t" + name + "\t" + tel;
	}

	public String getCustomerNum() {
		return customerNum;
	}

	public void setCustomerNum(String customerNum) {
		this.customerNum = customerNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
