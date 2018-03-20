package in.co.examsadda.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.entity.Section;
import in.co.examsadda.repository.PracticePaperCurdRepository;

@Service
public class PaperService {

	@Autowired
	public PracticePaperCurdRepository paperCurdRepository;
	public List<Section> finAllSectionsByPaperId(PracticePaper practicePaper) {
		return paperCurdRepository.findSectionsByPaperId(practicePaper.getPaperId());
	}
	
	

}
