package in.co.examsadda.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.entity.Institute;
import in.co.examsadda.entity.User;
import in.co.examsadda.service.ExamService;

@RestController
@RequestMapping("exams")
public class ExamController {
	
	@Autowired
	private ExamService examService;

	//	When new institute want to purchase service we need to display available exams
	@RequestMapping(value = "/fetchExams", method = RequestMethod.GET, produces = "application/json")
	public List<Exam> getAllExams(){
		return examService.getAllExams();
	}
	
	
		
}
