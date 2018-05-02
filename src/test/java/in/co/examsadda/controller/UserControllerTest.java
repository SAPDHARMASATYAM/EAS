package in.co.examsadda.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import in.co.examsadda.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

	User user = null;

	@Before
	public void init() {
		user = new User();
		user.setEmailId("abc@hotmail.com");
		user.setPassword("password");
		System.err.println("new user created : " + user);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void addUserTest() {
		UserController service = new UserController();
		//User addUser = service.addUser(user);
		System.err.println("new user Saved : " + user);
		//Assert.notNull(addUser);
	}
}
