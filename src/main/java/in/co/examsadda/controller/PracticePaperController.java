package in.co.examsadda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.entity.Section;
import in.co.examsadda.service.PaperService;

@RestController
@RequestMapping("practicepaper")
public class PracticePaperController {

	@Autowired
	public PaperService paperService;
	
	@RequestMapping(value = "/getSections", method = RequestMethod.GET, produces = "application/json")
	public List<Section> finAllSectionsByExamId(@RequestBody PracticePaper pp){
		return paperService.finAllSectionsByPaperId(pp);
	}
	
	@RequestMapping(value = "/getAllPapers", method = RequestMethod.GET, produces = "application/json")
	public List<PracticePaper> getAllPapers(@RequestBody PracticePaper pp){
		return paperService.getAllPapers();
	}
}
