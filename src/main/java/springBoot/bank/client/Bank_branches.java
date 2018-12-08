package springBoot.bank.client;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank_details")
public class Bank_branches {
	
	@Column(name = "bank_ifsc")
	private String ifsc;
	
	@Id
	@Column(name = "bank_id")
	private long id;
	
	@Column(name = "bank_branch")
	private String branch;
	
	@Column(name = "bank_address")
	private String address;
	
	@Column(name = "bank_city")
	private String city;
	
	@Column(name = "bank_district")
	private String district;
	
	@Column(name = "bank_state")
	private String state;
	
	@Column(name = "bank_name")
	private String name;
	

	public Bank_branches() {
		super();
	}


	public Bank_branches(String ifsc, long id, String branch, String address, String city, String district,
			String state, String name) {
		super();
		this.ifsc = ifsc;
		this.id = id;
		this.branch = branch;
		this.address = address;
		this.city = city;
		this.district = district;
		this.state = state;
		this.name = name;
	}


	public String getIfsc() {
		return ifsc;
	}


	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	

	

}
