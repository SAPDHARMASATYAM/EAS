package in.co.examsadda.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.repository.ExamCurdRepository;

@Service
public class ExamService {
	
	@Autowired
	public ExamCurdRepository examCurdRepository;

	public Exam addExam(Exam exam) {
		return examCurdRepository.save(exam);
	}

	public Set<PracticePaper> getPracticePapersByExamId(Exam exam) {
		return examCurdRepository.finByExamId(exam.getExamId());
	}

	public List<PracticePaper> getAllPracticePapers() {
		List<PracticePaper> practicePapers = new ArrayList<PracticePaper>();
//		examCurdRepository.findAll().forEach(practicePapers::add);
		return practicePapers;
	}

	public Exam deleteExam(Exam exam) {
		 examCurdRepository.delete(exam);
		return exam;
	}
	
}
