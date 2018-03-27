package in.co.examsadda.controller;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.service.ExamService;

@RestController
@RequestMapping("exams")
public class ExamController {
	
	@Autowired
	private ExamService examService;
	
	@RequestMapping(value = "/addExam", method = RequestMethod.GET, produces = "application/json")
	public Exam addExam(@RequestParam Exam exam){
		return examService.addExam(exam);
	}
	
	@RequestMapping(value = "/getPracticePapersByExamId", method = RequestMethod.GET, produces = "application/json")
	public Set<PracticePaper> getPracticePapersByExamId(@RequestParam Exam exam){
		return examService.getPracticePapersByExamId(exam);
	}
	

	@RequestMapping(value = "/remove", method = RequestMethod.DELETE, produces = "application/json")
	public Exam deleteUser(@RequestBody  Exam exam) {
		return examService.deleteExam(exam);
	}
}
