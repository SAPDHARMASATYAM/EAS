package in.co.examsadda.service;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<Exam> getExam(Exam exam) {
		List<Exam> exams = new ArrayList<>();
		examCurdRepository.findAll().forEach(exams::add);
		return exams;
	}

	public Exam deleteExam(Exam exam) {
		 examCurdRepository.delete(exam);
		return exam;
	}
	
}
