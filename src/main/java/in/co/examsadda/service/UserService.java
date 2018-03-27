package in.co.examsadda.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.entity.User;
import in.co.examsadda.repository.UserCrudRepository;

@Service
public class UserService {

	@Autowired
	private UserCrudRepository userCurdRepository;

	public Optional<User> login(User user) {
		return userCurdRepository.findByPasswordAndEmailId(user.getPassword(), user.getEmailId());
	}

	public User addUser(User user) {
		return userCurdRepository.save(user);
	}

	public User deleteUser(User user) {
		userCurdRepository.delete(user);
		return user;
	}

	public User updateUser(User user) {
		return userCurdRepository.save(user);
	}

	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		userCurdRepository.findAll().forEach(users::add);
		return users;
	}

}
