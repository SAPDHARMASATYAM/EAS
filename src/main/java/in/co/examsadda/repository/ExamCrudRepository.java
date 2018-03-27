package in.co.examsadda.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.entity.PracticePaper;

public interface ExamCrudRepository extends CrudRepository<Exam, String>{

}
