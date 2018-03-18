package in.co.examsadda.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.entity.User;

public interface ExamCurdRepository extends CrudRepository<Exam, String>{

		public List<Exam> findExamsByuserId(String userId);

}
