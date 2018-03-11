package in.co.examsadda.entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question {
	
	@Id
	private Long qiestionId;
	private Long sectionId;
	private Long examId;
	private String questionDescription;
	private Byte[] questionImage;
	private Character optionA;
	private String answerA;
	private Character optionB;
	private String answerB;
	private Character optionC;
	private String answerC;
	private Character optionD;
	private String answerD;
	private Character answer;
	/**
	 * 
	 */
	public Question() {
	}
	/**
	 * @param qiestionId
	 * @param sectionId
	 * @param examId
	 * @param questionDescription
	 * @param questionImage
	 * @param optionA
	 * @param answerA
	 * @param optionB
	 * @param answerB
	 * @param optionC
	 * @param answerC
	 * @param optionD
	 * @param answerD
	 * @param answer
	 */
	public Question(Long qiestionId, Long sectionId, Long examId, String questionDescription, Byte[] questionImage,
			Character optionA, String answerA, Character optionB, String answerB, Character optionC, String answerC,
			Character optionD, String answerD, Character answer) {
		super();
		this.qiestionId = qiestionId;
		this.sectionId = sectionId;
		this.examId = examId;
		this.questionDescription = questionDescription;
		this.questionImage = questionImage;
		this.optionA = optionA;
		this.answerA = answerA;
		this.optionB = optionB;
		this.answerB = answerB;
		this.optionC = optionC;
		this.answerC = answerC;
		this.optionD = optionD;
		this.answerD = answerD;
		this.answer = answer;
	}
	/**
	 * @return the qiestionId
	 */
	public Long getQiestionId() {
		return qiestionId;
	}
	/**
	 * @param qiestionId the qiestionId to set
	 */
	public void setQiestionId(Long qiestionId) {
		this.qiestionId = qiestionId;
	}
	/**
	 * @return the sectionId
	 */
	public Long getSectionId() {
		return sectionId;
	}
	/**
	 * @param sectionId the sectionId to set
	 */
	public void setSectionId(Long sectionId) {
		this.sectionId = sectionId;
	}
	/**
	 * @return the examId
	 */
	public Long getExamId() {
		return examId;
	}
	/**
	 * @param examId the examId to set
	 */
	public void setExamId(Long examId) {
		this.examId = examId;
	}
	/**
	 * @return the questionDescription
	 */
	public String getQuestionDescription() {
		return questionDescription;
	}
	/**
	 * @param questionDescription the questionDescription to set
	 */
	public void setQuestionDescription(String questionDescription) {
		this.questionDescription = questionDescription;
	}
	/**
	 * @return the questionImage
	 */
	public Byte[] getQuestionImage() {
		return questionImage;
	}
	/**
	 * @param questionImage the questionImage to set
	 */
	public void setQuestionImage(Byte[] questionImage) {
		this.questionImage = questionImage;
	}
	/**
	 * @return the optionA
	 */
	public Character getOptionA() {
		return optionA;
	}
	/**
	 * @param optionA the optionA to set
	 */
	public void setOptionA(Character optionA) {
		this.optionA = optionA;
	}
	/**
	 * @return the answerA
	 */
	public String getAnswerA() {
		return answerA;
	}
	/**
	 * @param answerA the answerA to set
	 */
	public void setAnswerA(String answerA) {
		this.answerA = answerA;
	}
	/**
	 * @return the optionB
	 */
	public Character getOptionB() {
		return optionB;
	}
	/**
	 * @param optionB the optionB to set
	 */
	public void setOptionB(Character optionB) {
		this.optionB = optionB;
	}
	/**
	 * @return the answerB
	 */
	public String getAnswerB() {
		return answerB;
	}
	/**
	 * @param answerB the answerB to set
	 */
	public void setAnswerB(String answerB) {
		this.answerB = answerB;
	}
	/**
	 * @return the optionC
	 */
	public Character getOptionC() {
		return optionC;
	}
	/**
	 * @param optionC the optionC to set
	 */
	public void setOptionC(Character optionC) {
		this.optionC = optionC;
	}
	/**
	 * @return the answerC
	 */
	public String getAnswerC() {
		return answerC;
	}
	/**
	 * @param answerC the answerC to set
	 */
	public void setAnswerC(String answerC) {
		this.answerC = answerC;
	}
	/**
	 * @return the optionD
	 */
	public Character getOptionD() {
		return optionD;
	}
	/**
	 * @param optionD the optionD to set
	 */
	public void setOptionD(Character optionD) {
		this.optionD = optionD;
	}
	/**
	 * @return the answerD
	 */
	public String getAnswerD() {
		return answerD;
	}
	/**
	 * @param answerD the answerD to set
	 */
	public void setAnswerD(String answerD) {
		this.answerD = answerD;
	}
	/**
	 * @return the answer
	 */
	public Character getAnswer() {
		return answer;
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(Character answer) {
		this.answer = answer;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Question [qiestionId=" + qiestionId + ", sectionId=" + sectionId + ", examId=" + examId
				+ ", questionDescription=" + questionDescription + ", questionImage=" + Arrays.toString(questionImage)
				+ ", optionA=" + optionA + ", answerA=" + answerA + ", optionB=" + optionB + ", answerB=" + answerB
				+ ", optionC=" + optionC + ", answerC=" + answerC + ", optionD=" + optionD + ", answerD=" + answerD
				+ ", answer=" + answer + "]";
	}
	
}
