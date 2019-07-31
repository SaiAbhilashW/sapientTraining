package training.sapient.aop.model;

public class Account {
	private int accNo;
	private String accName;
	private int balance;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public Account(int accNo, String accName, int balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
