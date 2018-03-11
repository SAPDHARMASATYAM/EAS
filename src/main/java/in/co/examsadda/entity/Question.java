package in.co.examsadda.entity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Question {
	
	@Id
	private Long qiestionId;
	private Long sectionId;
	private Long examId;
	private String questionDescriptionRegional;
	private String questionDescriptionEnglish;
	private Byte[] questionImage;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@OrderBy("optionId")
	@JoinTable(name = "Question_Option_Mapping", joinColumns = {
			@JoinColumn(name = "qiestionId")}, inverseJoinColumns = {
					@JoinColumn(name = "optionId")})
	private Set<QuestionOption> options;
	private Character answer;
	/**
	 * 
	 */
	public Question() {
		options = new HashSet<QuestionOption>();
	}
	/**
	 * @param qiestionId
	 * @param sectionId
	 * @param examId
	 * @param questionDescriptionRegional
	 * @param questionDescriptionEnglish
	 * @param questionImage
	 * @param options
	 * @param answer
	 */
	public Question(Long qiestionId, Long sectionId, Long examId, String questionDescriptionRegional,
			String questionDescriptionEnglish, Byte[] questionImage, Set<QuestionOption> options, Character answer) {
		super();
		this.qiestionId = qiestionId;
		this.sectionId = sectionId;
		this.examId = examId;
		this.questionDescriptionRegional = questionDescriptionRegional;
		this.questionDescriptionEnglish = questionDescriptionEnglish;
		this.questionImage = questionImage;
		this.options = options;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Question [qiestionId=" + qiestionId + ", sectionId=" + sectionId + ", examId=" + examId
				+ ", questionDescriptionRegional=" + questionDescriptionRegional + ", questionDescriptionEnglish="
				+ questionDescriptionEnglish + ", questionImage=" + Arrays.toString(questionImage) + ", options="
				+ options + ", answer=" + answer + "]";
	}
	
}
