package in.co.examsadda.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.repository.ExamCurdRepository;
import in.co.examsadda.repository.SectionCurdRepository;

@Service
public class ExamService {
	
	@Autowired
	private ExamCurdRepository examCurdRepository;
	@Autowired
	private SectionCurdRepository sectionCurdRepository;
	public List<Exam> getAllExams() {
		List<Exam> exams = new ArrayList<Exam>();
		examCurdRepository.findAll().forEach(exams::add);
		return exams;
	}
	
	
	
	/*
	 * Find All Practice Papers
	 * Add PracticePaper by Exam
	 * get all exams
	 * */
}
