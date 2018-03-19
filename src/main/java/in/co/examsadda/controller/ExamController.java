package in.co.examsadda.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.entity.Section;
import in.co.examsadda.service.ExamService;

@RestController
@RequestMapping("exams")
public class ExamController {
	
	@Autowired
	private ExamService examService;
	
	@RequestMapping(value = "/addExam", method = RequestMethod.GET, produces = "application/json")
	public List<Exam> addExam(@RequestBody Exam exam){
		return examService.addExam(exam);
	}
	
	@RequestMapping(value = "/getSections", method = RequestMethod.GET, produces = "application/json")
	public List<Section> finAllSectionsByExamId(@RequestBody Exam exam){
		return examService.finAllSectionsByExamId(exam);
	}
	

}
