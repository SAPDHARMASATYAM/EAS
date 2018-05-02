package in.co.examsadda.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.co.examsadda.entity.User;
import in.co.examsadda.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {
	
	/*@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	public Optional<User> login(@RequestBody User user) {
		return userService.login(user);
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST, produces = "application/json")
	public User addUser(@RequestBody User user) {
		user.setDateOfRegistration(new Date());
		return userService.addUser(user);
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.DELETE, produces = "application/json")
	public User deleteUser(@RequestBody  User user) {
		return userService.deleteUser(user);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT, produces = "application/json")
	public User updateUser(@RequestBody  User user) {
		return userService.updateUser(user);
	}
	
	@RequestMapping(value = "/allUsers", method = RequestMethod.GET, produces = "application/json")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}*/
	
}
