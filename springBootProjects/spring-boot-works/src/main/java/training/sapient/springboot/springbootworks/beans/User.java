package training.sapient.springboot.springbootworks.beans;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;


public class User {
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private int userId;
	private String userName;
	private int userAge;
	private String userEmail;
	private Address address;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public User(int userId, String userName, int userAge, String userEmail ,Address address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.userEmail = userEmail;
		this.address = address;
	}
	
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
