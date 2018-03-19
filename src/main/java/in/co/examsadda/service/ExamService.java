package in.co.examsadda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.entity.Section;
import in.co.examsadda.repository.ExamCurdRepository;

@Service
public class ExamService {
	
	@Autowired
	public ExamCurdRepository examCurdRepository;

	public List<Exam> addExam(Exam exam) {
		return (List<Exam>) examCurdRepository.save(exam);
	}

	public List<Section> finAllSectionsByExamId(Exam exam) {
		return examCurdRepository.findAllSectionsByExamId(exam.getExamId());
	}
	
}
