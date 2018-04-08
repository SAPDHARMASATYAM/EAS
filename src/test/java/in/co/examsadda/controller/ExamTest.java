//package in.co.examsadda.controller;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import in.co.examsadda.entity.Exam;
//import in.co.examsadda.entity.PracticePaper;
//import in.co.examsadda.entity.Question;
//import in.co.examsadda.entity.QuestionOption;
//import in.co.examsadda.entity.Section;
//import in.co.examsadda.service.ExamService;
//
//public class ExamTest {
//
//	@Autowired
//	private static ExamService examService;
//	
//	Set<QuestionOption> options = new HashSet<QuestionOption>();
//	Set<Question> questions = new HashSet<Question>();
//	Set<Section> sections = new HashSet<Section>();
//	Set<PracticePaper> practicePapers = new HashSet<PracticePaper>();
//	static Exam exam = new Exam();
//	
//	public ExamTest() {
//		
//		options.add(getOption('a'));
//		options.add(getOption('b'));
//		options.add(getOption('c'));
//		options.add(getOption('d'));
//		questions.add(getQuestion('a'));
//		questions.add(getQuestion('b'));
//		questions.add(getQuestion('c'));
//		questions.add(getQuestion('d'));
//		questions.add(getQuestion('e'));
//		questions.add(getQuestion('f'));
//		questions.add(getQuestion('g'));
//		questions.add(getQuestion('h'));
//		questions.add(getQuestion('i'));
//		questions.add(getQuestion('j'));
//		questions.add(getQuestion('k'));
//		sections.add(getSection("Arthematic"));
//		sections.add(getSection("Reasoning"));
//		sections.add(getSection("Aptitude"));
//		sections.add(getSection("General awarness"));
//		practicePapers.add(getPracticePapers());
//	}
//	private QuestionOption getOption(final Character optionValue) {
//		QuestionOption questionOption = new QuestionOption();
//		questionOption.setOptionValue(optionValue);
//		questionOption.setAnswerEnglish(optionValue+" answer");
//		questionOption.setAnswerRegional(optionValue+" సమాధానం");
//		return questionOption;
//	}
//	
//	private Question getQuestion(final Character answer) {
//		Question question = new Question();
//		question.setQuestionDescriptionEnglish("What is your name");
//		question.setQuestionDescriptionRegional("నీ నామధేయం ఏమిటి ");
//		question.setOptions(this.options);
//		question.setAnswer(answer); 
//		return question;
//	}
//	
//	private Section getSection(final String sectionValue) {
//		Section section = new Section();
//		section.setSectionName(sectionValue);
//		section.setQuestions(this.questions);
//		return section;
//	}
//	
//	private PracticePaper getPracticePapers() {
//		
//		PracticePaper practicePaper = new PracticePaper();
//		practicePaper.setPaperNameEnglish("paper1");
//		practicePaper.setPaperNameRegional("మొదటి పేపర్ ");
//		practicePaper.setSections(this.sections);
//		return practicePaper;
//	}
//	public void addExam() {
//		exam.setExamNameEnglish("SSC");
//		exam.setExamNameRegional("ఎస్ఎస్సి");
//		exam.setPracticePapers(this.practicePapers);
//	}
//	
//	public void readExam() {
//		System.out.println(exam.getExamNameEnglish());
//		exam.getPracticePapers();
//		System.out.println(exam);
//	}
//	
//	public void mainExam(String args[]) {
//		ExamTest examTest = new ExamTest();
//		examTest.addExam();
//		ExamService examService = new ExamService();
//		examService.addExam(exam);
//		System.out.println(examService.getExam(exam));
//		examTest.readExam();
//	}
//}
