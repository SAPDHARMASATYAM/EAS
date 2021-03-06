package in.co.examsadda.entity;

import java.util.HashSet;
import java.util.Set;

public class Section implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long sectionId;
	private String sectionName;
	private Set<Question> questions;
	private PracticePaper practicePaper;
	
	/**
	 * 
	 */
	public Section() {
		questions = new HashSet<Question>();
	}

	/**
	 * @param sectionId
	 * @param sectionName
	 * @param questions
	 * @param practicePaper
	 */
	public Section(Long sectionId, String sectionName, Set<Question> questions, PracticePaper practicePaper) {
		this.sectionId = sectionId;
		this.sectionName = sectionName;
		this.questions = questions;
		this.practicePaper = practicePaper;
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
	 * @return the sectionName
	 */
	public String getSectionName() {
		return sectionName;
	}

	/**
	 * @param sectionName the sectionName to set
	 */
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	/**
	 * @return the questions
	 */
	public Set<Question> getQuestions() {
		return questions;
	}

	/**
	 * @param questions the questions to set
	 */
	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	/**
	 * @return the practicePaper
	 */
	public PracticePaper getPracticePaper() {
		return practicePaper;
	}

	/**
	 * @param practicePaper the practicePaper to set
	 */
	public void setPracticePaper(PracticePaper practicePaper) {
		this.practicePaper = practicePaper;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Section [sectionId=" + sectionId + ", sectionName=" + sectionName + ", questions=" + questions
				+ ", practicePaper=" + practicePaper + "]";
	}
	
}
