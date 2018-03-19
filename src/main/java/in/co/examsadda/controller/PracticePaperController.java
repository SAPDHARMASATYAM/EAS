package in.co.examsadda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.examsadda.entity.Section;

@RestController
@RequestMapping("practicepaper")
public class PracticePaperController {

	@Autowired
	public PaperService paperService;
	
	public void List(PracticePaper) findALLPapersBySectionId(Section exam) {
		return findALLPapersBySectionId1(Section sectionId)
		
	}
		
}
