package training.sapient.springboot.springbootworks.resources;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import training.sapient.springboot.springbootworks.beans.User;
import training.sapient.springboot.springbootworks.exceptions.UserNotFoundExecpection;
import training.sapient.springboot.springbootworks.service.UserDbService;


@RestController
public class UserDbController {
	@Autowired
	private UserDbService userService;

	// http://localhost:9090/users
	@GetMapping(path = "/db/users")
	public List<User> getAllUsersFromDb() {
		return this.userService.getAllUsers();
	}
	
	@GetMapping(path = "/db/users/{id}", produces="application/json")
	public Resource<User> getUser(@PathVariable Integer id) throws UserNotFoundExecpection {
		User user = this.userService.getUserByIdAsObject(id);

		if (user == null) {
			throw new UserNotFoundExecpection("Sorry user with id " + id + " Not found");
		}
		Resource<User> resource = new Resource<User>(user);
		ControllerLinkBuilder allUsersLink = linkTo(methodOn(this.getClass()).getAllUsersFromDb());
		resource.add(allUsersLink.withRel("all-users"));
		return resource;
	} 
	
	
	
	@GetMapping(path = "/db/users/name/{name}")
		public Resource<User> getUserByName(@PathVariable String name) throws UserNotFoundExecpection {
			User user = this.userService.getUserByName(name);

			if (user == null) {
				throw new UserNotFoundExecpection("Sorry user with Name " + name + " Not found");

			}

			Resource<User> resource = new Resource<User>(user);
			ControllerLinkBuilder allUsersLink = linkTo(methodOn(this.getClass()).getAllUsersFromDb());
			resource.add(allUsersLink.withRel("all-users"));
			return resource;
		} 
	 


	@PostMapping(path = "/db/users")
	public User insertDBUser(@RequestBody User user) {
		return this.userService.insertUser(user);
	}

	@PutMapping(path = "/db/users")
	public User updateUser(@RequestBody User user) {
		return this.userService.updateUser(user);
	} 


	@DeleteMapping(path = "/db/users/{id}")
	public String deleteUserById(@PathVariable Integer id) {
		if (this.userService.getUserById(id).isPresent()) {
			this.userService.deleteUserById(id);
			return "User Deleted with Id " + id;
		}
		return "Sorry User Not Found for : " + id;
	}

	@GetMapping(path = "/db/users/age/{userAge}")
	public List<User> getUserGreaterThanAge(@PathVariable int userAge) {
		return this.userService.getUserGreaterThanAge(userAge);
	} 
}
