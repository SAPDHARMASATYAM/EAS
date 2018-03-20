package in.co.examsadda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.repository.PracticePaperCurdRepository;

@Service
public class PracticePaperService {

	@Autowired
	public PracticePaperCurdRepository paperCurdRepository;
	
	public PracticePaper getPracticePaperByPracticePaperId(PracticePaper practicePaper) {
		return paperCurdRepository.findPracticePaperByPaperId(practicePaper.getPaperId());
	}
	
	

}
