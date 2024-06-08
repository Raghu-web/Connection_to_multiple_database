package in.raghu.postgres.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeAddressId;
	private String state;
	private String country;
	private String pincode;
	public Integer getEmployeeAddressId() {
		return employeeAddressId;
	}
	public void setEmployeeAddressId(Integer employeeAddressId) {
		this.employeeAddressId = employeeAddressId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public EmployeeDetails(String state, String country, String pincode) {
		super();
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeDetails [employeeAddressId=" + employeeAddressId + ", state=" + state + ", country=" + country
				+ ", pincode=" + pincode + "]";
	}
	
	
}
