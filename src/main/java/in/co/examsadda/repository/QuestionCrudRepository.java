package in.co.examsadda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import in.co.examsadda.entity.Question;

public interface QuestionCrudRepository	extends CrudRepository<Question, Long> {

}