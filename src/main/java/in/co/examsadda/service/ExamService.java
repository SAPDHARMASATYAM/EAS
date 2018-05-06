package in.co.examsadda.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.impl.ExamCrudImpl;

@Service
@EnableTransactionManagement
public class ExamService {
	
	//@Autowired
	ExamCrudImpl examCurdRepository;

	public Exam addExam(Exam exam) throws Exception {
		//return examCurdRepository.save(exam);
		return new ExamCrudImpl().saveExam(exam);
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
