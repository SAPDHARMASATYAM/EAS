package in.co.examsadda.entity;

import java.util.HashSet;
import java.util.Set;

public class PracticePaper {
	
	private Long practicePaperId;
	private String practicePaperNameRegional;
	private String practicePaperNameEnglish;
	private Set<Section> sections;
	private Integer practicePaperTimeInMinutes;
	private Exam exam;
	/**
	 * 
	 */
	public PracticePaper() {
		sections = new HashSet<Section>();
	}
	/**
	 * @param practicePaperId
	 * @param practicePaperNameRegional
	 * @param practicePaperNameEnglish
	 * @param sections
	 * @param practicePaperTimeInMinutes
	 * @param exam
	 */
	public PracticePaper(Long practicePaperId, String practicePaperNameRegional, String practicePaperNameEnglish,
			Set<Section> sections, Integer practicePaperTimeInMinutes, Exam exam) {
		this.practicePaperId = practicePaperId;
		this.practicePaperNameRegional = practicePaperNameRegional;
		this.practicePaperNameEnglish = practicePaperNameEnglish;
		this.sections = sections;
		this.practicePaperTimeInMinutes = practicePaperTimeInMinutes;
		this.exam = exam;
	}
	/**
	 * @return the practicePaperId
	 */
	public Long getPracticePaperId() {
		return practicePaperId;
	}
	/**
	 * @param practicePaperId the practicePaperId to set
	 */
	public void setPracticePaperId(Long practicePaperId) {
		this.practicePaperId = practicePaperId;
	}
	/**
	 * @return the practicePaperNameRegional
	 */
	public String getPracticePaperNameRegional() {
		return practicePaperNameRegional;
	}
	/**
	 * @param practicePaperNameRegional the practicePaperNameRegional to set
	 */
	public void setPracticePaperNameRegional(String practicePaperNameRegional) {
		this.practicePaperNameRegional = practicePaperNameRegional;
	}
	/**
	 * @return the practicePaperNameEnglish
	 */
	public String getPracticePaperNameEnglish() {
		return practicePaperNameEnglish;
	}
	/**
	 * @param practicePaperNameEnglish the practicePaperNameEnglish to set
	 */
	public void setPracticePaperNameEnglish(String practicePaperNameEnglish) {
		this.practicePaperNameEnglish = practicePaperNameEnglish;
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
	 * @return the practicePaperTimeInMinutes
	 */
	public Integer getPracticePaperTimeInMinutes() {
		return practicePaperTimeInMinutes;
	}
	/**
	 * @param practicePaperTimeInMinutes the practicePaperTimeInMinutes to set
	 */
	public void setPracticePaperTimeInMinutes(Integer practicePaperTimeInMinutes) {
		this.practicePaperTimeInMinutes = practicePaperTimeInMinutes;
	}
	/**
	 * @return the exam
	 */
	public Exam getExam() {
		return exam;
	}
	/**
	 * @param exam the exam to set
	 */
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PracticePaper [practicePaperId=" + practicePaperId + ", practicePaperNameRegional="
				+ practicePaperNameRegional + ", practicePaperNameEnglish=" + practicePaperNameEnglish + ", sections="
				+ sections + ", practicePaperTimeInMinutes=" + practicePaperTimeInMinutes + ", exam=" + exam + "]";
	}
	
}
