package in.co.examsadda.service;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.entity.Question;
import in.co.examsadda.entity.QuestionOption;
import in.co.examsadda.entity.Section;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExamServiceTest {

	@Autowired
	private ExamService examService;
	@Test
	public void saveExam() throws Exception {
		examService.addExam(getExam());
		
	}
	private static Exam getExam(){
		
		Exam  exam = new Exam();
		try {
		exam.setExamNameEnglish("RRB");
		exam.setExamNameRegional("ర్ ర్ బి");
		exam.setPracticePapers(getPracticePapers());
		}catch(Exception e){
			throw e;
		}
		return exam;
	}

	private static Set<PracticePaper> getPracticePapers() {
		
		//System.out.println("Inside getPracticePapers");
		Set<PracticePaper> practicePapers = new HashSet<>();
		for (int i = 1; i <= 1; i++) {
			practicePapers.add(getPracticePaper(i));
		}
		return practicePapers;
	}
	
	//PracticePaper practicePaper = new PracticePaper();

	private static PracticePaper getPracticePaper(Integer practicePaperNumber) {
		//System.out.println("Inside getPracticePaper ");
		PracticePaper practicePaper = new PracticePaper();
		practicePaper.setPracticePaperNameEnglish(String.valueOf(practicePaperNumber + " Practie Paper"));
		practicePaper.setPracticePaperNameRegional(String.valueOf(practicePaperNumber + " పేపర్"));
		practicePaper.setSections(getSections());
		practicePaper.setPracticePaperTimeInMinutes(180);
		return practicePaper;
	}

	private static Set<Section> getSections() {
		
		//System.out.println("Inside getSections");
		Set<Section> sections = new HashSet<>();
		sections.add(getSection("English"));
		sections.add(getSection("Maths"));
		sections.add(getSection("Reasoning"));
		sections.add(getSection("Current Affires"));
		sections.add(getSection("Genaral Awareness"));
		return sections;
	}

	private static Section getSection(String sectionName) {
		Section section = new Section();
		section.setSectionName(sectionName);
		section.setQuestions(getQuestions());
		return section;
	}

	private static Set<Question> getQuestions() {
		Set<Question> questions = new HashSet<>();
		questions.add(getQuestion('A'));
		questions.add(getQuestion('B'));
		questions.add(getQuestion('C'));
		questions.add(getQuestion('D'));
		questions.add(getQuestion('D'));
		questions.add(getQuestion('C'));
		questions.add(getQuestion('B'));
		questions.add(getQuestion('A'));
		questions.add(getQuestion('C'));
		questions.add(getQuestion('B'));
		return questions;
	}

	private static Question getQuestion(Character answer) {
		//System.out.println("Inside getQuestion");
		Question question = new Question();
		question.setQuestionDescriptionRegional("మీ పేరు తెలుపండి?");
		question.setQuestionDescriptionEnglish("What is your name?");
		question.setOptions(getQuestionOptions());
		question.setAnswer(answer);
		return question;
	}

	private static Set<QuestionOption> getQuestionOptions() {
		Set<QuestionOption> questionOptions = new HashSet<>();
		questionOptions.add(getQuestionOption('A'));
		questionOptions.add(getQuestionOption('B'));
		questionOptions.add(getQuestionOption('C'));
		questionOptions.add(getQuestionOption('D'));
		return questionOptions;
	}

	private static QuestionOption getQuestionOption(Character optionValue) {
		QuestionOption questionOption = new QuestionOption();
		questionOption.setOptionValue(optionValue);
		//questionOption.setAnswerRegional(optionValue + " సమాధానం");
		//questionOption.setAnswerEnglish(optionValue + " : Answer");
		return questionOption;

	}
}
