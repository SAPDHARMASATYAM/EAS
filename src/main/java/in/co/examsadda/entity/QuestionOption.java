package in.co.examsadda.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class QuestionOption {
	
	@Id
	private Long optionId;
	private Character optionValue;
	private String answerRegional;
	private String answerEnglish;
	
	
	/**
	 * 
	 */
	public QuestionOption() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param optionId
	 * @param optionValue
	 * @param answerRegional
	 * @param answerEnglish
	 */
	public QuestionOption(Long optionId, Character optionValue, String answerRegional, String answerEnglish) {
		super();
		this.optionId = optionId;
		this.optionValue = optionValue;
		this.answerRegional = answerRegional;
		this.answerEnglish = answerEnglish;
	}


	/**
	 * @return the optionId
	 */
	public Long getOptionId() {
		return optionId;
	}


	/**
	 * @param optionId the optionId to set
	 */
	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}


	/**
	 * @return the optionValue
	 */
	public Character getOptionValue() {
		return optionValue;
	}


	/**
	 * @param optionValue the optionValue to set
	 */
	public void setOptionValue(Character optionValue) {
		this.optionValue = optionValue;
	}


	/**
	 * @return the answerRegional
	 */
	public String getAnswerRegional() {
		return answerRegional;
	}


	/**
	 * @param answerRegional the answerRegional to set
	 */
	public void setAnswerRegional(String answerRegional) {
		this.answerRegional = answerRegional;
	}


	/**
	 * @return the answerEnglish
	 */
	public String getAnswerEnglish() {
		return answerEnglish;
	}


	/**
	 * @param answerEnglish the answerEnglish to set
	 */
	public void setAnswerEnglish(String answerEnglish) {
		this.answerEnglish = answerEnglish;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Option [optionId=" + optionId + ", optionValue=" + optionValue + ", answerRegional=" + answerRegional
				+ ", answerEnglish=" + answerEnglish + "]";
	}

	

	
}
