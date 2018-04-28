package in.co.examsadda.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.transaction.Transactional;

@Entity
public class Address {
	
	@Id
	private long addressId;
	private String flatNumber;
	private String location;
	private String village;
	private String mondal;
	private String district;
	private String state;
	private Integer pincode;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="emailId")
	private User user;
	public Address() {
		
	}

	/**
	 * @param addressId
	 * @param flatNumber
	 * @param location
	 * @param village
	 * @param mondal
	 * @param district
	 * @param state
	 * @param pincode
	 */
	public Address(long addressId, String flatNumber, String location, String village, String mondal, String district,
			String state, Integer pincode) {
		super();
		this.addressId = addressId;
		this.flatNumber = flatNumber;
		this.location = location;
		this.village = village;
		this.mondal = mondal;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}

	/**
	 * @return the addressId
	 */
	public long getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the flatNumber
	 */
	public String getFlatNumber() {
		return flatNumber;
	}

	/**
	 * @param flatNumber the flatNumber to set
	 */
	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the village
	 */
	public String getVillage() {
		return village;
	}

	/**
	 * @param village the village to set
	 */
	public void setVillage(String village) {
		this.village = village;
	}

	/**
	 * @return the mondal
	 */
	public String getMondal() {
		return mondal;
	}

	/**
	 * @param mondal the mondal to set
	 */
	public void setMondal(String mondal) {
		this.mondal = mondal;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the pincode
	 */
	public Integer getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", flatNumber=" + flatNumber + ", location=" + location
				+ ", village=" + village + ", mondal=" + mondal + ", district=" + district + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
	
	
	
}
