package training.sapient.springboot.springbootworks.exceptions;

public class UserNotFoundExecpection extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public UserNotFoundExecpection(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserNotFoundExecpection [message=" + message + "]";
	}
	
	
	
}
