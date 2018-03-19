package in.co.examsadda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.entity.Section;
import in.co.examsadda.repository.SectionCurdRepository;

@Service
public class SectionService {
	
	@Autowired
	public SectionCurdRepository sectionCurdRepository;

	public List<Section> findSectionsByExamId(Exam exam) {
		
		return sectionCurdRepository.findSectionsByExamId(exam.getExamId());
	}
	
	

}
