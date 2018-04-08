package in.co.examsadda.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Exam {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long examId;
	@Column(unique=true)
	private String examNameRegional;
	@Column(unique=true)
	private String examNameEnglish;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="practicePaperId")
    @ElementCollection(targetClass=PracticePaper.class)
	private Set<PracticePaper> PracticePapers;

	public Exam() {
		PracticePapers = new HashSet<PracticePaper>();
	}

	/**
	 * @param examId
	 * @param examNameRegional
	 * @param examNameEnglish
	 * @param practicePapers
	 */
	public Exam(Long examId, String examNameRegional, String examNameEnglish, Set<PracticePaper> practicePapers) {
		this.examId = examId;
		this.examNameRegional = examNameRegional;
		this.examNameEnglish = examNameEnglish;
		PracticePapers = practicePapers;
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
	 * @return the examNameRegional
	 */
	public String getExamNameRegional() {
		return examNameRegional;
	}

	/**
	 * @param examNameRegional the examNameRegional to set
	 */
	public void setExamNameRegional(String examNameRegional) {
		this.examNameRegional = examNameRegional;
	}

	/**
	 * @return the examNameEnglish
	 */
	public String getExamNameEnglish() {
		return examNameEnglish;
	}

	/**
	 * @param examNameEnglish the examNameEnglish to set
	 */
	public void setExamNameEnglish(String examNameEnglish) {
		this.examNameEnglish = examNameEnglish;
	}

	/**
	 * @return the practicePapers
	 */
	public Set<PracticePaper> getPracticePapers() {
		return PracticePapers;
	}

	/**
	 * @param practicePapers the practicePapers to set
	 */
	public void setPracticePapers(Set<PracticePaper> practicePapers) {
		PracticePapers = practicePapers;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", examNameRegional=" + examNameRegional + ", examNameEnglish="
				+ examNameEnglish + ", PracticePapers=" + PracticePapers + "]";
	}

	
}
