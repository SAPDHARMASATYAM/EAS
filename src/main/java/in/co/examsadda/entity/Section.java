package in.co.examsadda.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Section implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long sectionId;
	private String sectionName;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "Section_Question", joinColumns = {
			@JoinColumn(name = "sectionId")}, inverseJoinColumns = {
					@JoinColumn(name = "qiestionId")})
	private Set<Question> questions;
	
	/**
	 * 
	 */
	public Section() {
	}

	/**
	 * @param sectionId
	 * @param sectionName
	 * @param questions
	 */
	public Section(Long sectionId, String sectionName, Set<Question> questions) {
		super();
		this.sectionId = sectionId;
		this.sectionName = sectionName;
		this.questions = questions;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Section [sectionId=" + sectionId + ", sectionName=" + sectionName + ", questions=" + questions + "]";
	}
	
}
