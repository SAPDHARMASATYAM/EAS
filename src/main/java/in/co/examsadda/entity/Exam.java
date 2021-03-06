package in.co.examsadda.entity;

import java.util.HashSet;
import java.util.Set;

public class Exam {

	private Long examId;
	private String examNameRegional;
	private String examNameEnglish;
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
