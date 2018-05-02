package in.co.examsadda.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.repository.PracticePaperCrudRepository;

@Service
@EnableTransactionManagement
public class PracticePaperService {

	/*@Autowired
	public PracticePaperCrudRepository paperCurdRepository;
	
	public PracticePaper addPracticePaper(PracticePaper practicePaper) {
		return paperCurdRepository.save(practicePaper);
	}*/
	
	
}
