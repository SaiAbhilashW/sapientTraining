package training.day3;

public class SyncronizeTest extends Thread{
	
	Account account;
	int amount;
	
	public SyncronizeTest(Account acc, int withdrawnAmount, String name) {
		this.account = acc;
		this.amount = withdrawnAmount;
		new Thread(this, name).start();
	}
	
	public void run() {
		account.withdraw(amount);
	}
	
	public static void main(String[] args) {
		Account account = new Account(1000);
		
		new SyncronizeTest(account, 500, "A");
		new SyncronizeTest(account, 750, "B");
	}
}
