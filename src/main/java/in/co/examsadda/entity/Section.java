package in.co.examsadda.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.transaction.Transactional;

@Entity
public class Section implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long sectionId;
	private String sectionName;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	//@JoinTable(name="section",joinColumns= {@JoinColumn(name="sectionId")}, inverseJoinColumns= {@JoinColumn(name="qiestionId")})
	@JoinColumn(name="qiestionId")
	@OrderBy("qiestionId")
	private Set<Question> questions;
	@ManyToOne(cascade = CascadeType.PERSIST)
    //@ElementCollection(targetClass=PracticePaper.class)
	@JoinColumn(name="practicePaperId",nullable = false, updatable = true)
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
