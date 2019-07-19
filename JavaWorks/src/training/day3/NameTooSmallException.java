package training.day3;

public class NameTooSmallException extends Exception {
	private String message;

	public NameTooSmallException(String message) {
		this.message = message;
		System.out.println("Sorry, name [" + this.message + "] is too small");
	}
	
	public NameTooSmallException() {
		this.message = "Sorry, name too samll";
	}
	
	
}
