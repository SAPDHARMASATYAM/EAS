package in.co.examsadda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.entity.Institute;
import in.co.examsadda.service.InstituteService;

@RestController
@RequestMapping("institute")
public class InstituteController {
	
	@Autowired
	public InstituteService instituteService;
	
	@RequestMapping(value = "/fetchExamsByID", method = RequestMethod.GET, produces = "application/json")
	public List<Exam> finAllExamsByInstitute(@RequestBody Institute institute){
		return instituteService.findAllExamsByInstitute(institute);
	}
	
	@RequestMapping(value = "/registerInst", method = RequestMethod.POST, produces = "application/json")
	public List<Institute> addInstitute(@RequestBody Institute institute){
		return instituteService.addInstitute(institute);
	}
	
	@RequestMapping(value = "/registerExam", method = RequestMethod.POST, produces = "application/json")
	public List<Exam> addInstitute(@RequestBody Exam exam){
		return instituteService.registerExam(exam);
	}
	
}
