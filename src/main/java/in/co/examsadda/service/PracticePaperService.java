package in.co.examsadda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.repository.PracticePaperCrudRepository;

@Service
public class PracticePaperService {

	@Autowired
	public PracticePaperCrudRepository paperCurdRepository;

}
