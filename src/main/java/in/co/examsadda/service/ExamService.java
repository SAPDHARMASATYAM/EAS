package in.co.examsadda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.repository.ExamCrudRepository;

@Service
public class ExamService {
	
	@Autowired
	public ExamCrudRepository examCurdRepository;

	public Exam addExam(Exam exam) {
		return examCurdRepository.save(exam);
	}

	public Exam deleteExam(Exam exam) {
		 examCurdRepository.delete(exam);
		return exam;
	}
	
}
