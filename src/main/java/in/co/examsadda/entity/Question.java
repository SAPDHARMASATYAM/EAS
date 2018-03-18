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
	public Question(Long qiestionId, Long sectionId, String questionDescriptionRegional,
			String questionDescriptionEnglish, Byte[] questionImage, Set<QuestionOption> options, Character answer) {
		super();
		this.qiestionId = qiestionId;
		this.sectionId = sectionId;
		this.questionDescriptionRegional = questionDescriptionRegional;
		this.questionDescriptionEnglish = questionDescriptionEnglish;
		this.questionImage = questionImage;
		this.options = options;
		this.answer = answer;
	}
	public Long getQiestionId() {
		return qiestionId;
	}
	public void setQiestionId(Long qiestionId) {
		this.qiestionId = qiestionId;
	}
	public Long getSectionId() {
		return sectionId;
	}
	public void setSectionId(Long sectionId) {
		this.sectionId = sectionId;
	}
	public String getQuestionDescriptionRegional() {
		return questionDescriptionRegional;
	}
	public void setQuestionDescriptionRegional(String questionDescriptionRegional) {
		this.questionDescriptionRegional = questionDescriptionRegional;
	}
	public String getQuestionDescriptionEnglish() {
		return questionDescriptionEnglish;
	}
	public void setQuestionDescriptionEnglish(String questionDescriptionEnglish) {
		this.questionDescriptionEnglish = questionDescriptionEnglish;
	}
	public Byte[] getQuestionImage() {
		return questionImage;
	}
	public void setQuestionImage(Byte[] questionImage) {
		this.questionImage = questionImage;
	}
	public Set<QuestionOption> getOptions() {
		return options;
	}
	public void setOptions(Set<QuestionOption> options) {
		this.options = options;
	}
	public Character getAnswer() {
		return answer;
	}
	public void setAnswer(Character answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [qiestionId=" + qiestionId + ", sectionId=" + sectionId + ", questionDescriptionRegional="
				+ questionDescriptionRegional + ", questionDescriptionEnglish=" + questionDescriptionEnglish
				+ ", questionImage=" + Arrays.toString(questionImage) + ", options=" + options + ", answer=" + answer
				+ "]";
	}
	
}
