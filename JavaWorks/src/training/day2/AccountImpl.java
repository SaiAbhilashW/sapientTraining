package training.day2;

public class AccountImpl {
	
	public static void displayAccountDetails(Account a1) {
		System.out.println("id : " + a1.getAccountId() + " name : " + a1.getCustomerName() + " balance : " + a1.getInitialBalance());
		System.out.println("++++++++++");
	}
	
	public static void main(String[] args) {
		Account a1 = new Account("Salah", 1000);
		Account a2 = new Account("Firmino", 4000);
		Account a3 = new Account("Ox", 2000);
		
		displayAccountDetails(a1);
		displayAccountDetails(a2);
		displayAccountDetails(a3);
	}
}
