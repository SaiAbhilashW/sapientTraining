package training.day3;

class Customer{
	private String custName;
	private String custEmail;
	
	public String getCustName() {
		return custName;
	}
	public Customer(String custName, String custEmail) {
		super();
		this.custName = custName;
		this.custEmail = custEmail;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
}

public class UserDefinedExceptionEx {
	
	public static void performTransaciton(Customer customer, int amount) throws NameTooSmallException, AmountTooLessException {
		
		try {
			checkName(customer.getCustName());
			checkAmount(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void checkName(String name) throws Exception {
		try {
			if(name.length() < 3) {
				throw new NameTooSmallException(name);
			}
		} catch(NameTooSmallException e) {
			throw new Exception("Sorry, I got nameTooSmallEx", e);
		}
		
	}
	
	public static void checkAmount(int amount) throws Exception {
		try {
			if(amount >= 100) {
				System.out.println("Transaction successful!");
			} else {
				throw new AmountTooLessException();
			}
		} catch(AmountTooLessException e) {
			throw new Exception("Sorry, I got amountTooLessEx", e);
		}
	}
	
	public static void main(String[] args) {
		Customer customer = new Customer("sai", "sa@gmail.com");
		int amount = 90;
		try {
			performTransaciton(customer, amount);
		} catch (NameTooSmallException | AmountTooLessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
