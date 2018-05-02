package in.co.examsadda.repository;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.entity.Institute;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface InstituteCrudRepository{

	public List<Exam> findAllExamsByInstituteId(Long instituteId);
}
