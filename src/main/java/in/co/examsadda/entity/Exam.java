package in.co.examsadda.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;

@Entity
public class Exam {

	@Id
	private Long examId;
	private String examName;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@OrderBy("sectionId")
	@JoinTable(name = "Exam_Section", joinColumns = {
			@JoinColumn(name = "examId")}, inverseJoinColumns = {
					@JoinColumn(name = "sectionId")})
	private Set<Section> sections;
	private Integer timeInMinutes;
	/**
	 * 
	 */
	public Exam() {
		sections = new HashSet<Section>();
	}
	/**
	 * @param examId
	 * @param examName
	 * @param sections
	 * @param timeInMinutes
	 */
	public Exam(Long examId, String examName, Set<Section> sections, Integer timeInMinutes) {
		super();
		this.examId = examId;
		this.examName = examName;
		this.sections = sections;
		this.timeInMinutes = timeInMinutes;
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
	 * @return the examName
	 */
	public String getExamName() {
		return examName;
	}
	/**
	 * @param examName the examName to set
	 */
	public void setExamName(String examName) {
		this.examName = examName;
	}
	/**
	 * @return the sections
	 */
	public Set<Section> getSections() {
		return sections;
	}
	/**
	 * @param sections the sections to set
	 */
	public void setSections(Set<Section> sections) {
		this.sections = sections;
	}
	/**
	 * @return the timeInMinutes
	 */
	public Integer getTimeInMinutes() {
		return timeInMinutes;
	}
	/**
	 * @param timeInMinutes the timeInMinutes to set
	 */
	public void setTimeInMinutes(Integer timeInMinutes) {
		this.timeInMinutes = timeInMinutes;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", examName=" + examName + ", sections=" + sections + ", timeInMinutes="
				+ timeInMinutes + "]";
	}

}
