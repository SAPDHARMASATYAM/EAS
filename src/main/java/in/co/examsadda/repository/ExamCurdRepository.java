package in.co.examsadda.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.entity.Section;

public interface ExamCurdRepository extends CrudRepository<Exam, String>{

	List<Section> findAllSectionsByExamId(Long examId);

	List<PracticePaper> finAllPracticePapersByExamId(Long examId);

	Set<PracticePaper> finByExamId(Long examId);
}
