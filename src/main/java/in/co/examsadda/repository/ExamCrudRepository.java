package in.co.examsadda.repository;

import java.sql.SQLException;
import java.util.List;
import in.co.examsadda.entity.Exam;

public interface ExamCrudRepository{

	public Exam saveExam(Exam exam) throws SQLException;

	public List<Exam> findAll();

	public void delete(Exam exam);
}
