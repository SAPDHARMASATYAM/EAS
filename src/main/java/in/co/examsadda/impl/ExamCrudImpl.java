package in.co.examsadda.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import in.co.examsadda.entity.Exam;
import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.entity.Question;
import in.co.examsadda.entity.QuestionOption;
import in.co.examsadda.entity.Section;
import in.co.examsadda.repository.ExamCrudRepository;
import in.co.examsadda.util.DataSource;
import in.co.examsadda.util.ProcedureNames;
import in.co.examsadda.util.PropertiesUtil;

public class ExamCrudImpl implements ExamCrudRepository {

	Connection connection;

	@Autowired
	public Exam saveExam(Exam exam) throws SQLException {
		PreparedStatement insertQuestionOption = null;
		PreparedStatement insertQuestion = null;
		PreparedStatement insertSection = null;
		PreparedStatement insertPracticePaper = null;
		PreparedStatement insertExam = null;
		try {
			connection = DataSource.getConnection();
		
		Properties properties = PropertiesUtil.getProperties();
		insertQuestionOption = connection.prepareStatement(properties.getProperty(ProcedureNames.SAVE_QUESTION_OPTION));
		insertQuestion = connection.prepareStatement(properties.getProperty(ProcedureNames.SAVE_QUESTION));
		insertSection = connection.prepareStatement(properties.getProperty(ProcedureNames.SAVE_SECTION));
		insertPracticePaper = connection.prepareStatement(properties.getProperty(ProcedureNames.SAVE_PRACTICEPAPER));
		insertExam = connection.prepareStatement(PropertiesUtil.getProperty(ProcedureNames.SAVE_EXAM_SP));
		
		insertExam.setString(1, exam.getExamNameEnglish());
		insertExam.setString(2, exam.getExamNameRegional());
		//insertExam.execute();
		insertExam.execute();
		
			Set<PracticePaper> practicePapers =  exam.getPracticePapers();
			
			for (PracticePaper practicePaper : practicePapers) {
			
				insertPracticePaper.setString(1, practicePaper.getPracticePaperNameEnglish());
				insertPracticePaper.setString(2, practicePaper.getPracticePaperNameRegional());
				insertPracticePaper.setInt(3, practicePaper.getPracticePaperTimeInMinutes());
				//insertPracticePaper.setLong(4, practicePaper.getExam().getExamId());
				insertPracticePaper.executeUpdate();
				Set<Section> sections = practicePaper.getSections();
				
				for(Section section : sections) {
					
					insertSection.setString(1, section.getSectionName());
					//insertSection.setLong(2, section.getPracticePaper().getPracticePaperId());
					
					Set<Question> questions = section.getQuestions();
					
					for(Question question : questions) {
						
						insertQuestion.setString(1,question.getAnswer()+"");
						insertQuestion.setString(2,question.getQuestionDescriptionEnglish()+"");
						insertQuestion.setString(3,question.getQuestionDescriptionRegional()+"");
						insertQuestion.setBytes(4,question.getQuestionImage());
						//insertQuestion.setLong(5,question.getSection().getSectionId());
						insertQuestion.execute();
						
						Set<QuestionOption> questionOptions = question.getOptions();
						
						for(QuestionOption questionOption : questionOptions) {
							insertQuestionOption.setString(1, questionOption.getAnswerEnglish());
							insertQuestionOption.setString(2, questionOption.getAnswerRegional());
							insertQuestionOption.setBytes(3, questionOption.getAnswerImage());
							insertQuestionOption.setString(4, questionOption.getOptionValue()+"");
							//insertQuestionOption.setLong(5, questionOption.getQuestion().getQiestionId());
							insertQuestionOption.execute();
						}
					}
				}
			}	
		
		
		
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if(connection!=null)
			connection.close();
	}
		return null;
	}



	@Override
	public List<Exam> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void delete(Exam exam) {
		// TODO Auto-generated method stub
		
	}
	
}
