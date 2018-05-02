package in.co.examsadda.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Institute {

	private Long instituteId;
	private String Name;
	private Address address;
	private Date activationDate;
	private Date deactivationDate;
	private Set<User> users;
	private Set<Exam> exams;

	/**
	 * 
	 */
	public Institute() {
		exams = new HashSet<Exam>();
	}

	public Institute(Long instituteId, String name, Address address, Date activationDate, Date deactivationDate,
			Set<User> users, Set<Exam> exams) {
		super();
		this.instituteId = instituteId;
		Name = name;
		this.address = address;
		this.activationDate = activationDate;
		this.deactivationDate = deactivationDate;
		this.users = users;
		this.exams = exams;
	}

	public Long getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(Long instituteId) {
		this.instituteId = instituteId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}

	public Date getDeactivationDate() {
		return deactivationDate;
	}

	public void setDeactivationDate(Date deactivationDate) {
		this.deactivationDate = deactivationDate;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<Exam> getExams() {
		return exams;
	}

	public void setExams(Set<Exam> exams) {
		this.exams = exams;
	}

	@Override
	public String toString() {
		return "Institute [instituteId=" + instituteId + ", Name=" + Name + ", address=" + address + ", activationDate="
				+ activationDate + ", deactivationDate=" + deactivationDate + ", users=" + users + ", exams=" + exams
				+ "]";
	}

	

}
//  You are in Institute
//	Find this institute Exams
//	Subscribe for new Exam
//	Find Students of this institute
//  find Students of this institute by exam name
// 	Add Exam to Students (use input as list so that we can send either one student or multiple)
	