package in.co.examsadda.repository;

import org.springframework.data.repository.CrudRepository;

import in.co.examsadda.entity.User;

public interface UserCurdRepository extends CrudRepository<User, String> {
	
}
