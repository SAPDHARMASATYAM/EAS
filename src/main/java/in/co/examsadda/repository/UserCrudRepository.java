package in.co.examsadda.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import in.co.examsadda.entity.User;

//CrudRepository<Entity, Data Type of ID>
public interface UserCrudRepository extends CrudRepository<User, String> {
	public Optional<User> findByPasswordAndEmailId(String password, String emailId);
}
