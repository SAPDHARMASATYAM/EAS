package in.co.examsadda.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.entity.Institute;
import in.co.examsadda.repository.InstituteCrudRepository;

@Service
public class InstituteService {

	public InstituteCrudRepository instituteCurdRepository;
	public List<Exam> findAllExamsByInstitute(Institute institute){
		return instituteCurdRepository.findAllExamsByInstituteId(institute.getInstituteId());
	}
	
	@SuppressWarnings("unchecked")
	public List<Institute> addInstitute(Institute institute) {
		return (List<Institute>) instituteCurdRepository.save(institute);
		
	}
	
}
