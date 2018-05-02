package in.co.examsadda.entity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question {
	
	private Long qiestionId;
	private String questionDescriptionRegional;
	private String questionDescriptionEnglish;
	private byte[] questionImage;
	private Set<QuestionOption> options;
	private Character answer;
	private Section section;
	/**
	 * 
	 */
	public Question() {
		options = new HashSet<QuestionOption>();
	}
	/**
	 * @param qiestionId
	 * @param questionDescriptionRegional
	 * @param questionDescriptionEnglish
	 * @param questionImage
	 * @param options
	 * @param answer
	 * @param section
	 */
	public Question(Long qiestionId, String questionDescriptionRegional, String questionDescriptionEnglish,
			byte[] questionImage, Set<QuestionOption> options, Character answer, Section section) {
		this.qiestionId = qiestionId;
		this.questionDescriptionRegional = questionDescriptionRegional;
		this.questionDescriptionEnglish = questionDescriptionEnglish;
		this.questionImage = questionImage;
		this.options = options;
		this.answer = answer;
		this.section = section;
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
	 * @return the questionDescriptionRegional
	 */
	public String getQuestionDescriptionRegional() {
		return questionDescriptionRegional;
	}
	/**
	 * @param questionDescriptionRegional the questionDescriptionRegional to set
	 */
	public void setQuestionDescriptionRegional(String questionDescriptionRegional) {
		this.questionDescriptionRegional = questionDescriptionRegional;
	}
	/**
	 * @return the questionDescriptionEnglish
	 */
	public String getQuestionDescriptionEnglish() {
		return questionDescriptionEnglish;
	}
	/**
	 * @param questionDescriptionEnglish the questionDescriptionEnglish to set
	 */
	public void setQuestionDescriptionEnglish(String questionDescriptionEnglish) {
		this.questionDescriptionEnglish = questionDescriptionEnglish;
	}
	/**
	 * @return the questionImage
	 */
	public byte[] getQuestionImage() {
		return questionImage;
	}
	/**
	 * @param questionImage the questionImage to set
	 */
	public void setQuestionImage(byte[] questionImage) {
		this.questionImage = questionImage;
	}
	/**
	 * @return the options
	 */
	public Set<QuestionOption> getOptions() {
		return options;
	}
	/**
	 * @param options the options to set
	 */
	public void setOptions(Set<QuestionOption> options) {
		this.options = options;
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
	/**
	 * @return the section
	 */
	public Section getSection() {
		return section;
	}
	/**
	 * @param section the section to set
	 */
	public void setSection(Section section) {
		this.section = section;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Question [qiestionId=" + qiestionId + ", questionDescriptionRegional=" + questionDescriptionRegional
				+ ", questionDescriptionEnglish=" + questionDescriptionEnglish + ", questionImage="
				+ Arrays.toString(questionImage) + ", options=" + options + ", answer=" + answer + ", section="
				+ section + "]";
	}
	
}
