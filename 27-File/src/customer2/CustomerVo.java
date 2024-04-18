package customer2;

import java.io.Serializable;

public class CustomerVo implements Serializable {
	private String cusNum;
	private String name;
	private String tell;

	public CustomerVo() {
		
	}
	
	public CustomerVo(String cusNum, String name, String tell) {
		super();
		this.cusNum = cusNum;
		this.name = name;
		this.tell = tell;
	}
	
	// toString
	@Override
	public String toString() {
		String str = String.format("%s\t%s\t%s\t", cusNum, name, tell);
		return str;
	}

	// getter & setter
	public String getCusNum() {
		return cusNum;
	}

	public void setCusNum(String cusNum) {
		this.cusNum = cusNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTell() {
		return tell;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}
	

}
