package in.co.examsadda.repository;

import java.util.List;
import in.co.examsadda.entity.Exam;

public interface ExamCrudRepository{

	public Exam saveExam(Exam exam) throws  Exception;

	public List<Exam> findAll();

	public void delete(Exam exam);
}
