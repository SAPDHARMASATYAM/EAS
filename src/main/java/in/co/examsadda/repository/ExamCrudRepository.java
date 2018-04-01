package in.co.examsadda.repository;

import org.springframework.data.repository.CrudRepository;

import in.co.examsadda.entity.Exam;

public interface ExamCrudRepository extends CrudRepository<Exam, String>{

}
