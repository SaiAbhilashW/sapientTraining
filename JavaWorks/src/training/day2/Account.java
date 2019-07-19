package training.day2;

import java.io.Serializable;

public class Account implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int accountId;
	private String customerName;
	private double initialBalance;
	
	private static int count = 100;
	
	public Account(String customerName, double initialBalance) {
		this.customerName = customerName;
		this.initialBalance = initialBalance;
		this.accountId = count++;
	}

	public int getAccountId() {
		return accountId;
	}

	public String getCustomerName() {
		return customerName;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", customerName=" + customerName + ", initialBalance="
				+ initialBalance + "]";
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}
}
