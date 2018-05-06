package in.co.examsadda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.service.ExamService;

@RestController
@RequestMapping("exams")
public class ExamController {
	
	@Autowired
	private ExamService examService;
	
	@RequestMapping(value = "/addExam", method = RequestMethod.POST, produces = "application/json")
	public Exam addExam(@RequestParam Exam exam) throws Exception{
		return examService.addExam(exam);
	}
	@GetMapping(value="/getExamById/{examId}")
	public Exam getExamByExamId(@RequestParam Long examId) {
		Exam exam = new Exam();
		exam.setExamId(examId);
		exam = (examService.getExam(exam)!= null && examService.getExam(exam).size()>0)?examService.getExam(exam).get(0):null;
		return exam;
	}
}
