package training.sapient.aop.model;

public class SBAccount {
	private Account account;
	public double showBalance() {
		return account.getBalance();
	}
	public SBAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SBAccount(Account account) {
		super();
		this.account = account;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
}
