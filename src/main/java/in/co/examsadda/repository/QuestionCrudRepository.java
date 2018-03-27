package in.co.examsadda.repository;

import org.springframework.data.repository.CrudRepository;
import in.co.examsadda.entity.Question;

public interface QuestionCrudRepository	extends CrudRepository<Question, Long> {

}
