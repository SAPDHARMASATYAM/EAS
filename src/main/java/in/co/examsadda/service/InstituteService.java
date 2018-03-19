package in.co.examsadda.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.entity.Institute;
import in.co.examsadda.repository.InstituteCurdRepository;

@Service
public class InstituteService {

	public InstituteCurdRepository instituteCurdRepository;
	public List<Exam> findAllExamsByInstitute(Institute institute){
		return instituteCurdRepository.findAllExamsByInstituteId(institute.getInstituteId());
	}
	public List<Institute> addInstitute(Institute institute) {
		return (List<Institute>) instituteCurdRepository.save(institute);
		
	}
	public List<Exam> registerExam(Exam exam) {
		// TODO Auto-generated method stub
		return (List<Exam>) instituteCurdRepository.registerExam(exam.getExamId());
	}
}
