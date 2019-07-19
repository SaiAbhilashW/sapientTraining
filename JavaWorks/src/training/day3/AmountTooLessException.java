package training.day3;

public class AmountTooLessException extends Exception {
	private String message;

	public AmountTooLessException(String message) {
		
		this.message = message;
	}
	
	public AmountTooLessException() {
		System.out.println("Sorry, amount too less");
	}
}
