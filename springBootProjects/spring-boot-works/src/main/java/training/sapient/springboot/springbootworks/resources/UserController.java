package training.sapient.springboot.springbootworks.resources;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import training.sapient.springboot.springbootworks.beans.User;
import training.sapient.springboot.springbootworks.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userservice;
	@GetMapping(path="/users")
	public List<User> getAllUsers(){
		return userservice.getAllUsers();
	}
	
	@GetMapping("users/{userId}")
	public User getUser(@PathVariable int userId) throws UserPrincipalNotFoundException {
		User user = userservice.findOne(userId);
		
		if(user == null) {
			throw new UserPrincipalNotFoundException("Sorry user not found");
		}
		return user;
	}
	
	
	@GetMapping("users-with-resource/{userId}")
	public User getUserWithResource(@PathVariable int userId) throws UserPrincipalNotFoundException {
		User user = userservice.findOne(userId);
		
		if(user == null) {
			throw new UserPrincipalNotFoundException("Sorry user not found");
		}
		return user;
	}
	
	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		User savedUser = userservice.save(user);
		
		return savedUser;
	}
} 
