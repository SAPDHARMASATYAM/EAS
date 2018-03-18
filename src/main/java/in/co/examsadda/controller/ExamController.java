package in.co.examsadda.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.examsadda.service.ExamService;

@RestController
@RequestMapping("exams")
public class ExamController {
	
	@Autowired
	private ExamService examService;

}
