package in.co.examsadda.entity;

import java.util.Arrays;

public class QuestionOption {
	
	private Long optionId;
	private Character optionValue;
	private String answerRegional;
	private String answerEnglish;
	private byte [] answerImage;
	private Question question;
	
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
	 * @param answerImage
	 * @param question
	 */
	public QuestionOption(Long optionId, Character optionValue, String answerRegional, String answerEnglish,
			byte[] answerImage, Question question) {
		this.optionId = optionId;
		this.optionValue = optionValue;
		this.answerRegional = answerRegional;
		this.answerEnglish = answerEnglish;
		this.answerImage = answerImage;
		this.question = question;
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

	/**
	 * @return the answerImage
	 */
	public byte[] getAnswerImage() {
		return answerImage;
	}

	/**
	 * @param answerImage the answerImage to set
	 */
	public void setAnswerImage(byte[] answerImage) {
		this.answerImage = answerImage;
	}

	/**
	 * @return the question
	 */
	public Question getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(Question question) {
		this.question = question;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "QuestionOption [optionId=" + optionId + ", optionValue=" + optionValue + ", answerRegional="
				+ answerRegional + ", answerEnglish=" + answerEnglish + ", answerImage=" + Arrays.toString(answerImage)
				+ ", question=" + question + "]";
	}

}
