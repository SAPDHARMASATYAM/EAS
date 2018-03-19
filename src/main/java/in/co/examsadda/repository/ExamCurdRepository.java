package in.co.examsadda.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.entity.Section;

public interface ExamCurdRepository extends CrudRepository<Exam, String>{

	List<Section> findAllSectionsByExamId(Long examId);

}
