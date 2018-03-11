package in.co.examsadda.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class User {

	@Id
	private String emailId;
	private String firstName;
	private String lastName;
	private String gender;
	private String mobile;
	private String password;
	private Date dateOfRegistration;
	@ManyToOne(cascade = CascadeType.ALL)
	private Institute inistitute;
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	private Address address;
	

	public User() {
	}


	/**
	 * @param emailId
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param mobile
	 * @param password
	 * @param dateOfRegistration
	 * @param inistitute
	 * @param address
	 */
	public User(String emailId, String firstName, String lastName, String gender, String mobile, String password,
			Date dateOfRegistration, Institute inistitute, Address address) {
		super();
		this.emailId = emailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.mobile = mobile;
		this.password = password;
		this.dateOfRegistration = dateOfRegistration;
		this.inistitute = inistitute;
		this.address = address;
	}


	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}


	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}


	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}


	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the dateOfRegistration
	 */
	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}


	/**
	 * @param dateOfRegistration the dateOfRegistration to set
	 */
	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}


	/**
	 * @return the institute
	 */
	public Institute getInistitute() {
		return inistitute;
	}


	/**
	 * @param inistitute the institute to set
	 */
	public void setInistitute(Institute inistitute) {
		this.inistitute = inistitute;
	}


	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [emailId=" + emailId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", mobile=" + mobile + ", password=" + password + ", dateOfRegistration=" + dateOfRegistration
				+ ", inistitute=" + inistitute + ", address=" + address + "]";
	}

	

}
