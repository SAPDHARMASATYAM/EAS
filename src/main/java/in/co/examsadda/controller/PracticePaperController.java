package in.co.examsadda.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.entity.Question;
import in.co.examsadda.entity.QuestionOption;
import in.co.examsadda.entity.Section;
import in.co.examsadda.repository.QuestionCrudRepository;
import in.co.examsadda.repository.QuestionOptionCrudRepository;
import in.co.examsadda.repository.SectionCrudRepository;
import in.co.examsadda.service.PracticePaperService;

@RestController
@RequestMapping("practicepaper")
public class PracticePaperController {

	@Autowired
	private PracticePaperService practicePaperService;
	@Autowired
	private SectionCrudRepository scr;
	@Autowired
	private QuestionCrudRepository qcr;
	@Autowired
	QuestionOptionCrudRepository qocr;
	
//	@RequestMapping(value = "/getSectionsByPracticePaperId/{practicePaperId}", method = RequestMethod.GET, produces = "application/json")
//	public PracticePaper getPracticePaperByPracticePaperId(@RequestParam PracticePaper practicePaperId){
//		PracticePaper practicePaper = new PracticePaper();
//		practicePaper = practicePaperService.getPracticePaperByPracticePaperId(practicePaperId);
//		for(Section section : practicePaper.getSections()) {
//			Optional<Section> sec = scr.findById(section.getSectionId());
//			// This section populates all questions under current section
//			for(Question q : sec.get().getQuestions()){
//				Optional<Question> question = qcr.findById(q.getQiestionId());
//							
//				//This section populates questions's options 
//				for(QuestionOption qo : question.get().getOptions()) {
//					Optional<QuestionOption> qos = qocr.findById(qo.getOptionId());
//					QuestionOption questionOptions = qos.get();
//					qo.setAnswerEnglish(questionOptions.getAnswerEnglish());
//					qo.setAnswerRegional(questionOptions.getAnswerRegional());
//					qo.setOptionValue(questionOptions.getOptionValue());
//					qo.setOptionId(questionOptions.getOptionId());
//					question.get().getOptions().add(qo);
//				}
//				sec.get().getQuestions().add(question.get());
//			}
//			practicePaper.getSections().add(sec.get());
//		}
//		return practicePaper;
//	}
}

