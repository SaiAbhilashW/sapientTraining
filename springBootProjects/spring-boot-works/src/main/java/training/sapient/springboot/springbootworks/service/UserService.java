package training.sapient.springboot.springbootworks.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import training.sapient.springboot.springbootworks.beans.User;
@Component
public class UserService {
	//assuming data is populated from db
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(101,"umang",23,"umang@gmail.com",null));
		users.add(new User(102,"mayur",23,"mayur@gmail.com",null));
		users.add(new User(103,"sai",24,"sai@gmail.com",null));
	}
	
	public List<User> getAllUsers(){
		return users;
	}
	
	public User save(User user) {
		if(user.getUserId()== 0) {
			int counter = users.size() + 1;
			user.setUserId(counter);
		}
		users.add(user);
		
		return user;
	}
	
	public User findOne(int userId) {
		for(User u : users) {
			if(u.getUserId() == userId) {
				return u;
			}
		}
		return null;
	}
	
	public User updateUser(User user) {
		this.deleteUser(user.getUserId());
		users.add(user);
		return user;
	}
	
	public User deleteUser(int userId) {
		for(User user : users) {
			if(user.getUserId() == userId) {
				users.remove(user);
				return user;
			}
		}
		return null;
	}
}
