package in.co.examsadda.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
	public Exam saveExam(Exam exam) throws Exception {
		PreparedStatement insertQuestionOption = null;
		PreparedStatement insertQuestion = null;
		PreparedStatement insertSection = null;
		PreparedStatement insertPracticePaper = null;
		PreparedStatement insertExam = null;
		ResultSet rstExam=null;
		ResultSet rstPracticePaper=null;
		ResultSet rstSection=null;
		ResultSet rstQuestion=null;
		int generatedId;
		try {
			connection = DataSource.getConnection();
		
		Properties properties = PropertiesUtil.getProperties();
		insertQuestionOption = connection.prepareStatement(properties.getProperty(ProcedureNames.SAVE_QUESTION_OPTION),Statement.RETURN_GENERATED_KEYS);
		insertQuestion = connection.prepareStatement(properties.getProperty(ProcedureNames.SAVE_QUESTION),Statement.RETURN_GENERATED_KEYS);
		insertSection = connection.prepareStatement(properties.getProperty(ProcedureNames.SAVE_SECTION),Statement.RETURN_GENERATED_KEYS);
		insertPracticePaper = connection.prepareStatement(properties.getProperty(ProcedureNames.SAVE_PRACTICEPAPER),Statement.RETURN_GENERATED_KEYS);
		insertExam = connection.prepareStatement(PropertiesUtil.getProperty(ProcedureNames.SAVE_EXAM_SP),Statement.RETURN_GENERATED_KEYS);
		
		insertExam.setString(1, exam.getExamNameEnglish());
		insertExam.setString(2, exam.getExamNameRegional());
		//insertExam.execute();
		insertExam.executeUpdate();
		
		rstExam = insertExam.getGeneratedKeys();
		rstExam.next();
		generatedId = rstExam.getInt(1);
		
			Set<PracticePaper> practicePapers =  exam.getPracticePapers();
			
			for (PracticePaper practicePaper : practicePapers) {
				System.out.println("practicePaper.getPracticePaperNameEnglish()  ::"+practicePaper.getPracticePaperNameEnglish());
				System.out.println("practicePaper.getPracticePaperNameRegional()  ::"+practicePaper.getPracticePaperNameRegional());
				System.out.println("practicePaper.getPracticePaperTimeInMinutes()  ::"+practicePaper.getPracticePaperTimeInMinutes());
				insertPracticePaper.setString(1, practicePaper.getPracticePaperNameEnglish());
				insertPracticePaper.setString(2, practicePaper.getPracticePaperNameRegional());
				insertPracticePaper.setInt(3, practicePaper.getPracticePaperTimeInMinutes());
				insertPracticePaper.setLong(4, generatedId);
				insertPracticePaper.executeUpdate();
				Set<Section> sections = practicePaper.getSections();
				
				rstPracticePaper = insertPracticePaper.getGeneratedKeys();
				rstPracticePaper.next();
				generatedId = rstPracticePaper.getInt(1);
				
				for(Section section : sections) {
					System.out.println("section.getSectionName() "+section.getSectionName());
					insertSection.setString(1, section.getSectionName());
					insertSection.setLong(2, generatedId);
					insertSection.executeUpdate();
					Set<Question> questions = section.getQuestions();
					rstSection = insertSection.getGeneratedKeys();
					rstSection.next();
					generatedId = rstSection.getInt(1);
					
					for(Question question : questions) {
						System.out.println("section.getSectionName() "+section.getSectionName());
						insertQuestion.setString(1,question.getAnswer()+"");
						insertQuestion.setString(2,question.getQuestionDescriptionEnglish()+"");
						insertQuestion.setString(3,question.getQuestionDescriptionRegional()+"");
						//insertQuestion.setBytes(4,question.getQuestionImage());
						insertQuestion.setLong(4,generatedId);
						insertQuestion.executeUpdate();
						Set<QuestionOption> questionOptions = question.getOptions();
						
						rstQuestion = insertQuestion.getGeneratedKeys();
						rstQuestion.next();
						generatedId = rstQuestion.getInt(1);
						
						for(QuestionOption questionOption : questionOptions) {
							insertQuestionOption.setString(1, questionOption.getOptionValue()+"");
							insertQuestionOption.setInt(2, generatedId);
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
