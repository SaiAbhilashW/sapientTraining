package training.day3;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Account {
	private int balance;
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	public void withdraw(int amount) {
		if(amount < balance) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			this.balance = balance - amount;
			
			System.out.println("Amount of " + amount + " is withdrawn, balance is " + this.balance);
		}
		else System.out.println("Not enough balance");
		
	}
}
